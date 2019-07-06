package com.j1635web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.j1635web.bean.ClassBean;
import com.j1635web.bean.UserBean;
import com.j1635web.service.IAreaService;
import com.j1635web.service.IClassService;
import com.j1635web.service.impl.ClassServiceimpl;

/**
 * Servlet implementation class updateIClassServlet
 */
@WebServlet("/UpdateFindClassServlet")
public class UpdateFindClassServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IClassService clas = new ClassServiceimpl();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		Integer id = Integer.parseInt(request.getParameter("id"));
		ClassBean calBean = clas.findById(id);
		
		HttpSession session = request.getSession();
		session.setAttribute("id", id);
		session.setAttribute("ClassBean", calBean);
		
		request.getRequestDispatcher("/jsp/updateclass.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
