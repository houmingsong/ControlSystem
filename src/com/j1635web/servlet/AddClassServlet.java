package com.j1635web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.j1635web.bean.ClassBean;
import com.j1635web.service.IClassService;
import com.j1635web.service.impl.ClassServiceimpl;

/**
 * Servlet implementation class ClassServlet
 */
@WebServlet("/AddClassServlet")
public class AddClassServlet extends HttpServlet {
  private	IClassService clas=new ClassServiceimpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.setCharacterEncoding("UTF-8");
      String className = request.getParameter("name");
      String principal = request.getParameter("principal");
      String tel = request.getParameter("tel");
      Integer personNumber =Integer.parseInt(request.getParameter("personNumber"));
      String area= request.getParameter("areaId");
      int areaId = Integer.parseInt(area);
      
	  ClassBean classBean=new ClassBean(className, principal, tel, personNumber, areaId);
	   clas.add(classBean);
	     response.sendRedirect("jsp/minclass.jsp");
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
