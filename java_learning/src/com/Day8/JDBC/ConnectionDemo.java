package com.Day8.JDBC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDemo {
	public static void main(String[] args) {
//		String url = "jdbc:mysql://localhost:3306/training";
		try {
//		DriverManager.registerDriver(new Driver());
//		Connection con = DriverManager.getConnection(url,"root","aniket47");
		
		Connection con = JDBCFactory.getConnection();
		DatabaseMetaData meta = con.getMetaData();
		System.out.println("DB Name: "+meta.getDatabaseProductName());
		System.out.println("DB Version: "+meta.getDatabaseProductVersion());
		System.out.println("Driver Name: "+meta.getDriverName());
		System.out.println("Driver Version: "+meta.getDriverVersion());
		
		con.close();
		}catch(SQLException ex) {
			System.out.println("Connection Failed due to...");
			ex.printStackTrace();
		}
	}
}
