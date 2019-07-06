package com.j1635web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.j1635web.bean.PageBean;
import com.j1635web.bean.ThingBean;
import com.j1635web.service.IThingService;
import com.j1635web.service.impl.ThingServiceImpl;

@WebServlet("/ApplyServlet")
public class ApplyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		IThingService service = new ThingServiceImpl();
		
		request.setCharacterEncoding("utf-8");
		ServletContext context = request.getServletContext();
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		ThingBean thingBean = service.findById(id);
		
		String condition = thingBean.getCondition();
		String name = thingBean.getName();
		String areaName = thingBean.getAreaName();
		PageBean<ThingBean> pageBean = new PageBean<ThingBean>();
		
		List<ThingBean> list = service.findByItem(null, condition,null, null, null, 1);
		if(condition.equals("无法解决，申请专家会商")) {
			pageBean.setList(list);
			context.setAttribute("pageBean", pageBean);
		}else {
			response.sendRedirect("jsp/event.jsp");
		}
		
		response.sendRedirect("jsp/event.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
