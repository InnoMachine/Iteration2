/**
 * puppy
 * Apr 26, 2015 7:21:20 PM
 * TODO
 */
package dataService2;

public class DaoFactory {
	
	public static GameDao getGameDaoInstence() {
		return new GameDaoImpl();
	}
	
	public static PlayerDao getPlayerDaoInstance() {
		return new PlayerDaoImpl();
	}
	
	public static TeamDao getTeamDaoInstance() {
		return new TeamDaoImpl();
	}
	
	public static SystemDao getSystemDaoInstance() {
		return new SystemDaoImpl();
	}
	
}
