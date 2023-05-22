package GUIFactory;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Pokemon.Pokemon;

public class AttackGUI extends JFrame implements ActionListener, GUIObserver  {

	Pokemon enemy[] = new Pokemon[6];
	Pokemon player[] = new Pokemon[6];
	Pokemon enemyActive;
	Pokemon playerActive;
	GUIObserver obs;
	JPanel bottomPanel = new JPanel();
	JPanel playerPanel = new JPanel();
	public JButton hiAttk, medAttk, lowAttk, SPAttk;
	
	/**
	 * A gui for allowing players to attack one another
	 * @param o
	 */
	public AttackGUI(GUIObserver o)
	{
		obs = o;
    	obs.addObserver(this);
    	pull();
    	hiAttk = new JButton("High Attack");
    	lowAttk = new JButton("Low Attack");
    	medAttk = new JButton("Medium Attack");
    	SPAttk = new JButton("Special Attack");
    	hiAttk.addActionListener(this);
    	medAttk.addActionListener(this);
    	lowAttk.addActionListener(this);
    	SPAttk.addActionListener(this);
    	JPanel top = new JPanel(new BorderLayout());
    	JPanel bot = new JPanel(new BorderLayout());
    	top.add("North", lowAttk);
    	top.add("Center", medAttk);
    	top.add("South", hiAttk);
    	bot.add("North",SPAttk);
    	add("North", top);
    	add("South", bot);
    	pack();
    	setVisible(true);
    	
    	
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == hiAttk)
		{
			playerActive.attackFull(enemyActive);
		}
		if(e.getSource() == medAttk)
		{
			playerActive.attackMed(enemyActive);
		}
		if(e.getSource() == lowAttk)
		{
			playerActive.attackLow(enemyActive);

		}
		if(e.getSource() == SPAttk)
		{
			
		}
		push(obs);
		
	}
	public void pull() {
		player = obs.getPlayerTeam();
		enemy = obs.getEnemyTeam();
		playerActive = obs.getPlayerPokemon();
		enemyActive = obs.getEnemyPokemon();
		
	}
	
	
	
	@Override
	public void update() 
	{
		
		
	}

	@Override
	public void push(GUIObserver g) 
	{
		
		
		
		obs.setPlayerTeam(player);
		obs.setPlayerPokemon(playerActive);
		obs.setEnemyTeam(enemy);
		obs.setEnemyPokemon(enemyActive);
		obs.update();
		this.setVisible(false);
	}

	@Override
	public void addObserver(GUIObserver g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObserver(GUIObserver g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pokemon getPlayerPokemon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pokemon getEnemyPokemon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pokemon[] getPlayerTeam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pokemon[] getEnemyTeam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPlayerPokemon(Pokemon p) {
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
