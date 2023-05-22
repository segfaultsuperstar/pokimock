package GUITests;

import static org.junit.Assert.*;

import org.junit.Test;

import GUIFactory.*;
import Pokemon.*;


public class GUITests {

	@Test
	public void test()
	{
		GUIObserver obs = new ConcreteGUIObserver();
		SelectGUI g = new SelectGUI(obs);
		g.squirtleButton.doClick();
		g.blastoiseButton.doClick();
		g.finishSelection.doClick();
		assertNotEquals(null, g.playerActive);
		assertNotEquals(null, g.player[0]);
		g.game.switcher.pkm2.doClick();
		assertEquals(obs.getPlayerPokemon(), g.player[1]);
		
		
		
	}

}
