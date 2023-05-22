package States;

import Pokemon.Pokemon;

public abstract class State
{
	Pokemon p;
	
	public abstract void eval(Pokemon p);
	public void handle()
	{
		
	}
}
