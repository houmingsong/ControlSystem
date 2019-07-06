package com.j1635web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.j1635web.bean.DiseaseBean;
import com.j1635web.bean.PageBean;
import com.j1635web.service.IDiseaseService;
import com.j1635web.service.impl.DiseaseServiceImpl;


@WebServlet("/DiseaseServlet")
public class DiseaseServlet extends HttpServlet {
	private IDiseaseService service=new DiseaseServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String name=request.getParameter("name");
		String symptom=request.getParameter("symptom");
		String currPage = request.getParameter("currentPage");
 		Integer currentPage=Integer.parseInt(currPage);
 		
 		Integer totalPage=service.getCount(name, symptom, currentPage);
 		
		if (currentPage  < 1) {
			currentPage = 1;
		} 
		if (currentPage  > totalPage) {
			currentPage = totalPage;
		}
		
		List<DiseaseBean> list=service.findByItem(name, symptom, currentPage);
		
		PageBean<DiseaseBean> pageBean=new PageBean<DiseaseBean>();
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
