package Pokemon;

import States.State;

public class Vulpix extends Pokemon
{
	private String name;
	private int hitPoints;
	private int typeNum = 1;
	protected String type = "Fire";
	protected FireAttackFacade faf;

	public Vulpix()
	{
		this.name = "Vulpix";
		this.hitPoints = 75;
		faf = new FireAttackFacade();
	}

	
	public int getHP()
	{
		return this.hitPoints;
	}

	
	public int getTypeNum()
	{
		return this.typeNum;
	}

	
	public void takeHit(int damage)
	{
		if(hitPoints < damage || (hitPoints - damage) < 0)
		{
			hitPoints = 0;
		}
		else
		{
			hitPoints-=damage;
		}
	}

	
	public String getName()
	{
		return this.name;
	}

	
	public int getMaxLifePoints()
	{
		return 75;
	}

	
	public String getType()
	{
		return this.type;
	}

	
	public void setHP(int HP)
	{
		if (HP <= getMaxLifePoints())
		{
			this.hitPoints = HP;
		}
	}

	
	public void attackLow(Pokemon pok)
	{
		faf.lowAttack(pok);
	}

	
	public void attackMed(Pokemon pok)
	{
		faf.medAttack(pok);
	}

	
	public void attackFull(Pokemon pok)
	{
		faf.fullAttack(pok);
	}

	
	public void setCurrentState(State state)
	{
		// TODO Auto-generated method stub

	}

	
	public State getCurrentState()
	{
		// TODO Auto-generated method stub
		return null;
	}

	
	public void attackSpecial()
	{
		// TODO Auto-generated method stub

	}
}
