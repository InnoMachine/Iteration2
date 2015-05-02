package businessLogic;

import java.util.ArrayList;

import po.Scoreboard;
import enums.Division;
import vo.GameVo;
import vo.PlayerPerformanceInSingleGame;
import vo.PlayerVo;
import vo.TeamPerformanceInSingleGame;

public class Game_BL_Stub implements Game_BS {

	@Override
	public ArrayList<GameVo> getAllGames() {
		// TODO Auto-generated method stub

		Scoreboard scoreboard1 = new Scoreboard();
		scoreboard1.setGuestScore(19);
		scoreboard1.setHomeScore(21);
		Scoreboard scoreboard2 = new Scoreboard();
		scoreboard2.setGuestScore(76);
		scoreboard2.setHomeScore(84);

		ArrayList<GameVo> gameVos = new ArrayList<GameVo>();
		GameVo gameVo1 = new GameVo();
		gameVo1.setHomeTeam("BKN");
		gameVo1.setGuestTeam("CLE");
		gameVo1.setScore1st(scoreboard1);
		gameVo1.setScore2nd(scoreboard1);
		gameVo1.setScore3rd(scoreboard1);
		gameVo1.setScore4th(scoreboard1);
		gameVo1.setScoreOverall(scoreboard2);
		
		TeamPerformanceInSingleGame tp1=new TeamPerformanceInSingleGame("CLE");
		
		PlayerPerformanceInSingleGame pp1=new PlayerPerformanceInSingleGame("Mike Miller");
		pp1.setHitNum(9);
		pp1.setThreePointHitNum(3);
		pp1.setFoul(3);
		pp1.setSteal(2);
		pp1.setReboundOverall(6);
		pp1.setScore(19);
		tp1.AddPlayerP(pp1);
		tp1.AddFirstP(pp1);
		PlayerPerformanceInSingleGame pp2=new PlayerPerformanceInSingleGame("Anderson Varejao");
		pp2.setHitNum(0);
		pp2.setThreePointHitNum(0);
		pp2.setFoul(0);
		pp2.setSteal(0);
		pp2.setReboundOverall(0);
		pp2.setScore(0);
		tp1.AddPlayerP(pp2);
		PlayerPerformanceInSingleGame pp3=new PlayerPerformanceInSingleGame("Anthony Bennett");
		pp3.setHitNum(9);
		pp3.setThreePointHitNum(3);
		pp3.setFoul(3);
		pp3.setSteal(2);
		pp3.setReboundOverall(6);
		pp3.setScore(19);
		tp1.AddPlayerP(pp3);
		PlayerPerformanceInSingleGame pp4=new PlayerPerformanceInSingleGame("Andre Roberson");
		pp4.setHitNum(0);
		pp4.setThreePointHitNum(0);
		pp4.setFoul(0);
		pp4.setSteal(0);
		pp4.setReboundOverall(0);
		pp4.setScore(0);
		tp1.AddPlayerP(pp4);
		PlayerPerformanceInSingleGame pp5=new PlayerPerformanceInSingleGame("Evan Turner");
		pp5.setHitNum(9);
		pp5.setThreePointHitNum(3);
		pp5.setFoul(3);
		pp5.setSteal(2);
		pp5.setReboundOverall(6);
		pp5.setScore(19);
		tp1.AddPlayerP(pp5);
		PlayerPerformanceInSingleGame pp6=new PlayerPerformanceInSingleGame("Anderson Varejao");
		pp6.setHitNum(0);
		pp6.setThreePointHitNum(0);
		pp6.setFoul(0);
		pp6.setSteal(0);
		pp6.setReboundOverall(0);
		pp6.setScore(0);
		tp1.AddPlayerP(pp6);
		
		tp1.AddFirstP(pp2);
		tp1.AddFirstP(pp3);
		tp1.AddFirstP(pp4);
		tp1.AddFirstP(pp5);
		gameVo1.setGuestTP(tp1);	
		
		TeamPerformanceInSingleGame tp2=new TeamPerformanceInSingleGame("CLE");
		PlayerPerformanceInSingleGame pp7=new PlayerPerformanceInSingleGame("Mike Miller");
		pp7.setHitNum(9);
		pp7.setThreePointHitNum(3);
		pp7.setFoul(3);
		pp7.setSteal(2);
		pp7.setReboundOverall(6);
		pp7.setScore(19);
		tp2.AddPlayerP(pp7);
		PlayerPerformanceInSingleGame pp8=new PlayerPerformanceInSingleGame("Anderson Varejao");
		pp8.setHitNum(0);
		pp8.setThreePointHitNum(0);
		pp8.setFoul(0);
		pp8.setSteal(0);
		pp8.setReboundOverall(0);
		pp8.setScore(0);
		tp2.AddPlayerP(pp8);
		PlayerPerformanceInSingleGame pp9=new PlayerPerformanceInSingleGame("Anthony Bennett");
		pp9.setHitNum(9);
		pp9.setThreePointHitNum(3);
		pp9.setFoul(3);
		pp9.setSteal(2);
		pp9.setReboundOverall(6);
		pp9.setScore(19);
		tp2.AddPlayerP(pp9);
		PlayerPerformanceInSingleGame pp10=new PlayerPerformanceInSingleGame("Andre Roberson");
		pp10.setHitNum(0);
		pp10.setThreePointHitNum(0);
		pp10.setFoul(0);
		pp10.setSteal(0);
		pp10.setReboundOverall(0);
		pp10.setScore(0);
		tp2.AddPlayerP(pp10);
		PlayerPerformanceInSingleGame pp11=new PlayerPerformanceInSingleGame("Evan Turner");
		pp11.setHitNum(0);
		pp11.setThreePointHitNum(0);
		pp11.setFoul(0);
		pp11.setSteal(0);
		pp11.setReboundOverall(0);
		pp11.setScore(0);
		tp2.AddPlayerP(pp11);
		tp2.AddFirstP(pp7);
		tp2.AddFirstP(pp8);
		tp2.AddFirstP(pp9);
		tp2.AddFirstP(pp10);
		tp2.AddFirstP(pp11);	
		gameVo1.setHomeTP(tp2);	
		
		gameVos.add(gameVo1);
		GameVo gameVo2 = new GameVo();
		gameVo2.setHomeTeam("SAS");
		gameVo2.setGuestTeam("OKC");
		gameVo2.setScore1st(scoreboard1);
		gameVo2.setScore2nd(scoreboard1);
		gameVo2.setScore3rd(scoreboard1);
		gameVo2.setScore4th(scoreboard1);
		gameVo2.setScoreOverall(scoreboard2);
		gameVos.add(gameVo2);
		GameVo gameVo3 = new GameVo();
		gameVo3.setHomeTeam("MIA");
		gameVo3.setGuestTeam("CHI");
		gameVo3.setScore1st(scoreboard1);
		gameVo3.setScore2nd(scoreboard1);
		gameVo3.setScore3rd(scoreboard1);
		gameVo3.setScore4th(scoreboard1);
		gameVo3.setScoreOverall(scoreboard2);
		gameVos.add(gameVo3);
		GameVo gameVo4 = new GameVo();
		gameVo4.setHomeTeam("UTA");
		gameVo4.setGuestTeam("NYK");
		gameVo4.setScore1st(scoreboard1);
		gameVo4.setScore2nd(scoreboard1);
		gameVo4.setScore3rd(scoreboard1);
		gameVo4.setScore4th(scoreboard1);
		gameVo4.setScoreOverall(scoreboard2);
		gameVos.add(gameVo4);
		GameVo gameVo5 = new GameVo();
		gameVo5.setHomeTeam("LAL");
		gameVo5.setGuestTeam("MIL");
		gameVo5.setScore1st(scoreboard1);
		gameVo5.setScore2nd(scoreboard1);
		gameVo5.setScore3rd(scoreboard1);
		gameVo5.setScore4th(scoreboard1);
		gameVo5.setScoreOverall(scoreboard2);
		gameVos.add(gameVo5);
		GameVo gameVo6 = new GameVo();
		gameVo6.setHomeTeam("PHX");
		gameVo6.setGuestTeam("GSW");
		gameVo6.setScore1st(scoreboard1);
		gameVo6.setScore2nd(scoreboard1);
		gameVo6.setScore3rd(scoreboard1);
		gameVo6.setScore4th(scoreboard1);
		gameVo6.setScoreOverall(scoreboard2);
		gameVos.add(gameVo6);
		GameVo gameVo7 = new GameVo();
		gameVo7.setHomeTeam("UTA");
		gameVo7.setGuestTeam("NYK");
		gameVo7.setScore1st(scoreboard1);
		gameVo7.setScore2nd(scoreboard1);
		gameVo7.setScore3rd(scoreboard1);
		gameVo7.setScore4th(scoreboard1);
		gameVo7.setScoreOverall(scoreboard2);
		gameVos.add(gameVo7);
		GameVo gameVo8 = new GameVo();
		gameVo8.setHomeTeam("LAL");
		gameVo8.setGuestTeam("MIL");
		gameVo8.setScore1st(scoreboard1);
		gameVo8.setScore2nd(scoreboard1);
		gameVo8.setScore3rd(scoreboard1);
		gameVo8.setScore4th(scoreboard1);
		gameVo8.setScoreOverall(scoreboard2);
		gameVos.add(gameVo8);
		GameVo gameVo9 = new GameVo();
		gameVo9.setHomeTeam("PHX");
		gameVo9.setGuestTeam("GSW");
		gameVo9.setScore1st(scoreboard1);
		gameVo9.setScore2nd(scoreboard1);
		gameVo9.setScore3rd(scoreboard1);
		gameVo9.setScore4th(scoreboard1);
		gameVo9.setScoreOverall(scoreboard2);
		gameVos.add(gameVo9);
		GameVo gameVo10 = new GameVo();
		gameVo10.setHomeTeam("PHX");
		gameVo10.setGuestTeam("GSW");
		gameVo10.setScore1st(scoreboard1);
		gameVo10.setScore2nd(scoreboard1);
		gameVo10.setScore3rd(scoreboard1);
		gameVo10.setScore4th(scoreboard1);
		gameVo10.setScoreOverall(scoreboard2);
		gameVos.add(gameVo10);
		return gameVos;
	}

