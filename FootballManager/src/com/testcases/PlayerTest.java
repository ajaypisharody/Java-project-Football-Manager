package com.testcases;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.aspects.DatabaseProvider;
//testcase for checking whether the name of the player is passed properly and appropriate result is achieved
public class PlayerTest {
PreparedStatement ps1;
Connection con=DatabaseProvider.ProvideObj();
ResultSet rs;
String name="D.Drogba",test;
	@Test
	public void testBuyPlayer() {

		
		try {
			ps1=con.prepareStatement("select * from PLAYERS where PLAYERNAME=?");
			ps1.setString(1, name);
			
			rs=ps1.executeQuery();
			while(rs.next())
			{
				test=rs.getString(1);
			}
			
		
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(name, test);
	}
	
	

}
