package mypack.service;

import java.util.List;

import mypack.dao.TeachersDAO;
import mypack.entity.Teachers;

public class TeachersService {
public List<Teachers> getAllTeachers(){
	
	TeachersDAO dao = new TeachersDAO();
	return dao.getAllTeachers();
	
}
}
