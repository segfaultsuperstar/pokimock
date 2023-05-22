package Statuses;

import Pokemon.Pokemon;

public class Sleep extends StatusEffect{

	public Sleep(Pokemon targetPokemon)
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
