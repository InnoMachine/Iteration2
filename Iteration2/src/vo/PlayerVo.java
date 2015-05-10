package vo;

import enums.Division;


public class PlayerVo {
	private String number;
	private String position;
	private String height;
	private String weight;
	private String birth;
	private int age;
	private int exp;
	private String school;
	private Division div;
	
	private String name;
	private String team;
	private int FirstOnNum;//先发场数
	private int gameNum;
	private int reboundOverall;
	private int assistance;
	private int time;
	private int hitNum;
	private int shotNum;
	private int threePointHitNum;
	private int threePointShotNum;
	private int freeThrowHitNum;     //罚球命中数
	private int freeThrowShotNum;
	private double hitRate;          //投篮命中率
	private double threePointHitRate;//三分球命中率
	private double freeThrowRate;    //罚球命中率
	private int attackingNum;        //进攻数=进攻篮板数。。。
	private int defensiveNum;        //防守数
	private int block;               //盖帽数
	private int turnover;            //失误数
	private int foul;                //犯规数
	private int steal;               //抢断
	private int score;               //总得分
	private int efficiency;          //效率
	private double GmSc;
	private double trueHitRate;      //真实命中率
	private double hitEfficiency;    //投篮效率
	private double turnOverRate;
	private double reboundOverallRate;
	private double offensiveReboundRate;
	private double defensiveReboundRate;//
	private double assistanceRate;          //助攻率
	private double blockRate;        //盖帽率       
	private double stealRate;//抢断率
	private double useRate;//使用率
	//场均的
	private double scoreField;
	private double attackingNumField;
	private double defensiveNumField;        //防守数
	private double blockField;               //盖帽数
	private double turnoverField;            //失误数
	private double foulField;                //犯规数
	private double stealField;               //抢断
	private double hitNumField;
	private double shotNumField;
	private double reboundOverallField;
	private double assistanceField;
	private double GmScField;
	private double timeField;
	private double threePointHitNumField;
	private double threePointShotNumField;
	private double freeThrowHitNumField;     //罚球命中数
	private double freeThrowShotNumField;
	private double efficiencyField; 
	private double scoreFieldProgress;
	private double reboundOverallFieldProgress;
	private double assistanceFieldProgress;
	
	
	private int weighted;
	private int twoTenNum;//两双数
	private double teamRoundAttack;      //进攻回合
	private int opOffensiveRebound;  //对手进攻篮板
	private int opDefensiveRebound;  //对手防守篮板
	private int opReboundAll;
	private double opRoundAttack;       //对手进攻回合
	private int opTwoPointShotNum;   //对手两分球出手
	private int teamTime;            //球队所有球员上场时间
	private int teamShotNum;
	private int teamHitNum;
	private int teamFreeThrowNum;
	private int teamTurnOver;
	private int teamRebound;
	private int teamOffensiveRebound;
	private int teamDefensiveRebound;
	
	
	public PlayerVo(String name ){
		this.name = name ;
		
	}
	public PlayerVo(){
		
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int  getGameNum() {
		return gameNum;
	}
	public void setGameNum(int gameNum) {
		this.gameNum = gameNum;
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
	public double getHitRate() {
		return hitRate;
	}
	public void setHitRate(double hitRate) {
		this.hitRate = hitRate;
	}
	public double getTurnOverRate() {
		return turnOverRate;
	}
	public void setTurnOverRate(double turnOverRate) {
		this.turnOverRate = turnOverRate;
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
	public int getAttackingNum() {
		return attackingNum;
	}
	public void setAttackingNum(int attackingNum) {
		this.attackingNum = attackingNum;
	}
	public int getDefensiveNum() {
		return defensiveNum;
	}
	public void setDefensiveNum(int defensiveNum) {
		this.defensiveNum = defensiveNum;
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
	public int getEfficiency() {
		return efficiency;
	}
	public void setEfficiency(int efficiency) {
		this.efficiency = efficiency;
	}
	public double getGmSc() {
		return GmSc;
	}
	public void setGmSc(double GmSc) {
		this.GmSc = GmSc;
	}
	public double getTrueHitRate() {
		return trueHitRate;
	}
	public void setTrueHitRate(double trueHitRate) {
		this.trueHitRate = trueHitRate;
	}
	public double getHitEfficiency() {
		return hitEfficiency;
	}
	public void setHitEfficiency(double hitEfficiency) {
		this.hitEfficiency = hitEfficiency;
	}
	public double getReboundOverallRate() {
		return reboundOverallRate;
	}
	public void setReboundOverallRate(double reboundOverallRate) {
		this.reboundOverallRate = reboundOverallRate;
	}
	public double getOffensiveReboundRate() {
		return offensiveReboundRate;
	}
	public void setOffensiveReboundRate(double offensiveReboundRate) {
		this.offensiveReboundRate = offensiveReboundRate;
	}
	public double getDefensiveReboundRate() {
		return defensiveReboundRate;
	}
	public void setDefensiveReboundRate(double defensiveReboundRate) {
		this.defensiveReboundRate = defensiveReboundRate;
	}
	public double getAssistanceRate() {
		return assistanceRate;
	}
	public void setAssistanceRate(double assistanceRate) {
		this.assistanceRate = assistanceRate;
	}
	public double getBlockRate() {
		return blockRate;
	}
	public void setBlockRate(double blockRate) {
		this.blockRate = blockRate;
	}
	public double getStealRate() {
		return stealRate;
	}
	public void setStealRate(double stealRate) {
		this.stealRate = stealRate;
	}
	public double getUseRate() {
		return useRate;
	}
	public void setUseRate(double useRate) {
		this.useRate = useRate;
	}
	
	public double getTeamRoundAttack() {
		return teamRoundAttack;
	}
	public void setTeamRoundAttack(double roundAttack) {
		this.teamRoundAttack = roundAttack;
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
	public int getteamTime() {
		return teamTime;
	}
	public void setteamTime(int teamTime) {
		this.teamTime = teamTime;
	}
	public int GetteamShotNum() {
		return teamShotNum;
	}
	public void setteamShotNum(int teamShotNum) {
		this.teamShotNum = teamShotNum;
	}
	public int GetteamHitNum() {
		return teamHitNum;
	}
	public void setteamHitNum(int teamHitNum) {
		this.teamHitNum = teamHitNum;
	}
	public int getteamFreeThrowNum() {
		return teamFreeThrowNum;
	}
	public void setteamFreeThrowNum(int teamFreeThrowNum) {
		this.teamFreeThrowNum = teamFreeThrowNum;
	}
	
	public int getteamTurnOver() {
		return teamTurnOver;
	}
	public void setteamTurnOver(int teamTurnOver) {
		this.teamTurnOver = teamTurnOver;
	}
	
	public int getOpReboundAll() {
		return opReboundAll;
	}
	public void setOpReboundAll(int opReboundAll) {
		this.opReboundAll = opReboundAll;
	}
	public int getteamRebound() {
		return teamRebound;
	}
	public void setteamRebound(int teamRebound) {
		this.teamRebound = teamRebound;
	}
	public int getteamOffensiveRebound() {
		return teamOffensiveRebound;
	}
	public void setteamOffensiveRebound(int teamOffensiveRebound) {
		this.teamOffensiveRebound = teamOffensiveRebound;
	}
	public int getteamDefensiveRebound() {
		return teamDefensiveRebound;
	}
	public void setteamDefensiveRebound(int teamDefensiveRebound) {
		this.teamDefensiveRebound = teamDefensiveRebound;
	}
	public int getFirstOnNum() {
		return FirstOnNum;
	}
	public void setFirstOnNum(int firstOnNum) {
		FirstOnNum = firstOnNum;
	}
	public Division getDivision() {
		return div;
	}
	public void setDivision(Division div) {
		this.div = div;
	}
	public int getTwoTenNum() {
		return twoTenNum;
	}
	public void setTwoTenNum(int twoTenNum) {
		this.twoTenNum = twoTenNum;
	}
	public int getWeighted() {
		return weighted;
	}
	public void setWeighted(int weighted) {
		this.weighted = weighted;
	}
	public double getAttackingNumField() {
		return attackingNumField;
	}
	public void setAttackingNumField(double attackingNumField) {
		this.attackingNumField = attackingNumField;
	}
	public double getScoreField() {
		return scoreField;
	}
	public void setScoreField(double scoreField) {
		this.scoreField = scoreField;
	}
	public double getShotNumField() {
		return shotNumField;
	}
	public void setShotNumField(double shotNumField) {
		this.shotNumField = shotNumField;
	}
	public double getHitNumField() {
		return hitNumField;
	}
	public void setHitNumField(double hitNumField) {
		this.hitNumField = hitNumField;
	}
	public double getStealField() {
		return stealField;
	}
	public void setStealField(double stealField) {
		this.stealField = stealField;
	}
	public double getFoulField() {
		return foulField;
	}
	public void setFoulField(double foulField) {
		this.foulField = foulField;
	}
	public double getTurnoverField() {
		return turnoverField;
	}
	public void setTurnoverField(double turnoverField) {
		this.turnoverField = turnoverField;
	}
	public double getBlockField() {
		return blockField;
	}
	public void setBlockField(double blockField) {
		this.blockField = blockField;
	}
	public double getDefensiveNumField() {
		return defensiveNumField;
	}
	public void setDefensiveNumField(double defensiveNumField) {
		this.defensiveNumField = defensiveNumField;
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
	public double getGmScField() {
		return GmScField;
	}
	public void setGmScField(double gmScField) {
		GmScField = gmScField;
	}
	public double getTimeField() {
		return timeField;
	}
	public void setTimeField(double timeField) {
		this.timeField = timeField;
	}
	public double getThreePointHitNumField() {
		return threePointHitNumField;
	}
	public void setThreePointHitNumField(double threePointHitNumField) {
		this.threePointHitNumField = threePointHitNumField;
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
	public double getEfficiencyField() {
		return efficiencyField;
	}
	public void setEfficiencyField(double efficiencyField) {
		this.efficiencyField = efficiencyField;
	}
	public double getScoreFieldProgress() {
		return scoreFieldProgress;
	}
	public void setScoreFieldProgress(double scoreFieldProgress) {
		this.scoreFieldProgress = scoreFieldProgress;
	}
	public double getReboundOverallFieldProgress() {
		return reboundOverallFieldProgress;
	}
	public void setReboundOverallFieldProgress(double reboundOverallFieldProgress) {
		this.reboundOverallFieldProgress = reboundOverallFieldProgress;
	}
	public double getAssistanceFieldProgress() {
		return assistanceFieldProgress;
	}
	public void setAssistanceFieldProgress(double assistanceFieldProgress) {
		this.assistanceFieldProgress = assistanceFieldProgress;
	}
	
	
}