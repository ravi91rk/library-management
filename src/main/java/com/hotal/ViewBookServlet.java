package com.hotal;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/ViewBookDetails")
public class ViewBookServlet  extends HttpServlet{

	
	@Override
	protected void  doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException ,IOException
	{
		HttpSession hs=req.getSession();
		if(hs==null) {
			req.setAttribute("msg", "Session Expired ....!");
			req.getRequestDispatcher("BookInsert.jsp").forward(req, res);
		}
		else {
			ArrayList<BookBean> al=new ViewBookDAO().getViewDetails();
			
			hs.setAttribute("viewallbook", al);
			req.getRequestDispatcher("ViewBookDetails.jsp").forward(req, res);
			
		
		}
	}
}
