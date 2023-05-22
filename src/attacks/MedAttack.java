package attacks;

import Pokemon.Pokemon;

/**
 *	A Medium Attack will do damage equivalent to 1/2 the Pokemon's HitPoints
 */
public class MedAttack extends AttackPower
{	
	/**
	 * @param pk
	 */
	public MedAttack(Pokemon pk)
	{
		setPokemon(pk);
		damage = (int)(pokmn.getHP() / 2);
	}
	
	@Override
	public int medAttack(Pokemon pkmn)
	{
		return damage;
	}
}
