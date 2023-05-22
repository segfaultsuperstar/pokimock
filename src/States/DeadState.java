package States;

import Pokemon.Pokemon;

public class DeadState extends State
{
	
	public DeadState(Pokemon p)
	{
		this.p = p; 
	}
	
	@Override
	public void eval(Pokemon p)
	{
//		p.setCurrentState(p.deadState);
	}
	
	public void handle()
	{
		eval(p);
	}
}
