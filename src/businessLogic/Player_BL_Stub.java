package businessLogic;

import java.util.ArrayList;

import javax.swing.JTextField;

import enums.Conference;
import enums.Division;
import vo.PlayerCardVo;
import vo.PlayerGames;
import vo.PlayerPerformanceInSingleGame;
import vo.PlayerRecentGames;
import vo.PlayerVo;
import vo.TotalInfo;

public class Player_BL_Stub implements Player_BS {
	Player_Handler player_handler;

	public PlayerVo getPlayerByName(String name) {
		System.out.println("Enter Stub");
		PlayerVo playerVo = new PlayerVo();
		playerVo.setName(name);
		playerVo.setAge(25);
		playerVo.setDivision(Division.ATLANTIC);
		playerVo.setNumber("19");
		playerVo.setReboundOverallField(4.1);
		playerVo.setGameNum(10);
		playerVo.setTimeField(1201);
		playerVo.setAssistanceField(7.11);
		playerVo.setScoreField(18.2);
		playerVo.setHitNumField(5.2);
		playerVo.setThreePointHitRate(0.389);
		playerVo.setFreeThrowRate(0.793);
		playerVo.setStealField(10.3);
		playerVo.setBlockField(9.8);
		playerVo.setTurnoverField(1.9);
		playerVo.setFoulField(3.4);
		return playerVo;
	}

	public ArrayList<PlayerVo> getAllPlayer() {
		ArrayList<PlayerVo> playerVos = new ArrayList<PlayerVo>();
		PlayerVo playerVo1 = new PlayerVo();
		playerVo1.setName("Andre Miller");
		playerVo1.setTeam("NYK");
		playerVo1.setAge(25);
		playerVo1.setDivision(Division.ATLANTIC);
		playerVo1.setNumber("19");
		playerVos.add(playerVo1);
		PlayerVo playerVo2 = new PlayerVo();
		playerVo2.setName("David Lee");
		playerVo2.setTeam("OKC");
		playerVo2.setAge(24);
		playerVo2.setDivision(Division.SOUTHEAST);
		playerVo2.setNumber("6");
		playerVos.add(playerVo2);

		return playerVos;
	}

	public ArrayList<PlayerVo> sortPlayerBy(String option) {

		ArrayList<PlayerVo> playerVos = new ArrayList<PlayerVo>();
		PlayerVo playerVo1 = new PlayerVo();
		playerVo1.setName("Andre Miller");
		playerVo1.setAge(25);
		playerVo1.setDivision(Division.ATLANTIC);
		playerVo1.setNumber("19");
		playerVos.add(playerVo1);
		PlayerVo playerVo2 = new PlayerVo();
		playerVo2.setName("David Lee");
		playerVo2.setAge(24);
		playerVo2.setDivision(Division.SOUTHEAST);
		playerVo2.setNumber("6");
		playerVos.add(playerVo2);

		return playerVos;
	}

	public ArrayList<PlayerVo> filterPlayerBy(String position, String div,
			String option) {
		ArrayList<PlayerVo> playerVos = new ArrayList<PlayerVo>();
		PlayerVo playerVo1 = new PlayerVo();
		playerVo1.setName("Andre Miller");
		playerVo1.setAge(25);
		playerVo1.setDivision(Division.ATLANTIC);
		playerVo1.setNumber("19");
		playerVos.add(playerVo1);
		PlayerVo playerVo2 = new PlayerVo();
		playerVo2.setName("David Lee");
		playerVo2.setAge(24);
		playerVo2.setDivision(Division.SOUTHEAST);
		playerVo2.setNumber("6");
		playerVos.add(playerVo2);

		return playerVos;
	}

	public ArrayList<PlayerVo> getPlayersByTeam(String abbr) {
		ArrayList<PlayerVo> playerVos = new ArrayList<PlayerVo>();
		PlayerVo playerVo1 = new PlayerVo();
		playerVo1.setName("Andre Miller");
		playerVo1.setAge(25);
		playerVo1.setTeam(abbr);
		playerVo1.setDivision(Division.ATLANTIC);
		playerVo1.setNumber("19");
		playerVos.add(playerVo1);
		PlayerVo playerVo2 = new PlayerVo();
		playerVo2.setName("David Lee");
		playerVo2.setAge(24);
		playerVo2.setTeam(abbr);
		playerVo2.setDivision(Division.SOUTHEAST);
		playerVo2.setNumber("6");
		playerVos.add(playerVo2);

		return playerVos;

	}

