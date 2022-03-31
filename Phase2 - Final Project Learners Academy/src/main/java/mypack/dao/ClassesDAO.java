package mypack.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mypack.entity.Classes;
import mypack.sql.connection.MyConnection;

public class ClassesDAO {
public List<Classes> getAllClasses(){
		
		try {
			Connection con = MyConnection.establishConnection();
			String query = "select * from classes";
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			List<Classes> classes = new ArrayList<Classes>();
			while(rs.next()) {
				
				Classes c = new Classes();
				c.setClassId(rs.getInt(1));
				c.setClassName(rs.getString(2));
				classes.add(c);				
			}
			con.close();
			return classes;
				
			}
			
			
			catch(Exception e) {
				
				System.out.println(e);
			}
				
				return null;
		}
}
