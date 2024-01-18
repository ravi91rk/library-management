package com.hotal;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddStudentDAO {
	public int k=0;
	public int insertStudentData(StudentBean sb) {
		
		try {
			Connection con=DBConnection.getConn();
			PreparedStatement ps=con.prepareStatement
					("insert into LibraryStudent values (?,?,?,?,?,?)");
			ps.setString(1, sb.getUname());
			ps.setString(2, sb.getPword());
			ps.setString(3,sb.getName());
			ps.setString(4, sb.getAddr());
			ps.setString(5, sb.getEmail());
			ps.setLong(6, sb.getPhon());
			
			k=ps.executeUpdate();
			
			
		}
		catch(Exception e) {
			
		}
		
		
		return k;
	}

}
