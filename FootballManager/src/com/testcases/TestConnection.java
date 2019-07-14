package com.testcases;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.aspects.DatabaseProvider;
//testcase for checking the proper creation of the connection with database
public class TestConnection {
	Boolean status;
	@Test
	public void testProvideObj() {

		Connection con=DatabaseProvider.ProvideObj();
		try {
			status=con.isClosed();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotEquals(true, status);
	}

}
