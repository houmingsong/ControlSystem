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
import com.j1635web.bean.LogBean;
import com.j1635web.bean.PageBean;
import com.j1635web.service.ILogService;
import com.j1635web.service.impl.LogServiceImpl;
import com.j1635web.util.DateChange;

@WebServlet("/LogServlet")
public class LogServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String currPage = request.getParameter("currentPage");
		Integer currentPage = Integer.parseInt(currPage);
		
		String start = request.getParameter("startDate");
		Date startDate = DateChange.getDate(start);
		
		String end = request.getParameter("endDate");
		Date endDate = DateChange.getDate(end);
		
		ILogService logService = new LogServiceImpl();
		
		Integer totalPage = logService.getTotalPageByItem(startDate, endDate);
		
		if (currentPage < 1) {
			currentPage = 1;
		}
		if (currentPage > totalPage) {
			currentPage = totalPage;
		}
		/** 获取区域的list集合对象 */
		List<LogBean> list = logService.findByItem(startDate, endDate, currentPage);
		
		PageBean<LogBean> pageBean = new PageBean<LogBean>();
		
		pageBean.setList(list);
		pageBean.setTotalPage(totalPage);
		pageBean.setCurrentPage(currentPage);
		
		ObjectMapper om = new ObjectMapper();
		om.writeValue(response.getOutputStream(), pageBean);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
