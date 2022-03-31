package mypack.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypack.entity.Teachers;
import mypack.service.TeachersService;


@WebServlet("/listOfTeachers")
public class TeachersMasterListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      TeachersService service  =  new TeachersService();
      List<Teachers> teachers = service.getAllTeachers();
      PrintWriter out = response.getWriter();
      //out.println(teachers);
      request.setAttribute("teachers",teachers);
		getServletConfig().getServletContext().getRequestDispatcher("/teacherslist.jsp").forward(request,response);
	}

}
