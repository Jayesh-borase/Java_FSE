package com.Day8.JDBC;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.IOException;

import com.mysql.cj.jdbc.Driver;

public final class JDBCFactory {
	private JDBCFactory() {
	}
	
//	public static Connection getConnection() throws SQLException{
//		String url = "jdbc:mysql://localhost:3306/training";
//		DriverManager.registerDriver(new Driver());
//		Connection conn = DriverManager.getConnection(url,"root","aniket47");
//		return conn;
//	}
	
	public static Connection getConnection() throws SQLException{
		Properties prop = new Properties();
		try {
			prop.load(new FileReader("src/mysql.info"));
			
			String url = prop.getProperty("url");
			Class.forName(prop.getProperty("driver"));
			Connection conn = DriverManager.getConnection(url,"root","aniket47");
			return conn;
		}catch(ClassNotFoundException | IOException ex) {
		    throw new SQLException(ex.getMessage());
		}
	}
}
