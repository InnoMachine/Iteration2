package functionTest;

import de.tototec.cmdoption.CmdCommand;
import de.tototec.cmdoption.CmdOption;


@CmdCommand(names={"-player","-p"},description="Show Player information")
public class PlayerCommand{

	@CmdOption(names={"-season"},description="Show Season Player King",maxCount=1
			,minCount=0,requires={"-king"},conflictsWith={"-daily"})
	public void setSeasonPlayerKing(){
		
	}
	
}
