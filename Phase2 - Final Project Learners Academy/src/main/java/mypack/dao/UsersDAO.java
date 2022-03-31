package mypack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import mypack.entity.Users;
import mypack.sql.connection.MyConnection;

public class UsersDAO {
	public boolean checkAdminLogin(Users u) {
		boolean status=false;
		try {
			Connection con = MyConnection.establishConnection();
			String query = "select * from users where email_id =? and password = ?"
					+ " and type='admin' ";
			
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1,u.getEmailId());
			st.setString(2, u.getPassword());
			ResultSet rs = st.executeQuery();
			if(rs.next())
				status = true;
			con.close();
			
			
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
		
		return status;
	}
}
