package attacks;

import Pokemon.Pokemon;

/**
 * Adjusts attack power for a grass type Pokemon
 */
public class GrassAttack extends AttackTypes
{
	/**
	 * 
	 * @param aPower the power of an attack to be adjusted(decorated) 
	 */
	public GrassAttack(AttackPower aPower)
	{
		super(aPower);
	}

	/**
	 * All three types of AttackPowers for a Grass Attack will do the same thing:
	 * cut the power of the attack in half if attacking a Fire Type Pokemon
	 * don't adjust the power of the attack if attacking a Grass Type Pokemon
	 * double the power of the attack if attacking a Water Type Pokemon
	 */
	@Override
	public int lowAttack(Pokemon pkmn)
	{
		if(pkmn.getType().equalsIgnoreCase("fire") == true)
		{
			damage = (int)(modifiedAttack.damage / 2);
		}
		if(pkmn.getType().equalsIgnoreCase("grass") == true)
		{
			damage = (int)(modifiedAttack.damage);
		}

		if(pkmn.getType().equalsIgnoreCase("water") == true)
		{
			damage = (int)(modifiedAttack.damage * 2);
		}
		
		return damage;
	}
	
	@Override
	public int medAttack(Pokemon pkmn)
	{
		if(pkmn.getType().equalsIgnoreCase("fire") == true)
		{
			damage = (int)(modifiedAttack.damage / 2);
		}
		if(pkmn.getType().equalsIgnoreCase("grass") == true)
		{
			damage = (int)(modifiedAttack.damage);
		}

		if(pkmn.getType().equalsIgnoreCase("water") == true)
		{
			damage = (int)(modifiedAttack.damage * 2);
		}
		
		return damage;
	}
	
	@Override
	public int fullAttack(Pokemon pkmn)
	{
		if(pkmn.getType().equalsIgnoreCase("fire") == true)
		{
			damage = (int)(modifiedAttack.damage / 2);
		}
		if(pkmn.getType().equalsIgnoreCase("grass") == true)
		{
			damage = (int)(modifiedAttack.damage);
		}

		if(pkmn.getType().equalsIgnoreCase("water") == true)
		{
			damage = (int)(modifiedAttack.damage * 2);
		}
		
		return damage;
	}
	
	@Override
	public int specialAttack(Pokemon pkmn)
	{
		if(pkmn.getType().equalsIgnoreCase("fire") == true)
		{
			damage = (int)(modifiedAttack.damage / 2);
		}
		if(pkmn.getType().equalsIgnoreCase("grass") == true)
		{
			damage = (int)(modifiedAttack.damage);
		}

		if(pkmn.getType().equalsIgnoreCase("water") == true)
		{
			damage = (int)(modifiedAttack.damage * 2);
		}
		
		return damage;
	}
}
