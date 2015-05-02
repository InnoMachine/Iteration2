/**
 * puppy
 * Apr 8, 2015 9:38:36 PM
 * TODO
 */
package dataService2;

import java.util.ArrayList;
import po.SeasonTracker;

public interface SystemDao {

	public void add(SeasonTracker st);
	
	public void update(SeasonTracker st);
	
	public void deleteSeasonById(String id);
	
	public SeasonTracker getStById(String id);
	
	public ArrayList<SeasonTracker> getAllSeasons();
	
}
