package mypack.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypack.entity.Subjects;
import mypack.service.SubjectClassService;


@WebServlet("/assignSubjects")
public class AssignSubjectsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String subjectName = request.getParameter("subject");
		String className  = request.getParameter("class");
		
		Subjects s = new Subjects();
		s.setClassName(className);
		s.setSubjectName(subjectName);
		
		SubjectClassService service = new SubjectClassService();
		service.assignSubjectsToClass(s);
		getServletConfig().getServletContext().getRequestDispatcher("/adminhome.jsp").forward(request,response);
		
	}

}
