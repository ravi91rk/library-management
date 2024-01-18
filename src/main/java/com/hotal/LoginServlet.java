package com.hotal;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException ,IOException
	{
		AdminBean ab=new LoginDAO().login(req);
		if(ab==null) {
			req.setAttribute("msg", "UserName or PassWord not matched....!");
			req.getRequestDispatcher("Insert.jsp").forward(req, res);
		}
		else {
			HttpSession hs=req.getSession();
			hs.setAttribute("abean", ab);
			req.getRequestDispatcher("ViewData.jsp").forward(req, res);
		}
	}

}
