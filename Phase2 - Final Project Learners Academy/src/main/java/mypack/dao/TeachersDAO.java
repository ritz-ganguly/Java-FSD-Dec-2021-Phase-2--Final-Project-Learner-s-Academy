package mypack.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import mypack.entity.Teachers;
import mypack.sql.connection.MyConnection;

public class TeachersDAO {
public List<Teachers> getAllTeachers(){
		
		try {
			Connection con = MyConnection.establishConnection();
			String query = "select * from teachers";
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			List<Teachers> teachers = new ArrayList<Teachers>();
			while(rs.next()) {
				
				Teachers t = new Teachers();
				t.setTeacherId(rs.getInt(1));
				t.setFirstName(rs.getString(2));
				t.setLastName(rs.getString(3));
				t.setAge(rs.getInt(4));
				teachers.add(t);				
			}
			con.close();
			return teachers;
				
			}
			
			
			catch(Exception e) {
				
				System.out.println(e);
			}
				
				return null;
		}
}
