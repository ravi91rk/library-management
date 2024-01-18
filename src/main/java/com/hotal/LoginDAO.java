package com.hotal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;

public class LoginDAO {
	
	public AdminBean ab=null;
	
	public AdminBean login(HttpServletRequest req) {
		
		try{
			Connection com=DBConnection.getConn();
			PreparedStatement ps=com.prepareStatement
					("select * from Adminlibrary Where UNAME=? AND PASSWORD=?");
			
			ps.setString(1, req.getParameter("id"));
			ps.setString(2, req.getParameter("pword"));
	
			
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				ab=new AdminBean();
				ab.setName(rs.getString(3));
				ab.setEmail(rs.getString(4));
				ab.setPin(rs.getString(5));
				ab.setPhon(rs.getLong(6));
				
					
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		return ab;
	}

}
