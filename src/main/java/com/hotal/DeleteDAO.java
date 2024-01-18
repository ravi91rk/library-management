package com.hotal;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;

public class DeleteDAO {

	public int k=0;
	public int delete(HttpServletRequest req) {
		
		try {
			
			Connection con=DBConnection.getConn();
			PreparedStatement ps=con.prepareStatement
					("delete from adminBook where bid=?");
			ps.setString(1, req.getParameter("bookId"));
			
			
			k=ps.executeUpdate();
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}

}
