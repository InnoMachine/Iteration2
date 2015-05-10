/**
 * puppy
 * Apr 26, 2015 8:02:58 PM
 * TODO
 */
package dataService2;

import java.util.ArrayList;

import database2.Singleton;
import po.GamePO;

public class GameDaoImpl implements GameDao {

	Singleton singleton = Singleton.getInstance();
	
	@Override
	public void add(GamePO game) {
		singleton.addGame(game);
	}

	@Override
	public void update(GamePO game) {
		ArrayList<GamePO> db = new ArrayList<GamePO>();
		int index = 0;
		db = singleton.getGameDB();
		for(GamePO gameFromDB: db) {
			if(game.getGameLabel().equals(gameFromDB.getGameLabel())) {
				db.remove(index);
				break;
			}
			index ++;
		}
	}

	@Override
	public GamePO getGameByLabel(String label) {
		ArrayList<GamePO> db = new ArrayList<GamePO>();
		db = singleton.getGameDB();
		for(GamePO gameFromDB: db) {
			if(label.equals(gameFromDB.getGameLabel())) {
				return gameFromDB;
			}
		}
		return null;
	}

	@Override
	public ArrayList<GamePO> getAllGames() {
		return singleton.getGameDB();
	}

	@Override
	public void add(ArrayList<GamePO> gameList) {
		singleton.addGame(gameList);
	}

}
