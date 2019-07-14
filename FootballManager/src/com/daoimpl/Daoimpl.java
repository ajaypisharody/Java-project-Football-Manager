package com.daoimpl;

import com.aspects.DatabaseProvider;
import com.beans.Manager;
import com.beans.Players;
import com.daointerface.Daointerface;
import com.exception.PriceException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
//implementation of the dao interface
public class Daoimpl implements Daointerface{
	DatabaseProvider db=new DatabaseProvider();
	Connection con=DatabaseProvider.ProvideObj();
	Manager m;
	PreparedStatement ps,ps1,ps2,ps3;
	ResultSet rs,rs1,rs3;
	String m1=null;

	public static List<Players> l1=new ArrayList<Players>();
	
	@Override
	public Players buyPlayer(String name, int fees) throws PriceException{
		String n=null;
		int s=0,flag=0;
		try {
			ps1=con.prepareStatement("select * from PLAYERS where PLAYERNAME=?");
			ps1.setString(1, name);
			rs=ps1.executeQuery();

			while(rs.next())
			{
				 n=rs.getString(1);
				
				 s=rs.getInt(3);
				
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		if(fees<=s)
		{
			flag=1;
		}
		else
		{
			flag=0;
		}
		if(flag==1)
		{

			throw new PriceException("Price too low");
			
		}
		else
		{

			try {
				ps1=con.prepareStatement("delete from PLAYERS where PLAYERNAME=?");

				ps1.setString(1, name);
				ps1.executeUpdate();
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			l1.add(new Players(n,m1,fees));
		return new Players(n,m1,fees);
		}
		
	}
	
	@Override
	public Manager getMan(String name)
	{
		String m2=null;
		
		int i1=0,i2=0;
		try {
			ps3=con.prepareStatement("select * from MANAGERS where MANAGERNAME=?");
			ps3.setString(1, name);
			rs3=ps3.executeQuery();
			while(rs3.next())
			{
				 m2=rs3.getString(1);
				 m1=rs3.getString(2);
				 i1=rs3.getInt(4);
				 i2=rs3.getInt(3);
				 
				 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Manager(m2,m1,i1,i2);
		
	}
	
	@Override
	public void viewManagers() 
	{
		try {
			ps1=con.prepareStatement("select * from MANAGERS");
			rs=ps1.executeQuery();

			System.out.println("NAMES\t  "+"CLUBNAMES\t  "+"EXPERIENCE\t"+"SALARY");
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public  void viewPlayers() 
	{
		try {
			ps1=con.prepareStatement("select * from PLAYERS");
			rs=ps1.executeQuery();
			System.out.println("NAMES\t  "+"CLUBNAMES\t  "+"SALARY");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" \t| "+rs.getString(2)+"\t| "+rs.getInt(3));
				
				}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
	}
	
	
}
