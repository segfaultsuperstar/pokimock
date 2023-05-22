package attacks;

import Pokemon.*;

/**
 *	A Special Attack will do damage equivalent to double the Pokemon's HitPoints
 */
public class SpecialAttack extends AttackPower
{
	private SuperAttack supr;
	
	public SpecialAttack(Pokemon pk)
	{
		setPokemon(pk);
	    damage = pokmn.getHP() * 2;
	}
	
	@Override
	public int specialAttack(Pokemon pkmn)
	{
		return damage;
	}
}
