package com.j1635web.servlet;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.map.ObjectMapper;

import com.j1635web.bean.InstrumentBean;
import com.j1635web.bean.PageBean;
import com.j1635web.bean.WarehouseBean;
import com.j1635web.service.IInstrumentService;
import com.j1635web.service.IWareHouseService;
import com.j1635web.service.impl.InstrumentServiceImpl;
import com.j1635web.service.impl.WarehouseServiceImpl;

/**
 * 出库管理
 * @author 陈川
 *
 */
@WebServlet("/wareHouse")
public class WareHouseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IWareHouseService waser = new WarehouseServiceImpl();
		String thispages = request.getParameter("thispage");
		String instrumentname = request.getParameter("instrumentname");
		String instrumenttype = request.getParameter("instrumenttype");
		String instrumentkind = request.getParameter("instrumentkind");
		Date startdate = null;
		Date enddate = null;
		if(instrumentname!=null&&instrumentname.length()!=0) {
			startdate = Date.valueOf(instrumentname);
		}
		if(instrumenttype!=null&&instrumenttype.length()!=0) {
			enddate = Date.valueOf(instrumenttype);
		}
		if(thispages!=null) {
			int thispage = Integer.parseInt(thispages);
			List<WarehouseBean> list = waser.findByItem(startdate, enddate, instrumentkind, (thispage-1)*5);
			int max = waser.findCount(startdate, enddate, instrumentkind);
			PageBean<WarehouseBean> page = new PageBean<WarehouseBean>();
			int maxpage = (max+5-1)/5;
			if(maxpage<1) {
				maxpage =1;
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
