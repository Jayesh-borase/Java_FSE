package com.Day8.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultDemo {
	public static void main(String[] args) {
		String sql = "select * from cust";
		
		try{
			Connection conn = JDBCFactory.getConnection();
			Statement stmt = conn.createStatement();
			
			//Execute DQL Operation and getting results into ResultSet
			ResultSet rs = stmt.executeQuery(sql);
//			while(rs.next()) {
//				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
//			}
			
			ResultSetMetaData meta = rs.getMetaData();
			System.out.println(meta.getColumnCount());
			
			while(rs.next()) {
				for(int c=1;c<=meta.getColumnCount();c++) {
					System.out.print(rs.getString(c)+" ");
				}
				System.out.println();
			}
			
			
			conn.close();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
}
