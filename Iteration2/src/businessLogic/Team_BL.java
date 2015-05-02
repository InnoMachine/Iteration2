package businessLogic;

import java.util.ArrayList;

import vo.PlayerVo;
import vo.TeamCardVo;
import vo.TeamPerformanceInSingleGame;
import vo.TeamRecentGames;
import vo.TeamVo;

public class Team_BL implements Team_BS{
	Team_Handler team_handler;
	Player_BL player_bl;
	public Team_BL()
	{
		team_handler = new Team_Handler();
		player_bl = new Player_BL();
	}
	public TeamVo getTeamByAbbr(String abbr) {
		
		return team_handler.getTeamByAbbr(abbr);
	}

	@Override
	public ArrayList<TeamVo> getAllTeam() {
		return team_handler.getAllTeam();
	}

	@Override
	public ArrayList<TeamVo> sortTeamBy(String option) {
		return team_handler.sortTeamBy(option);
	}

	@Override
	public ArrayList<PlayerVo> getPlayers(String abbr) {
		return player_bl.getPlayersByTeam(abbr);
	}
	@Override
	public ArrayList<TeamCardVo> hotTeamSeason(String option) {
		return team_handler.hotTeamSeason(option);
	}
	@Override
	public TeamRecentGames getTeamRecentPerformance(String abbr) {
		
		return team_handler.getTeamRecentPerformance(abbr);
	}
	public ArrayList<TeamPerformanceInSingleGame> getTeamPerformance(String abbr){
		return team_handler.getTeamPerformance(abbr);
	}

}
