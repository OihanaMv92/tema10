package Ej4;


import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

public class Ej4 extends Frame implements WindowListener
{
    private static final long serialVersionUID = 1L;
    Random rnd=new Random();
    int i, x1, y1, x2, y2;
    int rojo, verde, azul;
    int ya=0;
    public Ej4()
    {
                setTitle("Dibujando...");
                addWindowListener(this);
                setSize(220,100);
                setVisible(true);
    }
    public void paint(Graphics g)
    {
                // paint es llamado 2 veces, una por setSize y otra por setVisible
                // Con la variable "ya" nos aseguramos que solamente hace su tarea una vez 
                if(ya==0)
                {
                            for(i=0;i<20;i++)
                            {
                                       rojo = rnd.nextInt(254);
                                       verde = rnd.nextInt(254);
                                       azul = rnd.nextInt(254);
                                       g.setColor(new Color(rojo,verde,azul));
                                       x1=rnd.nextInt(220);
                                       y1=rnd.nextInt(100);
                                       x2=rnd.nextInt(220);
                                       y2=rnd.nextInt(100);
                                       g.drawLine(x1, y1, x2, y2);
                            }
                            try 
                            {
                                       Thread.sleep(5000);
                                       g.setColor(new Color(255,255,255));
                                       g.fillRect(0,0,220,100);
                            }
                            catch(InterruptedException ex) 
                            {
                            }
                            ya=1;
                }
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
                new Ej4();
    }
}

