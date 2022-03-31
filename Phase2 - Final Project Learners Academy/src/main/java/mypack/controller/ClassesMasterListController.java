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
import mypack.service.ClassesService;


@WebServlet("/listOfClasses")
public class ClassesMasterListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClassesService service  = new ClassesService();
		List<Classes> classes = service.getAllClasses();
		PrintWriter out = response.getWriter();
		//out.println(classes);
		request.setAttribute("classes",classes);
		getServletConfig().getServletContext().getRequestDispatcher("/classeslist.jsp").forward(request,response);
	}

}
