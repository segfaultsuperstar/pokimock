package Pokemon;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestPokemon
{

	/**
	 * Test that all Pokemon have correct initialization
	 */
	@Test
	public void testPokemonInitializationAndAttack()
	{
		//create all Pokemon
		Pokemon Blastoise = new Blastoise();
		Pokemon Bulbasaur = new Bulbasaur();
		Pokemon Caterpie = new Caterpie();
		Pokemon Charmander = new Charmander();
		Pokemon Charmelean = new Charmelean();
		Pokemon Charzard = new Charzard();
		Pokemon Ivysaur = new Ivysaur();
		Pokemon Poliwag = new Poliwag();
		Pokemon Squirtle = new Squirtle();
		Pokemon Venasaur = new Venasaur();
		Pokemon Vulpix = new Vulpix();
		Pokemon Wartortle = new Wartortle();
		
		//check all hitpoints are correct
		assertEquals(200, Blastoise.getHP());
		assertEquals(50, Bulbasaur.getHP());
		assertEquals(75, Caterpie.getHP());
		assertEquals(50, Charmander.getHP());
		assertEquals(100, Charmelean.getHP());
		assertEquals(200, Charzard.getHP());
		assertEquals(100, Ivysaur.getHP());
		assertEquals(75, Poliwag.getHP());
		assertEquals(50, Squirtle.getHP());
		assertEquals(200, Venasaur.getHP());
		assertEquals(75, Vulpix.getHP());
		assertEquals(100, Wartortle.getHP());
		
		//check all max hitpoints
		assertEquals(200, Blastoise.getMaxLifePoints());
		assertEquals(50, Bulbasaur.getMaxLifePoints());
		assertEquals(75, Caterpie.getMaxLifePoints());
		assertEquals(50, Charmander.getMaxLifePoints());
		assertEquals(100, Charmelean.getMaxLifePoints());
		assertEquals(200, Charzard.getMaxLifePoints());
		assertEquals(100, Ivysaur.getMaxLifePoints());
		assertEquals(75, Poliwag.getMaxLifePoints());
		assertEquals(50, Squirtle.getMaxLifePoints());
		assertEquals(200, Venasaur.getMaxLifePoints());
		assertEquals(75, Vulpix.getMaxLifePoints());
		assertEquals(100, Wartortle.getMaxLifePoints());
		
		//check all types are correct
		assertEquals(3, Blastoise.getTypeNum());
		assertEquals(1, Bulbasaur.getTypeNum());
		assertEquals(1, Caterpie.getTypeNum());
		assertEquals(1, Charmander.getTypeNum());
		assertEquals(2, Charmelean.getTypeNum());
		assertEquals(3, Charzard.getTypeNum());
		assertEquals(2, Ivysaur.getTypeNum());
		assertEquals(1, Poliwag.getTypeNum());
		assertEquals(1, Squirtle.getTypeNum());
		assertEquals(3, Venasaur.getTypeNum());
		assertEquals(1, Vulpix.getTypeNum());
		assertEquals(2, Wartortle.getTypeNum());
		
		//check all names
		assertEquals("Blastoise", Blastoise.getName());
		assertEquals("Bulbasaur", Bulbasaur.getName());
		assertEquals("Caterpie", Caterpie.getName());
		assertEquals("Charmander", Charmander.getName());
		assertEquals("Charmelean", Charmelean.getName());
		assertEquals("Charzard", Charzard.getName());
		assertEquals("Ivysaur", Ivysaur.getName());
		assertEquals("Poliwag", Poliwag.getName());
		assertEquals("Squirtle", Squirtle.getName());
		assertEquals("Venasaur", Venasaur.getName());
		assertEquals("Vulpix", Vulpix.getName());
		assertEquals("Wartortle", Wartortle.getName());
		
		//check all types
		assertEquals("Water", Blastoise.getType());
		assertEquals("Grass", Bulbasaur.getType());
		assertEquals("Grass", Caterpie.getType());
		assertEquals("Fire", Charmander.getType());
		assertEquals("Fire", Charmelean.getType());
		assertEquals("Fire", Charzard.getType());
		assertEquals("Grass", Ivysaur.getType());
		assertEquals("Water", Poliwag.getType());
		assertEquals("Water", Squirtle.getType());
		assertEquals("Grass", Venasaur.getType());
		assertEquals("Fire", Vulpix.getType());
		assertEquals("Water", Wartortle.getType());
		
		//lets start hitting each other...
		//Fire hits water
		Charzard.attackLow(Wartortle);
		assertEquals(63, Wartortle.getHP());
		Charzard.attackMed(Wartortle);
		assertEquals(0, Wartortle.getHP());
		Wartortle.setHP(100);
		assertEquals(100, Wartortle.getHP());
		Charzard.attackFull(Wartortle);
		assertEquals(0, Wartortle.getHP());
		
		//Water hits fire
		Wartortle.setHP(100);
		Wartortle.attackFull(Charzard);
		assertEquals(100, Charzard.getHP());
		Wartortle.attackLow(Charzard);
		assertEquals(75, Charzard.getHP());
		Wartortle.attackMed(Charzard);
		assertEquals(25, Charzard.getHP());
		
		//Grass hits water
		Venasaur.attackLow(Blastoise);
		assertEquals(126, Blastoise.getHP());
		Blastoise.setHP(200);
		Venasaur.attackMed(Blastoise);
		assertEquals(50, Blastoise.getHP());
		
		//Water hits grass
		Blastoise.attackLow(Venasaur);
		assertEquals(100, Venasaur.getHP());
		
		//Fire hits grass
		Venasaur.setHP(200);
		Charzard.attackLow(Venasaur);
		assertEquals(50, Venasaur.getHP());
		
		//Grass hits fire
		Charzard.setHP(200);
		Venasaur.attackFull(Charzard);
		assertEquals(125, Charzard.getHP());
	}

}
