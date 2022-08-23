package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateConnection {

	static Connection conn = null;

	public static Connection getConnection() {

		if (conn != null)
			return conn;

		String url = "jdbc:mysql://localhost:3306/ashishdb1";
		String uname = "root";
		String pass = "mysql@123";

		return getConnection(url, uname, pass);
	}

	public static Connection getConnection(String url, String uname, String pass) {

		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, uname, pass);
		} catch (SQLException e) {

			System.out.println(e);
		}

		return conn;
	}

}
