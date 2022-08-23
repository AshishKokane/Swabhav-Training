package com.aurionpro.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.aurionpro.model.CreateConnection;

public class CallConnection {

	public static void main(String[] args) throws SQLException {
		Connection con = CreateConnection.getConnection();
		if (con != null) {
			System.out.println("Connection successful !!!");
			System.out.println();

		}

		createTable(con);

		viewTable(con);
		System.out.println();
		System.out.println("");

		insertValueInTable(con);
		

		viewTable(con);

		updateTable(con);
		
		viewTable(con);

		dropTable(con);
		
		//viewTable(con);

		closeConnection(con);
		
		//viewTable(con);

	}

	private static void updateTable(Connection con) {

		try {
			final String UPDATE_Table = "update registration set last = ? where id = ?;";
		 
			PreparedStatement preparedStatement = con.prepareStatement(UPDATE_Table);
			preparedStatement.setString(1, "usadadiya");
			preparedStatement.setInt(2, 2);
			preparedStatement.execute();
			
			System.out.println();
			System.out.println(" table updated ......");
		

		} catch (SQLException e) {
			
			System.out.println(e);
		}
	}

	private static void dropTable(Connection con) {

		Statement stmt;
		try {
			stmt = con.createStatement();
			String sql = "drop table registration";
			stmt.executeUpdate(sql);
			System.out.println();

			System.out.println("Table Droped");

		} catch (SQLException e) {

			System.out.println(e);
		}

	}

	private static void insertValueInTable(Connection con) {

		final String INSERT_Value = "INSERT INTO registration" + "  (id, first, last, age) VALUES " + " (?, ?, ?, ?);";

		PreparedStatement preparedStatement;
		try {
			preparedStatement = con.prepareStatement(INSERT_Value);
			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, "ashish");
			preparedStatement.setString(3, "kokane");
			preparedStatement.setInt(4, 22);
			preparedStatement.execute();

			preparedStatement.setInt(1, 2);
			preparedStatement.setString(2, "dhruv");
			preparedStatement.setString(3, "usadiya");
			preparedStatement.setInt(4, 22);
			preparedStatement.execute();

			preparedStatement.setInt(1, 3);
			preparedStatement.setString(2, "gaurav");
			preparedStatement.setString(3, "kinge");
			preparedStatement.setInt(4, 23);
			preparedStatement.execute();

			System.out.println("values inserted...");

		} catch (SQLException e) {

			System.out.println(e);
			
		}

	}

	private static void createTable(Connection con) {

		try {

			String table = "CREATE TABLE registration " + "(id INTEGER not NULL, " + " first VARCHAR(255), "
					+ " last VARCHAR(255), " + " age INTEGER, " + " PRIMARY KEY ( id ))";

			Statement stmt = con.createStatement();
			stmt.executeUpdate(table);
			System.out.println("Created table in given database ashishdb1...");

		} catch (SQLException e) {
			System.out.println(e);

		}
	}

	private static void viewTable(Connection con) throws SQLException {
		try {
			String query = "select * from registration";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			System.out.println("ID|  First  |  Last   |  Age");
			System.out.println("----------------------------");
			while (rs.next()) {
				int id = rs.getInt("id");
				String first = rs.getString("first");
				String last = rs.getString("last");
				int age = rs.getInt("age");

				System.out.println(id + " | " + first + " | " + last + "  | " + age);
				System.out.println("-------------------------------");
			}
			st.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static void closeConnection(Connection con) throws SQLException {
		con.close();
	}

}
