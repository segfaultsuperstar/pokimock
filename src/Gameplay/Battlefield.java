package Gameplay;

import Pokemon.Pokemon;

public class Battlefield {
	private Pokemon pokemon1;
	private Pokemon pokemon2;
	private static Battlefield uniqueBattlefield;
	public GameClock gameC = new GameClock();

	private Battlefield()
	{
		
	}

	public Pokemon getPokemon1() {
		return pokemon1;
	}

	public void setPokemon1(Pokemon pokemon1) {
		this.pokemon1 = pokemon1;
	}

	public Pokemon getPokemon2() {
		return pokemon2;
	}

	public void setPokemon2(Pokemon pokemon2) {
		this.pokemon2 = pokemon2;
	}

	public static Battlefield getBattlefield()
	{
		if(uniqueBattlefield == null)
		{
			uniqueBattlefield = new Battlefield();
		}
		return uniqueBattlefield;
	}
}
