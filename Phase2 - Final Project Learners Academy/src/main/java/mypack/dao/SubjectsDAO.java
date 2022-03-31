package mypack.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mypack.entity.Subjects;
import mypack.sql.connection.MyConnection;

public class SubjectsDAO {

	public List<Subjects> getAllSubjects(){
		
		try {
			Connection con = MyConnection.establishConnection();
			String query = "select s.subject_id, s.subject_name,c.class_id,c.class_name"
					+ "  from subjects s, classes c, subject_class sc "
					+ " where s.subject_id = sc.subject_id "
					+ " and c.class_id = sc.class_id";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			List<Subjects> subjects = new ArrayList<Subjects>();
			while(rs.next()) {
				
				Subjects s = new Subjects();
				s.setSubjectId(rs.getInt(1));
				s.setSubjectName(rs.getString(2));
				s.setClassId(rs.getInt(3));
				s.setClassName(rs.getString(4));
				subjects.add(s);				
			}
			con.close();
			return subjects;
				
			}
			
			
			catch(Exception e) {
				
				System.out.println(e);
			}
				
				return null;
		}
	
	
	public List<Subjects> returnAllSubjects(){
		
		try {
			
			Connection con = MyConnection.establishConnection();
			String query = "select s.subject_id,s.subject_name from subjects s";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			List<Subjects> subjects = new ArrayList<Subjects>();
            while(rs.next()) {
				
				Subjects s = new Subjects();
				s.setSubjectId(rs.getInt(1));
				s.setSubjectName(rs.getString(2));
				
				subjects.add(s);				
			}
			con.close();
			return subjects; 
		}
		
		catch(Exception e) {
			
			System.out.println(e);
		}
		return null;
	}
}
