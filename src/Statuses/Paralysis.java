package Statuses;

import Pokemon.Pokemon;

public class Paralysis extends StatusEffect {

	public Paralysis(Pokemon targetPokemon)
	{
		roundsInEffect = 5;
		roundsPassed = 0;
		target = targetPokemon;
		bfAccess.gameC.AddRoundObserver(this);
	}

	public void update(int round) {
		if(roundsPassed <= roundsInEffect)
		{
			roundsPassed++;
		} else {
			target.setCurrentStatus(target.noStatus);
			roundsPassed = 0;
		}
	}
}
