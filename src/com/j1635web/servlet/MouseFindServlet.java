package com.j1635web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.j1635web.bean.MouseBean;
import com.j1635web.service.IMouseService;
import com.j1635web.service.impl.MouseServiceImpl;


@WebServlet("/MouseFindServlet")
public class MouseFindServlet extends HttpServlet {
	private IMouseService service=new MouseServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		int id=Integer.parseInt(request.getParameter("id"));
		
		MouseBean mouseBean=service.findById(id);
		
		request.setAttribute("MouseBean", mouseBean);
			
		request.getRequestDispatcher("jsp/findmouse.jsp").forward(request, response);
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
