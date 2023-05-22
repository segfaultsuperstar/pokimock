package States;

import Pokemon.Pokemon;

public class LivingState extends State
{
	
	public LivingState(Pokemon p)
	{
		this.p = p; 
	}
	
	@Override
	public void eval(Pokemon p)
	{
		if (p.getHP() > 0)
		{
//			p.setCurrentState(p.livingState);
		}
	}
	
	public void handle()
	{
		eval(p);
	}
}