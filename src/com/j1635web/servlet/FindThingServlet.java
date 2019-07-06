package com.j1635web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.j1635web.bean.MeetingBean;
import com.j1635web.bean.ThingBean;
import com.j1635web.service.IMeetingService;
import com.j1635web.service.IThingService;
import com.j1635web.service.impl.MeetingServiceImpl;
import com.j1635web.service.impl.ThingServiceImpl;


@WebServlet("/FindThingServlet")
public class FindThingServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        IThingService  service=new ThingServiceImpl();
	        IMeetingService meetingService=new MeetingServiceImpl();
		    request.setCharacterEncoding("utf-8");
	         Integer id = Integer.parseInt(request.getParameter("id"));
	         ThingBean thingBean = service.findById(id);
	         List<MeetingBean> meetingList = meetingService.findByThingId(id);
	         request.setAttribute("meetingList",meetingList);
	         request.setAttribute("thingBean",thingBean);
	         request.getRequestDispatcher("/jsp/findevent.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
