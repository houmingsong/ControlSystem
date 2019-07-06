package com.j1635web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.j1635web.service.IExpertService;
import com.j1635web.service.impl.ExpertServiceImpl;

@WebServlet("/UpServlet")
public class UpServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	          IExpertService service=new ExpertServiceImpl();
	          HttpSession session = request.getSession();
		      request.setCharacterEncoding("utf-8");
	          String job = request.getParameter("job");
	          String company = request.getParameter("company");
	          String email = request.getParameter("email");
	          String tel = request.getParameter("tel");
	          Integer id = (Integer)session.getAttribute("id");
	          service.updateById(tel, company, job, email, id);
	          response.sendRedirect("jsp/expert.jsp");
	} 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
