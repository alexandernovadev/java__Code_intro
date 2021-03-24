package aplicacion;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import java.awt.FlowLayout;

import jdesktoppane.ClaseJDesktopPane;
import jdialog.ClaseJDialog;
import jframe.ClaseFrame;
import jpanel.ClaseJPanel;
import jscrollpane.ClaseJScrollPane;
import jsplitpane.ClaseJSplitPane;
import jtabbedpane.ClaseJTabbedPane;
import jtoolbar.ClaseJToolbar;

public class VentanaPrincipal extends JFrame implements ActionListener {
	
	private Container contenedor;
	public JButton botonJFrame,botonJDialog,botonJPanel,botonJScrollPane,botonJSplitPane,botonJTabbedPane,botonJDesktopPane,botonJToolBar;
	public JButton btnflow =  new JButton("Flow Layouts");
	public JButton boxlayout =  new JButton("Box Layouts");
	public JButton gridlayout =  new JButton("GRID Layouts");
	public JButton borderlayout =  new JButton("BORDER Layout");
	public JButton gridBaglayout =  new JButton("GridBag Layout");
	public JButton springLayout =  new JButton("Spring Layout");
	JLabel labelTitulo;
	private VentanaPrincipal miVentanaPrincipal;
	private JMenuBar barraMenu;
	private JMenu menuAcercaDe;

	
	public VentanaPrincipal(){

		iniciarComponentes();
		setTitle("Tito Nova   67000403");
		setBackground(Color.WHITE);
		setSize(740,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * @param miVentana
	 */
	public void setVentanaPrincipal(VentanaPrincipal miVentana) {
		miVentanaPrincipal=miVentana;
	}

	private void iniciarComponentes() {
		contenedor=getContentPane();
		contenedor.setLayout(new FlowLayout());
		contenedor.setBackground(Color.WHITE);

	    botonJFrame= new JButton();
	    botonJFrame.setText("JFrame");
	    botonJFrame.setBounds(40, 80, 200, 25);
	    botonJFrame.addActionListener(this);
	    
	    botonJDialog= new JButton();
		botonJDialog.setText("JDialog");
		botonJDialog.setBounds(260, 80, 200, 25);
		botonJDialog.addActionListener(this);
		
		botonJPanel= new JButton();
		botonJPanel.setText("JPanel");
		botonJPanel.setBounds(480, 80, 200, 25);
		botonJPanel.addActionListener(this);
		
		botonJScrollPane= new JButton();
		botonJScrollPane.setText("JScrollPane");
		botonJScrollPane.setBounds(40, 120, 200, 25);
		botonJScrollPane.addActionListener(this);
		    
		botonJSplitPane= new JButton();
		botonJSplitPane.setText("JSplitPane");
		botonJSplitPane.setBounds(260, 120, 200, 25);
		botonJSplitPane.addActionListener(this);
		
		botonJTabbedPane= new JButton();
		botonJTabbedPane.setText("JTabbedPane");
		botonJTabbedPane.setBounds(480, 120, 200, 25);
		botonJTabbedPane.addActionListener(this);
		
		botonJDesktopPane= new JButton();
		botonJDesktopPane.setText("JDesktopPane");
		botonJDesktopPane.setBounds(150, 160, 200, 25);
		botonJDesktopPane.addActionListener(this);
		
		botonJToolBar= new JButton();
		botonJToolBar.setText("JToolBar");
		botonJToolBar.setBounds(370, 160, 200, 25);
		botonJToolBar.addActionListener(this);
	
		btnflow.addActionListener(this);
		boxlayout.addActionListener(this);
		gridlayout.addActionListener(this);
		borderlayout.addActionListener(this);
		gridBaglayout.addActionListener(this);
		springLayout.addActionListener(this);
	

		contenedor.add(botonJFrame);
		contenedor.add(botonJDialog);
		contenedor.add(botonJPanel);
		contenedor.add(botonJScrollPane);
		contenedor.add(botonJSplitPane);
		contenedor.add(botonJTabbedPane);
		contenedor.add(botonJDesktopPane);
		contenedor.add(botonJToolBar);

		contenedor.add(btnflow);
		contenedor.add(boxlayout);
		contenedor.add(gridlayout);
		contenedor.add(borderlayout);
		contenedor.add(gridBaglayout);
		contenedor.add(springLayout);
	}

	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource()==botonJFrame)
		{
			ClaseFrame miClaseJFrame= new ClaseFrame();
			miClaseJFrame.setVisible(true);
		}
		if (evento.getSource()==botonJDialog)
		{
			ClaseJDialog miClaseJDialog=new ClaseJDialog(miVentanaPrincipal,true);
			miClaseJDialog.setVisible(true);
		}
		if (evento.getSource()==botonJPanel)
		{
			ClaseJPanel miClaseJPanel= new ClaseJPanel(miVentanaPrincipal,true);
			miClaseJPanel.setVisible(true);
		}
		if (evento.getSource()==botonJScrollPane)
		{
			ClaseJScrollPane miClaseJScrollPane = new ClaseJScrollPane(miVentanaPrincipal,true);
			miClaseJScrollPane.setVisible(true);
		}
		if (evento.getSource()==botonJTabbedPane)
		{
			ClaseJTabbedPane miClaseJTabbedPane = new ClaseJTabbedPane(miVentanaPrincipal,true);
			miClaseJTabbedPane.setVisible(true);
		}
		if (evento.getSource()==botonJDesktopPane)
		{
			ClaseJDesktopPane miClaseJDesktopPane = new ClaseJDesktopPane(miVentanaPrincipal,true);
			miClaseJDesktopPane.setVisible(true);
		}
		if (evento.getSource()==botonJToolBar)
		{
			ClaseJToolbar miClaseJToolbar = new ClaseJToolbar(miVentanaPrincipal,true);
			miClaseJToolbar.setVisible(true);
		}
		if (evento.getSource()==botonJSplitPane)
		{
			ClaseJSplitPane miClaseJSplitPane = new ClaseJSplitPane(miVentanaPrincipal,true);
			miClaseJSplitPane.setVisible(true);
		}
		if (evento.getSource()==gridlayout)
		{
			LayoGRID a = new LayoGRID();
			a.vb.setVisible(true);
		}
		if (evento.getSource()==borderlayout )
		{
			LayoBorder aa = new LayoBorder();
			aa.visualizaVentana();
		}
		
		if (evento.getSource() == btnflow)
		{
			LayoutFloww vf = new LayoutFloww();
			vf.v.setVisible(true);
		}
		if (evento.getSource() == boxlayout){
			LayoutBox vbox = new LayoutBox();
			vbox.vb.setVisible(true);
			}

		if (evento.getSource() == gridBaglayout){
			LayoutGridBad prueba=new LayoutGridBad();
				prueba.setVisible(true);
		}

		if (evento.getSource() == springLayout){
			LayoutSpring prueba=new LayoutSpring();
			  prueba.frame.setVisible(true);
	  
			}
	}
}
