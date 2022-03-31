package mypack.service;

import java.util.List;

import mypack.dao.ClassesDAO;
import mypack.entity.Classes;

public class ClassesService {
public List<Classes> getAllClasses(){
	
	ClassesDAO dao = new ClassesDAO();
	return dao.getAllClasses();
	
	
}
}
