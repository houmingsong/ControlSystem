package com.j1635web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.j1635web.service.IUserService;
import com.j1635web.service.impl.UserServiceImpl;

/**
 * Servlet implementation class DelClassServlet
 */
@WebServlet("/DelUserServlet")
public class DelUserServlet extends HttpServlet {
	IUserService user=new UserServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str = request.getParameter("id");
		int id = Integer.parseInt(str);
		user.del(id);
		response.sendRedirect("jsp/user.jsp");
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
