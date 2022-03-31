package mypack.service;

import mypack.dao.UsersDAO;
import mypack.entity.Users;

public class UsersService {
	public boolean checkAdminLogin(Users u) {
		 UsersDAO dao = new UsersDAO();
		 boolean status = dao.checkAdminLogin(u);
		 return status;
		 
		 
	 }
}
