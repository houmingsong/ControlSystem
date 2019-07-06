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
import com.j1635web.bean.PageBean;
import com.j1635web.service.IAreaService;
import com.j1635web.service.impl.AreaServiceImpl;

@WebServlet("/AreaServlet")
public class AreaServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		/** 获取当前页面 */
		String str = request.getParameter("currentPage");
		Integer currentPage = Integer.parseInt(str);

		/** 获取区域名 */
		String areaName = request.getParameter("areaName");
		/** 获取林种 */
		String treeKind = request.getParameter("treeKind");
		/** 获取负责小班名 */
		String className = request.getParameter("className");

		IAreaService as = new AreaServiceImpl();

		/** 获取总页数 */
		Integer totalPage = as.getTotalPageByItem(areaName, treeKind, className);

		if (currentPage < 1) {
			currentPage = 1;
		}
		if (currentPage > totalPage) {
			currentPage = totalPage;
		}
		
		/** 获取区域的list集合对象 */
		List<AreaBean> list = as.findByItem(areaName, treeKind, className, currentPage);

		PageBean<AreaBean> pageBean = new PageBean<AreaBean>();

		pageBean.setList(list);
		pageBean.setCurrentPage(currentPage);
		pageBean.setTotalPage(totalPage);

		ObjectMapper om = new ObjectMapper();
		om.writeValue(response.getOutputStream(), pageBean);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