	public ArrayList<PlayerCardVo> hotPlayerDaily(String option) {
		ArrayList<PlayerCardVo> playerCardVos = new ArrayList<PlayerCardVo>();
		if (option == "score") {

			PlayerCardVo playerCardVo1 = new PlayerCardVo();
			playerCardVo1.setName("Andre Miller");
			playerCardVo1.setTeam("ATL");
			playerCardVo1.setPosition("前锋");
			playerCardVo1.setSortOption(option);
			playerCardVo1.setSortvalue(27.8);
			;
			playerCardVo1.setNumber("19");
			playerCardVos.add(playerCardVo1);
			PlayerCardVo playerCardVo2 = new PlayerCardVo();
			playerCardVo2.setName("David Lee");
			playerCardVo2.setTeam("LAC");
			playerCardVo2.setPosition("后卫");
			playerCardVo2.setSortOption(option);
			playerCardVo2.setSortvalue(19.6);
			playerCardVo2.setNumber("6");
			playerCardVos.add(playerCardVo2);
			PlayerCardVo playerCardVo3 = new PlayerCardVo();
			playerCardVo3.setName("testHotPlayerDaily3");
			playerCardVo3.setTeam("DAL");
			playerCardVo3.setPosition("前锋");
			playerCardVo3.setSortOption(option);
			playerCardVo3.setSortvalue(24.8);
			;
			playerCardVo3.setNumber("20");
			playerCardVos.add(playerCardVo3);
			PlayerCardVo playerCardVo4 = new PlayerCardVo();
			playerCardVo4.setName("testHotPlayerDaily4");
			playerCardVo4.setTeam("MIA");
			playerCardVo4.setPosition("中锋");
			playerCardVo4.setSortOption(option);
			playerCardVo4.setSortvalue(33.7);
			playerCardVo4.setNumber("9");
			playerCardVos.add(playerCardVo4);
			PlayerCardVo playerCardVo5 = new PlayerCardVo();
			playerCardVo5.setName("testHotPlayerDaily5");
			playerCardVo5.setTeam("MIA");
			playerCardVo5.setPosition("后卫");
			playerCardVo5.setSortOption(option);
			playerCardVo5.setSortvalue(32.8);
			playerCardVo5.setNumber("18");
			playerCardVos.add(playerCardVo5);
		} else {

			PlayerCardVo playerCardVo1 = new PlayerCardVo();
			playerCardVo1.setName("David Lee");
			playerCardVo1.setTeam("ATL");
			playerCardVo1.setPosition("前锋");
			playerCardVo1.setSortOption(option);
			playerCardVo1.setSortvalue(27.8);
			;
			playerCardVo1.setNumber("19");
			playerCardVos.add(playerCardVo1);
			PlayerCardVo playerCardVo2 = new PlayerCardVo();
			playerCardVo2.setName("Andre Miller");
			playerCardVo2.setTeam("LAC");
			playerCardVo2.setPosition("后卫");
			playerCardVo2.setSortOption(option);
			playerCardVo2.setSortvalue(19.6);
			playerCardVo2.setNumber("6");
			playerCardVos.add(playerCardVo2);
			PlayerCardVo playerCardVo3 = new PlayerCardVo();
			playerCardVo3.setName("testHotPlayerDaily3");
			playerCardVo3.setTeam("DAL");
			playerCardVo3.setPosition("前锋");
			playerCardVo3.setSortOption(option);
			playerCardVo3.setSortvalue(24.8);
			;
			playerCardVo3.setNumber("20");
			playerCardVos.add(playerCardVo3);
			PlayerCardVo playerCardVo4 = new PlayerCardVo();
			playerCardVo4.setName("testHotPlayerDaily4");
			playerCardVo4.setTeam("MIA");
			playerCardVo4.setPosition("中锋");
			playerCardVo4.setSortOption(option);
			playerCardVo4.setSortvalue(33.7);
			playerCardVo4.setNumber("9");
			playerCardVos.add(playerCardVo4);
			PlayerCardVo playerCardVo5 = new PlayerCardVo();
			playerCardVo5.setName("testHotPlayerDaily5");
			playerCardVo5.setTeam("MIA");
			playerCardVo5.setPosition("后卫");
			playerCardVo5.setSortOption(option);
			playerCardVo5.setSortvalue(32.8);
			playerCardVo5.setNumber("18");
			playerCardVos.add(playerCardVo5);

		}
		return playerCardVos;
	}