	@Override
	public ArrayList<GameVo> getGamesDaily() {
		// TODO Auto-generated method stub
		Scoreboard scoreboard1 = new Scoreboard();
		scoreboard1.setGuestScore(28);
		scoreboard1.setHomeScore(27);
		Scoreboard scoreboard2 = new Scoreboard();
		scoreboard2.setGuestScore(112);
		scoreboard2.setHomeScore(108);

		ArrayList<GameVo> gameVos = new ArrayList<GameVo>();
		GameVo gameVo1 = new GameVo();
		gameVo1.setHomeTeam("BKN");
		gameVo1.setGuestTeam("CLE");
		gameVo1.setScore1st(scoreboard1);
		gameVo1.setScore2nd(scoreboard1);
		gameVo1.setScore3rd(scoreboard1);
		gameVo1.setScore4th(scoreboard1);
		gameVo1.setScoreOverall(scoreboard2);
		gameVos.add(gameVo1);
		GameVo gameVo2 = new GameVo();
		gameVo2.setHomeTeam("SAS");
		gameVo2.setGuestTeam("OKC");
		gameVo2.setScore1st(scoreboard1);
		gameVo2.setScore2nd(scoreboard1);
		gameVo2.setScore3rd(scoreboard1);
		gameVo2.setScore4th(scoreboard1);
		gameVo2.setScoreOverall(scoreboard2);
		gameVos.add(gameVo2);
		return gameVos;
	}

