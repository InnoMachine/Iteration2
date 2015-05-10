package functionTest;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

import database2.DataFileReader;
import businessLogic.Player_Handler;
import businessLogic.Team_Handler;
import test.data.PlayerHighInfo;
import test.data.PlayerHotInfo;
import test.data.PlayerKingInfo;
import test.data.PlayerNormalInfo;
import test.data.TeamHighInfo;
import test.data.TeamHotInfo;
import test.data.TeamNormalInfo;
import vo.PlayerPerformanceInSingleGame;
import vo.PlayerVo;
import vo.TeamCardVo;
import vo.TeamVo;

public class Console {

	BigDecimal b;
	PrintStream out ;
	Player_Handler player_handler;
	Team_Handler team_handler;
	public void execute(PrintStream out,String[] args){
		this.out = out;
		System.setOut(out);
		String order = args[0];
		if(args[0].contains("datasource")){
			int i=order.indexOf("datasource");
			i=i+10;
			while(order.substring(i, i+1).equals(" ")){
				i++;
			}
			String source = order.substring(i);
			System.out.print(source);
			DataFileReader.importAll(source+"\\players\\info", source+"\\teams\\teams", source+"\\matches");
			player_handler = new Player_Handler();
			team_handler = new Team_Handler();
			return;
		}
		
		if(order.contains("player")){
			int n =50;
			if(order.contains("-n")){
				int k = order.indexOf("-n");
				String s1 = order.substring(k+3);
				if(s1.contains("-")){
					int p =s1.indexOf("-");
					s1 = s1.substring(0, p-1);
				}
				n=Integer.parseInt(s1);
			}
			if(order.contains("-king")){
				int k =order.indexOf("-king");
				String s = order.substring(k+6);
				String field = s.substring(0, s.indexOf("-")-1);
				if(s.contains("-season")){
					ArrayList<PlayerKingInfo> ob= SetKingInfo(field,true);
					for(int p =0;p<ob.size();p++){
						out.println(p+1);
						out.println(ob.get(p).toString());
					}
				}else{
					ArrayList<PlayerKingInfo> ob= SetKingInfo(field,false);
					for(int p =0;p<ob.size();p++){
						out.println(p+1);
						out.println(ob.get(p).toString());
					}
				}
			}
			else if(order.contains("-hot")){
				int k =order.indexOf("-hot");
				String s = order.substring(k+5);
				String field;
				if(s.contains("-")){
					field = s.substring(0, s.indexOf("-")-1);
				}else{
					field = s.substring(0);
				}
				ArrayList<PlayerHotInfo> ob= SetHotInfo(field,n);
				for(int p =0;p<ob.size();p++){
					out.println(p+1);
					out.println(ob.get(p).toString());
				}
			}
			else if(order.contains("-sort")){
				ArrayList<PlayerVo> listvo = null ;
				ArrayList<PlayerVo> list = null ;
				int k=order.indexOf("-sort");
				String s = order.substring(k+6);
				if(s.contains("-")){
					s = s.substring(0,s.indexOf("-")-1);
				}
				String field = s.substring(0,s.indexOf("."));
				String sortorder = s.substring(s.indexOf("."));
				if(!s.contains(",")){
					playerSortFieldTrans(field);
					listvo = player_handler.sortPlayerBy(field);
				}
				else{
					k=s.indexOf(",");
					String s2 = s.substring(k+1);
					String field2 = s2.substring(0,s2.indexOf("."));
					String sortorder2 = s2.substring(s2.indexOf("."));
					playerSortFieldTrans(field);
					playerSortFieldTrans(field2);
					boolean issame = true;
					if(!sortorder.equals(sortorder2))
						issame =false;
					listvo = player_handler.sortPlayerBy(field, field2, issame);
				}
				if(!sortorder.equals("desc"))
				{
					Collections.reverse(listvo);
				}
				
				if(!order.contains("-high")){
					if(order.contains("-filter")){
						k=order.indexOf("-filter");
						String position ="All";
						String league = "All";
						String age = "All";
						s = order.substring(k+8);
						if(s.contains("-")){
							s = s.substring(0,s.indexOf("-")-1);
						}
						if(s.contains("position")){
							field = s.substring(0,s.indexOf("."));
							String value = s.substring(s.indexOf("."));
							if(!s.contains(",")){
								position = value;
							}
							else{
								value.substring(0, value.indexOf(",")-1);
								position = value;
							}
						}
						if(s.contains("league")){
							field = s.substring(0,s.indexOf("."));
							String value = s.substring(s.indexOf("."));
							if(!s.contains(",")){
								league = value;
							}
							else{
								value.substring(0, value.indexOf(",")-1);
								league = value;
							}
						}
						if(s.contains("age")){
							field = s.substring(0,s.indexOf("."));
							String value = s.substring(s.indexOf("."));
							if(!s.contains(",")){
								age = value;
							}
							else{
								value.substring(0, value.indexOf(",")-1);
								age = value;
							}
						}
						list = filterList(listvo,position,league,age);
					}
					if(order.contains("-total")){
						ArrayList<PlayerNormalInfo> ob= CreateTotalPlayerNormalInfo(list,n);
						for(int p =0;p<ob.size();p++){
							out.println(p+1);
							out.println(ob.get(p).toString());
						}	
					}
					else{
						ArrayList<PlayerNormalInfo> ob= CreateAvgPlayerNormalInfo(list,n);
						for(int p =0;p<ob.size();p++){
							out.println(p+1);
							out.println(ob.get(p).toString());
						}
					}
					
					
				}
				else{
					if(order.contains("-total")){
						ArrayList<PlayerHighInfo> ob= CreateTotalPlayerHighInfo(listvo,n);
						for(int p =0;p<ob.size();p++){
							out.println(p+1);
							out.println(ob.get(p).toString());
						}
					}
					else{
						ArrayList<PlayerHighInfo> ob= CreateAvgPlayerHighInfo(listvo,n);
						for(int p =0;p<ob.size();p++){
							out.println(p+1);
							out.println(ob.get(p).toString());
						}
					}
				}
			}
			
			
		}
		else if(order.contains("team")){
			int n =30;
			String field ="";
			String sortorder="";
			ArrayList<TeamVo> listvo = null ;
			ArrayList<TeamVo> list = null ;
			if(order.contains("-hot")){
				int k =order.indexOf("-hot");
				String s = order.substring(k+5);
				if(s.contains("-")){
					field = s.substring(0, s.indexOf("-")-1);
				}else{
					field = s.substring(0);
				}
				ArrayList<TeamHotInfo> ob= SetTeamHotInfo(field,n);
				for(int p =0;p<ob.size();p++){
					out.println(p+1);
					out.println(ob.get(p).toString());
				}
			}
			else if(!order.contains("-high")){
				
				if(order.contains("-sort")){
					int k=order.indexOf("-sort");
					String s = order.substring(k+6);
					if(s.contains("-")){
						s = s.substring(0,s.indexOf("-")-1);
					}
					field = s.substring(0,s.indexOf("."));
					sortorder = s.substring(s.indexOf("."));
				}
				else{
					field = "score";
					sortorder ="desc";
				}
				TeamSortFieldTrans(field);
				list = team_handler.sortTeamBy(field);
				if(!sortorder.equals("desc"))
				{
					Collections.reverse(listvo);
				}
				if(order.contains("-total")){
					ArrayList<TeamHighInfo> ob= CreateTotalTeamHighInfo(list,n);
					for(int p =0;p<ob.size();p++){
						out.println(p+1);
						out.println(ob.get(p).toString());
					}
				}
				else{
					ArrayList<TeamHighInfo> ob= CreateAvgTeamHighInfo(list,n);
					for(int p =0;p<ob.size();p++){
						out.println(p+1);
						out.println(ob.get(p).toString());
					}
					}
				}
			else{
				if(order.contains("-sort")){
					int k=order.indexOf("-sort");
					String s = order.substring(k+6);
					if(s.contains("-")){
						s = s.substring(0,s.indexOf("-")-1);
					}
					field = s.substring(0,s.indexOf("."));
					sortorder = s.substring(s.indexOf("."));
				}
				else{
					field = "winRate";
					sortorder ="desc";
				}
				TeamSortFieldTrans(field);
				list = team_handler.sortTeamBy(field);
				if(!sortorder.equals("desc"))
				{
					Collections.reverse(listvo);
				}
				if(order.contains("-total")){
					ArrayList<TeamNormalInfo> ob= CreateTotalTeamNormalInfo(list,n);
					for(int p =0;p<ob.size();p++){
						out.println(p+1);
						out.println(ob.get(p).toString());
					}
				}
				else{
					ArrayList<TeamNormalInfo> ob= CreateAvgTeamNormalInfo(list,n);
					for(int p =0;p<ob.size();p++){
						out.println(p+1);
						out.println(ob.get(p).toString());
					}
				}
				
				
			}
		}
		}
	
