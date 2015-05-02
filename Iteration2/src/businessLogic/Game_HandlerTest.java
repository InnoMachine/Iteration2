package businessLogic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Game_HandlerTest {

	Game_Handler game_handler;
	@Before
	public void setUp() throws Exception {
		game_handler = new Game_Handler();
	}

	@Test
	public void testGetAllGames() {
		assertTrue(game_handler.getAllGames()!=null);
	}

	@Test
	public void testGetGameDaily() {
		assertTrue(game_handler.getGameDaily()!=null);
	}

	@Test
	public void testGetGameByDate() {
		assertTrue(game_handler.getGameByDate("2013-02-03")!=null);
	}

	@Test
	public void testGetGameByLabel() {
		assertTrue(game_handler.getGameByLabel("13-14 02-03 AVL-LAK")==null);

	}

	@Test
	public void testGetPerformance() {
		assertTrue(game_handler.getPerformance("13-14 02-03 AVL-LAK", "avl")==null);
	}

}
