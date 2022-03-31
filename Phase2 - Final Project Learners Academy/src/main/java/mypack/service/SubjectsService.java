package mypack.service;

import java.util.List;

import mypack.dao.SubjectsDAO;
import mypack.entity.Subjects;

public class SubjectsService {

	public List<Subjects> getDistinctSubjects(){
	
	SubjectsDAO dao = new SubjectsDAO();
	return dao.getAllSubjects();
	
}
	
	public List<Subjects> getAllSubjects(){
		
		SubjectsDAO dao = new SubjectsDAO();
		return dao.returnAllSubjects();
		
	}
}
