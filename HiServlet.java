package com.servlet.study.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class HiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HiServlet() {
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = "한글";
		String email = "email@email.com";
		
		response.setContentType("text/html;charset=utf-8");
		
		response.getWriter().print("<html>");
		response.getWriter().print("<head>");
		response.getWriter().print("<title>hello servlet</title>");
		response.getWriter().print("</head>");
		response.getWriter().print("<body>");
		response.getWriter().print("<h1>Hello Servlet</h1>");
		response.getWriter().print("<p>servlet study</p>");
		response.getWriter().print("<p>이름: "+name+ "</p>");
		response.getWriter().print("<p>이메일:"+email+"</p>");
		response.getWriter().print("</body>");
		response.getWriter().print("</html>");
	}

}
