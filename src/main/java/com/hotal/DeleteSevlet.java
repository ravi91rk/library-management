package com.hotal;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/Delete")
public class DeleteSevlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException , IOException{
		
		HttpSession hs=req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expaired....!");
			req.getRequestDispatcher("Insert.jsp").forward(req, res);
		}
		else 
		{
			int k=new DeleteDAO().delete(req);
			if(k>0) {
				req.setAttribute("msg", "Book Deleted SuccessFully ...!");
				req.getRequestDispatcher("DeleteBook.jsp").forward(req, res);
			}
		}
		
	
	}
	
	
}
