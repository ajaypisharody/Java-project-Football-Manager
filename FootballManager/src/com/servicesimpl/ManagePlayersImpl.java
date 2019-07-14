package com.servicesimpl;

import java.util.Iterator;


import com.aspects.DaoProvider;
import com.beans.Manager;
import com.beans.Players;
import com.daoimpl.Daoimpl;
import com.exception.PriceException;
import com.services.ManagePlayers;


public class ManagePlayersImpl implements ManagePlayers{
	//implementation of the services layer interface
	private Players dr;
	private Manager m,m1;
	
	Daoimpl dimpl=DaoProvider.provideDao();
	Daoimpl dimpl1=DaoProvider.provideDao();
	
	int sign;
	
	
	
	@Override
	public void viewPlayer() {
		
		dimpl.viewPlayers();
	}
@Override
	public void viewManager() {
		dimpl1.viewManagers();
		
	}
	
	
	public void setManager(String n)
	{
		m1=dimpl.getMan(n);
		m=new Manager(m1.getManagerName(),m1.getClubName(),m1.getExperience(),m1.getSalary());

		System.out.println("Congratulations you chose:");
		System.out.println(m);
	}
	
	
	public int getManagerSalary()
	{
		return m.getSalary();
	}
	public void setPlayers(String playerList,String clubname,int salary)
	{
		dr=new Players(playerList,clubname,salary);
		System.out.println(dr);
		
	}
	
	
	@Override
	public void purchasePlayers(String n,int signfee)  {
		
		try {
			dr=dimpl.buyPlayer(n,signfee);
			System.out.println("Congratulations on your new signing....!!");
			System.out.println(dr);
		} catch (PriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}
	@Override
	public void getPlayerReport() {
		Iterator<Players> i2=Daoimpl.l1.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
	}
	
	
}
