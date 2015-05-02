/**
 * puppy
 * Apr 8, 2015 4:23:06 PM
 * TODO
 */
package po;

public class GameDate implements Comparable<Object> {
	
	private int year;
	private int month;
	private int day;
	
	public GameDate() {//default current date
		this.year = 2000;
		this.month = 1;
		this.day = 1;
	}
	
	public GameDate(int year, int month, int day) {//default current date
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public GameDate(String date) {
		String[] splited = date.split("-");
		this.year = Integer.parseInt(splited[0]);
		this.month = Integer.parseInt(splited[1]);
		this.day = Integer.parseInt(splited[2]);
	}
	
	public static String appendYear(String season, String originalDate) {//season = "13-14"; originalDate = "01-01"
		String year = season.split("-")[0];//13
		String month = originalDate.split("-")[0];//01
		if(Integer.parseInt(month) <= 9 ) {
			year = (Integer.parseInt(year) + 1) + "";
		}
		String result = "20" + year + "-" + originalDate; 
		return result;
	}
	
	public String toString() {
		
		String monthString = "";
		String dayString = "";
		if(month < 10) {
			monthString = "0" + this.month;
		}else{
			monthString = "" + this.month;
		}
		if(day < 10) {
			dayString = "0" + this.day;
		}else{
			dayString = "" + this.day;
		}
		return this.year + "-" + monthString + "-" + dayString;
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public int compareTo(Object o) {
		
		GameDate obj = (GameDate) o;
		if(this.year > obj.getYear()) {
			return 1;
		}else if(this.year < obj.getYear()) { 
			return -1;
		}else if(this.year == obj.getYear()) {
			if(this.month > obj.getMonth()) {
				return 1;
			}else if(this.month < obj.getMonth()) { 
				return -1;
			}else if(this.month == obj.getMonth()) {
				if(this.day > obj.getDay()) {
					return 1;
				}else if(this.day < obj.getDay()) { 
					return -1;
				}else if(this.day == obj.getDay()) {
					return 0;
				}
			}
		}
		return 0;
		
	}
	
	public static int compare(GameDate gd0, GameDate gd1) {
		return gd0.compareTo(gd1);
	}
	
	
}
