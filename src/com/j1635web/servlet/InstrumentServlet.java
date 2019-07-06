package com.j1635web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.codehaus.jackson.map.ObjectMapper;

import com.j1635web.bean.InstrumentBean;
import com.j1635web.bean.PageBean;
import com.j1635web.dao.IInstrumentDao;
import com.j1635web.dao.impl.InstrumentDaoImpl;
import com.j1635web.service.IInstrumentService;
import com.j1635web.service.impl.InstrumentServiceImpl;
import com.j1635web.util.DBUtil;

/**
 * 按当前页码查询药剂
 * @author 陈川
 *
 */
@WebServlet("/instrument")
public class InstrumentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IInstrumentService insser = new InstrumentServiceImpl();
		String thispages = request.getParameter("thispage");
		String instrumentname = request.getParameter("instrumentname");
		String instrumenttype = request.getParameter("instrumenttype");
		String instrumentkind = request.getParameter("instrumentkind");
		if(thispages!=null) {
			int thispage = Integer.parseInt(thispages);
			List<InstrumentBean> list = insser.findByItems(instrumentname, instrumenttype, instrumentkind, (thispage-1)*5);
			int max = insser.findCount(instrumentname, instrumenttype, instrumentkind);
			PageBean<InstrumentBean> page = new PageBean<InstrumentBean>();
			int maxpage = (max+5-1)/5;
			if(maxpage < 1) {
				maxpage = 1;
			}
			page.setTotalPage(maxpage);
			page.setCurrentPage(thispage);
			page.setList(list);
			ObjectMapper om = new ObjectMapper();
			om.writeValue(response.getOutputStream(), page);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
