package mypack.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypack.entity.Subjects;
import mypack.service.SubjectsService;


@WebServlet("/listOfSubjects")
public class SubjectsMasterListController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SubjectsService service = new SubjectsService();
		List<Subjects> subjects = service.getDistinctSubjects();
		PrintWriter out = response.getWriter();
		//out.println(subjects);
		
		request.setAttribute("subjects",subjects);
		getServletConfig().getServletContext().getRequestDispatcher("/subjectslist.jsp").forward(request,response);
	}

}
