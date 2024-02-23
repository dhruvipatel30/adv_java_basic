package com.util;

import java.sql.*;

public class DbConnection {
	public static void main(String[] args) {
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/royal_adv_java";
		String userName = "root";
		String password = "dhrudravi";
		
		try {
			//load driver
			Class.forName(driverName);
			
			//open database connection
			Connection con = DriverManager.getConnection(url, userName, password);
			
			System.out.println("Db -- connected");
			System.out.println(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
