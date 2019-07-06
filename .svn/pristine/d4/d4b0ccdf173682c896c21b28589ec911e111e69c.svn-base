package com.j1635web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.ognl.internal.ClassCacheImpl;

import com.j1635web.bean.ClassBean;
import com.j1635web.service.IClassService;
import com.j1635web.service.impl.ClassServiceimpl;

/**
 * Servlet implementation class findIClassServlet
 */
@WebServlet("/FindClassServlet")
public class FindClassServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		IClassService cs = new ClassServiceimpl();  
		Integer id = Integer.parseInt(request.getParameter("id"));
		ClassBean classBean = cs.findById(id);
		
		request.setAttribute("classBean",classBean);
		request.getRequestDispatcher("/jsp/findclass.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
