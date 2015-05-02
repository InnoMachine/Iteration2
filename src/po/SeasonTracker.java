/**
 * puppy
 * Apr 8, 2015 4:55:20 PM
 * TODO record the sequence of games in a certain season
 */
package po;

import java.util.ArrayList;
import java.util.Calendar;

public class SeasonTracker {//每个赛季一个Tracker对象
	
	private ArrayList<GameDayPack> seasonRecord = new ArrayList<GameDayPack>();	//所有比赛日包的顺序列表
	private GameDate currentDate;//当前日期
	private String seasonId;//当前赛季
	private ArrayList<String> updateTeamList;//当日需要更新信息的球队名单（即参赛了）
	private ArrayList<String> updatePlayerList;//当日需要更新信息的球员名单（即参赛了）
	private int gameNumSofar;//本赛季已经进行总场次
	private ArrayList<String> fileNameList;//记录已经处理的数据文件名列表
	private ArrayList<String> updateGameList;
	
	public GameDate getCurrentDate() {
		return currentDate;
	}
	
	public GameDate getNextDate() {
		
		int year = currentDate.getYear();
		int month = currentDate.getMonth();
		int day = currentDate.getDay();
		
		Calendar time=Calendar.getInstance();
		time.clear();
		time.set(Calendar.YEAR, year);
		time.set(Calendar.MONTH, month - 1);//count from 0
		int monthLength = time.getActualMaximum(Calendar.DAY_OF_MONTH);
		if(monthLength == day) {
			if(month == 12) {
				year ++;
				month = 1;
			}else {
				month ++;
			}
			day = 1;
		}else {
			day ++;
		}
		return new GameDate(year, month, day);
		
	}

	public void setCurrentDate(GameDate currentDate) {
		this.currentDate = currentDate;
	}

	public String toString() {//sudo
		return null;
	}
	
	public ArrayList<GameDayPack> getSeasonRecord() {
		return seasonRecord;
	}

	public void setSeasonRecord(ArrayList<GameDayPack> seasonRecord) {
		this.seasonRecord = seasonRecord;
	}

	public int getGameNumSofar() {
		return gameNumSofar;
	}

	public void setGameNumSofar(int gameNumSofar) {
		this.gameNumSofar = gameNumSofar;
	}

	public String getSeasonId() {
		return seasonId;
	}

	public void setSeasonId(String seasonId) {
		this.seasonId = seasonId;
	}

	public ArrayList<String> getUpdateTeamList() {
		return updateTeamList;
	}

	public void setUpdateTeamList(ArrayList<String> updateTeamList) {
		this.updateTeamList = updateTeamList;
	}

	public ArrayList<String> getUpdatePlayerList() {
		return updatePlayerList;
	}

	public void setUpdatePlayerList(ArrayList<String> updatePlayerList) {
		this.updatePlayerList = updatePlayerList;
	}

	public ArrayList<String> getFileNameList() {
		return fileNameList;
	}

	public void setFileNameList(ArrayList<String> fileNameList) {
		this.fileNameList = fileNameList;
	}

	public ArrayList<String> getUpdateGameList() {
		return updateGameList;
	}

	public void setUpdateGameList(ArrayList<String> updateGameList) {
		this.updateGameList = updateGameList;
	}
	
}
