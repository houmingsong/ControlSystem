package com.j1635web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.j1635web.service.IClassService;
import com.j1635web.service.impl.ClassServiceimpl;

/**
 * Servlet implementation class UpdateClassServlet
 */
@WebServlet("/UpdateClassServlet")
public class UpdateClassServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         IClassService clas=new ClassServiceimpl();
		request.setCharacterEncoding("UTF-8");
		HttpSession session=request.getSession();
		String username = request.getParameter("username");
		String tel = request.getParameter("tel");
	Integer id=	(Integer)session.getAttribute("id");
	clas.updateByItem( tel, username,id);
	response.sendRedirect("jsp/minclass.jsp");
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
