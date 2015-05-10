/**
 * puppy
 * Apr 6, 2015 8:13:32 PM
 * TODO
 */
package dataService2;

import java.util.ArrayList;
import po.PlayerPO;

public interface PlayerDao {
	
	public void add(PlayerPO player);
	
	public void add(ArrayList<PlayerPO> players);
	
	public void update(PlayerPO player);
	
	public PlayerPO getPlayerByName(String name);
	
	public ArrayList<PlayerPO> getAllPlayers();
	
}
