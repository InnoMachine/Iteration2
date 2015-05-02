package businessLogic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Data_HandlerTest {
	Data_Handler dh;
	@Before
	public void setUp() throws Exception {
		dh = Data_Handler.getInstance();
	}

	@Test
	public void testGetPlayers() {
		assertTrue(dh.getPlayers()!=null);
	}

	@Test
	public void testGetTeams() {
		assertTrue(dh.getTeams()!=null);
	}

}
