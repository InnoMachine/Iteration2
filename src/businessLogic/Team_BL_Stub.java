package businessLogic;

import java.util.ArrayList;

import po.GameDate;
import enums.Conference;
import enums.Division;
import vo.PlayerPerformanceInSingleGame;
import vo.PlayerRecentGames;
import vo.PlayerVo;
import vo.TeamCardVo;
import vo.TeamPerformanceInSingleGame;
import vo.TeamRecentGames;
import vo.TeamVo;

public class Team_BL_Stub implements Team_BS {

	@Override
	public TeamVo getTeamByAbbr(String abbr) {
		// TODO Auto-generated method stub
		TeamVo teamVo1 = new TeamVo();
		teamVo1.setTeamName("SSSSSS");
		teamVo1.setAbbreviation("SAS");
		teamVo1.setConference(Conference.E);
		teamVo1.setDivision(Division.CENTRAL);
		teamVo1.setCity("Los Angeles");
		return teamVo1;
	}

	@Override
	public ArrayList<TeamVo> getAllTeam() {
		// TODO Auto-generated method stub
		ArrayList<TeamVo> teamVos = new ArrayList<TeamVo>();
		TeamVo teamVo1 = new TeamVo();
		teamVo1.setTeamName("");
		teamVo1.setAbbreviation("SAS");
		teamVo1.setConference(Conference.E);
		teamVo1.setDivision(Division.CENTRAL);
		teamVo1.setCity("Los Angeles");
		teamVos.add(teamVo1);
		TeamVo teamVo2 = new TeamVo();
		teamVo2.setTeamName("");
		teamVo2.setAbbreviation("ATL");
		teamVo2.setConference(Conference.W);
		teamVo2.setDivision(Division.ATLANTIC);
		teamVo2.setCity("Dallas");
		teamVos.add(teamVo2);
		TeamVo teamVo3 = new TeamVo();
		teamVo3.setTeamName("");
		teamVo3.setAbbreviation("WAS");
		teamVo3.setConference(Conference.E);
		teamVo3.setDivision(Division.SOUTHEAST);
		teamVo3.setCity("Seattle");
		teamVos.add(teamVo3);
		return teamVos;
	}

	@Override
	public ArrayList<TeamVo> sortTeamBy(String option) {
		// TODO Auto-generated method stub
		ArrayList<TeamVo> teamVos = new ArrayList<TeamVo>();
		if (option == "score") {
			TeamVo teamVo1 = new TeamVo();
			teamVo1.setTeamName("");
			teamVo1.setAbbreviation("SAS");
			teamVo1.setConference(Conference.E);
			teamVo1.setDivision(Division.CENTRAL);
			teamVo1.setCity("Los Angeles");
			teamVos.add(teamVo1);
			TeamVo teamVo2 = new TeamVo();
			teamVo2.setTeamName("");
			teamVo2.setAbbreviation("ATL");
			teamVo2.setConference(Conference.W);
			teamVo2.setDivision(Division.ATLANTIC);
			teamVo2.setCity("Dallas");
			teamVos.add(teamVo2);
			TeamVo teamVo3 = new TeamVo();
			teamVo3.setTeamName("");
			teamVo3.setAbbreviation("WAS");
			teamVo3.setConference(Conference.E);
			teamVo3.setDivision(Division.SOUTHEAST);
			teamVo3.setCity("Seattle");
			teamVos.add(teamVo3);

		}else if(option=="hitRate"){
			TeamVo teamVo1 = new TeamVo();
			teamVo1.setTeamName("");
			teamVo1.setAbbreviation("HOU");
			teamVo1.setConference(Conference.E);
			teamVo1.setDivision(Division.CENTRAL);
			teamVo1.setCity("Los Angeles");
			teamVos.add(teamVo1);
			TeamVo teamVo2 = new TeamVo();
			teamVo2.setTeamName("");
			teamVo2.setAbbreviation("PHX");
			teamVo2.setConference(Conference.W);
			teamVo2.setDivision(Division.ATLANTIC);
			teamVo2.setCity("Dallas");
			teamVos.add(teamVo2);
			TeamVo teamVo3 = new TeamVo();
			teamVo3.setTeamName("");
			teamVo3.setAbbreviation("POR");
			teamVo3.setConference(Conference.E);
			teamVo3.setDivision(Division.SOUTHEAST);
			teamVo3.setCity("Seattle");
			teamVos.add(teamVo3);
			
		}else{
			TeamVo teamVo1 = new TeamVo();
			teamVo1.setTeamName("");
			teamVo1.setAbbreviation("IND");
			teamVo1.setConference(Conference.E);
			teamVo1.setDivision(Division.CENTRAL);
			teamVo1.setCity("Los Angeles");
			teamVos.add(teamVo1);
			TeamVo teamVo2 = new TeamVo();
			teamVo2.setTeamName("");
			teamVo2.setAbbreviation("ORL");
			teamVo2.setConference(Conference.W);
			teamVo2.setDivision(Division.ATLANTIC);
			teamVo2.setCity("Dallas");
			teamVos.add(teamVo2);
			TeamVo teamVo3 = new TeamVo();
			teamVo3.setTeamName("");
			teamVo3.setAbbreviation("UTA");
			teamVo3.setConference(Conference.E);
			teamVo3.setDivision(Division.SOUTHEAST);
			teamVo3.setCity("Seattle");
			teamVos.add(teamVo3);	
		}

		return teamVos;
	}

