/**
 * puppy
 * Apr 6, 2015 8:12:56 PM
 * TODO
 */
package dataService2;

import java.util.ArrayList;
import po.TeamPO;

public interface TeamDao {

	public void add(TeamPO team);
	
	public void add(ArrayList<TeamPO> teams);

	public void update(TeamPO team);

	public TeamPO getTeamByAbbr(String abbr);

	public ArrayList<TeamPO> getAllTeams();
	
}
