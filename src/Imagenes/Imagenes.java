package Imagenes;

import java.awt.*;
import java.awt.event.*;

public class Imagenes extends Frame implements WindowListener
{
private static final long serialVersionUID = 1L;
// Declarar el objeto Image
Image imagen;
// Declarar el objeto Toolkit para manejo de imágenes
Toolkit herramienta;
public Imagenes()
{
setTitle("Imágenes");
setLocation(250,250);
setSize(1000,600);
setResizable(false);
addWindowListener(this);
// Establecer el método de trabajo con imágenes
herramienta = getToolkit();
// Especificar la ruta de la imagen
//Si ponemos ruta OJO con los \\
imagen = herramienta.getImage("sirenita.jpg");
setVisible(true);
}
public static void main(String[] args)
{
new Imagenes();
}
public void paint(Graphics g)
{
//Dibujar la imagen
g.drawImage(imagen,4,23,this);
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
}