	public ArrayList<PlayerCardVo> hotPlayerSeason(String option) {
		ArrayList<PlayerCardVo> playerCardVos = new ArrayList<PlayerCardVo>();
		if (option == "scoreField") {

			PlayerCardVo playerCardVo1 = new PlayerCardVo();
			playerCardVo1.setName("Raymond Felton");
			playerCardVo1.setTeam("ATL");
			playerCardVo1.setPosition("前锋");
			playerCardVo1.setSortOption(option);
			playerCardVo1.setSortvalue(27.8);
			;
			playerCardVo1.setNumber("19");
			playerCardVos.add(playerCardVo1);
			PlayerCardVo playerCardVo2 = new PlayerCardVo();
			playerCardVo2.setName("Kobe Bryant");
			playerCardVo2.setTeam("LAC");
			playerCardVo2.setPosition("后卫");
			playerCardVo2.setSortOption(option);
			playerCardVo2.setSortvalue(19.6);
			playerCardVo2.setNumber("6");
			playerCardVos.add(playerCardVo2);
			PlayerCardVo playerCardVo3 = new PlayerCardVo();
			playerCardVo3.setName("testHotPlayerDaily3");
			playerCardVo3.setTeam("DAL");
			playerCardVo3.setPosition("前锋");
			playerCardVo3.setSortOption(option);
			playerCardVo3.setSortvalue(24.8);
			;
			playerCardVo3.setNumber("20");
			playerCardVos.add(playerCardVo3);
			PlayerCardVo playerCardVo4 = new PlayerCardVo();
			playerCardVo4.setName("testHotPlayerDaily4");
			playerCardVo4.setTeam("MIA");
			playerCardVo4.setPosition("中锋");
			playerCardVo4.setSortOption(option);
			playerCardVo4.setSortvalue(33.7);
			playerCardVo4.setNumber("9");
			playerCardVos.add(playerCardVo4);
			PlayerCardVo playerCardVo5 = new PlayerCardVo();
			playerCardVo5.setName("testHotPlayerDaily5");
			playerCardVo5.setTeam("MIA");
			playerCardVo5.setPosition("后卫");
			playerCardVo5.setSortOption(option);
			playerCardVo5.setSortvalue(32.8);
			playerCardVo5.setNumber("18");
			playerCardVos.add(playerCardVo5);
		} else {

			PlayerCardVo playerCardVo1 = new PlayerCardVo();
			playerCardVo1.setName("Kobe Bryant");
			playerCardVo1.setTeam("ATL");
			playerCardVo1.setPosition("前锋");
			playerCardVo1.setSortOption(option);
			playerCardVo1.setSortvalue(27.8);
			;
			playerCardVo1.setNumber("19");
			playerCardVos.add(playerCardVo1);
			PlayerCardVo playerCardVo2 = new PlayerCardVo();
			playerCardVo2.setName("Raymond Felton");
			playerCardVo2.setTeam("LAC");
			playerCardVo2.setPosition("后卫");
			playerCardVo2.setSortOption(option);
			playerCardVo2.setSortvalue(19.6);
			playerCardVo2.setNumber("6");
			playerCardVos.add(playerCardVo2);
			PlayerCardVo playerCardVo3 = new PlayerCardVo();
			playerCardVo3.setName("testHotPlayerDaily3");
			playerCardVo3.setTeam("DAL");
			playerCardVo3.setPosition("前锋");
			playerCardVo3.setSortOption(option);
			playerCardVo3.setSortvalue(24.8);
			;
			playerCardVo3.setNumber("20");
			playerCardVos.add(playerCardVo3);
			PlayerCardVo playerCardVo4 = new PlayerCardVo();
			playerCardVo4.setName("testHotPlayerDaily4");
			playerCardVo4.setTeam("MIA");
			playerCardVo4.setPosition("中锋");
			playerCardVo4.setSortOption(option);
			playerCardVo4.setSortvalue(33.7);
			playerCardVo4.setNumber("9");
			playerCardVos.add(playerCardVo4);
			PlayerCardVo playerCardVo5 = new PlayerCardVo();
			playerCardVo5.setName("testHotPlayerDaily5");
			playerCardVo5.setTeam("MIA");
			playerCardVo5.setPosition("后卫");
			playerCardVo5.setSortOption(option);
			playerCardVo5.setSortvalue(32.8);
			playerCardVo5.setNumber("18");
			playerCardVos.add(playerCardVo5);

		}
		return playerCardVos;
	}

