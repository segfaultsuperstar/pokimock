package attacks;

import Pokemon.Pokemon;

public class SuperAttack extends SpecialAttack
{
    private boolean used = true;
    
	public SuperAttack(Pokemon pk)
	{	
		super(pk);
	}

	public int increasePower()
	{
		if(!used)
		{
			damage = pokmn.getHP() * 2;
			used = true;
		}
		else
		{	
			used = false;
		}
		
		return damage;
	}

}
