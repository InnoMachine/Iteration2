/**
 * puppy
 * Apr 6, 2015 8:12:56 PM
 * TODO
 */
package dataService2;

import java.util.ArrayList;

import po.TeamPO;
import po.TeamPerformance;

public interface TeamDao {

	public void add(TeamPO team);

	public void update(TeamPO team);

	public void deleteTeamByAbbr(String abbr);

	public TeamPO getTeamByAbbr(String abbr);

	public ArrayList<TeamPO> getAllTeams();
	
	public void addTeamPerformance(TeamPerformance tp, String teamAbbr);
	
	public void addCurrentPlayer(String playerName, String teamAbbr);
	
	public void playerTrans(String playerName, String fromTeamAbbr, String toTeamAbbr);
	
	public void changeTeamName(String teamAbbr, TeamPO newTeam);
	
}
