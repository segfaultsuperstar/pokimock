package GUIFactory;

import Pokemon.Pokemon;
import java.util.*;
public class ConcreteGUIObserver implements GUIObserver
{

	public Pokemon enemy[] = new Pokemon[6];
	public Pokemon player[] = new Pokemon[6];
	public Pokemon enemyActive;
	public Pokemon playerActive;
	public GUIObserver[] observerArray = new GUIObserver[10];

	@Override
	public void update() 
	{
		
		int i = 0;
	while(i < 10)
	{
		if(observerArray[i] != null)
		{
			observerArray[i].setEnemyPokemon(enemyActive);
			observerArray[i].setEnemyTeam(enemy);
			observerArray[i].setPlayerPokemon(playerActive);
			observerArray[i].setPlayerTeam(player);
			observerArray[i].update();
			i++;
		}else
		{
			i++;
		}
	}
	}

	@Override
	public void push(GUIObserver g) 
	{

		enemy = g.getEnemyTeam();
		player = g.getPlayerTeam();
		playerActive = g.getPlayerPokemon();
		enemyActive = g.getEnemyPokemon();
		
	}

	@Override
	public void addObserver(GUIObserver g) 
	{
		int observerCounter = 0;
		while(observerCounter < 10)
		
		if(observerArray[observerCounter] == null)
		{
		observerArray[observerCounter] = g;
		break;
		}else
		{
			observerCounter++;
		}
		
	}

	@Override
	public void removeObserver(GUIObserver g) 
	{
		int i = 0;
		if(observerArray[i] == g){
			
		}else
		{
			i++;
		}
	}

	@Override
	public Pokemon getPlayerPokemon() 
	{
		return playerActive;
	}

	@Override
	public Pokemon getEnemyPokemon()
	{
		return enemyActive;
	}

	@Override
	public Pokemon[] getPlayerTeam() 
	{
		return player;
	}

	@Override
	public Pokemon[] getEnemyTeam() {
		// TODO Auto-generated method stub
		return enemy;
	}

	@Override
	public void setPlayerPokemon(Pokemon p) 
	{
		playerActive = p;
		
	}

	@Override
	public void setEnemyPokemon(Pokemon p) {
		enemyActive = p;
	}

	@Override
	public void setPlayerTeam(Pokemon[] p) {
		player = p;		
	}

	@Override
	public void setEnemyTeam(Pokemon[] p) {
		enemy = p;		
	}

}
