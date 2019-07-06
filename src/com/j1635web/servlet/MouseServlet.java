package com.j1635web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.j1635web.bean.MouseBean;
import com.j1635web.bean.PageBean;
import com.j1635web.bean.WormBean;
import com.j1635web.service.IMouseService;
import com.j1635web.service.impl.MouseServiceImpl;


@WebServlet("/MouseServlet")
public class MouseServlet extends HttpServlet {
	private IMouseService service=new MouseServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String name=request.getParameter("name");
		String currPage = request.getParameter("currentPage");
 		Integer currentPage=Integer.parseInt(currPage);

 		Integer totalPage=service.getCount(name, currentPage);
		
 		
		 if (currentPage  < 1) {
			currentPage = 1;
		} 
		if (currentPage  > totalPage) {
			currentPage = totalPage;
		}
		
		List<MouseBean> list=service.findByItem(name, currentPage);
		
		PageBean<MouseBean> pageBean =new PageBean<MouseBean>();
		
		pageBean.setList(list);
		pageBean.setCurrentPage(currentPage);
		pageBean.setTotalPage(totalPage);
		
		ObjectMapper om=new ObjectMapper();
		om.writeValue(response.getOutputStream(),pageBean);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
