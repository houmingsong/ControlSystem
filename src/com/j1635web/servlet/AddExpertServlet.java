package com.j1635web.servlet;

import java.io.IOException;
import java.sql.Date;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.j1635web.bean.ExpertBean;
import com.j1635web.service.IExpertService;
import com.j1635web.service.impl.ExpertServiceImpl;


@WebServlet("/AddExpertServlet")
@MultipartConfig
public class AddExpertServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IExpertService expertService=new ExpertServiceImpl();
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		response.setContentType("image/jpeg");
		String image="";
		Collection<Part>part=request.getParts();
		for (Part p : part) {
			String fileInfo = p.getHeader("Content-Disposition");
			if(fileInfo.contains("filename")) {
				String fileName=this.getFileName(fileInfo);
				String uploadDir=this.getServletContext().getRealPath("img");
				String filePath=uploadDir+"\\"+fileName;
				p.write(filePath);
				image+=fileName;
			}
		}
		ExpertBean expertBean=new ExpertBean();
		        String name = request.getParameter("name");
		        String sex = request.getParameter("sex");
		        String birthday = request.getParameter("birthady");
		       
		        String expertise = request.getParameter("expertise");
		        String job = request.getParameter("job");
		        String tel = request.getParameter("tel");
		        String company = request.getParameter("company");
		        String address = request.getParameter("address");
		        String email = request.getParameter("email");
		        expertBean.setName(name);
		        expertBean.setSex(sex);
		        expertBean.setBirthday(birthday);
		        expertBean.setImage(image);
		        expertBean.setExpertise(expertise);
		        expertBean.setJob(job);
		        expertBean.setTel(tel);
		        expertBean.setCompany(company);
		        expertBean.setAddress(address);
		        expertBean.setEmail(email);
		        expertService.addExpert(expertBean);
 		        response.sendRedirect("jsp/expert.jsp");
	}

	private String getFileName(String fileInfo) {
		 String[] arr2=fileInfo.split("\"");
		 String name=arr2[arr2.length-1];
		 return name;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
