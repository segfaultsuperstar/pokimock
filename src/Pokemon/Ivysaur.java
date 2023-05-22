package Pokemon;

import States.State;

public class Ivysaur extends Pokemon
{
	private String name;
	private int hitPoints;
	private int typeNum = 2;
	protected String type = "Grass";
	protected GrassAttackFacade gaf;

	public Ivysaur()
	{
		this.name = "Ivysaur";
		this.hitPoints = 100;
		gaf = new GrassAttackFacade();
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
		return 100;
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
		gaf.lowAttack(pok);
	}

	
	public void attackMed(Pokemon pok)
	{
		gaf.medAttack(pok);
	}

	
	public void attackFull(Pokemon pok)
	{
		gaf.fullAttack(pok);
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
