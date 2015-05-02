package businessLogic;

import java.util.ArrayList;

import vo.GameVo;
import vo.PlayerPerformanceInSingleGame;

public class Game_BL implements Game_BS{
	Game_Handler game_handler = new Game_Handler();
	
	public ArrayList<GameVo> getAllGames() {
		
		return game_handler.getAllGames();
	}

	
	public ArrayList<GameVo> getGamesDaily() {
		
		return game_handler.getGameDaily();
	}

	
	public ArrayList<GameVo> getGamesByDate(String date) {
		return game_handler.getGameByDate(date);
	}

	public ArrayList<GameVo> getGamesByDate(String date1,String date2) {
		return game_handler.getGameByDate(date1,date2);
	}


	
	public ArrayList<PlayerPerformanceInSingleGame> getGameByLabel(String label) {
		return game_handler.getGameByLabel(label);
	}


	public PlayerPerformanceInSingleGame getPerformance(String label,
			String name) {
		
		return game_handler.getPerformance(label,name);
	}


	@Override
	public GameVo getGameVoByLabel(String label) {
	
		return game_handler.getGameVoByLabel(label);
	}


	
}
