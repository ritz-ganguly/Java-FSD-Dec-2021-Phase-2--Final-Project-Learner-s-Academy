package mypack.service;

import mypack.dao.SubjectClassDAO;
import mypack.entity.Subjects;

public class SubjectClassService {

	public synchronized void assignSubjectsToClass(Subjects s) {
		
		SubjectClassDAO dao = new SubjectClassDAO();
		dao.assignSubjectsToClasss(s);
	}
}
