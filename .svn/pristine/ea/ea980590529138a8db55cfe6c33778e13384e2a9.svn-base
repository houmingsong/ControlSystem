package com.j1635web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.j1635web.bean.UserBean;
import com.j1635web.service.IUserService;
import com.j1635web.service.impl.UserServiceImpl;

/**
 * Servlet implementation class addIUserServlet
 */
@WebServlet("/addIUserServlet")
public class AddUserServlet extends HttpServlet {
	IUserService  user=new UserServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   request.setCharacterEncoding("UTF-8");
	   String name = request.getParameter("name");
	   String password = request.getParameter("password");
	   String realName = request.getParameter("realName");
	   String userLevel = request.getParameter("userLevel");
	   UserBean userBean=new UserBean(null, name, password, realName, userLevel);
	   user.add(userBean);
	  response.sendRedirect("jsp/user.jsp");
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
