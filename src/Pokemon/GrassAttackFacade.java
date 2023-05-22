package Pokemon;

import attacks.MockGrassType;

public class GrassAttackFacade
{
private MockGrassType mgt;
	
	public GrassAttackFacade()
	{
		mgt = new MockGrassType();
	}
	
	public void lowAttack(Pokemon p)
	{
		mgt.attackLow(p);
	}
	
	public void medAttack(Pokemon p)
	{
		mgt.attackMed(p);
	}
	
	public void fullAttack(Pokemon p)
	{
		mgt.attackFull(p);
	}
}
