package Ventas;


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JList;
import javax.swing.ListSelectionModel;
import java.util.ArrayList;
import javax.swing.UIManager;
import javax.swing.JSpinner;

public class Ven extends JFrame 
{

	protected JPanel contentPane;
	protected JLabel txt_index = new JLabel("");
	protected JLabel txt_nombre = new JLabel("Nombre");
	protected JLabel txt_apellido = new JLabel("Apellido");
	protected JLabel txt_documento  = new JLabel("Documento");
	protected JLabel txt_genero = new JLabel("Genero");
	protected JLabel txt_fechanacimiento = new JLabel("Fecha de Nacimiento");
	protected JLabel txt_validacion = new JLabel("Llena todos los campos");
	protected JTextField input_nombre,input_apellido, input_documento,input_genero,input_fechanacimiento;
	protected JButton btn_registrar = new JButton("REGISTRAR");
	protected JButton btn_edit = new JButton("EDITAR");
	protected JButton btn_remove = new JButton("REMOVE");
	protected JList listaNombres;//declaramos La Lista
	protected DefaultListModel modelo;//declaramos el Modelo
	
    ArrayList <Persona> personas = new ArrayList<Persona>();
    private JScrollPane scrollLista;
    protected JLabel txt_index_name;
	public Ven()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 700);
		ConfigJPane();
	    setContentPane(contentPane);
	    
	
	    btn_edit.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    btn_edit.setBackground(Color.WHITE);
	    btn_edit.setBounds(269, 477, 168, 33);
	    btn_edit.setVisible(false);
	    contentPane.add(btn_edit);
	    
	    btn_remove.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    btn_remove.setBackground(Color.WHITE);
	    btn_remove.setBounds(269, 520, 168, 33);
	    btn_remove.setVisible(false);
	    contentPane.add(btn_remove);
	    
		setVisible(true);
		
	}
	
	public void UpdateDataLista(JList listaNombres)
	{
		scrollLista.setViewportView(listaNombres);
		listaNombres.setModel(modelo);
	}
	
	public void ConfigJPane()
	{
		// Panel Vista1
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);
		
		/*Poner Btns. input, Labels*/
		
		// LABEL NAME
		txt_nombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txt_nombre.setBounds(10, 10, 118, 19);
		
		// INPUT NAME
		input_nombre = new JTextField();
		input_nombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		input_nombre.setBounds(20, 39, 173, 33);
		input_nombre.setColumns(10);
		
		// LABEL APELLIDOS
		txt_apellido.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txt_apellido.setBounds(10, 79, 118, 19);
		
		// INPUT APELLIDOS
		input_apellido = new JTextField();
		input_apellido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		input_apellido.setColumns(10);
		input_apellido.setBounds(20, 108, 173, 33);
		
		// LABEL DOCUMENTO 
		txt_documento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txt_documento.setBounds(10, 151, 118, 19);
		
		
		// INPUT DOCUMENTO 
		input_documento = new JTextField();
		input_documento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		input_documento.setColumns(10);
		input_documento.setBounds(20, 180, 173, 33);

		// LABEL GENERO
		txt_genero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txt_genero.setBounds(10, 223, 118, 19);
	
		// INPUT GENERO
		input_genero = new JTextField();
		input_genero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		input_genero.setColumns(10);
		input_genero.setBounds(20, 252, 173, 33);
	
		
		
		// LABEL FECHA NACIMIENTO
		txt_fechanacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txt_fechanacimiento.setBounds(10, 295, 151, 19);
	
		
		// INPUT FECHA NACIMIENTO
		input_fechanacimiento = new JTextField();
		input_fechanacimiento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		input_fechanacimiento.setColumns(10);
		input_fechanacimiento.setBounds(20, 324, 173, 33);
		
		input_apellido.getText();
	
		// LABEL ERROR VALIDACION
		txt_validacion.setForeground(Color.RED);
		txt_validacion.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		txt_validacion.setBounds(20, 439, 173, 25);
		txt_validacion.setVisible(false);
		
		// BOTON REGISTRAR
		btn_registrar.setBackground(Color.WHITE);
		btn_registrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_registrar.setBounds(25, 389, 168, 33);
		   
		//instanciamos el modelo
		modelo = new DefaultListModel();
		      
		
		//instanciamos la lista
		listaNombres = new JList();
		contentPane.add(listaNombres);
		listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
		listaNombres.setModel(modelo);
		listaNombres.setFont(new Font("Tahoma", Font.PLAIN, 16));
		listaNombres.setSelectionBackground(UIManager.getColor("MenuItem.selectionBackground"));
		
		
	
		//instanciamos el Scroll que tendra la lista
		scrollLista = new JScrollPane();
		scrollLista.setBounds(249, 37,296, 385);
		
		// LABEL INDEX
	    txt_index.setForeground(Color.RED);
	    txt_index.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		txt_index.setBounds(259, 434, 41, 33);
		contentPane.add(txt_index);
		
		// LABEL NAME INDEX
		txt_index_name = new JLabel("");
		txt_index_name.setForeground(Color.RED);
		txt_index_name.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		txt_index_name.setBounds(310, 432, 235, 33);
		contentPane.add(txt_index_name);
		
		
		
		// Add al Pane
		contentPane.add(txt_nombre);
		contentPane.add(input_nombre);
		contentPane.add(txt_apellido);
		contentPane.add(input_apellido);
		contentPane.add(txt_documento);
		contentPane.add(input_documento);
		contentPane.add(txt_genero);
		contentPane.add(input_genero);
		contentPane.add(txt_fechanacimiento);
		contentPane.add(input_fechanacimiento);
		contentPane.add(btn_registrar);
		contentPane.add(txt_validacion);
		contentPane.add(listaNombres);
		contentPane.add(scrollLista);
	}

	protected boolean validacion_noempty()
	{
		
		if(input_nombre.getText().equals("") ||
		   input_apellido.getText().equals("") ||
		   input_documento.getText().equals("") ||
		   input_genero.getText().equals("") ||
		   input_fechanacimiento.getText().equals("") )
		{
			this.txt_validacion.setVisible(true);
			return false;
		}
		else
		{
			this.txt_validacion.setVisible(false);
			return true;
		}
	}
}
