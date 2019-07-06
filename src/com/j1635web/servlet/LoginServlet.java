package com.j1635web.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.j1635web.bean.ClassBean;
import com.j1635web.bean.LogBean;
import com.j1635web.bean.UserBean;
import com.j1635web.dao.ILogDao;
import com.j1635web.dao.impl.LogDaoImpl;
import com.j1635web.service.IClassService;
import com.j1635web.service.IUserService;
import com.j1635web.service.impl.ClassServiceimpl;
import com.j1635web.service.impl.UserServiceImpl;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("pwd");
		ILogDao ldao = new LogDaoImpl();
		IUserService service = new UserServiceImpl();
		UserBean user = service.login(username, password);
		IClassService ic = new ClassServiceimpl();
		List<ClassBean> clist = ic.findAll();
		
		if (user != null) {
			SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
			String str = s.format(new Date(System.currentTimeMillis()));
			LogBean log = new LogBean();
			log.setInfo("用户" + user.getUserName() + "在" + str + "登录系统");
			ldao.add(log);
			String jurisdiction =user.getUserLevel();
			
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			session.setAttribute("Jurisdiction", jurisdiction);
			session.setAttribute("clist", clist);
			response.sendRedirect("jsp/index.jsp");
		} else {
			response.sendRedirect("jsp/login.jsp?error=yes");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
