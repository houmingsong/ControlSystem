package com.j1635web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.j1635web.bean.UserBean;
import com.j1635web.service.IUserService;
import com.j1635web.service.impl.UserServiceImpl;

/**
 * Servlet implementation class updateIUserServlet
 */
@WebServlet("/UpdateFindUserServlet")
public class UpdateFindUserServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IUserService user = new UserServiceImpl();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		Integer id = Integer.parseInt(request.getParameter("id"));
		UserBean userBean = user.findById(id);
		HttpSession session=request.getSession();
		session.setAttribute("id", id);
		session.setAttribute("userBean", userBean);
		request.getRequestDispatcher("/jsp/updateuser.jsp").forward(request, response);
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
