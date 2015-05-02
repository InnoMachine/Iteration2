package vo;

import java.util.ArrayList;

public class PlayerRecentGames {
	private String name;
	private ArrayList<PlayerPerformanceInSingleGame> fiveGames;
	
	public PlayerRecentGames(){
		fiveGames = new ArrayList<PlayerPerformanceInSingleGame>();
	}
	public PlayerRecentGames(String name ){
		this.name = name ;
		fiveGames = new ArrayList<PlayerPerformanceInSingleGame>();
	}
	public void AddNewGame(PlayerPerformanceInSingleGame ngame){
		if(fiveGames.size()==5)
		{
			fiveGames.remove(0);
			fiveGames.add(ngame);
		}
		else if(fiveGames.size()>5)
		{
			while(fiveGames.size()>=5)
			{
				fiveGames.remove(0);
			}
			fiveGames.add(ngame);
		}
		else
			fiveGames.add(ngame);
	}
	public ArrayList<PlayerPerformanceInSingleGame> getFiveGames()
	{
		return fiveGames;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}