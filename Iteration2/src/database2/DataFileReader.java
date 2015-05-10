/**
 * puppy
 * 2015年3月8日 上午10:53:10
 * TODO
 */
package database2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import dataService2.GameDao;
import dataService2.GameDaoImpl;
import dataService2.PlayerDao;
import dataService2.PlayerDaoImpl;
import dataService2.TeamDao;
import dataService2.TeamDaoImpl;
import enums.Conference;
import enums.Division;
import po.GameDate;
import po.GamePO;
import po.PlayerPO;
import po.Scoreboard;
import po.TeamPO;
import po.TeamPerformance;

public class DataFileReader {

	private static Scanner scanner;

	public static void importPlayersAndTeams() {

		DataFileReader.importPlayersFrom("CSEdata/players/info");
		DataFileReader.importTeamsFrom("CSEdata/teams/12-13teams");
		System.out.println("------------------------------");

	}

	public static void importGamesFrom(ArrayList<String> gameFileNameList) {

		String gameFileName;
		String originalString;
		ArrayList<String> gameDataList;
		GamePO game;
		GameDao gameController = new GameDaoImpl();

//		ArrayList<String> gameFileNameList = DataFileReader
//				.getFileNameList(path);
		for (int i = 0; i < gameFileNameList.size(); i ++) {
			gameFileName = gameFileNameList.get(i);
			originalString = DataFileReader.getOriginalFileString(gameFileName);
			gameDataList = DataFileReader.gameDataSplitor(originalString);
			game = DataFileReader.makeGame(gameDataList);
			gameController.add(game);
		}
		System.out.println("Games data imported!");

	}

	public static void importPlayersFrom(String path) {

		ArrayList<String> playerInfoFileNameList = DataFileReader
				.getFileNameList(path);
		for (int i = 0; i < playerInfoFileNameList.size(); i++) {

			String playerInfoFileName = playerInfoFileNameList.get(i);
			String originalString = DataFileReader
					.getOriginalFileString(playerInfoFileName);
			String splitedContent = DataFileReader.splitKeyword(originalString);
			ArrayList<String> playerDataList = DataFileReader
					.playerDataSplitor(splitedContent);
			PlayerDao playerController = new PlayerDaoImpl();
			playerController.add(DataFileReader.makePlayer(playerDataList));

		}
		System.out.println("Players data imported!");

	}

	public static void importTeamsFrom(String path) {

		ArrayList<TeamPO> teamList = DataFileReader.makeTeamList(DataFileReader
				.teamDataSplitor(DataFileReader.splitKeyword(DataFileReader
						.getOriginalFileString(path))));
		TeamDao teamController = new TeamDaoImpl();
		for (int k = 0; k < teamList.size(); k++) {
			teamController.add(teamList.get(k));
		}
		System.out.println("Teams data imported!");

	}

