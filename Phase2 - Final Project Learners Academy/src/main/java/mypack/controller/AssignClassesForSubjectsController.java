package mypack.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypack.entity.Classes;
import mypack.entity.Subjects;
import mypack.service.ClassesService;
import mypack.service.SubjectsService;


@WebServlet("/assignClassesForSubjects")
public class AssignClassesForSubjectsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SubjectsService service = new SubjectsService();
		List<Subjects> subjects = service.getAllSubjects();
		request.setAttribute("subjects",subjects);
		PrintWriter out = response.getWriter();
		
		
		ClassesService service2  = new ClassesService();
		List<Classes> classes = service2.getAllClasses();
		request.setAttribute("classes",classes);
		//out.println(classes);
		getServletConfig().getServletContext().getRequestDispatcher("/assignsubjectstoclasses.jsp").forward(request,response);
	}

}
