package com.hotal;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/AddBook")
public class AddBookServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException ,IOException
	
	{
		BookBean bb=new BookBean();
		bb.setBookId(req.getParameter("id"));
		bb.setBookName(req.getParameter("name"));
		bb.setTypeOfBook(req.getParameter("type"));
		bb.setRack( Integer.parseInt( req.getParameter("rack")));
		
		
		HttpSession hs= req.getSession();
		if(hs==null) {
			req.setAttribute("msg", "Session Expire....!");
			req.getRequestDispatcher("Insert.jsp").forward(req, res);
		}
		else {
			
			int k= new AddBookDAO().insertBook(bb);
			hs.setAttribute("bbean", bb);
			if(k>0) {
				req.setAttribute("msg", "Book SuccessFully Insert");
				req.getRequestDispatcher("BookInsert.jsp").forward(req, res);
			}
			
			
		}
		

		
	}

}
