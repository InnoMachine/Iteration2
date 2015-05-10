/**
 * puppy
 * Apr 26, 2015 7:12:47 PM
 * TODO
 */
package database2;

import java.util.ArrayList;

import po.GamePO;
import po.PlayerPO;
import po.TeamPO;

public class Singleton {

	private static Singleton instance;
	private ArrayList<GamePO> gameDB = new ArrayList<GamePO>();
	private ArrayList<PlayerPO> playerDB = new ArrayList<PlayerPO>();
	private ArrayList<TeamPO> teamDB = new ArrayList<TeamPO>();
	
	private Singleton() {//private constructor
		System.out.println("database initialized1");
	}
	
	public static Singleton getInstance() {//static method to get an instance
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void addGame(GamePO game) {
		this.gameDB.add(game);
	}
	
	public void addGame(ArrayList<GamePO> games) {
		this.gameDB.addAll(games);
	}
	
	public void addPlayer(PlayerPO player) {
		this.playerDB.add(player);
	}
	
	public void addPlayer(ArrayList<PlayerPO> players) {
		this.playerDB.addAll(players);
	}
	
	public void addTeam(TeamPO team) {
		this.teamDB.add(team);
	}
	
	public void addTeam(ArrayList<TeamPO> teams) {
		this.teamDB.addAll(teams);
	}
	
	public ArrayList<GamePO> getGameDB() {
		return gameDB;
	}

	public void setGameDB(ArrayList<GamePO> gameDB) {
		this.gameDB = gameDB;
	}

	public ArrayList<PlayerPO> getPlayerDB() {
		return playerDB;
	}

	public void setPlayerDB(ArrayList<PlayerPO> playerDB) {
		this.playerDB = playerDB;
	}

	public ArrayList<TeamPO> getTeamDB() {
		return teamDB;
	}

	public void setTeamDB(ArrayList<TeamPO> teamDB) {
		this.teamDB = teamDB;
	}
	
}
