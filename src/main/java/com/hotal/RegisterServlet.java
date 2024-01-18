package com.hotal;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/Register")
public class RegisterServlet  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException ,IOException
	
	{	
		AdminBean ab= new AdminBean();
		ab.setName(req.getParameter("name"));
		ab.setUser(req.getParameter("uname"));
		ab.setPhon(Long.parseLong(req.getParameter("phon")));
		ab.setEmail(req.getParameter("eid"));
		ab.setPin(req.getParameter("pin"));
		ab.setPword(req.getParameter("pword"));
		
		
		int k=new RegisterDAO().insert(ab);
		if(k>0) {
			
			req.setAttribute("msg","Admin DataFully Insert...!");
			req.getRequestDispatcher("Insert.jsp").forward(req, res);
			
		}
		
	
		
	}

}
