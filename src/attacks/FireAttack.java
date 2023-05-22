package attacks;

import Pokemon.Pokemon;

/**
 * Adjusts attack power for a fire type Pokemon
 */
public class FireAttack extends AttackTypes
{
	
	/**
	 * @param aPower
	 */
	public FireAttack(AttackPower aPower)
	{
		super(aPower);
	}
	
	/**
	 * All three types of AttackPowers for a Water Attack will do the same thing:
	 * cut the power of the attack in half if attacking a Water Type Pokemon
	 * don't adjust the power of the attack if attacking a Fire Type Pokemon
	 * double the power of the attack if attacking a Grass Type Pokemon
	 */

	@Override
	public int lowAttack(Pokemon pkmn)
	{	
		if(pkmn.getType().equalsIgnoreCase("water") == true)
		{
			damage = (int)(modifiedAttack.damage / 2) ;
		}
		if(pkmn.getType().equalsIgnoreCase("fire") == true)
		{
			damage =  (int)(modifiedAttack.damage);
		}

		if(pkmn.getType().equalsIgnoreCase("grass") == true)
		{
			damage = (int) (modifiedAttack.damage * 2);
		
		}
		
		return damage;
	}
	
	@Override
	public int medAttack(Pokemon pkmn)
	{
		if(pkmn.getType().equalsIgnoreCase("water") == true)
		{
			damage = (int)(modifiedAttack.damage / 2) ;
		}
		if(pkmn.getType().equalsIgnoreCase("fire") == true)
		{
			damage =  (int)(modifiedAttack.damage);
		}

		if(pkmn.getType().equalsIgnoreCase("grass") == true)
		{
			damage = (int) (modifiedAttack.damage * 2);
		
		}
		
		return damage;
	}
	
	@Override
	public int fullAttack(Pokemon pkmn)
	{
		if(pkmn.getType().equalsIgnoreCase("water") == true)
		{
			damage = (int)(modifiedAttack.damage / 2) ;
		}
		if(pkmn.getType().equalsIgnoreCase("fire") == true)
		{
			damage =  (int)(modifiedAttack.damage);
		}

		if(pkmn.getType().equalsIgnoreCase("grass") == true)
		{
			damage = (int) (modifiedAttack.damage * 2);
		
		}
		
		return damage;
	}
	
	@Override
	public int specialAttack(Pokemon pkmn)
	{	
		if(pkmn.getType().equalsIgnoreCase("water") == true)
		{
			damage = (int)(modifiedAttack.damage / 2) ;
		}
		if(pkmn.getType().equalsIgnoreCase("fire") == true)
		{
			damage =  (int)(modifiedAttack.damage);
		}

		if(pkmn.getType().equalsIgnoreCase("grass") == true)
		{
			damage = (int) (modifiedAttack.damage * 2);
		
		}
		return damage;
	}
}
