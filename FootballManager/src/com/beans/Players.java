package com.beans;
//Player data

public class Players {
	private String playerName;
	private String clubName;
	private int salary;
	
	public Players(String playerName, String clubName, int salary) {
		super();
		this.playerName = playerName;
		this.clubName = clubName;
		this.salary = salary;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clubName == null) ? 0 : clubName.hashCode());
		result = prime * result + ((playerName == null) ? 0 : playerName.hashCode());
		result = prime * result + salary;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Players other = (Players) obj;
		if (clubName == null) {
			if (other.clubName != null)
				return false;
		} else if (!clubName.equals(other.clubName))
			return false;
		if (playerName == null) {
			if (other.playerName != null)
				return false;
		} else if (!playerName.equals(other.playerName))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Players [playerName=" + playerName + ", clubName=" + clubName + ", salary=" + salary + "]";
	}
	
	
}
