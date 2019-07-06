package com.j1635web.servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.j1635web.bean.ThingBean;
import com.j1635web.service.IThingService;
import com.j1635web.service.impl.ThingServiceImpl;
import com.j1635web.util.DateChange;


@WebServlet("/AddThingServlet")
public class AddThingServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	            IThingService service=new ThingServiceImpl();
	            ThingBean thingBean=new ThingBean();
	            String name = request.getParameter("name");
	            String image = request.getParameter("image");
	            String date = request.getParameter("time");
	            String[] kind = request.getParameterValues("kind");
	            String[] condition = request.getParameterValues("condition");
	            String find = request.getParameter("find");
	            String description = request.getParameter("description");
	            String areaName = request.getParameter("areaName");
	            String defend = request.getParameter("defend");
	            Date time=DateChange.getDate(date);
	            thingBean.setAreaName(areaName);
	            thingBean.setCondition(condition[0]);
	            thingBean.setDescription(description);
	            thingBean.setFind(find);
	            thingBean.setImage(image);
	            thingBean.setKind(kind[0]);
	            thingBean.setName(name);
	            thingBean.setTime(time);
	            thingBean.setdefend(defend);
	            service.add(thingBean);
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
