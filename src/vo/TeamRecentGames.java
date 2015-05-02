package vo;

import java.util.ArrayList;

public class TeamRecentGames {
	private String name;
	private String abbreviation;
	private ArrayList<TeamPerformanceInSingleGame> fiveGames;

	public TeamRecentGames(){
		fiveGames = new ArrayList<TeamPerformanceInSingleGame>();
	}
	public TeamRecentGames(String name ){
		this.name = name ;
		fiveGames = new ArrayList<TeamPerformanceInSingleGame>();
	}
	public void AddNewGame(TeamPerformanceInSingleGame ngame){
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
	public ArrayList<TeamPerformanceInSingleGame> getFiveGames()
	{
		return fiveGames;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
}