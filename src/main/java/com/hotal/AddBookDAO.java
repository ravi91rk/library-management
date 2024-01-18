package com.hotal;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddBookDAO {	
	public int k=0;
	public int insertBook(BookBean bb) {
		try {
			Connection con=DBConnection.getConn();
			PreparedStatement ps=con.prepareStatement
					("insert into AdminBook values (?,?,?,?)");
			ps.setString(1, bb.getBookName());
			ps.setString(2, bb.getBookId());
			ps.setString(3, bb.getTypeOfBook());
			ps.setInt(4, bb.getRack());
			k=ps.executeUpdate();	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return k;
	}

}
