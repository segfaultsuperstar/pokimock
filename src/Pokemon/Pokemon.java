package Pokemon;

import Gameplay.Battlefield;
import Gameplay.RoundObserver;
import States.State;
import Statuses.*;

public abstract class Pokemon
{
	private StatusEffect currentStatus;
	public StatusEffect noStatus = new NoStatus(this);
	public StatusEffect paralyzed = new Paralysis(this);
	public StatusEffect poisoned = new Poison(this);
	public StatusEffect asleep = new Sleep(this);
	public Battlefield bfAccessor;

	public Pokemon()
	{
		currentStatus = noStatus;
		bfAccessor = Battlefield.getBattlefield();
	}

	public abstract int getHP();
	public abstract int getTypeNum();
	public abstract void takeHit(int damage);
	public abstract String getName();
	public abstract int getMaxLifePoints();
	public abstract String getType();
	public abstract void setHP(int HP);
	public abstract void attackLow(Pokemon pok);
	public abstract void attackMed(Pokemon pok);
	public abstract void attackFull(Pokemon pok);
	public abstract void setCurrentState(State state);
	public abstract State getCurrentState();

	public boolean canHit()
	{
		if(currentStatus == asleep)
		{
			return false;
		} else if (currentStatus == paralyzed){
			double hitChance = Math.random();
			if(hitChance < .5)
			{
				return true;
			}
			else
			{
				return false;
			}
		} else {
			return true;
		}
	}

	public void setCurrentStatus(StatusEffect status)
	{
		currentStatus = status;
	}

	public StatusEffect getStatusEffect()
	{
		return currentStatus;
	}
}
