package businessLogic;

import java.util.ArrayList;

import vo.PlayerCardVo;
import vo.PlayerGames;
import vo.PlayerRecentGames;
import vo.PlayerVo;
import vo.TotalInfo;

public class Player_BL implements Player_BS{
	Player_Handler player_handler;
	
	public Player_BL()
	{
		player_handler =new Player_Handler(); 
	}
	public PlayerVo getPlayerByName(String name) {
		return player_handler.getPlayerByName(name);
	}

	public ArrayList<PlayerVo> getAllPlayer() {
		return player_handler.getAllPlayer();
	}

	public ArrayList<PlayerVo> sortPlayerBy(String option) {
		
		return player_handler.sortPlayerBy(option);
	}
	public ArrayList<PlayerVo> sortPlayerBy(String option1,String option2){
		return player_handler.sortPlayerBy(option1,option2);
	}
	public ArrayList<PlayerVo> filterPlayerBy(String position, String div, String option) {
		return player_handler.filterPlayersBy(position, div, option,50);
	}
	
	public ArrayList<PlayerVo> getPlayersByTeam(String abbr)
	{
		return player_handler.getPlayersByTeam(abbr);
		
	}
	
	public ArrayList<PlayerCardVo> hotPlayerDaily(String option) {
		
		return player_handler.hotPlayerDaily(option);
	}
	
	public ArrayList<PlayerCardVo> hotPlayerSeason(String option) {
		return player_handler.hotPlayerSeason(option);
	}
	public ArrayList<PlayerCardVo> progressFastPlayer(String option) {
		return player_handler.progressFastPlayer(option);
	}
	
	public PlayerRecentGames getPlayerRecentPerformance(String name) {
		return player_handler.getPlayerRecentPerformance(name);
	}
	public ArrayList<PlayerVo> searchPlayer(String key) {
		return player_handler.searchPlayer(key);
	}
	public ArrayList<PlayerVo> searchPlayer(String key,String first) {
		
		return player_handler.searchPlayer(key,first);
	}
	
	public PlayerGames getPlayerPerformacne(
			String name) {
		
		return player_handler.getPlayerPerformacne(name);
	}
	
	public TotalInfo getTotalInfo() {
		return player_handler.getTotalInfo();
	}
}