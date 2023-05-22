package GUIFactory;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Pokemon.*;


public class SelectGUI extends JFrame implements ActionListener, GUIObserver
{
	public Pokemon enemy[] = new Pokemon[6];
	public Pokemon player[] = new Pokemon[6];
	public Pokemon enemyActive;
	public Pokemon playerActive;
	GUIObserver obs;
	int pokemonCounter = 0;
	public	GameGUI game;

	JLabel enemyPokemon, playerPokemon, emptySpace, selectionScreen, grassLabel, waterLabel, fireLabel;
	public JButton attackButton, switchButton, equipWeaponButton, squirtleButton, wartortleButton, blastoiseButton,
		charmanderButton, charmeleonButton, charizardButton, bulbasaurButton, ivysaurButton, venasaurButton,
		vulpixButton, caterpieButton, poliwagButton, finishSelection;

	/**
	 * A GUI that allows the player to select their Pokemon
	 * @param o
	 */
	
	
	public SelectGUI(GUIObserver o)
	{
		
		obs = o;
		

		enemy[0] = new Caterpie();
		enemy[1] = new Poliwag();
		enemy[2] = new Vulpix();
		enemy[3] = new Venasaur();
		enemy[4] = new Charzard();
		enemy[5] = new Blastoise();
		push(this);
		
		squirtleButton = new JButton("Squirtle");
		wartortleButton = new JButton("Wartortle");
		blastoiseButton = new JButton("Blastoise");
		charmanderButton = new JButton("Charmander");
		charmeleonButton = new JButton("Charmeleon");
		charizardButton = new JButton("Charizard");
		bulbasaurButton = new JButton("Bulbasaur");
		ivysaurButton = new JButton("Ivysaur");
		venasaurButton = new JButton("Venesaur");
		vulpixButton = new JButton("Vulpix");
		caterpieButton = new JButton("Caterpie");
		poliwagButton = new JButton("Poliwag");
		selectionScreen = new JLabel("Choose six Pokemon please");
		fireLabel = new JLabel("Fire");
		waterLabel = new JLabel("Water");
		grassLabel = new JLabel("Grass");
		finishSelection = new JButton("Finish");
		squirtleButton.addActionListener(this);
		wartortleButton.addActionListener(this);
		blastoiseButton.addActionListener(this);
		charmanderButton.addActionListener(this);
		charmeleonButton.addActionListener(this);
		charizardButton.addActionListener(this);
		bulbasaurButton.addActionListener(this);
		ivysaurButton.addActionListener(this);
		venasaurButton.addActionListener(this);
		vulpixButton.addActionListener(this);
		poliwagButton.addActionListener(this);
		caterpieButton.addActionListener(this);
		finishSelection.addActionListener(this);
		
		JPanel firePanel = new JPanel();
		JPanel waterPanel = new JPanel();
		JPanel grassPanel = new JPanel();
		JPanel pokemonPanel = new JPanel(new BorderLayout());
		JPanel labelPanel = new JPanel();
		JPanel bottomPanel = new JPanel();
		JButton [][] pokemonArray = new JButton [3][4];
		pokemonArray[0][0] = squirtleButton;
		pokemonArray[0][1] = wartortleButton;
		pokemonArray[0][2] = blastoiseButton;
		pokemonArray[0][3] = poliwagButton;
		
		pokemonArray[1][0] = charmanderButton;
		pokemonArray[1][1] = charmeleonButton;
		pokemonArray[1][2] = charizardButton;
		pokemonArray[1][3] = vulpixButton;
	
		pokemonArray[2][0] = bulbasaurButton;
		pokemonArray[2][1] = ivysaurButton;
		pokemonArray[2][2] = venasaurButton;
		pokemonArray[2][3] = caterpieButton;
		firePanel.add(fireLabel);
		firePanel.add(pokemonArray[1][0]);
		firePanel.add(pokemonArray[1][1]);
		firePanel.add(pokemonArray[1][2]);
		firePanel.add(pokemonArray[1][3]);
		pokemonPanel.add("South",firePanel);
		
		waterPanel.add(waterLabel);
		waterPanel.add(pokemonArray[0][0]);
		waterPanel.add(pokemonArray[0][1]);
		waterPanel.add(pokemonArray[0][2]);
		waterPanel.add(pokemonArray[0][3]);
		pokemonPanel.add("North",waterPanel);
		
		grassPanel.add(grassLabel);
		grassPanel.add(pokemonArray[2][0]);
		grassPanel.add(pokemonArray[2][1]);
		grassPanel.add(pokemonArray[2][2]);
		grassPanel.add(pokemonArray[2][3]);
		pokemonPanel.add("West",grassPanel);
		labelPanel.add(selectionScreen);
		
		bottomPanel.add(finishSelection);
		add("North", labelPanel);
		add("West",pokemonPanel);
		add("South", bottomPanel);
		pack();
		setVisible(true);
		
	}
	
	


	

