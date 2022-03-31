package mypack.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypack.entity.Students;
import mypack.service.StudentsService;


@WebServlet("/listOfStudents")
public class StudentsMasterListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentsService service = new StudentsService();
		List<Students> studs = service.getAllStudents();
		PrintWriter out = response.getWriter();
		//out.println(studs);
		request.setAttribute("students",studs);
		getServletConfig().getServletContext().getRequestDispatcher("/studentslist.jsp").forward(request,response);
	}

}
