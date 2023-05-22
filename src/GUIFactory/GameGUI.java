package GUIFactory;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Pokemon.Charmander;
import Pokemon.Charzard;
import Pokemon.Pokemon;
import Potions.HealthPotion;
import Potions.Potions;
import Potions.UsePotion;


public class GameGUI extends JFrame implements ActionListener, GUIObserver {

	

	Pokemon enemy[] = new Pokemon[6];
	Pokemon player[] = new Pokemon[6];
	Pokemon enemyActive;
	Pokemon playerActive;
	GUIObserver obs;
	int  enemyCounter = 0;
	public SwitchGUI switcher;
	public AttackGUI hitter;
	JPanel bottomPanel = new JPanel();
	JPanel playerPanel = new JPanel();
	
	JLabel enemyPokemon, playerPokemon, emptySpace, selectionScreen, grassLabel, waterLabel, fireLabel;
	JButton attackButton, switchButton, itemButton, squirtleButton, wartortleButton, blastoiseButton,
		charmanderButton, charmeleonButton, charizardButton, bulbasaurButton, ivysaurButton, venasaurButton,
		vulpixButton, caterpieButton, poliwagButton, finishSelection;
	
	
	
	

	
	public GameGUI(GUIObserver o) 
		{
			obs = o;
			obs.update();
			
	    	setLayout(new BorderLayout());
			
			JButton[][] buttonArray = new JButton[3][2];
			JLabel [][] pokemonArray = new JLabel [1][3];
			attackButton = new JButton("Attack");
			attackButton.addActionListener(this);
			buttonArray[0][0] = attackButton;

			switchButton = new JButton("Switch Pokemon");
			switchButton.addActionListener(this);
			buttonArray[1][0] = switchButton;
			
			itemButton = new JButton("Items");
			itemButton.addActionListener(this);
			buttonArray[2][0] = itemButton;
			
			playerPokemon = new JLabel(obs.getPlayerPokemon().getName()+ " " +obs.getPlayerPokemon().getHP() + "/" +obs.getPlayerPokemon().getMaxLifePoints());
			pokemonArray[0][0] = playerPokemon;
			
			emptySpace = new JLabel("                     ");
			pokemonArray[0][1] = emptySpace;
			
			enemyPokemon = new JLabel(obs.getEnemyPokemon().getName()+ " " +obs.getEnemyPokemon().getHP() + "/" +obs.getEnemyPokemon().getMaxLifePoints());
			pokemonArray[0][2] = enemyPokemon;
			
			playerPanel.add(pokemonArray[0][0]);
			playerPanel.add(pokemonArray[0][1]);
			playerPanel.add(pokemonArray[0][2]);
			
			bottomPanel.add(buttonArray[0][0]);
			bottomPanel.add(buttonArray[1][0]);
			bottomPanel.add(buttonArray[2][0]);
			add("South",bottomPanel);
			add("North", playerPanel);
			pack();
			setVisible(true);
			switcher = new SwitchGUI(obs);
			switcher.setVisible(false);
			hitter = new AttackGUI(obs);
			hitter.setVisible(false);
		}

	
	@Override
	public void update() 
	{
		if(playerActive.getHP() <= 0)
		{
			finishSelection.doClick();
		}
	playerPokemon.setText(obs.getPlayerPokemon().getName()+ " " +obs.getPlayerPokemon().getHP() + "/" +obs.getPlayerPokemon().getMaxLifePoints());	
	
	if(enemyActive.getHP() <= 0)
	{
		obs.setEnemyPokemon(enemy[enemyCounter++]);
		enemyActive = obs.getEnemyPokemon();
	}
	enemyPokemon.setText(obs.getEnemyPokemon().getName()+ " " +obs.getEnemyPokemon().getHP() + "/" +obs.getEnemyPokemon().getMaxLifePoints());
		
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == switchButton)
	    {
			switcher.setVisible(true);
	    }   
		if (e.getSource() == attackButton)
	    {
			hitter.setVisible(true);
	    }   
		if (e.getSource() == itemButton)
	    {
			
			UsePotion healthP = new UsePotion(new HealthPotion());
			healthP.usePotion(playerActive);
			
			
	    }  
		
	}




	@Override
	public void push(GUIObserver g) 
	{
		obs.update();
		
	}




	@Override
	public void addObserver(GUIObserver g) {
		
		
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
