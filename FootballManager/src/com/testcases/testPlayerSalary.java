package com.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import com.beans.Players;
//testcase for checking the Player's salary is accepted and displayed properly
public class testPlayerSalary {
	Players p;

	@Test
	public void testSetPlayerSalary()
	{
		p=new Players("Test", "Test", 10005);
		p.setSalary(10000000);

		assertEquals(10000000, p.getSalary());
		
	}

}
