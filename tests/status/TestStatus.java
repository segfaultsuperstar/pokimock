package status;

import static org.junit.Assert.*;

import org.junit.*;

import Gameplay.Battlefield;
import Pokemon.*;

/**
 *
 *
 */
public class TestStatus {

	/**
	 * this tests that the states change
	 * this is the only way to test paralysis and posion as they are triggered in the pokemon canHit method
	 */
	@Test
	public void TestStateChanges()
	{
		Pokemon b = new Blastoise();
		b.setCurrentStatus(b.noStatus);
		assertEquals(b.noStatus, b.getStatusEffect());
	}

	/**
	 * this tests that the poison state functions
	 */
	@Test
	public void testPoison()
	{
		Pokemon b = new Blastoise();
		b.setCurrentStatus(b.noStatus);
		Battlefield bf = Battlefield.getBattlefield();
		bf.gameC.RoundChange();
		assertEquals(180, b.getHP());
	}
}
