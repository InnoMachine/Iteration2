package vo;

import java.math.BigDecimal;

public class TotalInfo {
	BigDecimal b;
	private int score;
	private int rebound;
	private int assistance;
	private int three;
	private int free;
	private int gamenum;
	private int threeshot;
	private int freeshot;
	private int time;
	private int hit;
	private int block;
	private int steal;
	private int foul;
	private int turnover;
	private double scoreField;
	private double reboundField;
	private double assistanceField;
	private double threeRate;
	private double freeRate;
	private double minute;
	private double turnoverField;
	private double stealField;
	private double blockField;
	private double foulField;
	private double hitField;
	private double gamenumField;
	public TotalInfo(){
		setBlockField(0);
		setStealField(0);
		score = 0;
		rebound =0;
		assistance=0;
		three=0;
		free=0;
		gamenum=0;
		scoreField=0;
		reboundField =0;
		assistanceField=0;
		setThreeshot(0);
		setFreeshot(0);
		setThreeRate(0);
		setFreeRate(0);
		setMinute(0);
		setHit(0);
		setTime(0);
				
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void addScore(int score){
		this.score+=score;
	}

	public int getRebound() {
		return rebound;
	}

	public void setRebound(int rebound) {
		this.rebound = rebound;
	}
	
	public void addRebound(int r){
		this.rebound+=r;
	}
	public int getAssistance() {
		return assistance;
	}

	public void setAssistance(int assistance) {
		this.assistance = assistance;
	}
	public void addGameNum(){
		this.gamenum++;
	}
	public void addAssistance(int a ){
		this.assistance+=a;
	}
	public int getThree() {
		return three;
	}

	public void setThree(int three) {
		this.three = three;
	}
	public void addThree(int t){
		this.three+=t;
	}
	public int getGamenum() {
		return gamenum;
	}

	public void setGamenum(int gamenum) {
		this.gamenum = gamenum;
	}

	public int getFree() {
		return free;
	}

	public void setFree(int free) {
		this.free = free;
	}
	public void addFree(int f){
		this.free+=f;
	}
	public double getAssistanceField() {
		return assistanceField;
	}

	public void setAssistanceField(double assistanceField) {
		this.assistanceField = assistanceField;
	}

	public void calcAssistanceField(){
		b = new BigDecimal(this.assistance/this.gamenum);
		this.assistanceField  = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(); 
	}

	

	public double getReboundField() {
		return reboundField;
	}

	public void setReboundField(double reboundField) {
		this.reboundField = reboundField;
	}

	public void calcReboundField(){
		b = new BigDecimal(this.rebound/this.gamenum);
		this.reboundField  = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(); 
		
	}
	public double getScoreField() {
		return scoreField;
	}

	public void setScoreField(double scoreField) {
		this.scoreField = scoreField;
	}
	
	public void calcScoreField(){
		b = new BigDecimal(this.score/this.gamenum);
		this.scoreField  = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(); 
	}

	public int getThreeshot() {
		return threeshot;
	}

	public void setThreeshot(int threeshot) {
		this.threeshot = threeshot;
	}
	public void addThreeshot(int t){
		this.threeshot+=t;
	}
	public int getFreeshot() {
		return freeshot;
	}

	public void setFreeshot(int freeshot) {
		this.freeshot = freeshot;
	}
	public void addFreeshot(int f){
		this.freeshot+=f;
	}
	public int getTurnover() {
		return turnover;
	}

	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}
	public void addTurnover(int t){
		this.turnover+=t;
	}
	public int getBlock() {
		return block;
	}

	public void setBlock(int block) {
		this.block = block;
	}
	public void addBlock(int b){
		this.block+=b;
	}
	public int getSteal() {
		return steal;
	}

	public void setSteal(int steal) {
		this.steal = steal;
	}
	public void addSteal(int s){
		this.steal+=s;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}
	public void addHit(int h){
		this.hit+=h;
	}
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	public void addTime(int t){
		this.time+=t;
	}

	public double getThreeRate() {
		return threeRate;
	}

	public void setThreeRate(double threeRate) {
		this.threeRate = threeRate;
	}

	public void calcThreeRate(){
		b = new BigDecimal(this.three/(double)this.freeshot);
		this.threeRate  = b.setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue(); 
	}
	public double getFreeRate() {
		return freeRate;
	}

	public void setFreeRate(double freeRate) {
		this.freeRate = freeRate;
	}
	public void calcFreeRate(){
		b = new BigDecimal(this.free/(double)this.freeshot);
		this.freeRate  = b.setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue(); 
	}

	public double getMinute() {
		return minute;
	}

	public void setMinute(double minute) {
		this.minute = minute;
	}
	public void calcMinute(){
		b = new BigDecimal(this.time/(60.0*this.gamenum));
		this.minute  = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(); 
	}
	public double getBlockField() {
		return blockField;
	}

	public void setBlockField(double blockField) {
		this.blockField = blockField;
	}

	public void calcBlockField(){
		b = new BigDecimal(this.block/(double)this.gamenum);
		this.blockField  = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(); 
	}
	public double getStealField() {
		return stealField;
	}

	public void setStealField(double stealField) {
		this.stealField = stealField;
	}
	public void calcStealField(){
		b = new BigDecimal(this.steal/(double)this.gamenum);
		this.stealField  = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(); 
	}

	public double getTurnoverField() {
		return turnoverField;
	}

	public void setTurnoverField(double turnoverField) {
		this.turnoverField = turnoverField;
	}
	public void calcTurnoverFied(){
		b = new BigDecimal(this.turnover/(double)this.gamenum);
		this.turnoverField  = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(); 	
	}

	public int getFoul() {
		return foul;
	}

	public void setFoul(int foul) {
		this.foul = foul;
	}
	public void addFoul(int f){
		this.foul+=f;
	}

	public double getFoulField() {
		return foulField;
	}

	public void setFoulField(double foulField) {
		this.foulField = foulField;
	}
	public void calcFoulField(){
		b = new BigDecimal(this.foul/(double)this.gamenum);
		this.foulField  = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(); 	
		
	}

	public double getHitField() {
		return hitField;
	}

	public void setHitField(double hitField) {
		this.hitField = hitField;
	}
	public void calcHitField(){
		b = new BigDecimal(this.hit/(double)this.gamenum);
		this.hitField  = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(); 	
	}
	public double getGamenumField() {
		return gamenumField;
	}

	public void setGamenumField(double gamenumField) {
		this.gamenumField = gamenumField;
	}
}
