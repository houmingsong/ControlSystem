package com.j1635web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.j1635web.bean.WormBean;
import com.j1635web.service.IWormService;
import com.j1635web.service.impl.WormServiceImpl;


@WebServlet("/WormFindServlet")
public class WormFindServlet extends HttpServlet {
	private IWormService service=new WormServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		int id=Integer.parseInt(request.getParameter("id"));
		
		WormBean wormBean=service.findById(id);
		
		request.setAttribute("WormBean", wormBean);
			
		request.getRequestDispatcher("jsp/findworm.jsp").forward(request, response);
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
