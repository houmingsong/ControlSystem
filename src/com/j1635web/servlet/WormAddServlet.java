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

import com.j1635web.bean.WormBean;
import com.j1635web.service.IWormService;
import com.j1635web.service.impl.WormServiceImpl;


@WebServlet("/WormAddServlet")
@MultipartConfig
public class WormAddServlet extends HttpServlet {
	private IWormService service=new WormServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		response.setContentType("image/jpeg");
		
		String bigImage="";
		String smallImage="";
		Collection<Part> part=request.getParts();
		int i=0;
		for (Part p : part) {
			String fileInfo=p.getHeader("Content-Disposition");
			if(fileInfo.contains("filename")) {
				String fileName=this.getFileName(fileInfo);
				
				String uploadDir=this.getServletContext().getRealPath("img");
				
				String filePath=uploadDir+"\\"+fileName;
				
				p.write(filePath);
				if(i==0) {
					smallImage=fileName;
				}else {
					bigImage=fileName;
				}

				i=i+1;
				
			}
		}
		
		String name=request.getParameter("name");
		String host=request.getParameter("host");
		String breed=request.getParameter("breed");
		String enemy=request.getParameter("enemy");
		String defend=request.getParameter("defend");
		String harm=request.getParameter("harm");
		
		WormBean wormBean=new WormBean(null, name, host, breed, enemy, bigImage, smallImage, defend, harm);
		service.add(wormBean);
		
		response.sendRedirect("jsp/worm.jsp");
		
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
