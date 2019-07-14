package com.aspects;

import com.services.ManagePlayers;
import com.servicesimpl.ManagePlayersImpl;
//providing implementation object 
public class ObjectProvider {
public static ManagePlayers provideObj()
{
	return new ManagePlayersImpl();
}
}
