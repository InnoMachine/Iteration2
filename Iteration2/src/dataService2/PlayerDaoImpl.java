package dataService2;

import java.util.ArrayList;

import database2.Singleton;
import po.PlayerPO;
import po.SinglePerformance;

public class PlayerDaoImpl implements PlayerDao {
	
	Singleton singleton = Singleton.getInstance();
	
	@Override
	public void add(PlayerPO player) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(PlayerPO player) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePlayerByName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public PlayerPO getPlayerByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<PlayerPO> getAllPlayers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateHostTeam(String playerName, String teamAbbr) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addSinglePerformance(String playerName, SinglePerformance sp) {
		// TODO Auto-generated method stub

	}

}
