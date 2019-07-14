package com.aspects;

import java.sql.DriverManager;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
//providing database connection object with middleware and through abstraction
public class DatabaseProvider {
	static Connection con;
	static String classname,uname,pass,url=null;
	
	public static void Middleware()
	{
		Properties p=new Properties();
		

		try {
			p.load(new FileInputStream(".//resources//dbconfig.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		classname=p.getProperty("drivername");
		url=p.getProperty("url");
		uname=p.getProperty("username");
		pass=p.getProperty("password");
		
	}
	
	public static Connection ProvideObj()
	{
		Middleware();
	try {
		
		Class.forName(classname);
		con=DriverManager.getConnection(url,uname,pass);
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	
	return con;
	}
}
