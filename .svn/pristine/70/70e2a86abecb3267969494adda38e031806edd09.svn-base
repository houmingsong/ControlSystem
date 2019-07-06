package com.j1635web.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.j1635web.bean.PageBean;
import com.j1635web.bean.ThingBean;


@WebServlet("/TalkServlet")
public class TalkServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                   request.setCharacterEncoding("utf-8");
                   ServletContext context=request.getServletContext();
                   PageBean pageBean =(PageBean)context.getAttribute("pageBean");
                   
       			ObjectMapper om = new ObjectMapper();
       			om.writeValue(response.getOutputStream(), pageBean);
       			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
