package com.j1635web.servlet;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.map.ObjectMapper;

import com.j1635web.bean.InstrumentBean;
import com.j1635web.bean.UserBean;
import com.j1635web.bean.WarehouseBean;
import com.j1635web.service.IInstrumentService;
import com.j1635web.service.IWareHouseService;
import com.j1635web.service.impl.InstrumentServiceImpl;
import com.j1635web.service.impl.WarehouseServiceImpl;

/**
 * 添加出库信息
 * @author 陈川
 *
 */
@WebServlet("/addWareHouse")
public class AddWareHouseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		String str = request.getParameter("str");
		String minclass = request.getParameter("minclass");
		Integer classid = null;
		String mess = "";
		IInstrumentService inser = new InstrumentServiceImpl();
		
		if(minclass!=null&&minclass.length()!=0) {
			classid = Integer.parseInt(minclass);
		}
		String[] strarray1 = str.split("&");
		for (String string : strarray1) {
			String[] s = string.split(",");
			int number = Integer.parseInt(s[0]);
			int id = Integer.parseInt(s[1]);
			InstrumentBean ins = inser.findById(id);
			if(number>ins.getNumber()) {
				mess+=ins.getName()+"库存不足;"+"\n";
				
			}
		}
		if(mess.length()==0) {//库存全部充足
			SimpleDateFormat dates = new SimpleDateFormat("yyyy-MM-dd");
			String da = dates.format(System.currentTimeMillis());
			IWareHouseService ws = new WarehouseServiceImpl();
			for (String string : strarray1) {
				String[] s = string.split(",");
				int number = Integer.parseInt(s[0]);
				int id = Integer.parseInt(s[1]);
				//库存减少
				boolean isok = inser.updateInstrumentBeanNumber(id, -number);
				
				if(isok) {
					WarehouseBean wbean = new WarehouseBean();
					wbean.setNumber(number);
					wbean.setUserName("aa");//user.getUserName()
					wbean.setTime(da);
					wbean.setInstrumentId(id);
					wbean.setClassId(classid);
					isok = ws.add(wbean);
				}
			}
			response.getWriter().write("出库成功");
		}else {
			response.getWriter().write(mess);
		}	
		
 	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
