package businessLogic;

import java.util.ArrayList;

import vo.TeamCardVo;
import vo.TeamRecentGames;
import vo.TeamVo;

public class Team_Handler {
	private Data_Handler data_handler;
	private ArrayList<TeamVo> teamlistvo;

	
	public Team_Handler()
	{
		data_handler = Data_Handler.getInstance();
		teamlistvo = data_handler.getTeams();
		
	}

	
	public TeamVo getTeamByAbbr(String abbr) {
		for(TeamVo temp:teamlistvo)
		{
			if(abbr.equals(temp.getAbbreviation()))
			{
				return temp;
			}
		}
		return null;
	}
	
	public ArrayList<TeamVo> getAllTeam() {
		
		return teamlistvo;
	}

	public ArrayList<TeamVo> sortTeamBy(String option) {
		
		if(option.equals("teamName")){
			String a[][] = new String [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getTeamName();
				a[i][1] = i+"";
			}
			HeapSortByString.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get(Integer.parseInt(a[i][1])));
			}
			return templist;
		}else if(option.equals("GameNum")){
			int a[][] = new int [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getGameNum();
				a[i][1] = i;
			}
			HeapSortByInt.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get(a[i][1]));
			}
			return templist;
		}else if(option.equals("hitNum")){
			int a[][] = new int [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getHitNum();
				a[i][1] = i;
			}
			HeapSortByInt.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get(a[i][1]));
			}
			return templist;
		}else if(option.equals("hitNumField")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getHitNumField();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("shotNum")){
			int a[][] = new int [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getShotNum();
				a[i][1] = i;
			}
			HeapSortByInt.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get(a[i][1]));
			}
			return templist;
		}else if(option.equals("shotNumField")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getShotNumField();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("threePointHitNum")){
			int a[][] = new int [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getThreePointHitNum();
				a[i][1] = i;
			}
			HeapSortByInt.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get(a[i][1]));
			}
			return templist;
		}else if(option.equals("threePointHitNumField")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getThreePointHitNumField();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("threePointShotNum")){
			int a[][] = new int [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getThreePointShotNum();
				a[i][1] = i;
			}
			HeapSortByInt.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get(a[i][1]));
			}
			return templist;
		}else if(option.equals("threePointShotNumField")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getThreePointShotNumField();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("freeThrowHitNum")){
			int a[][] = new int [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getFreeThrowHitNum();
				a[i][1] = i;
			}
			HeapSortByInt.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get(a[i][1]));
			}
			return templist;
		}else if(option.equals("freeThrowHitNumField")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getFreeThrowHitNumField();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("freeThrowShotNum")){
			int a[][] = new int [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getFreeThrowShotNum();
				a[i][1] = i;
			}
			HeapSortByInt.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get(a[i][1]));
			}
			return templist;
		}else if(option.equals("freeThrowShotNumField")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getFreeThrowShotNumField();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("offensiveReboundField")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getOffensiveReboundField();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("offensiveRebound")){
			int a[][] = new int [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getOffensiveRebound();
				a[i][1] = i;
			}
			HeapSortByInt.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get(a[i][1]));
			}
			return templist;
		}else if(option.equals("defensiveReboundField")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getDefensiveReboundField();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("defensiveRebound")){
			int a[][] = new int [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getDefensiveRebound();
				a[i][1] = i;
			}
			HeapSortByInt.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get(a[i][1]));
			}
			return templist;
		}else if(option.equals("reboundOverallField")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getReboundOverallField();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}
		else if(option.equals("reboundOverall")){
			int a[][] = new int [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getReboundOverall();
				a[i][1] = i;
			}
			HeapSortByInt.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get(a[i][1]));
			}
			return templist;
		}else if(option.equals("assistanceField")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getAssistanceField();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("assistance")){
			int a[][] = new int [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getAssistance();
				a[i][1] = i;
			}
			HeapSortByInt.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get(a[i][1]));
			}
			return templist;
		}else if(option.equals("stealField")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getStealField();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("steal")){
			int a[][] = new int [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getSteal();
				a[i][1] = i;
			}
			HeapSortByInt.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get(a[i][1]));
			}
			return templist;
		}else if(option.equals("blockField")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getBlockField();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("block")){
			int a[][] = new int [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getBlock();
				a[i][1] = i;
			}
			HeapSortByInt.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get(a[i][1]));
			}
			return templist;
		}else if(option.equals("turnoverField")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getTurnoverField();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("turnover")){
			int a[][] = new int [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getTurnover();
				a[i][1] = i;
			}
			HeapSortByInt.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get(a[i][1]));
			}
			return templist;
		}else if(option.equals("foulField")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getFoulField();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("foul")){
			int a[][] = new int [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getFoul();
				a[i][1] = i;
			}
			HeapSortByInt.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get(a[i][1]));
			}
			return templist;
		}else if(option.equals("scoreField")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getScoreField();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("score")){
			int a[][] = new int [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getScore();
				a[i][1] = i;
			}
			HeapSortByInt.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get(a[i][1]));
			}
			return templist;
		}else if(option.equals("hitRate")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getHitRate();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("threePointHitRate")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getThreePointHitRate();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("freeThrowRate")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getFreeThrowRate();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("winningRate")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getWinningRate();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("roundAttack")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getRoundAttack();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("attackingEfficiency")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getAttackingEfficiency();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("defensiveEfficiency")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getDefensiveEfficiency();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("reboundEfficiency")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getReboundEfficiency();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("DefensiveReboundEfficiency")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getDefensiveReboundEfficiency();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("offensiveReboundEfficiency")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getOffensiveReboundEfficiency();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("stealEfficiency")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getStealEfficiency();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}else if(option.equals("assistanceEfficiency")){
			double a[][] = new double [teamlistvo.size()][2]; 
			for(int i=0;i<teamlistvo.size();i++)
			{
				a[i][0] = teamlistvo.get(i).getAssistanceEfficiency();
				a[i][1] = i;
			}
			HeapSortByDouble.heapSort(a);
			ArrayList<TeamVo> templist = new ArrayList<TeamVo>();
			for(int i=0;i<teamlistvo.size();i++)
			{
				templist.add(teamlistvo.get((int)a[i][1]));
			}
			return templist;
		}
		return null;
	}


	public TeamRecentGames getTeamRecentPerformance(String abbr) {
		
		return data_handler.getTeamRecentPerformance(abbr);
	}
	
	public ArrayList<TeamCardVo> hotTeamSeason(String option) {
		ArrayList<TeamVo> list = sortTeamBy(option);
		ArrayList<TeamCardVo> templist = new ArrayList<TeamCardVo>();
		for(int i=0;i<5;i++)
		{
			templist.add(new TeamCardVo(list.get(i),option));
		}
		return templist;
	}
}
