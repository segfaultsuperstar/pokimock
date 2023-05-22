package GUIFactory;

import Pokemon.Pokemon;
import Pokemon.Wartortle;

public interface GUIObserver 
{
public Pokemon enemy[] = null;
public Pokemon player[] = null;
public Pokemon enemyActive = null;
public Pokemon playerActive = null;
public void update();
public void push(GUIObserver g);
public void addObserver(GUIObserver g);
public void removeObserver(GUIObserver g);
public Pokemon getPlayerPokemon();
public Pokemon getEnemyPokemon();
public Pokemon[] getPlayerTeam();
public Pokemon[] getEnemyTeam();
public void setPlayerPokemon(Pokemon p);
public void setEnemyPokemon(Pokemon p);
public void setPlayerTeam(Pokemon[] p);
public void setEnemyTeam(Pokemon [] p);
}
