package vo;

import enums.Conference;
import enums.Division;

public class TeamVo {

	private String teamName;
	private String abbreviation;
	private String city;
	private Conference conference;
	private Division division;
	private String homeField;
	private String birthYear;
	private String imgPath;
	
	private int time;//sudo
	private int winningNum;
	private int GameNum;
	private int hitNum;
	private int shotNum;
	private int threePointHitNum;
	private int threePointShotNum;
	private int freeThrowHitNum;//罚球命中
	private int freeThrowShotNum;//罚球出手
	private int offensiveRebound;//进攻篮板
	private int defensiveRebound;//防守篮板
	private int reboundOverall;      //篮板数
	private int assistance;          //助攻
	private int block;               //盖帽数
	private int turnover;            //失误数
	private int foul;                //犯规数
	private int steal;               //抢断
	private int score;               //总得分
	private double hitRate;          //投篮命中率
	private double threePointHitRate;//三分球命中率
	private double freeThrowRate;    //罚球命中率
	private double winningRate;      //胜率
	private double roundAttack;      //进攻回合
	private double attackingEfficiency;//进攻效率
	private double defensiveEfficiency;//防守效率
	private double reboundEfficiency;//篮板效率
	private double stealEfficiency;//抢断效率？
	private double assistanceEfficiency;//助攻效率
	private double offensiveReboundEfficiency;//篮板效率
	private double defensiveReboundEfficiency;
	
	private double hitNumField;
	private double shotNumField;
	private double threePointHitNumField;
	private double threePointShotNumField;
	private double freeThrowHitNumField;//罚球命中
	private double freeThrowShotNumField;//罚球出手
	private double offensiveReboundField;//进攻篮板
	private double defensiveReboundField;//防守篮板
	private double reboundOverallField;      //篮板数
	private double assistanceField;          //助攻
	private double blockField;               //盖帽数
	private double turnoverField;            //失误数
	private double foulField;                //犯规数
	private double stealField;               //抢断
	private double scoreField;               //总得分
	private double roundAttackField;
	//下面的你们用不到
	private int opOffensiveRebound;  //对手进攻篮板
	private int opDefensiveRebound;  //对手防守篮板
	private int opReboundAll;
	private double opRoundAttack;       //对手进攻回合
	private int opTwoPointShotNum;   //对手两分球出手
	private int opScore;
	
