package Potions;

import static org.junit.Assert.*;

import org.junit.Test;

import Pokemon.Blastoise;
import Pokemon.Pokemon;

public class TestPotions
{

	@Test
	public void testHealthPotion()
	{
		Pokemon Blastoise = new Blastoise();
		UsePotion healthP = new UsePotion(new HealthPotion());
		Blastoise.setHP(100);
		assertEquals(100, Blastoise.getHP());
		
		healthP.usePotion(Blastoise);
		assertEquals(125, Blastoise.getHP());
		
		Blastoise.setHP(190);
		healthP.usePotion(Blastoise);
		assertEquals(200, Blastoise.getHP());
	}
	
	

}
