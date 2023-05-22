package attacks;

import Pokemon.Pokemon;

/**
 *	A Full Attack will do damage equivalent to the Pokemon's HitPoints
 */
public class FullAttack extends AttackPower
{
	/**
	 * @param pk
	 */
	public FullAttack(Pokemon pk)
	{
		setPokemon(pk);
		damage = (int)(pokmn.getHP());
	}
	
	@Override
	public int fullAttack(Pokemon pkmn)
	{
		return damage;
	}
}
