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
		ArrayList<GamePO> db = new ArrayList<GamePO>();
		db = singleton.getGameDB();
		db.add(game);
		singleton.setGameDB(db);
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
	public void deleteGameByLabel(String label) {
		ArrayList<GamePO> db = new ArrayList<GamePO>();
		db = singleton.getGameDB();
		for(GamePO gameFromDB: db) {
			if(label.equals(gameFromDB.getGameLabel())) {
				db.remove(gameFromDB);
				break;
			}
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
	public ArrayList<GamePO> getNewGamePOs() {
		// sudo
		return null;
	}

	@Override
	public void add(ArrayList<GamePO> gameList) {
		ArrayList<GamePO> db = new ArrayList<GamePO>();
		db = singleton.getGameDB();
		db.addAll(gameList);
		singleton.setGameDB(db);
	}

}
