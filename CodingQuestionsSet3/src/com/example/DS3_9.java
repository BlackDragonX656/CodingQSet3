package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DS3_9 {
	public static void main(String[] args) {
		try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/","root","pass");
				Statement stmt = conn.createStatement()){
			String sql = "INSERT INTO Customer VALUES (1, 'Jason', 'Tran')";
			stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
