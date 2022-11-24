package com.myprojects.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class JDBCTest {

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb?serverTimezone=UTC", "root", "1234");
			System.out.println(con);
		} catch (Exception e) {
			// TODO: handle exception
			fail(e.getMessage());
		}
	}
}