	@Override
	public ArrayList<GameVo> getGamesByDate(String date) {
		// TODO Auto-generated method stub
		Scoreboard scoreboard1 = new Scoreboard();
		scoreboard1.setGuestScore(26);
		scoreboard1.setHomeScore(23);
		Scoreboard scoreboard2 = new Scoreboard();
		scoreboard2.setGuestScore(104);
		scoreboard2.setHomeScore(92);

		ArrayList<GameVo> gameVos = new ArrayList<GameVo>();
		GameVo gameVo1 = new GameVo();
		gameVo1.setHomeTeam("UTA");
		gameVo1.setGuestTeam("NYK");
		gameVo1.setScore1st(scoreboard1);
		gameVo1.setScore2nd(scoreboard1);
		gameVo1.setScore3rd(scoreboard1);
		gameVo1.setScore4th(scoreboard1);
		gameVo1.setScoreOverall(scoreboard2);
		gameVos.add(gameVo1);
		GameVo gameVo2 = new GameVo();
		gameVo2.setHomeTeam("LAL");
		gameVo2.setGuestTeam("MIL");
		gameVo2.setScore1st(scoreboard1);
		gameVo2.setScore2nd(scoreboard1);
		gameVo2.setScore3rd(scoreboard1);
		gameVo2.setScore4th(scoreboard1);
		gameVo2.setScoreOverall(scoreboard2);
		gameVos.add(gameVo2);
		GameVo gameVo3 = new GameVo();
		gameVo3.setHomeTeam("PHX");
		gameVo3.setGuestTeam("GSW");
		gameVo3.setScore1st(scoreboard1);
		gameVo3.setScore2nd(scoreboard1);
		gameVo3.setScore3rd(scoreboard1);
		gameVo3.setScore4th(scoreboard1);
		gameVo3.setScoreOverall(scoreboard2);
		gameVos.add(gameVo3);
		return gameVos;
	}

