package com.j1635web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.j1635web.service.IThingService;
import com.j1635web.service.impl.ThingServiceImpl;


@WebServlet("/UpdateSuccessServlet")
public class UpdateSuccessServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        IThingService  service=new ThingServiceImpl();
        HttpSession session = request.getSession();
		request.setCharacterEncoding("utf-8");            
		String[] condition = request.getParameterValues("condition");
		  String defend= request.getParameter("defend");
		  Integer id = (Integer)session.getAttribute("id");
		  service.updateById(condition[0], defend, id);
		  response.sendRedirect("jsp/event.jsp");
	}

	/**                   
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
