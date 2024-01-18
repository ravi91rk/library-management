package com.hotal;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/AddStudent")
public class AddStudentServlet extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException ,IOException
	{
		HttpSession hs=req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expaired....! ");
			req.getRequestDispatcher("BookInsert.jsp").forward(req, res);
 }
		else 
		{
			StudentBean sb= new StudentBean();
			sb.setName(req.getParameter("name"));
			sb.setUname(req.getParameter("uname"));
			sb.setPword(req.getParameter("pword"));
			sb.setAddr(req.getParameter("addr"));
			sb.setAddr(req.getParameter("email"));
			sb.setPhon(Long.parseLong(req.getParameter("phon")));
			
			
			int k=new AddStudentDAO().insertStudentData(sb);
			if(k>0) {
				req.setAttribute("msg", "Student Data Inserted...!");
				req.getRequestDispatcher("BookInsert.jsp").forward(req, res);
			}
		}
		
		
		
	}

}
