package com.testcases;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.aspects.DatabaseProvider;
//testcase for checking whether the name of the Manager is passed properly and appropriate result is achieved

public class TestManager {
	PreparedStatement ps;
	Connection con=DatabaseProvider.ProvideObj();
	ResultSet rs;
	String name="Jose Mourinho",test;
	@Test
	public void testGetMan() {
		
		
		
		try {
			ps=con.prepareStatement("select * from MANAGERS where MANAGERNAME=?");
			ps.setString(1, name);
			rs=ps.executeQuery();
			while(rs.next())
			{
				 test=rs.getString(1);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(name, test);
	}

}
