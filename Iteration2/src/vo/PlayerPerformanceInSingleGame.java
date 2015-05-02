package vo;

public class PlayerPerformanceInSingleGame {
	private String gameLabel;
	private String name;
	private String position;
	private String number;
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
	
	private int firstOn;
	private int twoTenNum;
	private String Team;
	private String OpTeam;
	public PlayerPerformanceInSingleGame(String name)
	{
		this.name =name;
		time = 0;
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
		twoTenNum=0;
		firstOn=0;
	}
	public String toString() {
		return null;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
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
	public int getTwoTenNum() {
		return twoTenNum;
	}
	public void setTwoTenNum(int twoTenNum) {
		this.twoTenNum = twoTenNum;
	}
	public int getFirstOn() {
		return firstOn;
	}
	public void setFirstOn(int firstOn) {
		this.firstOn = firstOn;
	}
	public String getTeam() {
		return Team;
	}
	public void setTeam(String team) {
		Team = team;
	}
	public String getGameLabel() {
		return gameLabel;
	}
	public void setGameLabel(String gameLabel) {
		this.gameLabel = gameLabel;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getOpTeam() {
		return OpTeam;
	}
	public void setOpTeam(String opTeam) {
		OpTeam = opTeam;
	}
	public String getDate(){
		String date = gameLabel.substring(gameLabel.indexOf("_")+1);
		date = date.substring(0, date.indexOf("_"));
		return date;
	}

}