	@Override
	public void actionPerformed(ActionEvent e)
	{	
	
	
	
	if (e.getSource() == finishSelection)
	{
		
		push(this);
		playerActive = player[0];
		this.setVisible(false);
		game = new GameGUI(obs);
		obs.addObserver(game);
		obs.removeObserver(this);
	}
		
	  
	
	if (e.getSource() == squirtleButton)
	{
		
		if(pokemonCounter >5)
		{
			return;
		}
		player[pokemonCounter] = new Squirtle();
		pokemonCounter++;
		
		
	}
	if (e.getSource() == wartortleButton)
	{
		if(pokemonCounter >5)
		{
			return;
		}
		player[pokemonCounter] = new Wartortle();
		pokemonCounter++;
		
	}
	if (e.getSource() == blastoiseButton)
	{
		if(pokemonCounter >5)
		{
			return;
		}
		player[pokemonCounter] = new Blastoise();
		pokemonCounter++;
		
	}
	if (e.getSource() == charmanderButton)
	{
		if(pokemonCounter >5)
		{
			return;
		}
		player[pokemonCounter] = new Charmander();
		pokemonCounter++;
		
	}
	if (e.getSource() == charmeleonButton)
	{
		if(pokemonCounter >5)
		{
			return;
		}
		player[pokemonCounter] = new Charmelean();
		pokemonCounter++;
		
	}
	if (e.getSource() == charizardButton)
	{
		if(pokemonCounter >5)
		{
			return;
		}
		player[pokemonCounter] = new Charzard();
		pokemonCounter++;
		
	}   
	if (e.getSource() == bulbasaurButton)
	{
		if(pokemonCounter >5)
		{
			return;
		}
		player[pokemonCounter] = new Bulbasaur();
		pokemonCounter++;
			}   
	if (e.getSource() == ivysaurButton)
	{
		if(pokemonCounter >5)
		{
			return;
		}
		player[pokemonCounter] = new Ivysaur();
		pokemonCounter++;
		
	}   
	if (e.getSource() == venasaurButton)
	{
		if(pokemonCounter >5)
		{
			return;
		}
		player[pokemonCounter] = new Venasaur();
		pokemonCounter++; 
		
	}   
	if (e.getSource() == vulpixButton)
	{
		if(pokemonCounter >5)
		{
			return;
		}
		player[pokemonCounter] = new Vulpix();
		pokemonCounter++;
		
	}   
	if (e.getSource() == poliwagButton)
	{
		if(pokemonCounter >5)
		{
			return;
		}
		player[pokemonCounter] = new Poliwag();
		pokemonCounter++;
			}   
	if (e.getSource() == caterpieButton)
	{
		if(pokemonCounter >5)
		{
			return;
		}
		player[pokemonCounter] = new Caterpie();
		pokemonCounter++; 
	}	
	}   
	

	@Override
	public void push(GUIObserver g)
	{
		obs.setPlayerTeam(player);
		obs.setPlayerPokemon(player[0]);
		obs.setEnemyTeam(enemy);
		obs.setEnemyPokemon(enemy[0]);
		obs.update();
	}

	@Override
	public void addObserver(GUIObserver g) {

	}

	@Override
	public void removeObserver(GUIObserver g) {

	}

	@Override
	public void update() 
	{

	}

	@Override
	public Pokemon getPlayerPokemon() {
		// TODO Auto-generated method stub
		return playerActive;
	}

	@Override
	public Pokemon getEnemyPokemon() {
		// TODO Auto-generated method stub
		return enemyActive;
	}

	@Override
	public Pokemon[] getPlayerTeam() {
		// TODO Auto-generated method stub
		return player;
	}

	@Override
	public Pokemon[] getEnemyTeam() {
		// TODO Auto-generated method stub
		return enemy;
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
