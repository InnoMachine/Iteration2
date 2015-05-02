/**
 * puppy
 * Apr 6, 2015 8:12:04 PM
 * TODO
 */
package dataService2;

import java.util.ArrayList;

import po.GamePO;

public interface GameDao {
	
	public void add(GamePO game);
	
	public void update(GamePO game);
	
	public void deleteGameByLabel(String label);
	
	public GamePO getGameByLabel(String label);
	
	public ArrayList<GamePO> getAllGames();
	
	public ArrayList<GamePO> getNewGamePOs();
	
	public void add(ArrayList<GamePO> gameList);
	
}
