package com.j1635web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.j1635web.service.IUserService;
import com.j1635web.service.impl.UserServiceImpl;

/**
 * Servlet implementation class UpdateuserServlet
 */
@WebServlet("/UpdateuserServlet")
public class UpdateUserServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		IUserService user = new UserServiceImpl();
		HttpSession session=request.getSession();
		request.setCharacterEncoding("UTF-8"); 
		String password = request.getParameter("password");
		String userLevel = request.getParameter("userLevel");
	Integer id=	(Integer)session.getAttribute("id");
		user.update(password, userLevel,id);
	response.sendRedirect("jsp/user.jsp");
	
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
