package vo;

import java.util.ArrayList;

import po.GameDate;
import po.Scoreboard;

public class GameVo {
	private String gameLabel;
	private String seasonId;//season
	private GameDate gameDate;//comparable
	private String versus;
	private String guestTeam;
	private String homeTeam;
	private Scoreboard scoreOverall;
	private Scoreboard score1st;
	private Scoreboard score2nd;
	private Scoreboard score3rd;
	private Scoreboard score4th;
	
	private ArrayList<Scoreboard> extratime;//加时赛
	
	private TeamPerformanceInSingleGame guestTP;
	private TeamPerformanceInSingleGame homeTP;
	
	
	public GameVo(){
		
	}
	
	public GameDate getGameDate() {
		return gameDate;
	}

	public void setGameDate(String date) {
		this.gameDate = new GameDate(date);
	}
	public void setGameDate(GameDate date) {
		this.gameDate = date;
	}
	public String getVersus() {
		return versus;
	}

	public void setVersus(String versus) {
		this.versus = versus;
	}

	public String getGuestTeam() {
		return guestTeam;
	}

	public void setGuestTeam(String guestTeam) {
		this.guestTeam = guestTeam;
	}

	public String getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}

	public Scoreboard getScoreOverall() {
		return scoreOverall;
	}

	public void setScoreOverall(Scoreboard scoreOverall) {
		this.scoreOverall = scoreOverall;
	}

	public Scoreboard getScore1st() {
		return score1st;
	}

	public void setScore1st(Scoreboard score1st) {
		this.score1st = score1st;
	}

	public Scoreboard getScore2nd() {
		return score2nd;
	}

	public void setScore2nd(Scoreboard score2nd) {
		this.score2nd = score2nd;
	}

	public Scoreboard getScore3rd() {
		return score3rd;
	}

	public void setScore3rd(Scoreboard score3rd) {
		this.score3rd = score3rd;
	}

	public Scoreboard getScore4th() {
		return score4th;
	}

	public void setScore4th(Scoreboard score4th) {
		this.score4th = score4th;
	}

	public TeamPerformanceInSingleGame getGuestTP() {
		return guestTP;
	}

	public void setGuestTP(TeamPerformanceInSingleGame guestTP) {
		this.guestTP = guestTP;
	}

	public TeamPerformanceInSingleGame getHomeTP() {
		return homeTP;
	}

	public void setHomeTP(TeamPerformanceInSingleGame homeTP) {
		this.homeTP = homeTP;
	}

	public String getGameLabel() {
		return gameLabel;
	}

	public void setGameLabel(String gameLabel) {
		this.gameLabel = gameLabel;
	}

	public ArrayList<Scoreboard> getExtratime() {
		return extratime;
	}

	public void setExtratime(ArrayList<Scoreboard> extratime) {
		this.extratime = extratime;
	}

	public String getSeasonId() {
		return seasonId;
	}

	public void setSeasonId(String seasonId) {
		this.seasonId = seasonId;
	}
}
