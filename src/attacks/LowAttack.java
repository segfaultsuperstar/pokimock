package attacks;

import Pokemon.*;

/**
 *	A Low Attack will do damage equivalent to 1/4 the Pokemon's HitPoints
 */
public class LowAttack extends AttackPower
{
	/**
	 * @param pk
	 */
	public LowAttack(Pokemon pk)
	{
		setPokemon(pk);
		damage = (int)(pokmn.getHP() / 4);
	}
	@Override
	public int lowAttack(Pokemon pkmn)
	{
		return damage;
	}
}
