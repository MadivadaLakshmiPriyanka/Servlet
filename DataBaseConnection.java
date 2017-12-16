package com.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection 
{
	public static Connection getDBConnection()
	{
		Connection conn=null;

	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
	}
	catch (ClassNotFoundException e)
	{
		e.printStackTrace();
	}
	catch (SQLException e)
	{
		e.printStackTrace();
	}
	return conn;
}
}