package com.Day8.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {
	public static void main(String[] args) {
		String sql = "insert into cust values(12,'Polo','Pune')";
		
		try {
			Connection conn = JDBCFactory.getConnection();
			
			//Createing Statement to execute hardcoded query
			Statement stmt = conn.createStatement();
			//Performing DML Operation
			stmt.executeUpdate(sql);
			System.out.println("Record Inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
