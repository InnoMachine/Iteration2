package vo;

import java.util.ArrayList;

import po.GameDate;

public class TeamPerformanceInSingleGame {
	private GameDate gameDate;//comparable
	private String gameLabel;
	private String name;
	private int time;//sudo
	private int hitNum;
	private int shotNum;
	private int threePointHitNum;
	private int threePointShotNum;
	private int freeThrowHitNum;
	private int freeThrowShotNum;
	private int offensiveRebound;
	private int defensiveRebound;
	private int reboundOverall;
	private int assistance;
	private int steal;
	private int block;
	private int turnover;
	private int foul;
	private int score;
	private double roundAttack;      //进攻回合
	private int opOffensiveRebound;  //对手进攻篮板
	private int opDefensiveRebound;  //对手防守篮板
	private double opRoundAttack;       //对手进攻回合
	private int opTwoPointShotNum;   //对手两分球出手
	private int opScore;
	private int winning;
	private String opTeam;
	
	private double hitRate;          //投篮命中率
	private double threePointHitRate;//三分球命中率
	private double freeThrowRate;    //罚球命中率
	
	private String highestScorePlayer;
	private String highestReboundPlayer;
	private String highestassistPlayer;
	private String highestblockPlayer;
	private int highestScore;
	private int highestRebound;
	private int highestassist;
	private int highestblock;
	
