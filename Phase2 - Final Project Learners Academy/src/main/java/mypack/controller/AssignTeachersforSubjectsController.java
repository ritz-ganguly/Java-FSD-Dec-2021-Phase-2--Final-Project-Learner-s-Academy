package mypack.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypack.entity.Subjects;
import mypack.entity.Teachers;
import mypack.service.SubjectsService;
import mypack.service.TeachersService;


@WebServlet("/assignTeachersForSubjects")
public class AssignTeachersforSubjectsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SubjectsService service = new SubjectsService();
		List<Subjects> subjects = service.getAllSubjects();
		request.setAttribute("subjects",subjects);
		
		TeachersService service1 = new TeachersService();
		List<Teachers> teachers = service1.getAllTeachers();
		request.setAttribute("teachers",teachers);
		getServletConfig().getServletContext().getRequestDispatcher("/assignteacherstosubjects.jsp").forward(request,response);
		
		
	}

}
