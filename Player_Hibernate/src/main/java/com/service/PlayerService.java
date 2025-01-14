package com.service;

import java.util.List;

import com.dao.PlayerDao;
import com.entity.Player;

public class PlayerService {
    
	  PlayerDao playerDao=new PlayerDao();
	
	public  String addPlayerData(Player player) {
		String msg = playerDao.addPlayerData(player);
		return msg;
	}

	public List<Player> DisplayPlayer() {
		List<Player> data = playerDao.DisplayPlayer();
		return data;
	}
	
	public String deleteById(int PlayerId) {
		String msg = playerDao.deleteById(PlayerId);
		return msg;
	}
	
	public List<Player> getLimitedData(int key){
		List<Player> list = playerDao.getLimitedData(key);
		return list;
	}
	
	public List<Player> getParticularRecord_pagination(){
		
		List<Player> list = playerDao.getParticularRecord_pagination();
		return list;
	}
	public List<Player> restriction(){
		//Use Restriction when Data is need to print(filterring)  & your Input Is another of primary column & Mysql Query Include operator
		
		List<Player> list = playerDao.restriction();
		return list;
	}

	public void projection() {
		playerDao.projection();
		
	}

	public List<Object[]> displaySpecificColumn() {
		List<Object[]> list = playerDao.displaySpecificColumn();
		return  list;
	}
}
