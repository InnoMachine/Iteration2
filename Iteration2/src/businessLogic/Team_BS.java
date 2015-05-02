package businessLogic;

import java.util.ArrayList;

import vo.PlayerVo;
import vo.TeamCardVo;
import vo.TeamRecentGames;
import vo.TeamVo;

public interface Team_BS {

	public TeamVo getTeamByAbbr(String abbr);
	public ArrayList<TeamVo>  getAllTeam();
	public ArrayList<TeamVo>  sortTeamBy(String option);
	public ArrayList<PlayerVo> getPlayers(String abbr);
	public ArrayList<TeamCardVo> hotTeamSeason(String option); 
	public TeamRecentGames getTeamRecentPerformance(String abbr);
}
