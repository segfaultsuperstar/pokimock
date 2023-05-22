package attacks;

/**
 *	Will adjust the attack power of a Pokemon according to the type of Pokemon
 */
public abstract class AttackTypes extends AttackPower
{
	protected AttackPower modifiedAttack;
	
	/**
	 * @param mod
	 */
	public AttackTypes(AttackPower mod)
	{
		modifiedAttack = mod;
	}
}