	public String getTeamName(){
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Conference getConference() {
		return conference;
	}
	public void setConference(Conference conf) {
		this.conference = conf;
	}
	public Division getDivision() {
		return division;
	}
	public void setDivision(Division div) {
		this.division = div;
	}
	public String getHomeField() {
		return homeField;
	}
	public void setHomeField(String homeField) {
		this.homeField = homeField;
	}
	public String getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getWinningNum() {
		return winningNum;
	}
	public void setWiningNum(int winningNum) {
		this.winningNum = winningNum;
	}
	public int getGameNum() {
		return GameNum;
	}
	public void setGameNum(int GameNum) {
		this.GameNum = GameNum;
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
	public int getSteal() {
		return steal;
	}
	public void setSteal(int steal) {
		this.steal = steal;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
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
	public double getWinningRate() {
		return winningRate;
	}
	public void setWinningRate(double winningRate) {
		this.winningRate = winningRate;
	}
	public double getRoundAttack() {
		return roundAttack;
	}
	public void setRoundAttack(double roundAttack) {
		this.roundAttack = roundAttack;
	}
	public double getAttackingEfficiency() {
		return attackingEfficiency;
	}
	public void setAttackingEfficiency(double attackingEfficiency) {
		this.attackingEfficiency = attackingEfficiency;
	}
	public double getDefensiveEfficiency() {
		return defensiveEfficiency;
	}
	public void setDefensiveEfficiency(double defensiveEfficiency) {
		this.defensiveEfficiency = defensiveEfficiency;
	}
	public double getReboundEfficiency() {
		return reboundEfficiency;
	}
	public void setReboundEfficiency(double reboundEfficiency) {
		this.reboundEfficiency = reboundEfficiency;
	}
	public double getStealEfficiency() {
		return stealEfficiency;
	}
	public void setStealEfficiency(double stealEfficiency) {
		this.stealEfficiency = stealEfficiency;
	}
	public double getAssistanceEfficiency() {
		return assistanceEfficiency;
	}
	public void setAssistanceEfficiency(double assistanceEfficiency) {
		this.assistanceEfficiency = assistanceEfficiency;
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
	public int getOpReboundAll() {
		return opReboundAll;
	}
	public void setOpReboundAll(int opReboundAll) {
		this.opReboundAll = opReboundAll;
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
	
	public double getHitNumField() {
		return hitNumField;
	}
	public void setHitNumField(double hitNumField) {
		this.hitNumField = hitNumField;
	}
	public double getShotNumField() {
		return shotNumField;
	}
	public void setShotNumField(double shotNumField) {
		this.shotNumField = shotNumField;
	}
	public double getThreePointHitNumField() {
		return threePointHitNumField;
	}
	public void setThreePointHitNumField(double threePointHitNumField) {
		this.threePointHitNumField = threePointHitNumField;
	}
	public double getScoreField() {
		return scoreField;
	}
	public void setScoreField(double scoreField) {
		this.scoreField = scoreField;
	}
	public double getThreePointShotNumField() {
		return threePointShotNumField;
	}
	public void setThreePointShotNumField(double threePointShotNumField) {
		this.threePointShotNumField = threePointShotNumField;
	}
	public double getFreeThrowHitNumField() {
		return freeThrowHitNumField;
	}
	public void setFreeThrowHitNumField(double freeThrowHitNumField) {
		this.freeThrowHitNumField = freeThrowHitNumField;
	}
	public double getFreeThrowShotNumField() {
		return freeThrowShotNumField;
	}
	public void setFreeThrowShotNumField(double freeThrowShotNumField) {
		this.freeThrowShotNumField = freeThrowShotNumField;
	}
	public double getOffensiveReboundField() {
		return offensiveReboundField;
	}
	public void setOffensiveReboundField(double offensiveReboundField) {
		this.offensiveReboundField = offensiveReboundField;
	}
	public double getDefensiveReboundField() {
		return defensiveReboundField;
	}
	public void setDefensiveReboundField(double defensiveReboundField) {
		this.defensiveReboundField = defensiveReboundField;
	}
	public double getReboundOverallField() {
		return reboundOverallField;
	}
	public void setReboundOverallField(double reboundOverallField) {
		this.reboundOverallField = reboundOverallField;
	}
	public double getAssistanceField() {
		return assistanceField;
	}
	public void setAssistanceField(double assistanceField) {
		this.assistanceField = assistanceField;
	}
	public double getBlockField() {
		return blockField;
	}
	public void setBlockField(double blockField) {
		this.blockField = blockField;
	}
	public double getTurnoverField() {
		return turnoverField;
	}
	public void setTurnoverField(double turnoverField) {
		this.turnoverField = turnoverField;
	}
	public double getFoulField() {
		return foulField;
	}
	public void setFoulField(double foulField) {
		this.foulField = foulField;
	}
	public double getStealField() {
		return stealField;
	}
	public void setStealField(double stealField) {
		this.stealField = stealField;
	}
	public double getRoundAttackField() {
		return roundAttackField;
	}
	public void setRoundAttackField(double roundAttackField) {
		this.roundAttackField = roundAttackField;
	}
	public double getOffensiveReboundEfficiency() {
		return offensiveReboundEfficiency;
	}
	public void setOffensiveReboundEfficiency(double offensiveReboundEfficiency) {
		this.offensiveReboundEfficiency = offensiveReboundEfficiency;
	}
	public double getDefensiveReboundEfficiency() {
		return defensiveReboundEfficiency;
	}
	public void setDefensiveReboundEfficiency(double defensiveReboundEfficiency) {
		this.defensiveReboundEfficiency = defensiveReboundEfficiency;
	}
}
