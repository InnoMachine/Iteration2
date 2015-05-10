package dataService2;

import java.util.ArrayList;
import database2.Singleton;
import po.PlayerPO;

public class PlayerDaoImpl implements PlayerDao {
	
	Singleton singleton = Singleton.getInstance();
	
	@Override
	public void add(PlayerPO player) {
		singleton.addPlayer(player);
	}

	@Override
	public void update(PlayerPO player) {
		ArrayList<PlayerPO> db = new ArrayList<PlayerPO>();
		int index = 0;
		db = singleton.getPlayerDB();
		for(PlayerPO palyerFromDB: db) {
			if(player.getName().equals(palyerFromDB.getName())) {
				db.remove(index);
				break;
			}
			index ++;
		}
	}

	@Override
	public PlayerPO getPlayerByName(String name) {
		ArrayList<PlayerPO> db = new ArrayList<PlayerPO>();
		db = singleton.getPlayerDB();
		for(PlayerPO palyerFromDB: db) {
			if(name.equals(palyerFromDB.getName())) {
				return palyerFromDB;
			}
		}
		return null;
	}

	@Override
	public ArrayList<PlayerPO> getAllPlayers() {
		return singleton.getPlayerDB();
	}

	@Override
	public void add(ArrayList<PlayerPO> players) {
		singleton.addPlayer(players);
	}

}
