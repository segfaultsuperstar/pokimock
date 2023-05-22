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
import Pokemon.*;



public class GUI 
{
	Pokemon enemy[] = new Pokemon[6];
	Pokemon player[] = new Pokemon[6];
	Pokemon enemyActive;
	Pokemon playerActive;
	GUIObserver obs;
/**
 * @param args
 */
    public static void main(String[] args)
    {
    	new GUI();
    }
    public GUI()
    {
    	obs = new ConcreteGUIObserver();
    	
    	SelectGUI sg = new SelectGUI(obs);
    	obs.addObserver(sg);
    	
    }

}
	