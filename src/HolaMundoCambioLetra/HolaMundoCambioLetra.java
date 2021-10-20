package HolaMundoCambioLetra;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



public class HolaMundoCambioLetra extends Frame implements WindowListener
{
private static final long serialVersionUID = 1L;
public HolaMundoCambioLetra()
{
setTitle("Dibujando texto");
addWindowListener(this);
setSize(280,100);
setVisible(true);
}
public void paint(Graphics g)
{
// Creamos la fuente BOLD es negrita.
Font font = new Font("Arial", Font.BOLD, 14);
// Aplicamos la fuente
g.setFont(font);
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
new HolaMundoCambioLetra();
}
}