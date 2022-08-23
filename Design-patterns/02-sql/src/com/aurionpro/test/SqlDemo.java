package com.aurionpro.test;

import java.sql.*;

public class SqlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/ashishdb1";
		String uname = "root";
		String pass = "mysql@123";

		String query = "desc table employee1;";
		String query2 = "select * from employee1";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			System.out.println("no class");
		}
		Connection con;
		try {
			con = DriverManager.getConnection(url, uname, pass);

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);

			System.out.println("ID|  Name  |  City");
			System.out.println("----------------------------");

			while (rs.next()) {

				String city = rs.getString("EmpCity");
				String name = rs.getString("EmpName");
				String id = rs.getString("EmpId");

				System.out.println(id + " | " + name + " | " + city);
				System.out.println("-------------------------------");
				
			
			}

			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("connection error" + e);
		}

	}

}
