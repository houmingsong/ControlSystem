package com.j1635web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.j1635web.bean.PageBean;
import com.j1635web.bean.UserBean;
import com.j1635web.service.IUserService;
import com.j1635web.service.impl.UserServiceImpl;

/**
 * 用户查找servlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private IUserService user=new UserServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setCharacterEncoding("UTF-8");
       //获取用户等级
       String userLevel = request.getParameter("userLevel");
       if(userLevel.equals("所有用户")) {
    	   userLevel=null;
       }
       //获取当前页面
       String current = request.getParameter("currentPage");
       Integer currentPage = Integer.parseInt(current);
       Integer totalPage = user.getTotalCountByItem(userLevel);
       if(currentPage <1) {
    	   currentPage=1;
       }
       if(currentPage > totalPage) {
    	   currentPage=totalPage;
       }
       List<UserBean> list = user.findByItem(userLevel, currentPage);
       PageBean<UserBean> pageBean=new PageBean<UserBean>();
       pageBean.setList(list);
       pageBean.setCurrentPage(currentPage);
       pageBean.setTotalPage(totalPage);
       
       ObjectMapper om=new ObjectMapper();
       om.writeValue(response.getOutputStream(), pageBean);
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