	@Override
	public ArrayList<PlayerCardVo> progressFastPlayer(String option) {
		ArrayList<PlayerCardVo> playerCardVos = new ArrayList<PlayerCardVo>();
		PlayerCardVo playerCardVo1 = new PlayerCardVo();
		playerCardVo1.setName("Andre Miller");
		playerCardVo1.setTeam("ATL");
		playerCardVo1.setPosition("前锋");
		playerCardVo1.setSortOption(option);
		playerCardVo1.setSortvalue(27.8);
		;
		playerCardVo1.setNumber("19");
		playerCardVos.add(playerCardVo1);
		PlayerCardVo playerCardVo2 = new PlayerCardVo();
		playerCardVo2.setName("David Lee");
		playerCardVo2.setTeam("LAC");
		playerCardVo2.setPosition("后卫");
		playerCardVo2.setSortOption(option);
		playerCardVo2.setSortvalue(22.2);
		playerCardVo2.setNumber("6");
		playerCardVos.add(playerCardVo2);
		PlayerCardVo playerCardVo3 = new PlayerCardVo();
		playerCardVo3.setName("testHotPlayerDaily3");
		playerCardVo3.setTeam("DAL");
		playerCardVo3.setPosition("前锋");
		playerCardVo3.setSortOption(option);
		playerCardVo3.setSortvalue(24.8);
		;
		playerCardVo3.setNumber("20");
		playerCardVos.add(playerCardVo3);
		PlayerCardVo playerCardVo4 = new PlayerCardVo();
		playerCardVo4.setName("testHotPlayerDaily4");
		playerCardVo4.setTeam("MIA");
		playerCardVo4.setPosition("中锋");
		playerCardVo4.setSortOption(option);
		playerCardVo4.setSortvalue(33.7);
		playerCardVo4.setNumber("9");
		playerCardVos.add(playerCardVo4);
		PlayerCardVo playerCardVo5 = new PlayerCardVo();
		playerCardVo5.setName("testHotPlayerDaily5");
		playerCardVo5.setTeam("MIA");
		playerCardVo5.setPosition("后卫");
		playerCardVo5.setSortOption(option);
		playerCardVo5.setSortvalue(32.8);
		playerCardVo5.setNumber("18");
		playerCardVos.add(playerCardVo5);
		return playerCardVos;
	}

	@Override
	public PlayerRecentGames getPlayerRecentPerformance(String name) {
		PlayerRecentGames playerRecentGames = new PlayerRecentGames();
		PlayerPerformanceInSingleGame pp1 = new PlayerPerformanceInSingleGame(
				"Mike Miller");
		pp1.setHitNum(9);
		pp1.setThreePointHitNum(3);
		pp1.setFoul(3);
		pp1.setSteal(2);
		pp1.setReboundOverall(6);
		pp1.setScore(19);
		pp1.setGameLabel("13-14_2014-01-01_CHA-LAC");
		PlayerPerformanceInSingleGame pp2 = new PlayerPerformanceInSingleGame(
				"Anderson Varejao");
		pp2.setHitNum(0);
		pp2.setThreePointHitNum(0);
		pp2.setFoul(0);
		pp2.setSteal(0);
		pp2.setReboundOverall(0);
		pp2.setScore(0);
		pp2.setGameLabel("13-14_2014-01-01_CHA-LAC");
		PlayerPerformanceInSingleGame pp3 = new PlayerPerformanceInSingleGame(
				"Anthony Bennett");
		pp3.setHitNum(9);
		pp3.setThreePointHitNum(3);
		pp3.setFoul(3);
		pp3.setSteal(2);
		pp3.setReboundOverall(6);
		pp3.setScore(19);
		pp3.setGameLabel("13-14_2014-01-01_CHA-LAC");
		PlayerPerformanceInSingleGame pp4 = new PlayerPerformanceInSingleGame(
				"Andre Roberson");
		pp4.setHitNum(0);
		pp4.setThreePointHitNum(0);
		pp4.setFoul(0);
		pp4.setSteal(0);
		pp4.setReboundOverall(0);
		pp4.setScore(0);
		pp4.setGameLabel("13-14_2014-01-01_CHA-LAC");
		PlayerPerformanceInSingleGame pp5 = new PlayerPerformanceInSingleGame(
				"Evan Turner");
		pp5.setHitNum(9);
		pp5.setThreePointHitNum(3);
		pp5.setFoul(3);
		pp5.setSteal(2);
		pp5.setReboundOverall(6);
		pp5.setScore(19);
		pp5.setGameLabel("13-14_2014-01-01_CHA-LAC");
		playerRecentGames.AddNewGame(pp1);
		playerRecentGames.AddNewGame(pp2);
		playerRecentGames.AddNewGame(pp3);
		playerRecentGames.AddNewGame(pp4);
		playerRecentGames.AddNewGame(pp5);
		return playerRecentGames;
	}

