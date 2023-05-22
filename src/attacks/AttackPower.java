package attacks;

import Pokemon.*;

/**
 * Different levels of attacks with varying damage from 
 * low, to med, to full, to special
 */
public abstract class AttackPower
{
	protected int damage;
	/**
	 * 
	 */
	public Pokemon pokmn;
	
	/**
	 * @param pkmn the target
	 * @return low attack dammage
	 */
	public int lowAttack(Pokemon pkmn)
	{
		return damage;
	}
	
	/**
	 * @param pkmn the target
	 * @return medium attack dammage
	 */
	public int medAttack(Pokemon pkmn)
	{
		return damage;
	}
	
	/**
	 * @param pkmn the target
	 * @return full attack dammage
	 */
	public int fullAttack(Pokemon pkmn)
	{
		return damage;
	}
	
	/**
	 * 
	 * @return the amount of damage
	 */
	public int getDamage()
	{
		return damage;
	}
	
	/**
	 * works as a placeholder for an active Pokemon that
	 * is going to attack
	 * @param pk the pokemon that is going to attack
	 */
	public void setPokemon(Pokemon pk)
	{
		pokmn = pk;
	}
	
	/**
	 * @param pkmn the target
	 * @return special attack dammage
	 */
	public int specialAttack(Pokemon pkmn)
	{
		return damage;
	}
	
}
