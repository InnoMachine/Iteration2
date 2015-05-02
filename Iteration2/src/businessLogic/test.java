package businessLogic;

import java.util.ArrayList;

import dataService2.SystemDao;
import dataService2.SystemDaoImpl;
import po.GameDate;
import vo.GameVo;
import vo.PlayerCardVo;
import vo.PlayerPerformanceInSingleGame;
import vo.PlayerVo;
import vo.TotalInfo;

public class test {
	
	public static void main(String args[]){
		/*SystemDao dao = new SystemDaoImpl();
		System.out.println(dao.getStById("12-13").getCurrentDate().toString());
		Player_BS p = new Player_BL();
		ArrayList<PlayerVo> cv=p.filterPlayerBy("All", "All", "score");
		for(PlayerVo temp:cv){
			System.out.println(temp.getStealField());
		}*/
		/*Game_BS g = new Game_BL();
		GameDate gd = new GameDate(2012,11,1);
		ArrayList<PlayerPerformanceInSingleGame> gv = g.getGameByLabel("12-13_2012-10-31_DAL-UTA");
		ArrayList<GameVo> gl= g.getGamesByDate("2012-11-12","2012-11-15");
		for(GameVo temp:gl){
			System.out.println(temp.getGameLabel());
			//System.out.println(temp.getHomeTeam());
		}*/
		Player_BS pb = new Player_BL();
		ArrayList<PlayerVo> pv = pb.filterPlayerBy("G", "East", "score");
		for(PlayerVo temp:pv){
			System.out.println(temp.getName());
		}
		TotalInfo ti = pb.getTotalInfo();
		System.out.println(ti.getSteal());
		
	}
}
