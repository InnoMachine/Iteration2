/**
 * puppy
 * 2015年3月8日 下午3:41:24
 * TODO
 */
package po;

public class SinglePerformance {

	
	private String gamelabel;//
	
	private String name;
	private String position;
	
	
	private int timeBySeconds;// sudo
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

	private String teamThen;//
	
	public String toString() {

		return gamelabel + ";" + name + ";" + position + ";" + timeBySeconds + ";" + hitNum + ";"
				+ shotNum + ";" + threePointHitNum + ";" + threePointShotNum
				+ ";" + freeThrowHitNum + ";" + freeThrowShotNum + ";"
				+ offensiveRebound + ";" + defensiveRebound + ";"
				+ reboundOverall + ";" + assistance + ";" + steal + ";" + block
				+ ";" + turnover + ";" + foul + ";" + score + ";" + teamThen + ";";

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

	public int getTimeBySeconds() {
		return timeBySeconds;
	}

	public void setTimeBySeconds(int timeBySeconds) {
		this.timeBySeconds = timeBySeconds;
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getSteal() {
		return steal;
	}

	public void setSteal(int steal) {
		this.steal = steal;
	}
	
	public String getTeamThen() {
		return teamThen;
	}
	
	public void setTeamThen(String teamThen) {
		this.teamThen = teamThen;
	}
	
	public String getGamelabel() {
		return gamelabel;
	}
	
	public void setGamelabel(String gamelabel) {
		this.gamelabel = gamelabel;
	}

	public static SinglePerformance makeSP(String teamThen, String gamelabel, String spTextRaw) {

		String[] splited = spTextRaw.split(";");
		String name = splited[0];
		String position;
		if (splited.length == 1) {
			return null;
		}
		if (splited[1].equals("")) {
			position = null;// sudo
		} else {
			position = splited[1];
		}
		
		

		String timeText = splited[2];// sudo
		int timeByText;
		if (timeText.contains(":")) {
			if (!(timeText.equals("null") || timeText.equalsIgnoreCase("None") || timeText == null)) {
				String[] splitedTime = timeText.split(":");
				timeByText = Integer.parseInt(splitedTime[0]) * 60
						+ Integer.parseInt(splitedTime[1]);
			} else {
				timeByText = -1;// dirty data
			}
		} else {
			if (!(timeText.equals("null") || timeText.equalsIgnoreCase("None") || timeText == null)) {
				timeByText = Integer.parseInt(timeText);
			} else {
				timeByText = -1;// dirty data
			}
		}

		int hitNum = Integer.parseInt(splited[3]);
		int shotNum = Integer.parseInt(splited[4]);
		int threePointHitNum = Integer.parseInt(splited[5]);
		int threePointShotNum = Integer.parseInt(splited[6]);
		int freeThrowHitNum = Integer.parseInt(splited[7]);
		int freeThrowShotNum = Integer.parseInt(splited[8]);
		int offensiveRebound = Integer.parseInt(splited[9]);

		int defensiveRebound = 0;
		if (splited[10].equals("")) {
			defensiveRebound = -1;// dirty data
		} else {
			defensiveRebound = Integer.parseInt(splited[10]);
		}

		int reboundOverall = Integer.parseInt(splited[11]);
		int assistance = Integer.parseInt(splited[12]);
		int steal = Integer.parseInt(splited[13]);
		int block = Integer.parseInt(splited[14]);
		int turnover = Integer.parseInt(splited[15]);

		int foul = 0;
		if (splited[16].equals("")) {
			foul = -1;// dirty data
		} else {
			foul = Integer.parseInt(splited[16]);
		}

		int score = 0;
		if (splited[17].equalsIgnoreCase("null")) {
			score = -1;// dirty data
		} else {
			score = Integer.parseInt(splited[17]);
		}
		
//		String teamThen = splited[18];
//		String gamelabel = splited[19];
		
		

		SinglePerformance sp = new SinglePerformance();
		sp.setName(name);
		sp.setPosition(position);
		sp.setTimeBySeconds(timeByText);
		sp.setHitNum(hitNum);
		sp.setShotNum(shotNum);

		sp.setThreePointHitNum(threePointHitNum);
		sp.setThreePointShotNum(threePointShotNum);
		sp.setFreeThrowHitNum(freeThrowHitNum);
		sp.setFreeThrowShotNum(freeThrowShotNum);
		sp.setOffensiveRebound(offensiveRebound);

		sp.setDefensiveRebound(defensiveRebound);
		sp.setReboundOverall(reboundOverall);
		sp.setAssistance(assistance);
		sp.setSteal(steal);
		sp.setBlock(block);

		sp.setTurnover(turnover);
		sp.setFoul(foul);
		sp.setScore(score);

		sp.setTeamThen(teamThen);
		sp.setGamelabel(gamelabel);
		
		return sp;

	}
	
	public static SinglePerformance makeSP(String spTextDB) {//spTextDB is in database format

		String[] splited = spTextDB.split(";");
		String gamelabel = splited[0];
		String name = splited[1];
		String position;
		if (splited.length == 1) {
			return null;
		}
		if (splited[1].equals("")) {
			position = null;// sudo
		} else {
			position = splited[2];
		}
		
		

		String timeText = splited[3];// sudo
		int timeByText;
		if (timeText.contains(":")) {
			if (!(timeText.equals("null") || timeText.equalsIgnoreCase("None") || timeText == null)) {
				String[] splitedTime = timeText.split(":");
				timeByText = Integer.parseInt(splitedTime[0]) * 60
						+ Integer.parseInt(splitedTime[1]);
			} else {
				timeByText = -1;// dirty data
			}
		} else {
			if (!(timeText.equals("null") || timeText.equalsIgnoreCase("None") || timeText == null)) {
				timeByText = Integer.parseInt(timeText);
			} else {
				timeByText = -1;// dirty data
			}
		}

		int hitNum = Integer.parseInt(splited[4]);
		int shotNum = Integer.parseInt(splited[5]);
		int threePointHitNum = Integer.parseInt(splited[6]);
		int threePointShotNum = Integer.parseInt(splited[7]);
		int freeThrowHitNum = Integer.parseInt(splited[8]);
		int freeThrowShotNum = Integer.parseInt(splited[9]);
		int offensiveRebound = Integer.parseInt(splited[10]);

		int defensiveRebound = 0;
		if (splited[10].equals("")) {
			defensiveRebound = -1;// dirty data
		} else {
			defensiveRebound = Integer.parseInt(splited[11]);
		}

		int reboundOverall = Integer.parseInt(splited[12]);
		int assistance = Integer.parseInt(splited[13]);
		int steal = Integer.parseInt(splited[14]);
		int block = Integer.parseInt(splited[15]);
		int turnover = Integer.parseInt(splited[16]);

		int foul = 0;
		if (splited[17].equals("")) {
			foul = -1;// dirty data
		} else {
			foul = Integer.parseInt(splited[17]);
		}

		int score = 0;
		if (splited[18].equalsIgnoreCase("null")) {
			score = -1;// dirty data
		} else {
			score = Integer.parseInt(splited[18]);
		}
		
		String teamThen = splited[19];
		
		

		SinglePerformance sp = new SinglePerformance();
		sp.setName(name);
		sp.setPosition(position);
		sp.setTimeBySeconds(timeByText);
		sp.setHitNum(hitNum);
		sp.setShotNum(shotNum);

		sp.setThreePointHitNum(threePointHitNum);
		sp.setThreePointShotNum(threePointShotNum);
		sp.setFreeThrowHitNum(freeThrowHitNum);
		sp.setFreeThrowShotNum(freeThrowShotNum);
		sp.setOffensiveRebound(offensiveRebound);

		sp.setDefensiveRebound(defensiveRebound);
		sp.setReboundOverall(reboundOverall);
		sp.setAssistance(assistance);
		sp.setSteal(steal);
		sp.setBlock(block);

		sp.setTurnover(turnover);
		sp.setFoul(foul);
		sp.setScore(score);

		sp.setTeamThen(teamThen);
		sp.setGamelabel(gamelabel);
		
		return sp;

	}
	

}
