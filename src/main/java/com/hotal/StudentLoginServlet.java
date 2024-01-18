package com.hotal;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/StudentLogin")

public class StudentLoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException ,IOException
	{
		StudentBean sb=new StudentLoginDAO().getBook(req);
		if(sb==null) {
			req.setAttribute("msg", "Student Data is not Avilable....!");
			req.getRequestDispatcher("Login.jsp").forward(req, res);
		}
		else {
			HttpSession hs=req.getSession();
			hs.setAttribute("SBean", sb);
			req.getRequestDispatcher("StudentData.jsp").forward(req, res);
		}
	}

}
