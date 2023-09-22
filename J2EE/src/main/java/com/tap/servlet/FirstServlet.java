package com.tap.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{

//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
//			throws ServletException, IOException {
//		
////		resp.setContentType("text/html");
////		PrintWriter writer = resp.getWriter();
////		writer.println("<h3>doGet() service method called</h3>");
//		
//		
////		
//		
//		
//	}
	
//	@Override
//	public void init() throws ServletException {
//		System.out.println("init() method called");
//	}
//	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("doGet() method called");
//	}
//	
//	
//	@Override
//	public void destroy() {
//		System.out.println("destroy method called");
//	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
//		String name = req.getParameter("name");
//		String desg = req.getParameter("desg");
//		String ts = req.getParameter("techskills");
////		
//		System.out.println("name: "+name);
//		System.out.println("desg: "+desg);
//		System.out.println("tech skills: "+ts);
		
		
//		Enumeration<String> pN = req.getParameterNames();
//		while(pN.hasMoreElements()) {
//			System.out.println(pN.nextElement());
//		}
		String name = req.getParameter("name");
     	String desg = req.getParameter("desg");
		String [] pV = req.getParameterValues("techskills");
		
		System.out.println("name : "+name);
		System.out.println("Designation: "+desg);
		
		for(String i:pV) {
			System.out.println(i);
		}
		
		//Send response to the client
//		RequestDispatcher rd =req.getRequestDispatcher("staticresp.html");
//		rd.forward(req, resp);
		
		//sending dynamic response
		
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.println("<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "	<h3> Thank you for your response"+name +"</h3>\r\n"
				+ "</body>\r\n"
				+ "</html>");
		
	}
}



