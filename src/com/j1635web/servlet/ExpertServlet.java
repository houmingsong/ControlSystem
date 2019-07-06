package com.j1635web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.j1635web.bean.PageBean;
import com.j1635web.service.IExpertService;
import com.j1635web.service.impl.ExpertServiceImpl;


@WebServlet("/ExpertServlet")
public class ExpertServlet extends HttpServlet {
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          IExpertService expertService=new ExpertServiceImpl();
  
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String name = request.getParameter("name");
		String expertise = request.getParameter("expertise");
		String company = request.getParameter("company");
		String currPage = request.getParameter("currentPage");
 		Integer currentPage=Integer.parseInt(currPage);
		 PageBean   pageBean = expertService.findExpertByCondition(name, expertise, company, currentPage);
		int totalPage = pageBean.getTotalPage();
		 if (currentPage  < 1) {
			currentPage = 1;
		} 
		if (currentPage  > totalPage) {
			currentPage = totalPage;
		}
	
		ObjectMapper om = new ObjectMapper();
		om.writeValue(response.getOutputStream(), pageBean);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
