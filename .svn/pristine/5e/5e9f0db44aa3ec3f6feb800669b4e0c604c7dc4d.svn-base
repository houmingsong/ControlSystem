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

import com.j1635web.bean.FindWareHouse;
import com.j1635web.bean.PageBean;
import com.j1635web.bean.WarehouseBean;
import com.j1635web.service.IWareHouseService;
import com.j1635web.service.impl.WarehouseServiceImpl;

/**
 * 查看出库详情
 */
@WebServlet("/findhouse")
public class FindWareHouseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int classid = Integer.parseInt(request.getParameter("classid"));
		Date time = Date.valueOf(request.getParameter("date"));
		String username = request.getParameter("username");
		
		IWareHouseService ser = new WarehouseServiceImpl();
		List<FindWareHouse> list =ser.findFWareHouseByItem(classid, username, time);
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("jsp/findhouse.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
