package Pokemon;

import attacks.MockWaterType;

public class WaterAttackFacade
{
	private MockWaterType mwt;
	
	public WaterAttackFacade()
	{
		mwt = new MockWaterType();
	}
	
	public void lowAttack(Pokemon p)
	{
		mwt.attackLow(p);
	}
	
	public void medAttack(Pokemon p)
	{
		mwt.attackMed(p);
	}
	
	public void fullAttack(Pokemon p)
	{
		mwt.attackFull(p);
	}
}
