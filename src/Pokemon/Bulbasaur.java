package Pokemon;

import States.State;

public class Bulbasaur extends Pokemon
{
	private String name;
	private int hitPoints;
	private int typeNum = 1;
	protected String type = "Grass";
	protected GrassAttackFacade gaf;

	public Bulbasaur()
	{
		this.name = "Bulbasaur";
		this.hitPoints = 50;
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
		return 50;
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
