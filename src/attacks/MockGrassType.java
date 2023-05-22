package attacks;
import Pokemon.*;
import States.State;

/**
 * A mock implementation of a Grass Type Pokemon
 * so we can test a  for functionality that will
 * be constant across all real Grass Type Pokemon
 */
public class MockGrassType extends Pokemon
{
	private String name = "MockGrassType";
	private int hitPoints = 150;
	private int typeNum = 2;
	protected String type = "Grass";
	private int lifePoints = 550;

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
	 * then decorate it with a Grass Attack 
	 */
	public void attackLow(Pokemon pok)
	{
		GrassAttack g = new GrassAttack(new LowAttack(this));
		pok.takeHit(g.lowAttack(pok));
	}
	
	public void attackMed(Pokemon pok)
	{
		GrassAttack g = new GrassAttack(new MedAttack(this));
		pok.takeHit(g.medAttack(pok));
	}
	
	public void attackFull(Pokemon pok)
	{
		GrassAttack g = new GrassAttack(new FullAttack(this));
		pok.takeHit(g.fullAttack(pok));
	}
	
	/**
	 * @param pok the victim
	 */
	public void attackSpecial(Pokemon pok)
	{
		GrassAttack g = new GrassAttack(new SpecialAttack(this));
		pok.takeHit(g.specialAttack(pok));
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
		// TODO Auto-generated method stub
		return null;
	}


}
