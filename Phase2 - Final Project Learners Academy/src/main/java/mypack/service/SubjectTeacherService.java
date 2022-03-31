package mypack.service;

import mypack.dao.SubjectTeacherDAO;
import mypack.entity.Subjects;
import mypack.entity.Teachers;

public class SubjectTeacherService {
public synchronized void assignSubjectToTeacher(Subjects s, Teachers t) {
	
	SubjectTeacherDAO dao = new SubjectTeacherDAO();
	dao.assignSubjectToTeacher(s, t);
	
}
}
