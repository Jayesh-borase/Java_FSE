package com.Day8.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableDemo {
	
	public static void main(String[] args) {
		
		try {
			Connection conn = JDBCFactory.getConnection();
			CallableStatement stmt = conn.prepareCall("{? = get_name(?)}");
			stmt.setInt(2,11);
			 
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