	@Override
	public ArrayList<PlayerVo> getPlayers(String abbr) {
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

	@Override
	public ArrayList<TeamCardVo> hotTeamSeason(String option) {
		// TODO Auto-generated method stub
		ArrayList<TeamCardVo> teamCardVos = new ArrayList<TeamCardVo>();
		if (option == "scoreField") {
			TeamCardVo teamCardVo1 = new TeamCardVo();
			teamCardVo1.setAbbreviation("DAL");
			teamCardVo1.setCity("Los Angeles");
			teamCardVo1.setConference(Conference.E);
			teamCardVo1.setSortOption(option);
			teamCardVo1.setSortValue(27.8);
			teamCardVos.add(teamCardVo1);
			TeamCardVo teamCardVo2 = new TeamCardVo();
			teamCardVo2.setAbbreviation("MEM");
			teamCardVo2.setCity("Atlanta");
			teamCardVo2.setConference(Conference.W);
			teamCardVo2.setSortOption(option);
			teamCardVo2.setSortValue(22.8);
			teamCardVos.add(teamCardVo2);
			TeamCardVo teamCardVo3 = new TeamCardVo();
			teamCardVo3.setAbbreviation("PHI");
			teamCardVo3.setCity("New York");
			teamCardVo3.setConference(Conference.E);
			teamCardVo3.setSortOption(option);
			teamCardVo3.setSortValue(18.9);
			teamCardVos.add(teamCardVo3);
			TeamCardVo teamCardVo4 = new TeamCardVo();
			teamCardVo4.setAbbreviation("SAS");
			teamCardVo4.setCity("New York");
			teamCardVo4.setConference(Conference.W);
			teamCardVo4.setSortOption(option);
			teamCardVo4.setSortValue(19.1);
			teamCardVos.add(teamCardVo4);
			TeamCardVo teamCardVo5 = new TeamCardVo();
			teamCardVo5.setAbbreviation("UTA");
			teamCardVo5.setCity("New York");
			teamCardVo5.setConference(Conference.W);
			teamCardVo5.setSortOption(option);
			teamCardVo5.setSortValue(26.3);
			teamCardVos.add(teamCardVo5);
		} else {

			TeamCardVo teamCardVo1 = new TeamCardVo();
			teamCardVo1.setAbbreviation("ATL");
			teamCardVo1.setCity("Los Angeles");
			teamCardVo1.setConference(Conference.E);
			teamCardVo1.setSortOption(option);
			teamCardVo1.setSortValue(27.8);
			teamCardVos.add(teamCardVo1);
			TeamCardVo teamCardVo2 = new TeamCardVo();
			teamCardVo2.setAbbreviation("MIN");
			teamCardVo2.setCity("Atlanta");
			teamCardVo2.setConference(Conference.W);
			teamCardVo2.setSortOption(option);
			teamCardVo2.setSortValue(22.8);
			teamCardVos.add(teamCardVo2);
			TeamCardVo teamCardVo3 = new TeamCardVo();
			teamCardVo3.setAbbreviation("DEN");
			teamCardVo3.setCity("New York");
			teamCardVo3.setConference(Conference.E);
			teamCardVo3.setSortOption(option);
			teamCardVo3.setSortValue(18.9);
			teamCardVos.add(teamCardVo3);
			TeamCardVo teamCardVo4 = new TeamCardVo();
			teamCardVo4.setAbbreviation("DEN");
			teamCardVo4.setCity("New York");
			teamCardVo4.setConference(Conference.W);
			teamCardVo4.setSortOption(option);
			teamCardVo4.setSortValue(19.1);
			teamCardVos.add(teamCardVo4);
			TeamCardVo teamCardVo5 = new TeamCardVo();
			teamCardVo5.setAbbreviation("DEN");
			teamCardVo5.setCity("New York");
			teamCardVo5.setConference(Conference.W);
			teamCardVo5.setSortOption(option);
			teamCardVo5.setSortValue(26.3);
			teamCardVos.add(teamCardVo5);

		}
		return teamCardVos;

	}

	@Override
	public TeamRecentGames getTeamRecentPerformance(String abbr) {
		TeamRecentGames teamRecentGames = new TeamRecentGames();
		TeamPerformanceInSingleGame pp1 = new TeamPerformanceInSingleGame(
				"Mike Miller");
		pp1.setHitNum(9);
		pp1.setThreePointHitNum(3);
		pp1.setFoul(3);
		pp1.setSteal(2);
		pp1.setReboundOverall(6);
		pp1.setScore(19);
		GameDate gameDate1=new GameDate(2014, 1, 1);
		pp1.setGameDate(gameDate1);
		pp1.setGameLabel("13-14_2014-01-01_CHA-LAC");
		TeamPerformanceInSingleGame pp2 = new TeamPerformanceInSingleGame(
				"Anderson Varejao");
		pp2.setHitNum(0);
		pp2.setThreePointHitNum(0);
		pp2.setFoul(0);
		pp2.setSteal(0);
		pp2.setReboundOverall(0);
		pp2.setScore(0);
		GameDate gameDate2=new GameDate(2013, 1, 1);
		pp2.setGameDate(gameDate2);
		pp2.setGameLabel("13-14_2013-01-01_CHA-LAC");
		TeamPerformanceInSingleGame pp3 = new TeamPerformanceInSingleGame(
				"Anthony Bennett");
		pp3.setHitNum(9);
		pp3.setThreePointHitNum(3);
		pp3.setFoul(3);
		pp3.setSteal(2);
		pp3.setReboundOverall(6);
		pp3.setScore(19);
		GameDate gameDate3=new GameDate(2013, 11, 1);
		pp3.setGameDate(gameDate3);
		pp3.setGameLabel("13-14_2013-11-01_CHA-LAC");
		TeamPerformanceInSingleGame pp4 = new TeamPerformanceInSingleGame(
				"Andre Roberson");
		pp4.setHitNum(0);
		pp4.setThreePointHitNum(0);
		pp4.setFoul(0);
		pp4.setSteal(0);
		pp4.setReboundOverall(0);
		pp4.setScore(0);
		GameDate gameDate4=new GameDate(2013, 12, 23);
		pp4.setGameDate(gameDate4);
		pp4.setGameLabel("13-14_2013-12-23_CHA-LAC");
		TeamPerformanceInSingleGame pp5 = new TeamPerformanceInSingleGame(
				"Evan Turner");
		pp5.setHitNum(9);
		pp5.setThreePointHitNum(3);
		pp5.setFoul(3);
		pp5.setSteal(2);
		pp5.setReboundOverall(6);
		pp5.setScore(19);
		GameDate gameDate5=new GameDate(2014, 3, 1);
		pp5.setGameDate(gameDate5);
		pp5.setGameLabel("13-14_2014-03-01_CHA-LAC");
		teamRecentGames.AddNewGame(pp1);
		teamRecentGames.AddNewGame(pp2);
		teamRecentGames.AddNewGame(pp3);
		teamRecentGames.AddNewGame(pp4);
		teamRecentGames.AddNewGame(pp5);
		return teamRecentGames;
	}

	@Override
	public ArrayList<TeamPerformanceInSingleGame> getTeamPerformance(String abbr) {
		// TODO Auto-generated method stub
		ArrayList<TeamPerformanceInSingleGame> tps=new ArrayList<TeamPerformanceInSingleGame>();
		TeamPerformanceInSingleGame pp1 = new TeamPerformanceInSingleGame(
				"Mike Miller");
		pp1.setHitNum(9);
		pp1.setThreePointHitNum(3);
		pp1.setFoul(3);
		pp1.setSteal(2);
		pp1.setReboundOverall(6);
		pp1.setScore(19);
		GameDate gameDate1=new GameDate(2014, 1, 1);
		pp1.setGameDate(gameDate1);
		pp1.setGameLabel("13-14_2014-01-01_CHA-LAC");
		TeamPerformanceInSingleGame pp2 = new TeamPerformanceInSingleGame(
				"Anderson Varejao");
		pp2.setHitNum(0);
		pp2.setThreePointHitNum(0);
		pp2.setFoul(0);
		pp2.setSteal(0);
		pp2.setReboundOverall(0);
		pp2.setScore(0);
		GameDate gameDate2=new GameDate(2013, 1, 1);
		pp2.setGameDate(gameDate2);
		pp2.setGameLabel("13-14_2013-01-01_CHA-LAC");
		TeamPerformanceInSingleGame pp3 = new TeamPerformanceInSingleGame(
				"Anthony Bennett");
		pp3.setHitNum(9);
		pp3.setThreePointHitNum(3);
		pp3.setFoul(3);
		pp3.setSteal(2);
		pp3.setReboundOverall(6);
		pp3.setScore(19);
		GameDate gameDate3=new GameDate(2013, 11, 1);
		pp3.setGameDate(gameDate3);
		pp3.setGameLabel("13-14_2013-11-01_CHA-LAC");
		TeamPerformanceInSingleGame pp4 = new TeamPerformanceInSingleGame(
				"Andre Roberson");
		pp4.setHitNum(0);
		pp4.setThreePointHitNum(0);
		pp4.setFoul(0);
		pp4.setSteal(0);
		pp4.setReboundOverall(0);
		pp4.setScore(0);
		GameDate gameDate4=new GameDate(2013, 12, 23);
		pp4.setGameDate(gameDate4);
		pp4.setGameLabel("13-14_2013-12-23_CHA-LAC");
		TeamPerformanceInSingleGame pp5 = new TeamPerformanceInSingleGame(
				"Evan Turner");
		pp5.setHitNum(9);
		pp5.setThreePointHitNum(3);
		pp5.setFoul(3);
		pp5.setSteal(2);
		pp5.setReboundOverall(6);
		pp5.setScore(19);
		GameDate gameDate5=new GameDate(2014, 3, 1);
		pp5.setGameDate(gameDate5);
		pp5.setGameLabel("13-14_2014-03-01_CHA-LAC");
		tps.add(pp1);
		tps.add(pp2);
		tps.add(pp3);
		tps.add(pp4);
		tps.add(pp5);
		return tps;
	}

}
