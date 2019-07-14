package com.beans;

//Manager data
public class Manager extends Thread{
	private String managerName;
	private String clubName;
	private int experience;
	private int salary;
	
	
	
	public Manager(String managerName,String clubName,int experience,int salary) {
	
		this.managerName=managerName;
		this.clubName=clubName;
		this.experience=experience;
		this.salary=salary;
		
	}
	
	
	
	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	

	@Override
	public String toString() {
		return "Manager [managerName=" + managerName + ", clubName=" + clubName + ", experience=" + experience
				+ ", salary=" + salary + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clubName == null) ? 0 : clubName.hashCode());
		result = prime * result + experience;
		result = prime * result + ((managerName == null) ? 0 : managerName.hashCode());
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
		Manager other = (Manager) obj;
		if (clubName == null) {
			if (other.clubName != null)
				return false;
		} else if (!clubName.equals(other.clubName))
			return false;
		if (experience != other.experience)
			return false;
		if (managerName == null) {
			if (other.managerName != null)
				return false;
		} else if (!managerName.equals(other.managerName))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	
}
