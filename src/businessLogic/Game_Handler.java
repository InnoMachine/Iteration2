package businessLogic;

import java.util.ArrayList;

import po.GameDate;
import vo.GameVo;
import vo.PlayerPerformanceInSingleGame;

public class Game_Handler {
	private Data_Handler data_handler;
	private ArrayList<GameVo> listvo;
	public Game_Handler()
	{
		data_handler=Data_Handler.getInstance();
		listvo=data_handler.getAllGames();
	}
	
	public ArrayList<GameVo> getAllGames(){
		return listvo;
	}
	
	public ArrayList<GameVo> getGameDaily(){
		GameDate date =data_handler.getDateNow();
		ArrayList<GameVo> templist =new ArrayList<GameVo>();
		for(GameVo temp:listvo)
		{
			if(date.compareTo(temp.getGameDate())==0)
			{
				templist.add(temp);
			}
		}
		return templist;
	}
	public ArrayList<GameVo> getGameByDate(String date){
		GameDate gdate = new GameDate(date);
		ArrayList<GameVo> templist =new ArrayList<GameVo>();
		for(GameVo temp:listvo)
		{
			if(gdate.compareTo(temp.getGameDate())==0)
			{
				templist.add(temp);
			}
		}
		return templist;
	}

	public ArrayList<PlayerPerformanceInSingleGame> getGameByLabel(String label) {
		for(GameVo temp:listvo){
			if(temp.getGameLabel().equals(label)){
				ArrayList<PlayerPerformanceInSingleGame> list = new ArrayList<PlayerPerformanceInSingleGame>();
				for(PlayerPerformanceInSingleGame pp:temp.getGuestTP().playerlist){
					list.add(pp);
				}
				for(PlayerPerformanceInSingleGame pp:temp.getHomeTP().playerlist){
					list.add(pp);
				}
				return list;
			}
		}
		return null;
	}

	public PlayerPerformanceInSingleGame getPerformance(String label,
			String name) {
		ArrayList<PlayerPerformanceInSingleGame> list =getGameByLabel(label);
		for(PlayerPerformanceInSingleGame temp:list){
			if(temp.getName().equals(name)){
				return temp;
			}
		}
		return null;
	}

	public ArrayList<GameVo> getGameByDate(String date1, String date2) {
		GameDate d1 = new GameDate(date1);
		GameDate d2 = new GameDate(date2);
		GameDate d3 = data_handler.getNextDate(d2);
		ArrayList<GameVo> templist =new ArrayList<GameVo>();
		if(d1.compareTo(d2)==0){
			return getGameByDate(date1);
		}
		if(d1.compareTo(d2)==1){
			return null;
		}
		int i =0;
		while(i<listvo.size()&&listvo.get(i).getGameDate().compareTo(d1)==-1){
			i++;
		}
		if(listvo.get(i).getGameDate().compareTo(d1)==0){
			while(listvo.get(i).getGameDate().compareTo(d3)==-1){
				templist.add(listvo.get(i));
				i++;
			}
		}
		return templist;
	}

	public GameVo getGameVoByLabel(String label) {
		for(GameVo temp:listvo){
			if(temp.getGameLabel().equals(label)){
				return temp;
			}
		}
		return null;
	}
}

