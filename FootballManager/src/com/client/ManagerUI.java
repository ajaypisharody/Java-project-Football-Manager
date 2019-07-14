package com.client;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.aspects.ObjectProvider;
import com.beans.Manager;
import com.beans.Players;
import com.exception.PriceException;
import com.services.ManagePlayers;

public class ManagerUI{
	ManagePlayers mgp;
	static Players p1;
	
	Players p2;
	
	public static void main(String args[]) throws PriceException, InterruptedException
	{
		int choice=0;
		String n,n1,p,ans;
		//abstraction
		ManagePlayers mgp=new ObjectProvider().provideObj();
		System.out.println("Football Manager");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Welcome to Football Manager!!");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Welcome to Chelsea football club....");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Choose a Manager for the club");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Viewing managers....");
		TimeUnit.SECONDS.sleep(1);
	//choosing managers from the database
			mgp.viewManager();
			System.out.println("Choose a manager by entering the EXACT name of the manager");
			Scanner sc1=new Scanner(System.in);
			n=sc1.next();
			n1=sc1.next();
			System.out.println(n+" "+n1);
			String nn=n+" "+n1;
			mgp.setManager(nn);
			
			
			do
			{
				//viewing the players available in the transfer market
			System.out.println("1.View players transfer market...");
			System.out.println("2.Our players...");
			
			System.out.println("3.exit");
			Scanner s=new Scanner(System.in);
			choice=s.nextInt();
			switch(choice)
			{
			case 1:
				//buying the player
				mgp.viewPlayer();
				System.out.println("Choose a player by entering EXACT name and intended signing fees(mst be greater than current)");
				Scanner sc2=new Scanner(System.in);
				p=sc2.next();
				int signfee=sc2.nextInt();
				mgp.purchasePlayers(p, signfee);
				break;
			case 2:
				//viewing the details of the players in our club
				mgp.getPlayerReport();
				break;
			case 3:
				System.out.println("Thank you for using Football Manager!");
				TimeUnit.SECONDS.sleep(1);
				System.out.println(".");
				TimeUnit.SECONDS.sleep(1);
				System.out.println(".");
				TimeUnit.SECONDS.sleep(1);
				System.out.println(".");
				System.exit(0);
				break;
			default:
				System.out.println("wrong choice");
				
			}
			System.out.println("Do you want to continue?(yes or no)");
			Scanner sc5=new Scanner(System.in);
			ans=sc5.next();
			}while(ans!="yes");
		
		//assertion 	
		assert(mgp.getManagerSalary()>0):"Manager's salary not valid";
		assert(p1.getSalary()>0):"salary not valid";
			
		
	}


}
