package com.hotal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewBookDAO {
	
	ArrayList<BookBean> al=new ArrayList<BookBean>();
	
	public ArrayList<BookBean> getViewDetails() {
		
			try {
				Connection con=DBConnection.getConn();
				PreparedStatement ps=con.prepareStatement
						("select * from AdminBook");
				
				
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					BookBean bb= new BookBean();
						bb.setBookName(rs.getString(1));
						bb.setBookId(rs.getString(2));
						bb.setTypeOfBook(rs.getString(3));
						bb.setRack(rs.getInt(4));
						al.add(bb);				
				}		
			}
			catch(Exception e) {			
			}
		return al;
		
	}
	
	
	

}