	@Override
	public ArrayList<PlayerVo> sortPlayerBy(String option1, String option2) {
		ArrayList<PlayerVo> playerVos = new ArrayList<PlayerVo>();
		PlayerVo playerVo1 = new PlayerVo();
		playerVo1.setName("Chris Johnson");
		playerVo1.setAge(25);
		playerVo1.setDivision(Division.ATLANTIC);
		playerVo1.setNumber("19");
		playerVos.add(playerVo1);
		PlayerVo playerVo2 = new PlayerVo();
		playerVo2.setName("Leandro Barbosa");
		playerVo2.setAge(24);
		playerVo2.setDivision(Division.SOUTHEAST);
		playerVo2.setNumber("6");
		playerVos.add(playerVo2);

		return playerVos;
	}

	@Override
	public ArrayList<PlayerVo> searchPlayer(String key, String first) {
		// TODO Auto-generated method stub
		ArrayList<PlayerVo> playerVos = new ArrayList<PlayerVo>();
		if (key.equals("")) {
			if (first == "A") {
				System.out.println("null   " + "A");
				PlayerVo playerVo1 = new PlayerVo();
				playerVo1.setName("Andre Miller");
				playerVo1.setAge(25);
				playerVo1.setDivision(Division.ATLANTIC);
				playerVo1.setPosition("前锋");
				playerVo1.setTeam("ATL");
				playerVo1.setExp(4);
				playerVo1.setSchool("UCLA");
				playerVo1.setBirth("1991-12-23");
				playerVo1.setNumber("19");
				playerVos.add(playerVo1);
				PlayerVo playerVo2 = new PlayerVo();
				playerVo2.setName("Anthony Davis");
				playerVo2.setAge(24);
				playerVo2.setTeam("MIA");
				playerVo2.setDivision(Division.SOUTHEAST);
				playerVo2.setNumber("6");
				playerVos.add(playerVo2);
			} else {
				System.out.println("null   " + first);
				PlayerVo playerVo1 = new PlayerVo();
				playerVo1.setName("Dion Waiters");
				playerVo1.setAge(25);
				playerVo1.setDivision(Division.ATLANTIC);
				playerVo1.setPosition("中锋");
				playerVo1.setTeam("MEM");
				playerVo1.setExp(6);
				playerVo1.setSchool("UCLA");
				playerVo1.setBirth("1989-08-07");
				playerVo1.setNumber("11");
				playerVos.add(playerVo1);
				PlayerVo playerVo2 = new PlayerVo();
				playerVo2.setName("Josh Smith");
				playerVo2.setAge(24);
				playerVo2.setTeam("GSW");
				playerVo2.setDivision(Division.SOUTHEAST);
				playerVo2.setNumber("6");
				playerVos.add(playerVo2);
			}
		} else {
			if (first == "B") {
				System.out.println("key   B");
				PlayerVo playerVo1 = new PlayerVo();
				playerVo1.setName("Brandon Knight");
				playerVo1.setAge(25);
				playerVo1.setDivision(Division.ATLANTIC);
				playerVo1.setPosition("前锋");
				playerVo1.setTeam("HOU");
				playerVo1.setExp(4);
				playerVo1.setSchool("UCLA");
				playerVo1.setBirth("1991-12-23");
				playerVo1.setNumber("19");
				playerVos.add(playerVo1);
				PlayerVo playerVo2 = new PlayerVo();
				playerVo2.setName("Blake Griffin");
				playerVo2.setAge(24);
				playerVo2.setTeam("LAC");
				playerVo2.setDivision(Division.SOUTHEAST);
				playerVo2.setNumber("6");
				playerVos.add(playerVo2);
			} else {
				System.out.println("key   " + first);
				PlayerVo playerVo1 = new PlayerVo();
				playerVo1.setName("Lou Williams");
				playerVo1.setAge(25);
				playerVo1.setDivision(Division.ATLANTIC);
				playerVo1.setPosition("中锋");
				playerVo1.setTeam("SAC");
				playerVo1.setExp(6);
				playerVo1.setSchool("UCLA");
				playerVo1.setBirth("1989-08-07");
				playerVo1.setNumber("11");
				playerVos.add(playerVo1);
				PlayerVo playerVo2 = new PlayerVo();
				playerVo2.setName("Robert Sacre");
				playerVo2.setAge(24);
				playerVo2.setTeam("LAL");
				playerVo2.setDivision(Division.SOUTHEAST);
				playerVo2.setNumber("6");
				playerVos.add(playerVo2);
			}
		}

		return playerVos;
	}

