package functionTest;

import java.util.ArrayList;

import test.data.PlayerHotInfo;
import test.data.PlayerNormalInfo;

public class test {
	
	
	public static void main(String args[]){
		ArrayList<PlayerHotInfo> ob = new ArrayList<PlayerHotInfo>();
		PlayerHotInfo p1 = new PlayerHotInfo();
		p1.setField("score");
		p1.setName("张康");
		p1.setPosition("G");
		p1.setTeamName("AKL");
		p1.setUpgradeRate(0.342);
		p1.setValue(20);
		PlayerHotInfo p2 = new PlayerHotInfo();
		p2.setField("score");
		p2.setName("王芊语");
		p2.setPosition("G");
		p2.setTeamName("JSP");
		p2.setUpgradeRate(0.122);
		p2.setValue(30);
		ob.add(p1);
		ob.add(p2);
		for(int i =0;i<ob.size();i++){
			System.out.print(i+1+"");
			System.out.print(ob.get(i).toString());
		}
		
	}
}
