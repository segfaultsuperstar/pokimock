package attacks;
import Pokemon.*;
import States.State;

/**
 * A mock implementation of a Water Type Pokemon
 * so we can test a  for functionality that will
 * be constant across all real Water Type Pokemon
 */
public class MockWaterType extends Pokemon

{
	private String name = "MockWaterType";
	private int hitPoints = 200;
	private int typeNum = 1;
	protected String type = "Water";
	protected Pokemon MockWaterType;
	private int lifePoints = 600;

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
	 * then decorate it with a Water Attack 
	 */
	public void attackLow(Pokemon pok)
	{
		WaterAttack w = new WaterAttack(new LowAttack(this));
		pok.takeHit(w.lowAttack(pok));
	}
	public void attackMed(Pokemon pok)
	{
		WaterAttack w = new WaterAttack(new MedAttack(this));
		pok.takeHit(w.medAttack(pok));
	}
	public void attackFull(Pokemon pok)
	{
		WaterAttack w = new WaterAttack(new FullAttack(this));
		pok.takeHit(w.fullAttack(pok));
	}

	/**
	 * @param pok the victim
	 */
	public void attackSpecial(Pokemon pok)
	{
		WaterAttack w = new WaterAttack(new SpecialAttack(this));
		pok.takeHit(w.specialAttack(pok));
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
