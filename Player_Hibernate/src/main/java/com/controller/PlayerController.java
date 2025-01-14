package com.controller;

import java.util.List;
import java.util.Scanner;

import com.entity.Player;
import com.service.PlayerService;
import com.utility.PlayerUtility;

public class PlayerController {

	public static void main(String[] args) {
		PlayerService playerservice = new PlayerService();

		// create object of player with some value

		int ch;
		boolean wantToTerminate = false;

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Choice \n 1-Add Product" + "\n 2-Display All Product"
					+ "\n 3-Delete Player\n 4-Get Limited Player" + "\n5-Get Particular Record(Pagination)"
					+ "\n6-Restriction Example"
					+ "\n7-Projection Example"
					+ "\n8-Diaplay Specific Column");

			ch = sc.nextInt();
			switch (ch) {

			case 1: {
				Player player = PlayerUtility.preparePlayerData();

				String msg = playerservice.addPlayerData(player);
				System.out.println(msg);
				break;
			}

			case 2: {
				List<Player> players = playerservice.DisplayPlayer();

				for (Player P : players) {
					System.out.println(P);
				}
				break;
			}

			case 3: {
				int PlayerId = PlayerUtility.acceptIdByUser();
				String msg = playerservice.deleteById(PlayerId);
				System.out.println(msg);
				break;
			}

			case 4: {
				System.out.println("Enter key for Display Limited Data:");
				int key = sc.nextInt();

				List<Player> Payers = playerservice.getLimitedData(key);

				for (Player player : Payers) {
					System.out.println(player);
				}
				break;
			}

			case 5: {
				List<Player> Players = playerservice.getParticularRecord_pagination();

				for (Player player : Players) {
					System.out.println(player);
				}
				break;
			}

			case 6: {
				//Use Restriction when Data is need to print(filterring)  & your Input Is another of primary column & Mysql Query Include operator
				
				List<Player> Players = playerservice.restriction();
				for (Player player : Players) {
					System.out.println(player);
				}
				break;
			}
			case 7:{
				  playerservice.projection();
				 
			   break;
			}
			case 8:
			{
				 List<Object[]> list = playerservice.displaySpecificColumn();
				for (Object[] obj : list) {
					System.out.println(obj[0] +"\t" +obj[1]);
				}
				break;
			}
			
			
			
			
			case 0: {
				wantToTerminate = true;
				break;
			}

			}
		} while (wantToTerminate);
	}
}
