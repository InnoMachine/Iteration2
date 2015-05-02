package vo;

import java.util.ArrayList;

public class PlayerGames {

	private String name;
	private ArrayList<PlayerPerformanceInSingleGame> games;
	public PlayerGames(String name){
		this.setName(name);
		games = new ArrayList<PlayerPerformanceInSingleGame>();
	}
	public PlayerGames(){
		games = new ArrayList<PlayerPerformanceInSingleGame>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<PlayerPerformanceInSingleGame> getGames() {
		return games;
	}
	public void setGames(ArrayList<PlayerPerformanceInSingleGame> games) {
		this.games = games;
	}
	public void AddGames(PlayerPerformanceInSingleGame newgame){
		this.games.add(newgame);
	}
}
