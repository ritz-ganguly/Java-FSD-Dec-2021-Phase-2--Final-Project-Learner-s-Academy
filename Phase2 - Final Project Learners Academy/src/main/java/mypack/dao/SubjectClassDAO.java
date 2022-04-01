package mypack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import mypack.entity.Subjects;
import mypack.sql.connection.MyConnection;

public class SubjectClassDAO {

	public void assignSubjectsToClasss(Subjects s) {
		
		try {
			
			Connection con = MyConnection.establishConnection();
			String query = "select subject_id from subjects where subject_name = ? ";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1,s.getSubjectName());
			ResultSet rs = st.executeQuery();
			int subject_id = 0;
			while(rs.next()) {
				
				subject_id = rs.getInt(1);
			}
			
			query = "select class_id from classes where class_name = ? ";
			st = con.prepareStatement(query);
			st.setString(1,s.getClassName());
		    rs = st.executeQuery();
			int class_id =0;
			while(rs.next()) {
				
				class_id = rs.getInt(1);
			}
			
			
			int checkSubjectId = -1;
			
			query = "select subject_id from subject_class where subject_id = ?";
			st = con.prepareStatement(query);
			st.setInt(1, subject_id);
			rs = st.executeQuery();
			while(rs.next())
				checkSubjectId = rs.getInt(1);
			
			if(checkSubjectId == -1) {
			
			query = "insert into subject_class values(?,?)";
			st = con.prepareStatement(query);
			st.setInt(1, subject_id);
			st.setInt(2, class_id);
			
			st.executeUpdate();
			
			
			}
			
			
			else {
				
				query = "update subject_class set class_id =? where subject_id = ?";
				st = con.prepareStatement(query);
				st.setInt(2, subject_id);
				st.setInt(1, class_id);
				st.executeUpdate();
				
			}
			con.close();
			
		}
		
		catch(Exception e) {
			
			System.out.println(e);
		}
		
	}
}
