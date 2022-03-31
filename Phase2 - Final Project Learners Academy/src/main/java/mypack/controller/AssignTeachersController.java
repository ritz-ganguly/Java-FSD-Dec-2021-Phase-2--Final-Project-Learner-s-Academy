package mypack.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypack.entity.Subjects;
import mypack.entity.Teachers;
import mypack.service.SubjectTeacherService;

@WebServlet("/assignTeachers")
public class AssignTeachersController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String subjectName = request.getParameter("subject");
		String teacherName  = request.getParameter("teacher");
		Subjects s = new Subjects();
		s.setSubjectName(subjectName);
		Teachers t = new Teachers();
		t.setFirstName(teacherName);
		
		SubjectTeacherService service = new SubjectTeacherService();
		service.assignSubjectToTeacher(s, t);
		getServletConfig().getServletContext().getRequestDispatcher("/adminhome.jsp").forward(request,response);
	}

}
