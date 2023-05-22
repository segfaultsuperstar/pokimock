package Potions;

import Pokemon.Pokemon;

public class HealthPotion implements Potions
{

	@Override
	public void createPotion(Pokemon p)
	{
		int newHP = 0;
		if (p.getHP() < p.getMaxLifePoints())
		{
			newHP = p.getHP() + 25;
			{
				if (newHP > p.getMaxLifePoints())
				{
					newHP = p.getMaxLifePoints();
				}
			}
		}
		p.setHP(newHP);
	}

}
