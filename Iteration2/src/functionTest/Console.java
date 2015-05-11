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
	static Player_Handler player_handler;
	static Team_Handler team_handler;
	public void execute(PrintStream out,String[] args){
		
		this.out = out;
		System.setOut(out);
		String order="";
		for(int i=0;i<args.length-1;i++){
			order+=args[i];
			order+=" ";
		}
		order+=args[args.length-1];
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
				if(s1.contains(" ")){
					s1=s1.substring(0,s1.indexOf(" "));
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
			else{
				ArrayList<PlayerVo> listvo = null ;
				ArrayList<PlayerVo> list = null ;
				int k=0;
				String field ="";
				String s="";
				String sortorder ="";
				if(order.contains("-sort")){
					
					k=order.indexOf("-sort");
					s = order.substring(k+6);
					if(s.contains("-")){
						s = s.substring(0,s.indexOf("-")-1);
					}
					field = s.substring(0,s.indexOf("."));
					sortorder = s.substring(s.indexOf(".")+1);
					if(sortorder.contains(" ")){
						sortorder=sortorder.substring(0, sortorder.indexOf(" "));
					}
					if(!s.contains(",")){
						field=playerSortFieldTrans(field);
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
				}
				else{
					if(!order.contains("-high")){
						field="score";
						sortorder = "desc";
						playerSortFieldTrans(field);
						listvo = player_handler.sortPlayerBy(field);
					}else{
						field="realShot";
						sortorder = "desc";
						playerSortFieldTrans(field);
						listvo = player_handler.sortPlayerBy(field);
					}
				}
				
				if(!order.contains("-high")){
					if(order.contains("-filter")){
						k=order.indexOf("-filter");
						String position ="All";
						String league = "All";
						String age = "All";
						s = order.substring(k+8);
						if(s.contains("-")){
							s = s.substring(0,s.indexOf(" "));
						}
						if(s.contains("position")){
							String s1=s.substring(s.indexOf("position"));
							if(s1.contains(",")){
								s1=s1.substring(0, s1.indexOf(","));
							}
							field = "position";
							String value = s1.substring(s1.indexOf(".")+1);
							if(!s1.contains(",")){
								if(value.indexOf(" ")!=-1){
									position = value.substring(0, value.indexOf(" "));
								}else {
									position = value;
								}
								
							}
							else{
								value = value.substring(0, value.indexOf(","));
								position = value;
							}
						}
						if(s.contains("league")){
							String s1=s.substring(s.indexOf("league"));
							if(s1.contains(",")){
								s1=s1.substring(0, s1.indexOf(","));
							}
							field = "league";
							String value = s1.substring(s1.indexOf("league")+7);
							if(!s1.contains(",")){
								league = value;
							}
							else{
								value.substring(0, value.indexOf(",")-1);
								league = value;
							}
						}
						if(s.contains("age")){
							String s1=s.substring(s.indexOf("age"));
							if(s1.contains(",")){
								s1=s1.substring(0, s1.indexOf(","));
							}
							field = "age";
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
					else
						list = listvo;
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
			if(order.contains("-n")){
				int k = order.indexOf("-n");
				String s1 = order.substring(k+3);
				if(s1.contains("-")){
					int p =s1.indexOf("-");
					s1 = s1.substring(0, p-1);
				}
				if(s1.contains(" ")){
					s1=s1.substring(0,s1.indexOf(" "));
				}
				n=Integer.parseInt(s1);
			}
			String field ="";
			String sortorder="";
			ArrayList<TeamVo> list = null ;
			if(order.contains("-hot")){
				int k =order.indexOf("-hot");
				String s = order.substring(k+5);
				if(s.contains("-")){
					field = s.substring(0, s.indexOf(" "));
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
					sortorder = s.substring(s.indexOf(".")+1);
					if(sortorder.contains(" ")){
						sortorder=sortorder.substring(0, sortorder.indexOf(" "));
					}
				}
				else{
					field = "score";
					sortorder ="desc";
				}
				field =TeamSortFieldTrans(field);
				list = team_handler.sortTeamBy(field);
				if(!sortorder.equals("desc"))
				{
					Collections.reverse(list);
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
					sortorder = s.substring(s.indexOf(".")+1);
					if(sortorder.contains(" ")){
						sortorder=sortorder.substring(0, sortorder.indexOf(" "));
					}
				}
				else{
					field = "winRate";
					sortorder ="desc";
				}
				field =TeamSortFieldTrans(field);
				list = team_handler.sortTeamBy(field);
				if(!sortorder.equals("desc"))
				{
					Collections.reverse(list);
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
	
	private String TeamSortFieldTrans(String f) {
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
		return f;
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
			temp.setRebound(list.get(i).getReboundOverallField());
			temp.setTeamName(list.get(i).getAbbreviation());
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
			temp.setTeamName(list.get(i).getAbbreviation());
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
			temp.setTeamName(list.get(i).getAbbreviation());
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
			temp.setTeamName(list.get(i).getAbbreviation());
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
			temp.setRebound(list.get(i).getReboundOverallField());
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
			temp.setRebound(list.get(i).getReboundOverall());
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
				//System.out.println(temp.getPosition());
				if(isPosition(temp, position))
					list1.add(temp);
			}
		}
		if(league.equals("All")){
			for(PlayerVo temp:list1){
				list2.add(temp);
			}
		}else{
			if(league.equals("west")||league.equals("West")){
				for(PlayerVo temp:list1){
					String div = temp.getDivision()+"";
					if(div.equals("SOUTHWEST")||div.equals("NORTHWEST")||div.equals("PACIFIC")){
						list2.add(temp);
					}
				}
			}
			else if(league.equals("east")||league.equals("East")){
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
	private String playerSortFieldTrans(String f) {
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
		return f;
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
	private boolean isPosition(PlayerVo temp, String position) {
		String p = temp.getPosition();
		if(p.length()==1)
		{
			return p.equals(position);
		}
		else{
			String first = p.substring(0, 1);
			String right = p.substring(2, 3);
			return first.equals(position)||right.equals(position);
		}
		
	}
}
	



