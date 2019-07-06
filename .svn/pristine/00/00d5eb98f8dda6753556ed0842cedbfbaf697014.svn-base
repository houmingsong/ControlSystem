package com.j1635web.servlet;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.j1635web.bean.MouseBean;
import com.j1635web.service.IMouseService;
import com.j1635web.service.impl.MouseServiceImpl;


@WebServlet("/MouseAddServlet")
@MultipartConfig
public class MouseAddServlet extends HttpServlet {
	private IMouseService service=new MouseServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		response.setContentType("image/jpeg");
		
		String image="";
		Collection<Part> part=request.getParts();
		for (Part p : part) {
			String fileInfo=p.getHeader("Content-Disposition");
			if(fileInfo.contains("filename")) {
				String fileName=this.getFileName(fileInfo);
				
				String uploadDir=this.getServletContext().getRealPath("img");
				
				String filePath=uploadDir+"\\"+fileName;
				
				p.write(filePath);
				
				image+=fileName;
			}
		}
		
		
		String name=request.getParameter("name");
		String food=request.getParameter("food");
		String breed=request.getParameter("breed");
		String enemy=request.getParameter("enemy");
		String defend=request.getParameter("defend");
		String harm=request.getParameter("harm");
		
		MouseBean mouseBean=new MouseBean(null, name, food, breed, enemy, image, defend, harm);
		service.add(mouseBean);
		
		response.sendRedirect("jsp/mouse.jsp");
		
	}

	private String getFileName(String fileInfo) {
		String[] arr2=fileInfo.split("\"");
		String name=arr2[arr2.length-1];
		return name;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
