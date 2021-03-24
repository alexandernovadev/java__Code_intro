package jtoolbar;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import aplicacion.VentanaPrincipal;

public class ClaseJToolbar extends JDialog{

	JLabel labelTitulo;
	JTextArea areaDeTexto;
	String texto;
	JToolBar barraDeOpciones;
	JButton boton1,boton2,boton3;
	JTextField campo1;
	JPanel miPanel;
	public ClaseJToolbar(VentanaPrincipal miVentanaPrincipal, boolean modal){
		super(miVentanaPrincipal, modal);
		miPanel=new JPanel();
		miPanel.setLayout(null);
		setTitle("JToolbar");
			
		labelTitulo= new JLabel();
		labelTitulo.setText("CONTENEDOR JTOOLBAR");
		labelTitulo.setBounds(120, 30, 180, 23);
		
		texto="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod\n" +
			  "est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci\n" +
			  "molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?\n" +
			  "sequi nesciunt. Neque porro quisquam est, qui dolorem ip";
		areaDeTexto = new JTextArea();
		areaDeTexto.setText(texto);
		areaDeTexto.setBounds(40, 60, 350, 100);
		
		boton1=new JButton();
		boton2=new JButton();
		boton3=new JButton();
		boton1.setText("boton1");
		boton2.setText("boton2");
		boton3.setText("boton3");
		campo1= new JTextField();
				
	
		barraDeOpciones = new JToolBar();
        barraDeOpciones.add(boton1);
        barraDeOpciones.add(boton2);
        barraDeOpciones.add(boton3);
        barraDeOpciones.add(campo1);
         
		getContentPane().add(barraDeOpciones, BorderLayout.NORTH);
		pack();
		miPanel.add(labelTitulo);
		miPanel.add(areaDeTexto);
		add(miPanel);
		setSize(420,300);
		setBackground(Color.white);
		setLocationRelativeTo(null);
	}
}
