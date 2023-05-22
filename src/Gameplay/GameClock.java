package Gameplay;

import java.util.ArrayList;

public class GameClock {
	private int round = 0;
	private ArrayList<RoundObserver> observers = new ArrayList<RoundObserver>();

	public void AddRoundObserver(RoundObserver ro)
	{
		observers.add(ro);
	}

	public void RemoveRoundObserver(RoundObserver ro) {
		observers.remove(ro);
	}

	public void RoundChange()
	{
		round++;
		for ( RoundObserver obs : observers)
		{
			obs.update(round);
		}
	}

	public int getRound()
	{
		return round;
	}
}