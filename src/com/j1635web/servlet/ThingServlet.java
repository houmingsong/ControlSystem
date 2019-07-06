package com.j1635web.servlet;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.j1635web.bean.PageBean;
import com.j1635web.bean.ThingBean;
import com.j1635web.service.IThingService;
import com.j1635web.service.impl.ThingServiceImpl;
import com.j1635web.util.DateChange;

@WebServlet("/ThingServlet")
public class ThingServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		IThingService thingService = new ThingServiceImpl();

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String name = request.getParameter("name");
		String startDate = request.getParameter("startDate");
		String endDate = request.getParameter("endDate");
		Date sDate = DateChange.getDate(startDate);
		Date eDate = DateChange.getDate(endDate);
		String areaName = request.getParameter("location");
		String condition = request.getParameter("condition");
		String currPage = request.getParameter("currentPage");
		Integer currentPage = Integer.parseInt(currPage);
		
		Integer totalPage = thingService.getTotalPageByItem(name, condition, areaName, sDate, eDate);

		if (currentPage < 1) {
			currentPage = 1;
		}
		if (currentPage > totalPage) {
			currentPage = totalPage;
		}
		List<ThingBean> list = thingService.findByItem(name, condition, areaName, sDate, eDate, currentPage);
		
		PageBean<ThingBean> pageBean = new PageBean<ThingBean>();
		
		pageBean.setList(list);
		pageBean.setCurrentPage(currentPage);
		pageBean.setTotalPage(totalPage);
		
		ObjectMapper om = new ObjectMapper();
		om.writeValue(response.getOutputStream(), pageBean);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
