package dataService2;

import java.util.ArrayList;
import database2.Singleton;
import po.TeamPO;

public class TeamDaoImpl implements TeamDao {

	Singleton singleton = Singleton.getInstance();
	
	@Override
	public void add(TeamPO team) {
		singleton.addTeam(team);
	}

	@Override
	public void update(TeamPO team) {
		ArrayList<TeamPO> db = new ArrayList<TeamPO>();
		int index = 0;
		db = singleton.getTeamDB();
		for(TeamPO teamFromDB: db) {
			if(team.getAbbreviation().equals(teamFromDB.getAbbreviation())) {
				db.remove(index);
				break;
			}
			index ++;
		}
	}

	@Override
	public TeamPO getTeamByAbbr(String abbr) {
		ArrayList<TeamPO> db = new ArrayList<TeamPO>();
		db = singleton.getTeamDB();
		for(TeamPO teamFromDB: db) {
			if(abbr.equals(teamFromDB.getAbbreviation())) {
				return teamFromDB;
			}
		}
		return null;
	}

	@Override
	public ArrayList<TeamPO> getAllTeams() {
		return singleton.getTeamDB();
	}

	@Override
	public void add(ArrayList<TeamPO> teams) {
		singleton.addTeam(teams);
	}

}
