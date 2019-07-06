package com.j1635web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.j1635web.bean.AreaBean;
import com.j1635web.service.IAreaService;
import com.j1635web.service.impl.AreaServiceImpl;

@WebServlet("/AddAreaServlet")
public class AddAreaServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		 
		String areaName = request.getParameter("areaName");
		String treeKind = request.getParameter("treeKind");
		String treeAdvantage = request.getParameter("treeAdvantage");
		String areaKind = request.getParameter("areaKind");

		AreaBean areaBean = new AreaBean(null, areaName, treeKind, treeAdvantage, areaKind);	
		IAreaService ia = new AreaServiceImpl();
		ia.add(areaBean);

		response.sendRedirect("jsp/area.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
