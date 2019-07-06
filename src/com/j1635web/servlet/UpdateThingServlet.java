package com.j1635web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.j1635web.bean.ThingBean;
import com.j1635web.service.IThingService;
import com.j1635web.service.impl.ThingServiceImpl;


@WebServlet("/UpdateThingServlet")
public class UpdateThingServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		     IThingService  service=new ThingServiceImpl();
		     
		    request.setCharacterEncoding("utf-8");
	         Integer id = Integer.parseInt(request.getParameter("id"));
	         ThingBean thingBean = service.findById(id);
	         request.setAttribute("thingBean",thingBean);
	         HttpSession session = request.getSession();
	 		session.setAttribute("id", id);
	         request.getRequestDispatcher("/jsp/updateevent.jsp").forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
