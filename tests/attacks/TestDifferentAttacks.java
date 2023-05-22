package attacks;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Test the functionality of attacks with varying levels of power
 * and with different types of Pokemon using Mock Types
 */
public class TestDifferentAttacks
{

	/**
	 * Testing for the appropriate level of damage
	 * with a fire type Pokemon
	 */
	@Test
	public void testFireTypeAttacks()
	{
		/**
		 * Testing Low Power Attacks
		 */
		MockWaterType mckW = new MockWaterType();
		MockGrassType mckG = new MockGrassType();
		MockFireType mckF = new MockFireType();
		
		//Fire - Water
		mckF.attackLow(mckW);
		assertEquals(563 , mckW.getMaxLifePoints());
		
		//Fire - Grass
		mckF.attackLow(mckG);
		assertEquals(400, mckG.getMaxLifePoints());
		
		//Fire - Fire
		MockFireType mckF2 = new MockFireType();
		mckF.attackLow(mckF2);
		assertEquals(425 , mckF2.getMaxLifePoints());
		
		/**
		 * Testing Medium Power Attacks
		 */
		MockWaterType mckW2 = new MockWaterType();
		MockGrassType mckG2 = new MockGrassType();
		MockFireType mckF3 = new MockFireType();
		
		mckF.attackMed(mckW2);
		assertEquals(525 , mckW2.getMaxLifePoints());
		
		mckF.attackMed(mckG2);
		assertEquals(250, mckG2.getMaxLifePoints());
		
		mckF.attackMed(mckF3);
		assertEquals(350 , mckF3.getMaxLifePoints());
		
		/**
		 * Testing Full Power Attacks
		 */
		MockWaterType mckW3 = new MockWaterType();
		MockGrassType mckG3 = new MockGrassType();
		MockFireType mckF4 = new MockFireType();
		
		mckF.attackFull(mckW3);
		assertEquals(450 , mckW3.getMaxLifePoints());
		
		mckF.attackFull(mckG3);
		assertEquals(0, mckG3.getMaxLifePoints());
		
		mckF.attackFull(mckF4);
		assertEquals(200 , mckF4.getMaxLifePoints());
		
		/**
		 * Testing Special Power Attacks
		 */
		MockWaterType mckW4 = new MockWaterType();
		MockGrassType mckG4 = new MockGrassType();
		MockFireType mckF5 = new MockFireType();
		
		mckF.attackSpecial(mckW4);
		assertEquals(300 , mckW4.getMaxLifePoints());
		
		mckF.attackSpecial(mckG4);
		assertEquals(0, mckG4.getMaxLifePoints());
		
		mckF.attackSpecial(mckF5);
		assertEquals(0 , mckF5.getMaxLifePoints());
	}
	
	/**
	 * Testing for the appropriate level of damage
	 * with a grass type Pokemon
	 */
	@Test
	public void testGrassTypeAttacks()
	{
		/**
		 * Testing Low Power Attacks
		 */
		MockWaterType mckW = new MockWaterType();
		MockGrassType mckG = new MockGrassType();
		MockFireType mckF = new MockFireType();
		
		//Grass - Water
		mckG.attackLow(mckW);
		assertEquals(526 , mckW.getMaxLifePoints());
		
		//Grass - Fire
		mckG.attackLow(mckF);
		assertEquals(482, mckF.getMaxLifePoints());
		
		//Grass - Grass
		MockGrassType mckG2 = new MockGrassType();
		mckG.attackLow(mckG2);
		assertEquals(513 , mckG2.getMaxLifePoints());
		
		/**
		 * Testing Medium Power Attacks
		 */
		MockWaterType mckW2 = new MockWaterType();
		MockGrassType mckG3 = new MockGrassType();
		MockFireType mckF2 = new MockFireType();
		
		mckG.attackMed(mckW2);
		assertEquals(450 , mckW2.getMaxLifePoints());
		
		mckG.attackMed(mckF2);
		assertEquals(463 , mckF2.getMaxLifePoints());
		
		mckG.attackMed(mckG3);
		assertEquals(475, mckG3.getMaxLifePoints());
		
		/**
		 * Testing Full Power Attacks
		 */
		MockWaterType mckW3 = new MockWaterType();
		MockGrassType mckG4 = new MockGrassType();
		MockFireType mckF3 = new MockFireType();
		
		mckG.attackFull(mckW3);
		assertEquals(300 , mckW3.getMaxLifePoints());
		
		mckG.attackFull(mckF3);
		assertEquals(425 , mckF3.getMaxLifePoints());
		
		mckG.attackFull(mckG4);
		assertEquals(475, mckG3.getMaxLifePoints());
		
		/**
		 * Testing Special Power Attacks
		 */
		MockWaterType mckW4 = new MockWaterType();
		MockGrassType mckG5 = new MockGrassType();
		MockFireType mckF4 = new MockFireType();
		
		mckG.attackSpecial(mckW4);
		assertEquals(0 , mckW4.getMaxLifePoints());
		
		mckG.attackSpecial(mckF4);
		assertEquals(350 , mckF4.getMaxLifePoints());
		
		mckG.attackSpecial(mckG5);
		assertEquals(250, mckG5.getMaxLifePoints());
	}
	
	/**
	 * Testing for the appropriate level of damage
	 * with a Water type Pokemon
	 */
	@Test
	public void testWaterTypeAttacks()
	{
		/**
		 * Testing Low Power Attacks
		 */
		MockWaterType mckW = new MockWaterType();
		MockGrassType mckG = new MockGrassType();
		MockFireType mckF = new MockFireType();
		
		//Water - Fire
		mckW.attackLow(mckF);
		assertEquals(400 , mckF.getMaxLifePoints());
		
		//Water - Grass
		mckW.attackLow(mckG);
		assertEquals(525, mckG.getMaxLifePoints());
		
		//Water - Water
		MockWaterType mckW2 = new MockWaterType();
		mckW.attackLow(mckW2);
		assertEquals(550 , mckW2.getMaxLifePoints());
		
		/**
		 * Testing Medium Power Attacks
		 */
		MockWaterType mckW3 = new MockWaterType();
		MockGrassType mckG2 = new MockGrassType();
		MockFireType mckF2 = new MockFireType();
		
		mckW.attackMed(mckF2);
		assertEquals( 300, mckF2.getMaxLifePoints());
		
		mckW.attackMed(mckG2);
		assertEquals(500, mckG2.getMaxLifePoints());
		
		mckW.attackMed(mckW3);
		assertEquals(500 , mckW3.getMaxLifePoints());
		
		/**
		 * Testing Full Power Attacks
		 */
		MockWaterType mckW4 = new MockWaterType();
		MockGrassType mckG3 = new MockGrassType();
		MockFireType mckF3 = new MockFireType();
		
		mckW.attackFull(mckF3);
		assertEquals(100 , mckF3.getMaxLifePoints());
		
		mckW.attackFull(mckG3);
		assertEquals(450, mckG3.getMaxLifePoints());
		
		mckW.attackFull(mckW4);
		assertEquals(400 , mckW4.getMaxLifePoints());
		
		/**
		 * Testing Special Power Attacks
		 */
		MockWaterType mckW5 = new MockWaterType();
		MockGrassType mckG4 = new MockGrassType();
		MockFireType mckF4 = new MockFireType();
		
		mckW.attackSpecial(mckF4);
		assertEquals(0 , mckF4.getMaxLifePoints());
		
		mckW.attackSpecial(mckG4);
		assertEquals(350, mckG4.getMaxLifePoints());
		
		mckW.attackSpecial(mckW5);
		assertEquals(200 , mckW5.getMaxLifePoints());
	}

}