	@Override
	public PlayerGames getPlayerPerformacne(String name) {
		// TODO Auto-generated method stub
		PlayerGames playerGames = new PlayerGames(name);
		ArrayList<PlayerPerformanceInSingleGame> games = new ArrayList<PlayerPerformanceInSingleGame>();
		PlayerPerformanceInSingleGame pp1 = new PlayerPerformanceInSingleGame(
				"Mike Miller");
		pp1.setHitNum(9);
		pp1.setThreePointHitNum(3);
		pp1.setFoul(3);
		pp1.setSteal(2);
		pp1.setReboundOverall(6);
		pp1.setScore(19);
		pp1.setGameLabel("13-14_2014-01-01_CHA-LAC");
		PlayerPerformanceInSingleGame pp2 = new PlayerPerformanceInSingleGame(
				"Anderson Varejao");
		pp2.setHitNum(0);
		pp2.setThreePointHitNum(0);
		pp2.setFoul(0);
		pp2.setSteal(0);
		pp2.setReboundOverall(0);
		pp2.setScore(0);
		pp2.setGameLabel("13-14_2014-01-01_CHA-LAC");
		PlayerPerformanceInSingleGame pp3 = new PlayerPerformanceInSingleGame(
				"Anthony Bennett");
		pp3.setHitNum(9);
		pp3.setThreePointHitNum(3);
		pp3.setFoul(3);
		pp3.setSteal(2);
		pp3.setReboundOverall(6);
		pp3.setScore(19);
		pp3.setGameLabel("13-14_2014-01-01_CHA-LAC");
		PlayerPerformanceInSingleGame pp4 = new PlayerPerformanceInSingleGame(
				"Andre Roberson");
		pp4.setHitNum(0);
		pp4.setThreePointHitNum(0);
		pp4.setFoul(0);
		pp4.setSteal(0);
		pp4.setReboundOverall(0);
		pp4.setScore(0);
		pp4.setGameLabel("13-14_2014-01-01_CHA-LAC");
		PlayerPerformanceInSingleGame pp5 = new PlayerPerformanceInSingleGame(
				"Evan Turner");
		pp5.setHitNum(9);
		pp5.setThreePointHitNum(3);
		pp5.setFoul(3);
		pp5.setSteal(2);
		pp5.setReboundOverall(6);
		pp5.setScore(19);
		pp5.setGameLabel("13-14_2014-01-01_CHA-LAC");
		games.add(pp1);
		games.add(pp2);
		games.add(pp3);
		games.add(pp4);
//		games.add(pp5);
		playerGames.setGames(games);

		return playerGames;
	}

	@Override
	public TotalInfo getTotalInfo() {
		// TODO Auto-generated method stub
		TotalInfo totalInfo=new TotalInfo();
		totalInfo.setGamenumField(7);
		totalInfo.setTime(1201);
		totalInfo.setAssistanceField(7.11);
		totalInfo.setScoreField(18.2);
		totalInfo.setHitField(7.0);
		totalInfo.setReboundField(4.9);
		totalInfo.setThreeRate(0.389);
		totalInfo.setFreeRate(0.793);
		totalInfo.setStealField(10.3);
		totalInfo.setBlockField(9.8);
		totalInfo.setTurnoverField(3.5);
		totalInfo.setFoulField(2.3);
		return totalInfo;
	}
}