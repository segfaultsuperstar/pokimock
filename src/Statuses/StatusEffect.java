package Statuses;

import Gameplay.Battlefield;
import Gameplay.RoundObserver;
import Pokemon.Pokemon;

public abstract class StatusEffect implements RoundObserver{
	protected int roundsInEffect;
	protected int roundsPassed;
	protected Pokemon target;
	protected Battlefield bfAccess = Battlefield.getBattlefield();
}