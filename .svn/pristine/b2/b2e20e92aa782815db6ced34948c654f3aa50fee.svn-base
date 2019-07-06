package com.j1635web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.j1635web.bean.ClassBean;
import com.j1635web.bean.PageBean;
import com.j1635web.service.IClassService;
import com.j1635web.service.impl.ClassServiceimpl;

/**
 * Servlet implementation class minIClassService
 */
@WebServlet("/ClassServlet")
public class ClassServlet extends HttpServlet {
	private IClassService cs = new ClassServiceimpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		/**获取当前页面*/
		String current = request.getParameter("currentPage");
		Integer currentPage = Integer.parseInt(current);
		/**获取小班名称*/
		String className = request.getParameter("className");
		/**获取区域名称*/
		String areaName = request.getParameter("areaName");
		/**获取总页数*/
		Integer totalPage = cs.getTotalPageByItem(className, areaName);

		if (currentPage < 1) {
			currentPage = 1;
		}
		if (currentPage > totalPage) {
			currentPage = totalPage;
		}
		
		/**获取小班的list集合对象*/
		List<ClassBean> list = cs.findByItem(className, areaName, currentPage);

		PageBean<ClassBean> pageBean = new PageBean<ClassBean>();

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
