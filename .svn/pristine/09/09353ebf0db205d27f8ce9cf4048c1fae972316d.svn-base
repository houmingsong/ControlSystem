package com.j1635web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.map.ObjectMapper;

import com.j1635web.bean.MeetingBean;
import com.j1635web.bean.ThingBean;
import com.j1635web.service.IMeetingService;
import com.j1635web.service.IThingService;
import com.j1635web.service.impl.MeetingServiceImpl;
import com.j1635web.service.impl.ThingServiceImpl;


@WebServlet("/AddMeetingServlet")
public class AddMeetingServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                   request.setCharacterEncoding("utf-8");
                   IThingService  service=new ThingServiceImpl();
                   IMeetingService meetingService=new MeetingServiceImpl();
                   MeetingBean meetingBean=new MeetingBean();
                   String time = request.getParameter("time");
                   String result = request.getParameter("result");
                   String[] personarr = request.getParameterValues("person");
                   String person="";
                  for (String string : personarr) {
                	  person+=string+",";
				      }
                 meetingBean.setTime(time);
                 meetingBean.setResult(result);
                 meetingBean.setPerson(person);
                  meetingService.add(meetingBean);
                  List<MeetingBean>meetingList=new ArrayList<MeetingBean>();
                  HttpSession session=request.getSession();
                  Integer id = (Integer)(session.getAttribute("id"));
                  ThingBean thingBean = service.findById(id);
                  meetingList.add(meetingBean);
                  request.setAttribute("thingBean",thingBean);
                  request.setAttribute("meetingList", meetingList);
                  request.getRequestDispatcher("jsp/sstalk.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
