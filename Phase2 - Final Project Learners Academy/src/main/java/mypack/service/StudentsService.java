package mypack.service;

import java.util.List;

import mypack.dao.StudentsDAO;
import mypack.entity.Students;

public class StudentsService {
public List<Students> getAllStudents(){
	
	StudentsDAO dao = new StudentsDAO();
	return dao.getAllStudents();
	
}
}
