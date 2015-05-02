package vo;




public class PlayerCardVo {
	private String number;
	private String position;
	private String height;
	private String weight;
	private String birth;
	private String name;
	private int age;
	private int exp;
	private String school;
	private String ActionImgPath;
	private String PortraitImgPath;
	private String sortOption;
	private double sortvalue;
	private String Team;
	private double sortProgress;
	public PlayerCardVo()
	{
		
	}
	public PlayerCardVo(PlayerVo vo,String option,double progress)
	{
		this.name=vo.getName();
		this.number = vo.getNumber();
		this.position = vo.getPosition();
		this.height = vo.getHeight();
		this.weight = vo.getWeight();
		this.age =vo.getAge();
		this.birth = vo.getBirth();
		this.exp = vo.getExp();
		this.school = vo.getSchool();
		this.ActionImgPath =vo.getActionImgPath();
		this.PortraitImgPath = vo.getPortraitImgPath();
		this.sortProgress = progress;
		this.sortOption = option;
		this.Team=vo.getTeam();
		if(option.equals("time")){
			sortvalue = vo.getTime();
		}else if(option.equals("scoreFieldProgress")){
			sortvalue = vo.getFreeThrowShotNumField();
		}else if(option.equals("reboundOverallFieldProgress")){
			sortvalue = vo.getFreeThrowShotNum();
		}else if(option.equals("assistanceFieldProgress")){
			sortvalue = vo.getTwoTenNum();
		}else if(option.equals("timeField")){
			sortvalue = vo.getTimeField();
		}else if(option.equals("FirstOnNum")){
			sortvalue = vo.getFirstOnNum();
		}else if(option.equals("gameNum")){
			sortvalue = vo.getGameNum();
		}else if(option.equals("reboundOverall")){
			sortvalue = vo.getReboundOverall();
		}else if(option.equals("reboundOverallField")){
			sortvalue = vo.getReboundOverallField();
		}else if(option.equals("assistance")){
			sortvalue = vo.getAssistance();
		}else if(option.equals("assistanceField")){
			sortvalue = vo.getAssistanceField();
		}else if(option.equals("hitRate")){
			sortvalue = vo.getHitRate();
		}else if(option.equals("threePointHitRate")){
			sortvalue = vo.getThreePointHitRate();
		}else if(option.equals("freeThrowRate")){
			sortvalue = vo.getFreeThrowRate();
		}else if(option.equals("attackingNumField")){
			sortvalue = vo.getAttackingNumField();
		}else if(option.equals("attackingNum")){
			sortvalue = vo.getAttackingNum();
		}else if(option.equals("defensiveNumField")){
			sortvalue = vo.getDefensiveNumField();
		}else if(option.equals("defensiveNum")){
			sortvalue = vo.getDefensiveNum();
		}else if(option.equals("stealField")){
			sortvalue = vo.getStealField();
		}else if(option.equals("steal")){
			sortvalue = vo.getSteal();
		}else if(option.equals("blockField")){
			sortvalue = vo.getBlockField();
		}else if(option.equals("block")){
			sortvalue = vo.getBlock();
		}else if(option.equals("turnoverField")){
			sortvalue = vo.getTurnoverField();
		}else if(option.equals("turnover")){
			sortvalue = vo.getTurnover();
		}else if(option.equals("foulField")){
			sortvalue = vo.getFoulField();
		}else if(option.equals("foul")){
			sortvalue = vo.getFoul();
		}else if(option.equals("scoreField")){
			sortvalue = vo.getScoreField();
		}else if(option.equals("score")){
			sortvalue = vo.getScore();
		}else if(option.equals("efficiency")){
			sortvalue = vo.getEfficiency();
		}else if(option.equals("efficiencyField")){
			sortvalue = vo.getEfficiencyField();
		}else if(option.equals("GmScField")){
			sortvalue = vo.getGmScField();
		}else if(option.equals("GmSc")){
			sortvalue = vo.getGmSc();
		}else if(option.equals("trueHitRate")){
			sortvalue = vo.getTrueHitRate();
		}else if(option.equals("hitEfficiency")){
			sortvalue = vo.getHitEfficiency();
		}else if(option.equals("reboundOverallRate")){
			sortvalue = vo.getReboundOverallRate();
		}else if(option.equals("offensiveReboundRate")){
			sortvalue = vo.getOffensiveReboundRate();
		}else if(option.equals("defensiveReboundRate")){
			sortvalue = vo.getDefensiveReboundRate();
		}else if(option.equals("assistanceRate")){
			sortvalue = vo.getAssistanceRate();
		}else if(option.equals("stealRate")){
			sortvalue = vo.getStealRate();
		}else if(option.equals("blockRate")){
			sortvalue = vo.getBlockRate();
		}else if(option.equals("turnOverRate")){
			sortvalue = vo.getTurnOverRate();
		}else if(option.equals("useRate")){
			sortvalue = vo.getUseRate();
		}else if(option.equals("shotNumField")){
			sortvalue = vo.getShotNumField();
		}else if(option.equals("shotNum")){
			sortvalue = vo.getShotNum();
		}else if(option.equals("threePointShotNumField")){
			sortvalue = vo.getThreePointShotNumField();
		}else if(option.equals("threePointShotNum")){
			sortvalue = vo.getThreePointShotNum();
		}else if(option.equals("freeThrowShotNumField")){
			sortvalue = vo.getFreeThrowShotNumField();
		}else if(option.equals("freeThrowShotNum")){
			sortvalue = vo.getFreeThrowShotNum();
		}else if(option.equals("twoTenNum")){
			sortvalue = vo.getTwoTenNum();
		}
	}
	public PlayerCardVo(PlayerVo vo,String option)
	{
		this.name=vo.getName();
		this.number = vo.getNumber();
		this.position = vo.getPosition();
		this.height = vo.getHeight();
		this.weight = vo.getWeight();
		this.age =vo.getAge();
		this.birth = vo.getBirth();
		this.exp = vo.getExp();
		this.school = vo.getSchool();
		this.ActionImgPath =vo.getActionImgPath();
		this.PortraitImgPath = vo.getPortraitImgPath();
		this.sortProgress = 0;
		this.sortOption = option;
		this.Team=vo.getTeam();
		if(option.equals("time")){
			sortvalue = vo.getTime();
		}else if(option.equals("scoreFieldProgress")){
			sortvalue = vo.getFreeThrowShotNumField();
		}else if(option.equals("reboundOverallFieldProgress")){
			sortvalue = vo.getFreeThrowShotNum();
		}else if(option.equals("assistanceFieldProgress")){
			sortvalue = vo.getTwoTenNum();
		}else if(option.equals("timeField")){
			sortvalue = vo.getTimeField();
		}else if(option.equals("FirstOnNum")){
			sortvalue = vo.getFirstOnNum();
		}else if(option.equals("gameNum")){
			sortvalue = vo.getGameNum();
		}else if(option.equals("reboundOverall")){
			sortvalue = vo.getReboundOverall();
		}else if(option.equals("reboundOverallField")){
			sortvalue = vo.getReboundOverallField();
		}else if(option.equals("assistance")){
			sortvalue = vo.getAssistance();
		}else if(option.equals("assistanceField")){
			sortvalue = vo.getAssistanceField();
		}else if(option.equals("hitRate")){
			sortvalue = vo.getHitRate();
		}else if(option.equals("threePointHitRate")){
			sortvalue = vo.getThreePointHitRate();
		}else if(option.equals("freeThrowRate")){
			sortvalue = vo.getFreeThrowRate();
		}else if(option.equals("attackingNumField")){
			sortvalue = vo.getAttackingNumField();
		}else if(option.equals("attackingNum")){
			sortvalue = vo.getAttackingNum();
		}else if(option.equals("defensiveNumField")){
			sortvalue = vo.getDefensiveNumField();
		}else if(option.equals("defensiveNum")){
			sortvalue = vo.getDefensiveNum();
		}else if(option.equals("stealField")){
			sortvalue = vo.getStealField();
		}else if(option.equals("steal")){
			sortvalue = vo.getSteal();
		}else if(option.equals("blockField")){
			sortvalue = vo.getBlockField();
		}else if(option.equals("block")){
			sortvalue = vo.getBlock();
		}else if(option.equals("turnoverField")){
			sortvalue = vo.getTurnoverField();
		}else if(option.equals("turnover")){
			sortvalue = vo.getTurnover();
		}else if(option.equals("foulField")){
			sortvalue = vo.getFoulField();
		}else if(option.equals("foul")){
			sortvalue = vo.getFoul();
		}else if(option.equals("scoreField")){
			sortvalue = vo.getScoreField();
		}else if(option.equals("score")){
			sortvalue = vo.getScore();
		}else if(option.equals("efficiency")){
			sortvalue = vo.getEfficiency();
		}else if(option.equals("efficiencyField")){
			sortvalue = vo.getEfficiencyField();
		}else if(option.equals("GmScField")){
			sortvalue = vo.getGmScField();
		}else if(option.equals("GmSc")){
			sortvalue = vo.getGmSc();
		}else if(option.equals("trueHitRate")){
			sortvalue = vo.getTrueHitRate();
		}else if(option.equals("hitEfficiency")){
			sortvalue = vo.getHitEfficiency();
		}else if(option.equals("reboundOverallRate")){
			sortvalue = vo.getReboundOverallRate();
		}else if(option.equals("offensiveReboundRate")){
			sortvalue = vo.getOffensiveReboundRate();
		}else if(option.equals("defensiveReboundRate")){
			sortvalue = vo.getDefensiveReboundRate();
		}else if(option.equals("assistanceRate")){
			sortvalue = vo.getAssistanceRate();
		}else if(option.equals("stealRate")){
			sortvalue = vo.getStealRate();
		}else if(option.equals("blockRate")){
			sortvalue = vo.getBlockRate();
		}else if(option.equals("turnOverRate")){
			sortvalue = vo.getTurnOverRate();
		}else if(option.equals("useRate")){
			sortvalue = vo.getUseRate();
		}else if(option.equals("shotNumField")){
			sortvalue = vo.getShotNumField();
		}else if(option.equals("shotNum")){
			sortvalue = vo.getShotNum();
		}else if(option.equals("threePointShotNumField")){
			sortvalue = vo.getThreePointShotNumField();
		}else if(option.equals("threePointShotNum")){
			sortvalue = vo.getThreePointShotNum();
		}else if(option.equals("freeThrowShotNumField")){
			sortvalue = vo.getFreeThrowShotNumField();
		}else if(option.equals("freeThrowShotNum")){
			sortvalue = vo.getFreeThrowShotNum();
		}else if(option.equals("twoTenNum")){
			sortvalue = vo.getTwoTenNum();
		}
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
	public String getActionImgPath() {
		return ActionImgPath;
	}
	public void setActionImgPath(String actionImgPath) {
		ActionImgPath = actionImgPath;
	}
	public String getPortraitImgPath() {
		return PortraitImgPath;
	}
	public void setPortraitImgPath(String portraitImgPath) {
		PortraitImgPath = portraitImgPath;
	}
	public String getSortOption() {
		return sortOption;
	}
	public void setSortOption(String sortOption) {
		this.sortOption = sortOption;
	}
	public double getSortvalue() {
		return sortvalue;
	}
	public void setSortvalue(double sortvalue) {
		this.sortvalue = sortvalue;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return Team;
	}
	public void setTeam(String team) {
		Team = team;
	}
	public double getSortProgress() {
		return sortProgress;
	}
	public void setSortProgress(double sortProgress) {
		this.sortProgress = sortProgress;
	}
}
