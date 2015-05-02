package dataService2;

import java.util.ArrayList;

import database2.Singleton;
import po.TeamPO;
import po.TeamPerformance;

public class TeamDaoImpl implements TeamDao {

	Singleton singleton = Singleton.getInstance();
	
	@Override
	public void add(TeamPO team) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(TeamPO team) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteTeamByAbbr(String abbr) {
		// TODO Auto-generated method stub

	}

	@Override
	public TeamPO getTeamByAbbr(String abbr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<TeamPO> getAllTeams() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addTeamPerformance(TeamPerformance tp, String teamAbbr) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCurrentPlayer(String playerName, String teamAbbr) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playerTrans(String playerName, String fromTeamAbbr,
			String toTeamAbbr) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeTeamName(String teamAbbr, TeamPO newTeam) {
		// TODO Auto-generated method stub

	}

}
