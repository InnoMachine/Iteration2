package businessLogic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Player_HandlerTest {

	

	Player_Handler player_handler;
	@Before
	public void setUp() throws Exception {
		player_handler = new Player_Handler();
	}

	@Test
	public void testGetPlayerByName() {
		assertTrue(player_handler.getPlayerByName("Aaro")==null);
		assertTrue(player_handler.getPlayerByName("Aaron Gray")!=null);
	}

	@Test
	public void testGetAllPlayer() {
		assertTrue(player_handler.getAllPlayer().size()==448);
		assertTrue(player_handler.getAllPlayer().size()!=221);
	}

	

	@Test
	public void testGetPlayersByTeam() {
		assertTrue(player_handler.getPlayersByTeam("ATL")!=null);
	}

	



	@Test
	public void testFilterPlayersBy() {
		assertTrue(player_handler.filterPlayersBy("G", "All", "All", 20)!=null);
	}

	@Test
	public void testHotPlayerDaily() {
		assertTrue(player_handler.hotPlayerDaily("score")!=null);
		assertTrue(player_handler.hotPlayerDaily("sdad")==null);
	}

	@Test
	public void testProgressFastPlayerForTest() {
		assertTrue(player_handler.progressFastPlayerForTest("score")!=null);
	}

	@Test
	public void testProgressFastPlayer() {
		assertTrue(player_handler.progressFastPlayer("score")!=null);
		assertTrue(player_handler.progressFastPlayer("ss")==null);
	}

	@Test
	public void testHotPlayerSeason() {
		assertTrue(player_handler.hotPlayerSeason("score")!=null);
		assertTrue(player_handler.hotPlayerSeason("ss")==null);
	}

	

	@Test
	public void testGetPlayerRecentPerformance() {
		assertTrue(player_handler.getPlayerRecentPerformance("Aaron Gray")!=null);
		assertTrue(player_handler.getPlayerRecentPerformance("ss")==null);
	}

	@Test
	public void testSortDailyPerformance() {
		assertTrue(player_handler.sortDailyPerformance("Aaron Gray")!=null);
		assertTrue(player_handler.sortDailyPerformance("ss")==null);
	}


}
