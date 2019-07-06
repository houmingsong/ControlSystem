package com.j1635web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.j1635web.bean.InstrumentBean;
import com.j1635web.service.IInstrumentService;
import com.j1635web.service.impl.InstrumentServiceImpl;

/**
 * 添加药剂器械
 * @author 陈川
 *
 */
@WebServlet("/addinstrument")
public class AddInstrumentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String num = request.getParameter("number");
		String type = request.getParameter("type");
		String kind = request.getParameter("kind");
		String zyyt = request.getParameter("zyyt");
		Integer number=0;
		IInstrumentService ser = new InstrumentServiceImpl();
		if(num!=null&&num.length()!=0) {
			number = Integer.parseInt(num);
		}
		
		InstrumentBean ins = new InstrumentBean(null,name,kind,zyyt,type,number);
		boolean isOk = ser.add(ins);
		
//		ObjectMapper om = new ObjectMapper();
//		om.writeValue(response.getOutputStream(), isOk);
		
		if(isOk) {
			response.sendRedirect("jsp/inaddisok.jsp");
		}else {
			response.sendRedirect("jsp/addmedicine.jsp");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
