package vo;

import enums.Conference;
import enums.Division;

public class TeamCardVo {
	private String teamName;
	private String abbreviation;
	private String city;
	private Conference conference;
	private Division division;
	private String homeField;
	private String birthYear;
	private String imgPath;
	private String sortOption;
	private double sortValue;
	
	public TeamCardVo()
	{
		
	}
	
	
	public TeamCardVo(TeamVo vo,String option){
		this.teamName =vo.getTeamName();
		this.abbreviation =vo.getAbbreviation();
		this.city = vo.getCity();
		this.conference = vo.getConference();
		this.division =vo.getDivision();
		this.homeField =vo.getHomeField();
		this.birthYear =vo.getBirthYear();
		this.imgPath =vo.getImgPath();
		this.sortOption = option;
		if(option.equals("GameNum")){
			sortValue = vo.getGameNum();
		}else if(option.equals("hitNum")){
			sortValue = vo.getHitNum();
		}else if(option.equals("hitNumField")){
			sortValue = vo.getHitNumField();
		}else if(option.equals("shotNum")){
			sortValue = vo.getShotNum();
		}else if(option.equals("shotNumField")){
			sortValue = vo.getShotNumField();
		}else if(option.equals("threePointHitNum")){
			sortValue = vo.getThreePointHitNum();
		}else if(option.equals("threePointHitNumField")){
			sortValue = vo.getThreePointHitNumField();
		}else if(option.equals("threePointShotNum")){
			sortValue = vo.getThreePointShotNum();
		}else if(option.equals("threePointShotNumField")){
			sortValue = vo.getThreePointShotNumField();
		}else if(option.equals("freeThrowHitNum")){
			sortValue = vo.getFreeThrowHitNum();
		}else if(option.equals("freeThrowHitNumField")){
			sortValue = vo.getFreeThrowHitNumField();
		}else if(option.equals("freeThrowShotNum")){
			sortValue = vo.getFreeThrowShotNum();
		}else if(option.equals("freeThrowShotNumField")){
			sortValue = vo.getFreeThrowShotNumField();
		}else if(option.equals("offensiveReboundField")){
			sortValue = vo.getOffensiveReboundField();
		}else if(option.equals("offensiveRebound")){
			sortValue = vo.getOffensiveRebound();
		}else if(option.equals("defensiveReboundField")){
			sortValue = vo.getDefensiveReboundField();
		}else if(option.equals("defensiveRebound")){
			sortValue = vo.getDefensiveRebound();
		}else if(option.equals("reboundOverallField")){
			sortValue = vo.getReboundOverallField();
		}else if(option.equals("reboundOverall")){
			sortValue = vo.getReboundOverall();
		}else if(option.equals("assistanceField")){
			sortValue = vo.getAssistanceField();
		}else if(option.equals("assistance")){
			sortValue = vo.getAssistance();
		}else if(option.equals("stealField")){
			sortValue = vo.getStealField();
		}else if(option.equals("steal")){
			sortValue = vo.getSteal();
		}else if(option.equals("blockField")){
			sortValue = vo.getBlockField();
		}else if(option.equals("block")){
			sortValue = vo.getBlock();
		}else if(option.equals("turnoverField")){
			sortValue = vo.getTurnoverField();
		}else if(option.equals("turnover")){
			sortValue = vo.getTurnover();
		}else if(option.equals("foulField")){
			sortValue = vo.getFoulField();
		}else if(option.equals("foul")){
			sortValue = vo.getFoul();
		}else if(option.equals("scoreField")){
			sortValue = vo.getScoreField();
		}else if(option.equals("score")){
			sortValue = vo.getScore();
		}else if(option.equals("hitRate")){
			sortValue = vo.getHitRate();
		}else if(option.equals("threePointHitRate")){
			sortValue = vo.getThreePointHitRate();
		}else if(option.equals("freeThrowRate")){
			sortValue = vo.getFreeThrowRate();
		}else if(option.equals("winningRate")){
			sortValue = vo.getWinningRate();
		}else if(option.equals("roundAttack")){
			sortValue = vo.getRoundAttack();
		}else if(option.equals("attackingEfficiency")){
			sortValue = vo.getAttackingEfficiency();
		}else if(option.equals("defensiveEfficiency")){
			sortValue = vo.getDefensiveEfficiency();
		}else if(option.equals("reboundEfficiency")){
			sortValue = vo.getReboundEfficiency();
		}else if(option.equals("stealEfficiency")){
			sortValue = vo.getStealEfficiency();
		}else if(option.equals("assistanceEfficiency")){
			sortValue = vo.getAssistanceEfficiency();
		}
		
	}
			
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
	public String getSortOption() {
		return sortOption;
	}
	public void setSortOption(String sortOption) {
		this.sortOption = sortOption;
	}
	public double getSortValue() {
		return sortValue;
	}
	public void setSortValue(double sortValue) {
		this.sortValue = sortValue;
	}
}
