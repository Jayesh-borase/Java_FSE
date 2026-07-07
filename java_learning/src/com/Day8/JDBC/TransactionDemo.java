package com.Day8.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {
	public static void main(String[] args) {
		String sql1 = "insert into cust values(1,'Nik','Noida')";
		String sql2 = "update cust set city='Madurai' where cid=11";
		String sql3 = "delete from cust where id=14";
		Connection conn = null;
		try {
			conn = JDBCFactory.getConnection();
			conn.setAutoCommit(false); //Turning off auto-commit
			
			Statement stmt = conn.createStatement();
			//Adding 3 queries as a batch
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			//executing batch of 3 queries
			stmt.executeBatch();
			
			conn.commit();
			System.out.println("Transaction completed");
		} catch (SQLException e) {
			System.out.println("Transaction Failed");
			try {
				conn.rollback();
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			e.printStackTrace();
		}
		
	}
}
