package Colores;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Colores  extends Frame implements WindowListener
{
	private static final long serialVersionUID = 1L;
	public Colores()
	{
		setTitle("Dibujando texto");
		addWindowListener(this);
		setSize(280,100);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
	// Se crea un color tipo RGB meter los numeros de la derecha de paint al elegir color
	Color colorin = new Color(246,172,236);
	// Se aplica el color sin cordenadas esto sobraria 	Color colorin = new Color(246,172,236);
	//g.setColor(Color.magenta); 
	
	g.setColor(colorin); 
	g.drawString("Hola, mundo!", 30, 60);
	}


	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
	public static void main(String[] args)
	{
		new Colores();
	}
}