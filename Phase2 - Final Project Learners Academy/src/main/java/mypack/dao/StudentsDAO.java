package mypack.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mypack.entity.Students;

import mypack.sql.connection.MyConnection;

public class StudentsDAO {
public List<Students> getAllStudents(){
	
	
	try {
		
		Connection con = MyConnection.establishConnection();
		String query = "select s.student_id, s.first_name, s.last_name,s.age,s.class_id, "
				+ " c.class_name from students s, classes c where s.class_id = c.class_id ";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		List<Students> students = new ArrayList<Students>();
		
		while(rs.next()) {
			
			Students s = new Students();
			s.setStudentId(rs.getInt(1));
			s.setFirstName(rs.getString(2));
			s.setLastName(rs.getString(3));
			s.setAge(rs.getInt(4));
			s.setClassId(rs.getInt(5));
			s.setClassName(rs.getString(6));
			students.add(s);				
		}
		con.close();
		return students;
		
	}
	catch(Exception e) {
		
		System.out.println(e);
	}
	return null;
}
}
