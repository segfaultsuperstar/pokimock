package attacks;
import Pokemon.*;

import States.State;

/**
 * A mock implementation of a Fire Type Pokemon
 * so we can test a  for functionality that will
 * be constant across all real Fire Type Pokemon
 */
public class MockFireType extends Pokemon 
{
	private String name = "MockFireType";
	private int hitPoints = 300;
	private int typeNum = 3;
	protected String type = "Fire";
	private int lifePoints = 500;
	
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

	@Override
	public void takeHit(int damage)
	{
		if(lifePoints < damage || (lifePoints - damage) < 0)
		{
			lifePoints = 0;
		}		
		else
		{
			lifePoints-=damage;
		}
		
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public int getMaxLifePoints()
	{
		return lifePoints;
	}

	@Override
	public String getType()
	{
		return type;
	}
	
	/**
	 * All four levels of attacks will
	 * instantiate an attack Power 
	 * then decorate it with a Fire Attack 
	 */
	public void attackLow(Pokemon pok)
	{
		FireAttack f = new FireAttack(new LowAttack(this));
		pok.takeHit(f.lowAttack(pok));
	}
	
	public void attackMed(Pokemon pok)
	{
		FireAttack f = new FireAttack(new MedAttack(this));
		pok.takeHit(f.medAttack(pok));
	}
	
	public void attackFull(Pokemon pok)
	{
		FireAttack f = new FireAttack(new FullAttack(this));
		pok.takeHit(f.fullAttack(pok));
	}
	
	/**
	 * @param pok the victim
	 */
	public void attackSpecial(Pokemon pok)
	{
		FireAttack f = new FireAttack(new SpecialAttack(this));
		pok.takeHit(f.specialAttack(pok));
	}
	

	@Override
	public void setHP(int HP)
	{
		hitPoints = HP;
		
	}

	@Override
	public void setCurrentState(State state)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public State getCurrentState()
	{
		return null;
	}
}
