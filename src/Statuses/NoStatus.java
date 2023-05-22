package Statuses;

import Pokemon.Pokemon;

public class NoStatus extends StatusEffect{

	public NoStatus(Pokemon targetPokemon)
	{
		roundsInEffect = 5;
		roundsPassed = 0;
		target = targetPokemon;
		bfAccess.gameC.AddRoundObserver(this);
	}

	public void update(int round) {

	}

}
