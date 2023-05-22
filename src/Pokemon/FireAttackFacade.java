package Pokemon;

import attacks.MockFireType;

public class FireAttackFacade
{
	private MockFireType mft;
	
	public FireAttackFacade()
	{
		mft = new MockFireType();
	}
	
	public void lowAttack(Pokemon p)
	{
		mft.attackLow(p);
	}
	
	public void medAttack(Pokemon p)
	{
		mft.attackMed(p);
	}
	
	public void fullAttack(Pokemon p)
	{
		mft.attackFull(p);
	}
}
