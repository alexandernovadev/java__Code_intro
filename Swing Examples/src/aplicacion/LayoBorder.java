package aplicacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class LayoBorder  extends JApplet{
   
    public JPanel panelSuperior;
    public JPanel panelInferior;
    public JPanel panelIzquierdo;
    public  JPanel panelDerecho;
   

    public void visualizaVentana()
    {
        JFrame v = new JFrame("Prueba BorderLayout");
        construyeTodo(v.getContentPane());
        v.pack();
        v.setVisible(true);
       
    }

    public void start()
    {
        construyeTodo(this);
    }

    private void construyeTodo(Container contenedor)
    {
        construyePanelInferior();
        construyePanelSuperior();
        construyePanelIzquierdo();
        construyePanelDerecho();
        
        // Se construye el panel central.
        JScrollPane scroll = new JScrollPane(new JTextArea());
        contenedor.setLayout(new BorderLayout());
        
        // Se a�aden todos los paneles.
        contenedor.add(scroll, BorderLayout.CENTER);
        contenedor.add(panelSuperior, BorderLayout.NORTH);
        contenedor.add(panelInferior, BorderLayout.SOUTH);
        contenedor.add(panelIzquierdo, BorderLayout.WEST);
        contenedor.add(panelDerecho, BorderLayout.EAST);
    }

    private void construyePanelSuperior()
    {
        panelSuperior = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelSuperior.setBackground(Color.cyan);
        panelSuperior.add(new JButton("Sup.1"));
        panelSuperior.add(new JButton("Sup.2"));
        panelSuperior.add(new JButton("Sup.3"));
        panelSuperior.add(new JButton("Sup.4"));
    }

    private void construyePanelInferior()
    {
        panelInferior = new JPanel(new FlowLayout());
        panelInferior.setBackground(Color.yellow);
        panelInferior.add(new JLabel("Pon texto"));
        panelInferior.add(new JTextField(25));
        panelInferior.add(new JButton("Listo"));
    }

    private void construyePanelIzquierdo()
    {
        panelIzquierdo = new JPanel();
        panelIzquierdo.setLayout(
            new BoxLayout(panelIzquierdo, BoxLayout.Y_AXIS));
        panelIzquierdo.setBackground(Color.red);
        panelIzquierdo.add(new JButton("1"));
        panelIzquierdo.add(new JButton("2"));
        panelIzquierdo.add(new JButton("3"));
    }

    private void construyePanelDerecho()
    {
        panelDerecho = new JPanel();
        panelDerecho.setBackground(Color.green);
        panelDerecho.setLayout(new BoxLayout(panelDerecho, BoxLayout.Y_AXIS));
        panelDerecho.add(new JButton("A"));
        panelDerecho.add(new JButton("B"));
        panelDerecho.add(new JButton("C"));
        panelDerecho.add(new JButton("D"));
    }
}