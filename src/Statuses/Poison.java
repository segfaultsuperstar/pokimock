package Statuses;

import Pokemon.Pokemon;

public class Poison extends StatusEffect{

	public Poison(Pokemon targetPokemon)
	{
		roundsInEffect = 5;
		roundsPassed = 0;
		target = targetPokemon;
		bfAccess.gameC.AddRoundObserver(this);
	}

	public void update(int round) {
		if(roundsPassed <= roundsInEffect)
		{
			target.setHP(target.getHP() - (int)Math.ceil(target.getHP() * .1));
			roundsPassed++;
		} else {
			target.setCurrentStatus(target.noStatus);
			roundsPassed = 0;
		}
	}

}
