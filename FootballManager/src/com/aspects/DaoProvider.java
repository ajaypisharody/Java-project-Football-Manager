package com.aspects;

import com.daoimpl.Daoimpl;
//providing dao object 
public class DaoProvider {
	
	public static Daoimpl provideDao()
	{
		return new Daoimpl();
		
	}

}