	@Override
	public ArrayList<PlayerPerformanceInSingleGame> getGameByLabel(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlayerPerformanceInSingleGame getPerformance(String label,
			String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<GameVo> getGamesByDate(String date1, String date2) {
		// TODO Auto-generated method stub
		Scoreboard scoreboard1 = new Scoreboard();
		scoreboard1.setGuestScore(26);
		scoreboard1.setHomeScore(23);
		Scoreboard scoreboard2 = new Scoreboard();
		scoreboard2.setGuestScore(104);
		scoreboard2.setHomeScore(92);

		ArrayList<GameVo> gameVos = new ArrayList<GameVo>();
		GameVo gameVo1 = new GameVo();
		gameVo1.setHomeTeam("UTA");
		gameVo1.setGuestTeam("NYK");
		gameVo1.setScore1st(scoreboard1);
		gameVo1.setScore2nd(scoreboard1);
		gameVo1.setScore3rd(scoreboard1);
		gameVo1.setScore4th(scoreboard1);
		gameVo1.setScoreOverall(scoreboard2);
		gameVos.add(gameVo1);
		GameVo gameVo2 = new GameVo();
		gameVo2.setHomeTeam("LAL");
		gameVo2.setGuestTeam("MIL");
		gameVo2.setScore1st(scoreboard1);
		gameVo2.setScore2nd(scoreboard1);
		gameVo2.setScore3rd(scoreboard1);
		gameVo2.setScore4th(scoreboard1);
		gameVo2.setScoreOverall(scoreboard2);
		gameVos.add(gameVo2);
		GameVo gameVo3 = new GameVo();
		gameVo3.setHomeTeam("PHX");
		gameVo3.setGuestTeam("GSW");
		gameVo3.setScore1st(scoreboard1);
		gameVo3.setScore2nd(scoreboard1);
		gameVo3.setScore3rd(scoreboard1);
		gameVo3.setScore4th(scoreboard1);
		gameVo3.setScoreOverall(scoreboard2);
		gameVos.add(gameVo3);
		return gameVos;
	}

	@Override
	public GameVo getGameVoByLabel(String label) {
		// TODO Auto-generated method stub
		return null;
	}

}
