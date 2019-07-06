package com.j1635web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.j1635web.bean.ExpertBean;
import com.j1635web.service.IExpertService;
import com.j1635web.service.impl.ExpertServiceImpl;


@WebServlet("/FindExpertServlet")
public class FindExpertServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IExpertService service=new ExpertServiceImpl();    
		Integer id = Integer.parseInt(request.getParameter("id"));
		ExpertBean expertBean = service.findById(id);
		request.setAttribute("expertBean",expertBean);
		    request.getRequestDispatcher("/jsp/findexpert.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
