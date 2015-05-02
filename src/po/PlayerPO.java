/**
 * puppy
 * 2015年3月8日 下午3:00:54
 * TODO
 */
package po;

import java.util.ArrayList;

public class PlayerPO {
	
	private String name;
	private String number;//data type updated
	private String position;
	private String height;
	private String weight;
	private String birth;
	private int age;//
	private int exp;//
	private String school;
	private String ActionImgPath;
	private String PortraitImgPath;
	
	private String currentTeam;//
	
	private ArrayList<SinglePerformance> seasonSinglePerformance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public ArrayList<SinglePerformance> getSeasonSinglePerformance() {
		return seasonSinglePerformance;
	}
	public void setSeasonSinglePerformance(ArrayList<SinglePerformance> seasonSinglePerformance) {
		this.seasonSinglePerformance = seasonSinglePerformance;
	}
	public String getCurrentTeam() {
		return currentTeam;
	}
	public void setCurrentTeam(String currentTeam) {
		this.currentTeam = currentTeam;
	}
	
}
