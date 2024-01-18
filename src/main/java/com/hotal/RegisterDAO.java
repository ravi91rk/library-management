package com.hotal;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;

public class RegisterDAO {
	
	public int k=0;
	public int insert(AdminBean ab) {
		try {
			Connection con=DBConnection.getConn();
			PreparedStatement ps =con.prepareStatement
					("insert into Adminlibrary values (?,?,?,?,?,?)");
			ps.setString(1, ab.getUser());
			ps.setString(2, ab.getPword());
			ps.setString(3,ab.getName());
			ps.setString(4,ab.getEmail());
			ps.setString(5, ab.getPin());
			ps.setLong(6,ab.getPhon());
			k=ps.executeUpdate();	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return k;
		
	}
	

}
