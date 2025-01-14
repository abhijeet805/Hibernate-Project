package com.utility;

import java.util.Scanner;

import com.entity.Player;


public class PlayerUtility {

	 public static Player preparePlayerData() {
			
		  Scanner scanner=new Scanner(System.in);
		   
   	  System.out.println("Enter Player Id");
   	  int PlayerId=scanner.nextInt();
   	  
   	  System.out.println("Enter Player Name");
   	  String PlayerName=scanner.next();
   	  
   	  System.out.println("Enter Player JersyNumber");
   	  int Playerjersy=scanner.nextInt();
   	  
      System.out.println("Enter Player Runs");
 	  int PlayerRuns=scanner.nextInt();
 	  
   	  Player Player=new Player(PlayerId, PlayerName, Playerjersy, PlayerRuns);
   	 
   	  return Player;
    }
	 
  public static int acceptIdByUser() {
		  
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.println("Enter Product Id");
    	  int playerId=sc.nextInt();
		  return playerId;
	  }
	
}
