/**
 * puppy
 * 2015年3月23日 下午5:42:52
 * TODO
 */
package database2;

import java.util.ArrayList;

import dataService2.DaoFactory;
import po.GameDate;

public class PrepareDB {

	public static void main(String[] args) throws InterruptedException {
		
		ArrayList<String> fileNameList = DataFileReader.getFileNameList("CSEdata/new");
		while(true) {//check if any data exists, continue when there is at least 1 entry
			fileNameList = DataFileReader.getFileNameList("CSEdata/new");
			System.out.println("当前数据目录加下数据文件数量为" + fileNameList.size());
			if(fileNameList.size() != 0) {
				break;
			}
		}
		
		SystemDao sd = new SystemDaoImpl();
		SeasonTracker st = new SeasonTracker();
		st.setCurrentDate(filterCurrentDate(fileNameList));
		st.setFileNameList(fileNameList);
		st.setGameNumSofar(fileNameList.size());
		st.setSeasonId("12-13");
		
		
//		st.setSeasonRecord(seasonRecord);
//		st.setUpdatePlayerList(updatePlayerList);
//		st.setUpdateTeamList(updateTeamList);
		
//		InitDB.init();
		sd.add(st);
		DataFileReader.importGamesFrom(fileNameList);
		DataFileReader.importPlayersAndTeams();
//		DataFurtherDistributor.updateTeamAndPlayer(DaoFactory.getGameDaoInstence().getAllGames());;	
		System.out.println("initial data import finished!");
		
		while(true){
			if(checkNew(st.getGameNumSofar())) {
				System.out.println("new files found!!!!!!!!!!!!");//
				ArrayList<String> nowFileNameList = DataFileReader.getFileNameList("CSEdata/new");
				ArrayList<String> newFileNameList = getNewFileName(st.getFileNameList(), nowFileNameList);
				System.out.println(newFileNameList.toString());//sudo
				DataFileReader.importGamesFrom(newFileNameList);
				
				System.out.println(getGameLabelsFromPaths(newFileNameList));//sudo
				st.setUpdateGameList(getGameLabelsFromPaths(newFileNameList));//new GamePOs' gamelabel
				
				DaoFactory.getSystemDaoInstance().setUpdateGameList(getGameLabelsFromPaths(newFileNameList));
				st.setFileNameList(nowFileNameList);
				st.setGameNumSofar(DataFileReader.getFileNameList("CSEdata/new").size());
				st.setCurrentDate(filterCurrentDate(newFileNameList));
//				DataFurtherDistributor.updateTeamAndPlayer(DaoFactory.getGameDaoInstence().getGameByLabel(st.getUpdateGameList()));
				sd.update(st);
			}
			System.out.println(st.getCurrentDate().toString());
			Thread.sleep(3000);
		}
		
//		System.out.println("**************************************");
//		System.out.println("Database fully prepared now! :p");
//		System.out.println("**************************************");

	}
	
	public static boolean checkNew(int stGameNum) {
		int numberNow = DataFileReader.getFileNameList("CSEdata/new").size();
		return stGameNum <  numberNow;
	}
	
	public static ArrayList<String> getNewFileName(ArrayList<String> dbFileNameList, ArrayList<String> nowFileNameList) {
		ArrayList<String> result = new ArrayList<String>(nowFileNameList);
		for(String test: nowFileNameList) {
			if(dbFileNameList.contains(test)) {
				result.remove(test);
			}
		}
		return result;
	}
	
	
	public static GameDate filterCurrentDate(ArrayList<String> fileNameList) {
		
		GameDate result = new GameDate();
		for(String filePath: fileNameList) {
			GameDate test = getGamedateFromPath(filePath);
			if(result.compareTo(test) == -1) {
				result = test;
			}
		}
		return result;
		
	}
	
	public static GameDate getGamedateFromPath(String path) {
//		path = "CSEdata/new/12-13_10-30_BOS-MIA";  --  MAC OS X
//		path = "CSEdata\new\12-13_10-30_BOS-MIA";  --  WINDOWS
		String time = path.split("\\\\|\\/")[2];
		return new GameDate(GameDate.appendYear(time.split("_")[0], time.split("_")[1]));
	}
	
	
	public static String getGameLabelFromPath(String path) {
//		path = "CSEdata/new/12-13_10-30_BOS-MIA";  --  MAC OS X
//		path = "CSEdata\new\12-13_10-30_BOS-MIA";  --  WINDOWS
		String time = path.split("\\\\|\\/")[2];
		String seasonid = time.split("_")[0];
		String versus = time.split("_")[2];
		String gameDate = new GameDate(GameDate.appendYear(time.split("_")[0], time.split("_")[1])).toString();
		return seasonid + "_" + gameDate +"_"+ versus;
	}
	
	public static ArrayList<String> getGameLabelsFromPaths(ArrayList<String> paths) {
		ArrayList<String> result = new ArrayList<String>();
		for(String path: paths) {
			result.add(getGameLabelFromPath(path));
		}
		return result;
	}
	
	

}
