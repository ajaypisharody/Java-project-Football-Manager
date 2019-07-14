package com.daointerface;

import com.beans.Manager;
import com.beans.Players;
import com.exception.PriceException;
//interface for Dao layer
public interface Daointerface {
	
	public void viewPlayers();
	public void viewManagers();
	public Manager getMan(String name);
	public Players buyPlayer(String name,int fees)throws PriceException;


}
