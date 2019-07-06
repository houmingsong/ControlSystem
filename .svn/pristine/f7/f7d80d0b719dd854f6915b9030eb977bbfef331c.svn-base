package com.j1635web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.j1635web.bean.DiseaseBean;
import com.j1635web.service.IDiseaseService;
import com.j1635web.service.impl.DiseaseServiceImpl;


@WebServlet("/DiseaseFindServlet")
public class DiseaseFindServlet extends HttpServlet {
	private IDiseaseService service=new DiseaseServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		int id=Integer.parseInt(request.getParameter("id"));
		
		DiseaseBean diseaseBean=service.findById(id);
		
		request.setAttribute("DiseaseBean", diseaseBean);
			
		request.getRequestDispatcher("jsp/finddisease.jsp").forward(request, response);
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
