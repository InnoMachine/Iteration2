/**
 * puppy
 * Apr 8, 2015 5:04:46 PM
 * TODO
 */
package po;

import java.util.ArrayList;

public class GameDayPack {
	
	private GameDate gamedate;
	private int gameNumToday;
	private ArrayList<String> gamelabelList = new ArrayList<String>();
	
	public String toString() {
		String gamelabelListString = "";
		for(String gamelabel: gamelabelList) {
			gamelabelListString += (gamelabel + ";");
		}
		return gamedate + "$" + gamelabelListString;
	}
	
	public GameDate getGamedate() {
		return gamedate;
	}
	public void setGamedate(GameDate gamedate) {
		this.gamedate = gamedate;
	}
	public ArrayList<String> getGamelabelList() {
		return gamelabelList;
	}
	public void setGamelabelList(ArrayList<String> gamelabelList) {
		this.gamelabelList = gamelabelList;
	}

	public int getGameNumToday() {
		return gameNumToday;
	}

	public void setGameNumToday(int gameNumToday) {
		this.gameNumToday = gameNumToday;
	}

	
}