	public static String getOriginalFileString(String path) {

		StringBuffer fileContent = new StringBuffer();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(
					path), "UTF-8"));
			String line = null;
			if ((line = br.readLine()) != null) {
				fileContent.append(line.trim());
			}
			while ((line = br.readLine()) != null) {
				fileContent.append("\n");
				fileContent.append(line.trim());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		return fileContent.toString();

	}

	public static String splitKeyword(String originalString) {

		originalString = originalString.replace("╔", "");// teams
		originalString = originalString.replace("╤", "");
		originalString = originalString.replace("═", "");
		originalString = originalString.replace("╗", "");
		originalString = originalString.replace("║", "");
		originalString = originalString.replace("╚", "");
		originalString = originalString.replace("│", "\n");
		originalString = originalString.replace("╝", "");
		originalString = originalString.replace("╧", "");

		originalString = originalString.replace("─", "");// players
		originalString = originalString.replace("┼", "");
		originalString = originalString.replace("╢", "");
		originalString = originalString.replace("╟", "");

		String result = new String();

		scanner = new Scanner(originalString);
		String line = new String();
		if (scanner.hasNextLine()) {
			line = scanner.nextLine();
			result += line.trim();
		}
		while (scanner.hasNextLine()) {
			line = scanner.nextLine();
			if (!line.equals("")) {
				if (result.equals("")) {
					result += line.trim();
				} else {
					result += ("\n" + line.trim());
				}
			}
		}
		return result;

	}

	public static ArrayList<ArrayList<String>> teamDataSplitor(String context) {

		ArrayList<ArrayList<String>> splitedFullData = new ArrayList<ArrayList<String>>();
		ArrayList<String> splitedSingleData = new ArrayList<String>();
		Scanner scannerFull = new Scanner(context);
		String keyword = new String();
		while (scannerFull.hasNextLine()) {
			keyword = scannerFull.nextLine();
			splitedSingleData.add(keyword);
			if (splitedSingleData.size() == 7) {
				splitedFullData.add(new ArrayList<String>(splitedSingleData));// reference
																				// attentiion!
				splitedSingleData.clear();
			}
		}
		scannerFull.close();
		return splitedFullData;

	}

	public static ArrayList<String> playerDataSplitor(String context) {

		ArrayList<String> splitedSingleData = new ArrayList<String>();
		Scanner scannerFull = new Scanner(context);
		String keyword = new String();
		while (scannerFull.hasNextLine()) {
			scannerFull.nextLine();
			if (scannerFull.hasNextLine()) {
				keyword = scannerFull.nextLine();
			} else {
				keyword = null;
			}
			splitedSingleData.add(keyword);

			if (splitedSingleData.size() == 9) {
				break;
			}
		}
		scannerFull.close();
		return splitedSingleData;

	}

	public static ArrayList<String> gameDataSplitor(String context) {

		String guesttp = "";
		String hometp = "";
		String seasonid = "12-13";//season can only be got from data file name

		ArrayList<String> splitedSingleData = new ArrayList<String>();
		Scanner scannerFull = new Scanner(context);
		String line = new String();

		line = scannerFull.nextLine();
		String[] splited0 = line.split(";");
		//String gamedate = splited0[0];
		String gamedate = GameDate.appendYear(seasonid, splited0[0]);
		String versus = splited0[1];
		String scoreoverall = splited0[2];
		String[] splited00 = versus.split("-");
		String guestteam = splited00[0];
		String hometeam = splited00[1];

		line = scannerFull.nextLine();
		String[] splited1 = line.split(";");
		String score1st = splited1[0];
		String score2nd = splited1[1];
		String score3rd = splited1[2];
		String score4th = splited1[3];
		String extraTime = "";
		if (splited1.length > 4) {
			for (int k = 4; k < splited1.length; k++) {
				extraTime += (splited1[k] + ";");
			}
		}

		if ((line = scannerFull.nextLine()).equals(guestteam)) {
			while (!(line = scannerFull.nextLine()).equals(hometeam)) {
				guesttp += (line + "\n");
			}
		}
		if (line.equals(hometeam)) {
			while (scannerFull.hasNext()) {
				line = scannerFull.nextLine();
				hometp += (line + "\n");
			}
		}
		scannerFull.close();

		String gameLabel = seasonid + "_" + gamedate + "_" + versus + "";

		splitedSingleData.add(gameLabel);
		splitedSingleData.add(seasonid);
		splitedSingleData.add(gamedate);
		splitedSingleData.add(versus);
		splitedSingleData.add(guestteam);
		splitedSingleData.add(hometeam);
		splitedSingleData.add(scoreoverall);
		splitedSingleData.add(score1st);
		splitedSingleData.add(score2nd);
		splitedSingleData.add(score3rd);
		splitedSingleData.add(score4th);
		splitedSingleData.add(extraTime);
		splitedSingleData.add(guesttp);
		splitedSingleData.add(hometp);
		return splitedSingleData;

	}

	public static ArrayList<TeamPO> makeTeamList(
			ArrayList<ArrayList<String>> attriList) {

		ArrayList<TeamPO> teamList = new ArrayList<TeamPO>();
		TeamPO team;
		for (int i = 0; i < attriList.size(); i++) {
			team = new TeamPO();
			team.setTeamName(attriList.get(i).get(0));
			team.setAbbreviation(attriList.get(i).get(1));
			team.setCity(attriList.get(i).get(2));
			Conference conf = Conference.valueOf(attriList.get(i).get(3)
					.toUpperCase(Locale.ENGLISH));
			team.setConference(conf);
			Division div = Division.valueOf(attriList.get(i).get(4)
					.toUpperCase(Locale.ENGLISH));
			team.setDivision(div);
			team.setHomeField(attriList.get(i).get(5));
			team.setBirthYear(attriList.get(i).get(6));
//			team.setImgPath("CSEdata/teams/" + attriList.get(i).get(1) + ".svg");
			teamList.add(team);// reference attention!
		}
		return teamList;

	}

	public static PlayerPO makePlayer(ArrayList<String> attriList) {

		PlayerPO player;
		String exp;
		player = new PlayerPO();
		player.setName(attriList.get(0));
		player.setNumber(attriList.get(1));
		player.setPosition(attriList.get(2));
		player.setHeight(attriList.get(3));
		player.setWeight(attriList.get(4));
		player.setBirth(attriList.get(5));
		player.setAge(Integer.parseInt(attriList.get(6)));
		exp = attriList.get(7);
		if (DataFileReader.isNum(exp)) {// attention! Ognjen
			player.setExp(Integer.parseInt(exp));
		} else {
			player.setExp(0);// to indicate dirty data
		}
		player.setSchool(attriList.get(8));
//		player.setActionImgPath("CSEdata/players/action/" + attriList.get(0)
//				+ ".png");
//		player.setPortraitImgPath("CSEdata/players/portrait/"
//				+ attriList.get(0) + ".png");
		return player;

	}

	public static GamePO makeGame(ArrayList<String> attriList) {

		GamePO game = new GamePO();
		game.setGameLabel(attriList.get(0));
		game.setSeasonId(attriList.get(1));
		game.setGameDate(attriList.get(2));
		game.setVersus(attriList.get(3));
		game.setGuestTeam(attriList.get(4));
		game.setHomeTeam(attriList.get(5));
		game.setScoreOverall(Scoreboard.makeSB(attriList.get(6)));
		game.setScore1st(Scoreboard.makeSB(attriList.get(7)));
		game.setScore2nd(Scoreboard.makeSB(attriList.get(8)));
		game.setScore3rd(Scoreboard.makeSB(attriList.get(9)));
		game.setScore4th(Scoreboard.makeSB(attriList.get(10)));
		ArrayList<Scoreboard> extraList = new ArrayList<Scoreboard>();
		String extraText = attriList.get(11);
		if (extraText.contains(";")) {
			String[] splitedExtra = extraText.split(";");
			for (int j = 0; j < splitedExtra.length; j++) {
				extraList.add(Scoreboard.makeSB(splitedExtra[j]));
			}
		}
		game.setExtratime(extraList);
		game.setGuestTP(TeamPerformance.makeTP(attriList.get(4),attriList.get(0),
				attriList.get(12)));
		game.setHomeTP(TeamPerformance.makeTP(attriList.get(5),attriList.get(0),
				attriList.get(13)));
		return game;

	}

	public static ArrayList<String> getFileNameList(String path) {

		File file = new File(path);
		File[] fileList = file.listFiles();
		int len = fileList.length;
		ArrayList<String> fileNameList = new ArrayList<String>(len);
		for (int i = 0; i < len; i++) {
			if (fileList[i].isFile()) {
				if(!fileList[i].toString().contains("DS_Store")) {//ignore system default file .DS_Store
					fileNameList.add(fileList[i].toString());
				}
			}
		}
		return fileNameList;

	}

	public static boolean isNum(String str) {

		return str.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");

	}

}