	private void TeamSortFieldTrans(String f) {
		if(f.equals("point"))
			f="score";
		else if(f.equals("rebound"))
			f="reboundOverAll";
		else if(f.equals("assist"))
			f="assistance";
		else if(f.equals("blockShot"))
			f="block";
		else if(f.equals("fault"))
			f="turnover";
		else if(f.equals("shot"))
			f="hitRate";
		else if(f.equals("three"))
			f="threePointHitRate";
		else if(f.equals("penalty"))
			f="freeThrowRate";
		else if(f.equals("defendRebound"))
			f="defensiveRebound";
		else if(f.equals("offendRebound"))
			f="offensiveRebound";
		else if(f.equals("winRate"))
			f="winningRate";
		else if(f.equals("offendRound"))
			f="roundAttack";
		else if(f.equals("offendEfficient"))
			f="attackingEfficiency";
		else if(f.equals("defendEfficient"))
			f="defensiveEfficiency";
		else if(f.equals("offendReboundEfficient"))
			f="offensiveReboundEfficiency";
		else if(f.equals("stealEfficient"))
			f="stealEfficiency";
		else if(f.equals("assistEfficient"))
			f="assistanceEfficiency";
	}
	private ArrayList<TeamNormalInfo> CreateAvgTeamNormalInfo(
			ArrayList<TeamVo> list, int n) {
		ArrayList<TeamNormalInfo> info= new ArrayList<TeamNormalInfo>();
		for(int i=0;i<n;i++){
			TeamNormalInfo temp = new TeamNormalInfo();
			temp.setAssist(list.get(i).getAssistanceField());
			temp.setBlockShot(list.get(i).getBlockField());
			temp.setDefendRebound(list.get(i).getDefensiveReboundField());
			temp.setFault(list.get(i).getTurnoverField());
			temp.setFoul(list.get(i).getFoulField());
			temp.setNumOfGame(list.get(i).getGameNum());
			temp.setOffendRebound(list.get(i).getOffensiveReboundField());
			temp.setPenalty(list.get(i).getFreeThrowRate());
			temp.setPoint(list.get(i).getScoreField());
			temp.setSteal(list.get(i).getStealField());
			temp.setThree(list.get(i).getThreePointHitRate());
			temp.setShot(list.get(i).getHitRate());
			info.add(temp);
		}
		return info;
	}
	private ArrayList<TeamNormalInfo> CreateTotalTeamNormalInfo(
			ArrayList<TeamVo> list, int n) {
		ArrayList<TeamNormalInfo> info= new ArrayList<TeamNormalInfo>();
		for(int i=0;i<n;i++){
			TeamNormalInfo temp = new TeamNormalInfo();
			temp.setAssist(list.get(i).getAssistance());
			temp.setBlockShot(list.get(i).getBlock());
			temp.setDefendRebound(list.get(i).getDefensiveRebound());
			temp.setFault(list.get(i).getTurnover());
			temp.setFoul(list.get(i).getFoul());
			temp.setNumOfGame(list.get(i).getGameNum());
			temp.setOffendRebound(list.get(i).getOffensiveRebound());
			temp.setPenalty(list.get(i).getFreeThrowRate());
			temp.setPoint(list.get(i).getScore());
			temp.setSteal(list.get(i).getSteal());
			temp.setThree(list.get(i).getThreePointHitRate());
			temp.setShot(list.get(i).getHitRate());
			temp.setTeamName(list.get(i).getTeamName());
			info.add(temp);
		}
		return info;
	}
	private ArrayList<TeamHighInfo> CreateAvgTeamHighInfo(
			ArrayList<TeamVo> list, int n) {
		ArrayList<TeamHighInfo> info = new ArrayList<TeamHighInfo>();
		for(int i=0;i<n;i++){
			TeamHighInfo temp = new TeamHighInfo();
			temp.setWinRate(list.get(i).getWinningRate());
			temp.setAssistEfficient(list.get(i).getAssistanceEfficiency());
			temp.setDefendEfficient(list.get(i).getDefensiveEfficiency());
			temp.setDefendReboundEfficient(list.get(i).getDefensiveReboundEfficiency());
			temp.setOffendEfficient(list.get(i).getAttackingEfficiency());
			temp.setOffendReboundEfficient(list.get(i).getOffensiveReboundEfficiency());
			temp.setOffendRound(list.get(i).getRoundAttackField());
			temp.setStealEfficient(list.get(i).getStealEfficiency());
			info.add(temp);
		}
		return info;
	}
	private ArrayList<TeamHighInfo> CreateTotalTeamHighInfo(
			ArrayList<TeamVo> list, int n) {
		ArrayList<TeamHighInfo> info = new ArrayList<TeamHighInfo>();
		for(int i=0;i<n;i++){
			TeamHighInfo temp = new TeamHighInfo();
			temp.setWinRate(list.get(i).getWinningRate());
			temp.setAssistEfficient(list.get(i).getAssistanceEfficiency());
			temp.setDefendEfficient(list.get(i).getDefensiveEfficiency());
			temp.setDefendReboundEfficient(list.get(i).getDefensiveReboundEfficiency());
			temp.setOffendEfficient(list.get(i).getAttackingEfficiency());
			temp.setOffendReboundEfficient(list.get(i).getOffensiveReboundEfficiency());
			temp.setOffendRound(list.get(i).getRoundAttack());
			temp.setStealEfficient(list.get(i).getStealEfficiency());
			info.add(temp);
		}
		return info;
	}
	private ArrayList<TeamHotInfo> SetTeamHotInfo(String field, int n) {
		String f = TeamHotFieldTrans(field);
		ArrayList<TeamCardVo> list = team_handler.hotTeamSeason(f);
		ArrayList<TeamHotInfo> hi = new ArrayList<TeamHotInfo>();
		for(int i=0;i<n;i++){
			hi.add(CreateTeamHotInfo(list.get(i),field));
		}
		return hi;
	}
	private TeamHotInfo CreateTeamHotInfo(TeamCardVo vo, String field) {
		TeamHotInfo info = new TeamHotInfo();
		info.setTeamName(vo.getTeamName());
		String lea = vo.getConference()+"";
		if(lea.equals("E"))
			info.setLeague("East");
		else if(lea.equals("W"))
			info.setLeague("West");
		info.setField(field);
		info.setValue(vo.getSortValue());
		return info;
	}
	private String TeamHotFieldTrans(String field) {
		String f="";
		if(field.equals("point"))
			f="scoreField";
		else if(field.equals("rebound"))
			f="reboundOverAllField";
		else if(field.equals("assist"))
			f="assistanceField";
		else if(field.equals("blockShot"))
			f="blockField";
		else if(field.equals("fault"))
			f="turnoverField";
		else if(field.equals("shot"))
			f="hitRate";
		else if(field.equals("three"))
			f="threePointHitRate";
		else if(field.equals("penalty"))
			f="freeThrowRate";
		else if(field.equals("defendRebound"))
			f="defensiveReboundField";
		else if(field.equals("offendRebound"))
			f="offensiveReboundField";
		return f;
	}
	private ArrayList<PlayerHighInfo> CreateAvgPlayerHighInfo(
			ArrayList<PlayerVo> list, int n) {
		ArrayList<PlayerHighInfo> info= new ArrayList<PlayerHighInfo>();
		for(int i=0;i<n;i++){
			PlayerHighInfo temp = new PlayerHighInfo();
			temp.setAssistEfficient(list.get(i).getAssistanceRate());
			temp.setBlockShotEfficient(list.get(i).getBlockRate());
			temp.setDefendReboundEfficient(list.get(i).getDefensiveReboundRate());
			temp.setFaultEfficient(list.get(i).getTurnOverRate());
			temp.setFrequency(list.get(i).getUseRate());
			temp.setGmSc(list.get(i).getGmScField());
			String div = list.get(i).getDivision()+"";
			if(div.equals("SOUTHWEST")||div.equals("NORTHWEST")||div.equals("PACIFIC")){
				temp.setLeague("West");
			}else
				temp.setLeague("East");
			temp.setName(list.get(i).getName());
			temp.setOffendReboundEfficient(list.get(i).getOffensiveReboundRate());
			temp.setPosition(list.get(i).getPosition());
			temp.setRealShot(list.get(i).getTrueHitRate());
			temp.setReboundEfficient(list.get(i).getReboundOverallRate());
			temp.setShotEfficient(list.get(i).getHitEfficiency());
			temp.setStealEfficient(list.get(i).getStealRate());
			temp.setTeamName(list.get(i).getTeam());
			info.add(temp);
		}
		return info;
	}
	private ArrayList<PlayerHighInfo> CreateTotalPlayerHighInfo(
			ArrayList<PlayerVo> list, int n) {
		ArrayList<PlayerHighInfo> info= new ArrayList<PlayerHighInfo>();
		for(int i=0;i<n;i++){
			PlayerHighInfo temp = new PlayerHighInfo();
			temp.setAssistEfficient(list.get(i).getAssistanceRate());
			temp.setBlockShotEfficient(list.get(i).getBlockRate());
			temp.setDefendReboundEfficient(list.get(i).getDefensiveReboundRate());
			temp.setFaultEfficient(list.get(i).getTurnOverRate());
			temp.setFrequency(list.get(i).getUseRate());
			temp.setGmSc(list.get(i).getGmSc());
			String div = list.get(i).getDivision()+"";
			if(div.equals("SOUTHWEST")||div.equals("NORTHWEST")||div.equals("PACIFIC")){
				temp.setLeague("West");
			}else
				temp.setLeague("East");
			temp.setName(list.get(i).getName());
			temp.setOffendReboundEfficient(list.get(i).getOffensiveReboundRate());
			temp.setPosition(list.get(i).getPosition());
			temp.setRealShot(list.get(i).getTrueHitRate());
			temp.setReboundEfficient(list.get(i).getReboundOverallRate());
			temp.setShotEfficient(list.get(i).getHitEfficiency());
			temp.setStealEfficient(list.get(i).getStealRate());
			temp.setTeamName(list.get(i).getTeam());
			info.add(temp);
		}
		return info;
	}
	private ArrayList<PlayerNormalInfo> CreateAvgPlayerNormalInfo(
			ArrayList<PlayerVo> list, int n) {
		ArrayList<PlayerNormalInfo> info= new ArrayList<PlayerNormalInfo>();
		for(int i=0;i<n;i++){
			PlayerNormalInfo temp = new PlayerNormalInfo();
			temp.setAge(list.get(i).getAge());
			temp.setAssist(list.get(i).getAssistanceField());
			temp.setBlockShot(list.get(i).getBlockField());
			temp.setDefend(list.get(i).getDefensiveNumField());
			temp.setEfficiency(list.get(i).getEfficiencyField());
			temp.setFault(list.get(i).getTurnoverField());
			temp.setFoul(list.get(i).getFoulField());
			b = new BigDecimal((double)list.get(i).getTimeField()/60);
			temp.setMinute(b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
			temp.setName(list.get(i).getName());
			temp.setNumOfGame(list.get(i).getGameNum());
			temp.setOffend(list.get(i).getAttackingNumField());
			temp.setPenalty(list.get(i).getFreeThrowRate());
			temp.setPoint(list.get(i).getScoreField());
			temp.setStart(list.get(i).getFirstOnNum());
			temp.setSteal(list.get(i).getStealField());
			temp.setTeamName(list.get(i).getTeam());
			temp.setThree(list.get(i).getThreePointHitRate());
			temp.setShot(list.get(i).getHitRate());
			info.add(temp);
		}
		return info;
	}
	private ArrayList<PlayerNormalInfo> CreateTotalPlayerNormalInfo(
			ArrayList<PlayerVo> list, int n) {
		ArrayList<PlayerNormalInfo> info= new ArrayList<PlayerNormalInfo>();
		for(int i=0;i<n;i++){
			PlayerNormalInfo temp = new PlayerNormalInfo();
			temp.setAge(list.get(i).getAge());
			temp.setAssist(list.get(i).getAssistance());
			temp.setBlockShot(list.get(i).getBlock());
			temp.setDefend(list.get(i).getDefensiveNum());
			temp.setEfficiency(list.get(i).getEfficiency());
			temp.setFault(list.get(i).getTurnover());
			temp.setFoul(list.get(i).getFoul());
			b = new BigDecimal((double)list.get(i).getTime()/60);
			temp.setMinute(b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
			temp.setName(list.get(i).getName());
			temp.setNumOfGame(list.get(i).getGameNum());
			temp.setOffend(list.get(i).getAttackingNum());
			temp.setPenalty(list.get(i).getFreeThrowRate());
			temp.setPoint(list.get(i).getScore());
			temp.setStart(list.get(i).getFirstOnNum());
			temp.setSteal(list.get(i).getSteal());
			temp.setTeamName(list.get(i).getTeam());
			temp.setThree(list.get(i).getThreePointHitRate());
			temp.setShot(list.get(i).getHitRate());
			info.add(temp);
		}

		return info;
	}
	private ArrayList<PlayerVo> filterList(ArrayList<PlayerVo> listvo, String position, String league, String age) {
		ArrayList<PlayerVo> list1 = new ArrayList<PlayerVo>();
		ArrayList<PlayerVo> list2 = new ArrayList<PlayerVo>();
		ArrayList<PlayerVo> list3 = new ArrayList<PlayerVo>();
		if(position.equals("All")){
			for(PlayerVo temp:listvo){
				list1.add(temp);
			}
		}else{
			for(PlayerVo temp:listvo){
				if(position.equals(temp.getPosition()))
				list1.add(temp);
			}
		}
		if(league.equals("All")){
			for(PlayerVo temp:list1){
				list2.add(temp);
			}
		}else{
			if(league.equals("West")){
				for(PlayerVo temp:list1){
					String div = temp.getDivision()+"";
					if(div.equals("SOUTHWEST")||div.equals("NORTHWEST")||div.equals("PACIFIC")){
						list2.add(temp);
					}
				}
			}
			else if(league.equals("East")){
				for(PlayerVo temp:list1){
					String div = temp.getDivision()+"";
					if(div.equals("ATLANTIC")||div.equals("CENTRAL")||div.equals("SOUTHEAST")){
						list2.add(temp);
					}
				}
			}
				
		}
		if(age.equals("All")){
			for(PlayerVo temp:list2){
				list3.add(temp);
			}
		}
		else if(age.equals("<=22")){
			for(PlayerVo temp:list2){
				if(temp.getAge()<=22)
				list3.add(temp);
			}
		}else if(age.equals("22<X<=25")){
			for(PlayerVo temp:list2){
				if(temp.getAge()>22&&temp.getAge()<=25)
				list3.add(temp);
			}
		}else if(age.equals("25<X<=30")){
			for(PlayerVo temp:list2){
				if(temp.getAge()>25&&temp.getAge()<=30)
				list3.add(temp);
			}
		}else if(age.equals(">30")){
			for(PlayerVo temp:list2){
				if(temp.getAge()>30)
				list3.add(temp);
			}
		}
		
		return list3;
		
	}
	private void playerSortFieldTrans(String f) {
		if(f.equals("point"))
			f="score";
		else if(f.equals("rebound"))
			f="reboundOverAll";
		else if(f.equals("assist"))
			f="assistance";
		else if(f.equals("blockShot"))
			f="block";
		else if(f.equals("fault"))
			f="turnover";
		else if(f.equals("minute"))
			f="time";
		else if(f.equals("shot"))
			f="hitRate";
		else if(f.equals("three"))
			f="threePointHitRate";
		else if(f.equals("penalty"))
			f="freeThrowRate";
		else if(f.equals("doubleTwo"))
			f="twoTenNum";
		else if(f.equals("realShot"))
			f="trueHitRate";
		else if(f.equals("shotEfficient"))
			f="hitEfficiency";
		else if(f.equals("reboundEfficient"))
			f="reboundOverallRate";
		else if(f.equals("offendReboundEfficient"))
			f="offensiveReboundRate";
		else if(f.equals("defendReboundEfficient"))
			f="defensiveReboundRate";
		else if(f.equals("assistEfficient"))
			f="assistanceRate";
		else if(f.equals("stealEfficient"))
			f="stealRate";
		else if(f.equals("blockShotEfficient"))
			f="blockRate";
		else if(f.equals("faultEfficient"))
			f="turnOverRate";
		else if(f.equals("frequency"))
			f="useRate";
	}
	private ArrayList<PlayerHotInfo> SetHotInfo(String field, int n) {
		ArrayList<PlayerVo> list = player_handler.progressFastPlayerForTest(field);
		ArrayList<PlayerHotInfo> hi = new ArrayList<PlayerHotInfo>();
		for(int i=0;i<n;i++){
			hi.add(CreateHotInfoSeason(list.get(i),field));
		}
		return hi;
	}
	private PlayerHotInfo CreateHotInfoSeason(PlayerVo vo, String field) {
		PlayerHotInfo h = new PlayerHotInfo();
		h.setField(field);
		h.setName(vo.getName());
		h.setPosition(vo.getPosition());
		h.setTeamName(vo.getTeam());
		if(field.equals("score")){
			h.setValue(vo.getScoreField());
			h.setUpgradeRate(vo.getScoreFieldProgress());
		}else if(field.equals("rebound")){
			h.setValue(vo.getReboundOverallField());
			h.setUpgradeRate(vo.getReboundOverallFieldProgress());
		}else if(field.equals("assist")){	
			h.setValue(vo.getAssistanceField());
			h.setUpgradeRate(vo.getAssistanceFieldProgress());
		}
		return h;
	}
	private  ArrayList<PlayerKingInfo> SetKingInfo(String field, boolean isdaily) {
		
		if(isdaily){
			ArrayList<PlayerVo> list = player_handler.sortPlayerBy(field);
			ArrayList<PlayerKingInfo> ki = new ArrayList<PlayerKingInfo>();
			for(int i=0;i<5;i++){
				ki.add(CreateKingInfoSeason(list.get(i),field));
			}
			return ki;
		}
		else{
			ArrayList<PlayerPerformanceInSingleGame> pplist = player_handler.sortDailyPerformance(field);
			ArrayList<PlayerKingInfo> ki = new ArrayList<PlayerKingInfo>();
			for(PlayerPerformanceInSingleGame temp:pplist){
				ki.add(CreateKingInfoDaily(temp,field));
			}
			return ki;

		}
	}
	private PlayerKingInfo CreateKingInfoSeason(PlayerVo vo, String field) {
		PlayerKingInfo k = new PlayerKingInfo();
		k.setField(field);
		k.setName(vo.getName());
		k.setPosition(vo.getPosition());
		k.setTeamName(vo.getTeam());
		if(field.equals("score"))
			k.setValue(vo.getScoreField());
		else if(field.equals("rebound"))
			k.setValue(vo.getReboundOverallField());
		else if(field.equals("assist"))
			k.setValue(vo.getAssistanceField());
		
		return k;
	}
	private PlayerKingInfo CreateKingInfoDaily(PlayerPerformanceInSingleGame temp,
			String field) {
		PlayerKingInfo k = new PlayerKingInfo();
		k.setField(field);
		k.setName(temp.getName());
		k.setPosition(temp.getPosition());
		k.setTeamName(temp.getTeam());
		if(field.equals("score"))
			k.setValue(temp.getScore());
		else if(field.equals("rebound"))
			k.setValue(temp.getReboundOverall());
		else if(field.equals("assist"))
			k.setValue(temp.getAssistance());
		
		return k;
	}
	
}
	