	public ArrayList <PlayerPerformanceInSingleGame> playerlist;
	public ArrayList<PlayerPerformanceInSingleGame> firstonlist;
	public TeamPerformanceInSingleGame(String name)
	{
		this.name =name;
		highestScorePlayer="";
		highestReboundPlayer="";
		highestassistPlayer="";
		highestblockPlayer="";
		highestScore=0;
		highestRebound=0;
		highestassist=0;
		highestblock=0;
		time=0;
		hitNum=0;
		shotNum=0;
		threePointHitNum=0;
		threePointShotNum=0;
		freeThrowHitNum=0;
		freeThrowShotNum=0;
		offensiveRebound=0;
		defensiveRebound=0;
		reboundOverall=0;
		assistance=0;
		block=0;
		turnover=0;
		foul=0;
		score=0;
		roundAttack=0;
		opOffensiveRebound=0;
		opDefensiveRebound=0;
		opRoundAttack=0;
		opTwoPointShotNum=0;
		playerlist = new ArrayList<PlayerPerformanceInSingleGame>();
		firstonlist = new ArrayList<PlayerPerformanceInSingleGame>();
	}
	public TeamPerformanceInSingleGame(){
		
	}
	public void CalculateRoundAttack()
	{
		if(offensiveRebound+opDefensiveRebound!=0)
		{
			roundAttack = (double)shotNum+0.4*freeThrowShotNum-1.07*
					(offensiveRebound/(double)(offensiveRebound+opDefensiveRebound)*(shotNum-hitNum))
					+1.07*turnover;
		}
		
	}
	public void isWinning()
	{
		if(this.score>this.opScore)
		{
			winning = 1;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getHitNum() {
		return hitNum;
	}
	public void setHitNum(int hitNum) {
		this.hitNum = hitNum;
	}
	public int getShotNum() {
		return shotNum;
	}
	public void setShotNum(int shotNum) {
		this.shotNum = shotNum;
	}
	public int getThreePointHitNum() {
		return threePointHitNum;
	}
	public void setThreePointHitNum(int threePointHitNum) {
		this.threePointHitNum = threePointHitNum;
	}
	public int getThreePointShotNum() {
		return threePointShotNum;
	}
	public void setThreePointShotNum(int threePointShotNum) {
		this.threePointShotNum = threePointShotNum;
	}
	public int getFreeThrowHitNum() {
		return freeThrowHitNum;
	}
	public void setFreeThrowHitNum(int freeThrowHitNum) {
		this.freeThrowHitNum = freeThrowHitNum;
	}
	public int getFreeThrowShotNum() {
		return freeThrowShotNum;
	}
	public void setFreeThrowShotNum(int freeThrowShotNum) {
		this.freeThrowShotNum = freeThrowShotNum;
	}
	public int getOffensiveRebound() {
		return offensiveRebound;
	}
	public void setOffensiveRebound(int offensiveRebound) {
		this.offensiveRebound = offensiveRebound;
	}
	public int getDefensiveRebound() {
		return defensiveRebound;
	}
	public void setDefensiveRebound(int defensiveRebound) {
		this.defensiveRebound = defensiveRebound;
	}
	public int getReboundOverall() {
		return reboundOverall;
	}
	public void setReboundOverall(int reboundOverall) {
		this.reboundOverall = reboundOverall;
	}
	public int getAssistance() {
		return assistance;
	}
	public void setAssistance(int assistance) {
		this.assistance = assistance;
	}
	public int getSteal() {
		return steal;
	}

	public void setSteal(int steal) {
		this.steal = steal;
	}
	public int getBlock() {
		return block;
	}
	public void setBlock(int block) {
		this.block = block;
	}
	public int getTurnover() {
		return turnover;
	}
	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}
	public int getFoul() {
		return foul;
	}
	public void setFoul(int foul) {
		this.foul = foul;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public double getRoundAttack() {
		return roundAttack;
	}
	public void setRoundAttack(double roundAttack) {
		this.roundAttack = roundAttack;
	}
	public int getOpOffensiveRebound() {
		return opOffensiveRebound;
	}
	public void setOpOffensiveRebound(int opOffensiveRebound) {
		this.opOffensiveRebound = opOffensiveRebound;
	}
	public int getOpDefensiveRebound() {
		return opDefensiveRebound;
	}
	public void setOpDefensiveRebound(int opDefensiveRebound) {
		this.opDefensiveRebound = opDefensiveRebound;
	}
	public double getOpRoundAttack() {
		return opRoundAttack;
	}
	public void setOpRoundAttack(double opRoundAttack) {
		this.opRoundAttack = opRoundAttack;
	}
	public int getOpTwoPointShotNum() {
		return opTwoPointShotNum;
	}
	public void setOpTwoPointShotNum(int opTwoPointShotNum) {
		this.opTwoPointShotNum = opTwoPointShotNum;
	}
	public int getOpScore() {
		return opScore;
	}
	public void setOpScore(int opScore) {
		this.opScore = opScore;
	}
	public int getWinning() {
		return winning;
	}
	public void setWinning(int winning) {
		this.winning = winning;
	}
	public void AddPlayerP(PlayerPerformanceInSingleGame pgp) {
		this.playerlist.add(pgp);
		
	}
	public ArrayList<PlayerPerformanceInSingleGame> getPlayerList(){
		return playerlist;
	}
	public void AddFirstP(PlayerPerformanceInSingleGame pgp) {
		this.firstonlist.add(pgp);
		
	}
	public ArrayList<PlayerPerformanceInSingleGame> getFirstonList(){
		return firstonlist;
	}
	public String getGameLabel() {
		return gameLabel;
	}
	public void setGameLabel(String gameLabel) {
		this.gameLabel = gameLabel;
	}
	public double getHitRate() {
		return hitRate;
	}
	public void setHitRate(double hitRate) {
		this.hitRate = hitRate;
	}
	public double getThreePointHitRate() {
		return threePointHitRate;
	}
	public void setThreePointHitRate(double threePointHitRate) {
		this.threePointHitRate = threePointHitRate;
	}
	public double getFreeThrowRate() {
		return freeThrowRate;
	}
	public void setFreeThrowRate(double freeThrowRate) {
		this.freeThrowRate = freeThrowRate;
	}
	public String getHighestScorePlayer() {
		return highestScorePlayer;
	}
	public void setHighestScorePlayer(String highestScorePlayer) {
		this.highestScorePlayer = highestScorePlayer;
	}
	public String getHighestReboundPlayer() {
		return highestReboundPlayer;
	}
	public void setHighestReboundPlayer(String highestReboundPlayer) {
		this.highestReboundPlayer = highestReboundPlayer;
	}
	public String getHighestassistPlayer() {
		return highestassistPlayer;
	}
	public void setHighestassistPlayer(String highestassistPlayer) {
		this.highestassistPlayer = highestassistPlayer;
	}
	public int getHighestScore() {
		return highestScore;
	}
	public void setHighestScore(int highestScore) {
		this.highestScore = highestScore;
	}
	public int getHighestRebound() {
		return highestRebound;
	}
	public void setHighestRebound(int highestRebound) {
		this.highestRebound = highestRebound;
	}
	public String getHighestblockPlayer() {
		return highestblockPlayer;
	}
	public void setHighestblockPlayer(String highestblockPlayer) {
		this.highestblockPlayer = highestblockPlayer;
	}
	public int getHighestassist() {
		return highestassist;
	}
	public void setHighestassist(int highestassist) {
		this.highestassist = highestassist;
	}
	public int getHighestblock() {
		return highestblock;
	}
	public void setHighestblock(int highestblock) {
		this.highestblock = highestblock;
	}
	public String getOpTeam() {
		return opTeam;
	}
	public void setOpTeam(String opTeam) {
		this.opTeam = opTeam;
	}
	public GameDate getGameDate() {
		return gameDate;
	}
	public void setGameDate(GameDate gameDate) {
		this.gameDate = gameDate;
	}
	public void setOpTeamP(String name2) {
		for(PlayerPerformanceInSingleGame pp:this.playerlist){
			pp.setOpTeam(name2);
		}
		for(PlayerPerformanceInSingleGame pp:this.firstonlist){
			pp.setOpTeam(name2);
		}
	}
	
}
