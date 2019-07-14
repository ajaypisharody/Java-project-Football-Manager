package com.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import com.beans.Manager;
//testcase for checking the manager's salary is accepted and displayed properly
public class TestManSal {

	Manager m=new Manager("Test","testclub",10,100000);
	

	@Test
	public void testGetSalary()
	{
		int sal=m.getSalary();
		
		assertEquals(100000, sal);
	}

}
