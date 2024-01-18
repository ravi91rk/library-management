package com.hotal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class StudentLoginDAO {
	
		StudentBean sb=null;
		
	public StudentBean getBook(HttpServletRequest req){
		
		try {
			Connection con=DBConnection.getConn();
			PreparedStatement ps=con.prepareStatement
					("select * from LibraryStudent where UNAME=? AND PWORD=?");
			ps.setString(1, req.getParameter("uname"));
			ps.setString(2, req.getParameter("pword"));
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				sb=new StudentBean();
				sb.setName(rs.getString(3));
				sb.setAddr(rs.getString(4));
				sb.setEmail(rs.getString(5));
				
			}
			

			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return sb;
		
	}
	

}
