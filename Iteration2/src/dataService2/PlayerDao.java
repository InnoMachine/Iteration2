/**
 * puppy
 * Apr 6, 2015 8:13:32 PM
 * TODO
 */
package dataService2;

import java.util.ArrayList;

import po.PlayerPO;
import po.SinglePerformance;

public interface PlayerDao {
	
	public void add(PlayerPO player);
	
	public void update(PlayerPO player);
	
	public void deletePlayerByName(String name);
	
	public PlayerPO getPlayerByName(String name);
	
	public ArrayList<PlayerPO> getAllPlayers();
	
	public void updateHostTeam(String playerName, String teamAbbr);
	
	public void addSinglePerformance(String playerName, SinglePerformance sp);
	
}
