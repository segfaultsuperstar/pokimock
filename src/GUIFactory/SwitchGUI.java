package GUIFactory;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Pokemon.Blastoise;
import Pokemon.Pokemon;

public class SwitchGUI extends JFrame implements ActionListener, GUIObserver
{
	
	 
	
	public	JButton pkm1, pkm2, pkm3, pkm4, pkm5, pkm6;
	Pokemon enemy[] = new Pokemon[6];
	public Pokemon player[] = new Pokemon[6];
	Pokemon enemyActive;
	Pokemon playerActive;
	GUIObserver obs;


    
    
    /**
     * A GUI for players to switch Pokemon
     * @param o
     */
    public SwitchGUI(GUIObserver o) 
    {
    	obs = o;
    	obs.addObserver(this);
    	pull();
    	obs.update();
    	
    	JPanel top = new JPanel(new BorderLayout());
    	JPanel bot = new JPanel(new BorderLayout());

    	if(player[0]!=null)
		{
    		
    		pkm1 = new JButton(player[0].getName());
    		pkm1.addActionListener(this);
		}else
		{
			pkm1 = new JButton();
		}
    	if(player[1]!=null)
		{
			pkm2 = new JButton(player[1].getName());
			pkm2.addActionListener(this);
		}else
		{
			pkm2 = new JButton();
		}
    	if(player[2]!=null)
		{
			pkm3 = new JButton(player[2].getName());
			pkm3.addActionListener(this);
		}else
		{
			pkm3 = new JButton();
		}
    	if(player[3]!=null)
		{
    		pkm4 = new JButton(player[3].getName());
    		pkm4.addActionListener(this);
		}else
		{
			pkm4 = new JButton();
		}
    	if(player[4]!=null)
		{
    		pkm5 = new JButton(player[4].getName());
    		pkm5.addActionListener(this);
		}else
		{
			pkm5 = new JButton();
		}
    	if(player[5]!=null)
		{
    		pkm6 = new JButton(player[5].getName());
    		pkm6.addActionListener(this);
		}else
		{
			pkm6 = new JButton();
		}
    	top.add("North",pkm1);
    	top.add("Center", pkm2);
    	top.add("South", pkm3);
    	bot.add("North",pkm4);
    	bot.add("Center", pkm5);
    	bot.add("South", pkm6);
    	add("North", top);
    	add("South", bot);
    	pack();
    	setVisible(true);
    }
    @Override
	public void actionPerformed(ActionEvent e) 
    {
		if (e.getSource() == pkm1) 
		{
			playerActive = player[0];
			push(this);
		}
		if (e.getSource() == pkm2)
		{
			playerActive = player[1];
			push(this);
		}
		if (e.getSource() == pkm3) 
		{
			playerActive = player[2];
			push(this);
		}
		if (e.getSource() == pkm4) 
		{
			playerActive = player[3];
			push(this);
		}
		if (e.getSource() == pkm5) 
		{
			playerActive = player[4];
			push(this);
		}
		if (e.getSource() == pkm6) 
		{
			playerActive = player[5];
			push(this);
		}

		
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
	public void addObserver(GUIObserver g)
	{
		
	}

	@Override
	public void removeObserver(GUIObserver g) 
	{
		
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
