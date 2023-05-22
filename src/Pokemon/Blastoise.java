package Pokemon;

import States.DeadState;
import States.LivingState;
import States.State;

public class Blastoise extends Pokemon
{
	private String name;
	private int hitPoints;
	private int typeNum = 3;
	protected String type = "Water";
	protected WaterAttackFacade waf;

	public Blastoise()
	{
		super();
		this.name = "Blastoise";
		this.hitPoints = 200;
		waf = new WaterAttackFacade();
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
		return 200;
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
		waf.lowAttack(pok);
	}

	public void attackMed(Pokemon pok)
	{
		waf.medAttack(pok);
	}


	public void attackFull(Pokemon pok)
	{
		waf.fullAttack(pok);
	}

	public void attackSpecial()
	{
		//something here
	}

	@Override
	public void setCurrentState(State state)
	{
		//something here
	}

	@Override
	public State getCurrentState()
	{
		return null;
	}

	@Override
	public int getHP()
	{
		return hitPoints;
	}

	@Override
	public int getTypeNum()
	{
		return typeNum;
	}
}
