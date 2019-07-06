package com.j1635web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.j1635web.bean.AreaBean;
import com.j1635web.service.IAreaService;
import com.j1635web.service.impl.AreaServiceImpl;

/**
 * Servlet implementation class ClassAreaFindservlet
 */
@WebServlet("/ClassAreaFindservlet")
public class ClassAreaFindservlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     request.setCharacterEncoding("UTF-8");
     IAreaService area=new AreaServiceImpl();
	List<AreaBean> findByItem = area.findByIte(null, null, null);
	ObjectMapper om=new ObjectMapper();
      om.writeValue(response.getOutputStream(), findByItem);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
