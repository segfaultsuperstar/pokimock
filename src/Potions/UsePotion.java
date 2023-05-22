package Potions;

import Pokemon.Pokemon;

public class UsePotion
{
	private Potions potion;
	
	public UsePotion(Potions potion)
	{
		this.potion = potion;
	}
	
	public void usePotion(Pokemon p)
	{
		potion.createPotion(p);
	}
}
