package com.shop.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class JDBCTest {
	
@Test
public void testConnection() throws Exception {
		
		Class.forName("org.mariadb.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/shop", "root","1");
		
		System.out.println(con);
		
		
		
		
		
		
	}

}
