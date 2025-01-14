package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Player")
public class Player {
	
	 @Id
     private int id;
     private String name;
     private int jerseynumber;
     private int totalRuns;
     
     public Player() {
 		// TODO Auto-generated constructor stub
 	}
     
	public Player(int id, String name, int jerseynumber, int totalRuns) {
		super();
		this.id = id;
		this.name = name;
		this.jerseynumber = jerseynumber;
		this.totalRuns = totalRuns;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJerseynumber() {
		return jerseynumber;
	}

	public void setJerseynumber(int jerseynumber) {
		this.jerseynumber = jerseynumber;
	}

	public int getTotalRuns() {
		return totalRuns;
	}

	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", jerseynumber=" + jerseynumber + ", totalRuns=" + totalRuns
				+ "]";
	}
	
	
}
