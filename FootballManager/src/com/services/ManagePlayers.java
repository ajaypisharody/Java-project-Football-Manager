package com.services;



public interface ManagePlayers {
	//services layer interface
	public void viewPlayer();
	public void viewManager();
	
	
	public void purchasePlayers(String n,int signfee);

	public void setManager(String n);
	public void getPlayerReport();
	public int getManagerSalary();
	public void setPlayers(String playerList,String clubname,int salary);
	
}
