package Ventas;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JList;
import javax.swing.JOptionPane;

public class Controller extends Ven {

	
	public Controller()
	{
		listaNombres.addMouseListener(mouseListener);
		registraradd_event();
		registraredit_event();
		registraremove_even();
		
		PonerInformacionInputs("Alex","Nova","MAsc",1,"02");
	}
	
    MouseListener mouseListener = new MouseAdapter() {
	      public void mouseClicked(MouseEvent mouseEvent) {
	    	  
	    	  System.out.println("snkdfnsjkdfnksndf");
	        JList theList = (JList) mouseEvent.getSource();
	        if (mouseEvent.getClickCount() == 1) {
	          int index = theList.locationToIndex(mouseEvent.getPoint());
	          if (index >= 0) {
	          
	        	txt_index.setText(String.valueOf(index));
	        	txt_index_name.setText(personas.get(index).getFullName());
	        	btn_edit.setVisible(true);
	        	btn_remove.setVisible(true);
	        	txt_index.setVisible(true);
				txt_index_name.setVisible(true);
	        	
	        	PonerInformacionInputs(
						personas.get(index).getNombre(),
						personas.get(index).getApellido(),
						personas.get(index).getGenero(),
						personas.get(index).getDocumento(),
						personas.get(index).getFecha());
	            System.out.println("Index->"+ index +" Name: "+ personas.get(index).getNombre());
	  
	           
	          }
	        }
	      }
	    };
	    
	    
	public void registraremove_even()
	{
		btn_remove.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				int id = Integer.parseInt(txt_index.getText());
				System.out.println("Remover: "+ personas.get(id).getNombre());
				
				personas.remove(id);
				modelo.remove(id);
				UpdateDataLista(listaNombres);
				
				
				txt_index.setVisible(false);
				txt_index_name.setVisible(false);
			 	btn_edit.setVisible(false);
	        	btn_remove.setVisible(false);
	        	PonerInformacionInputs("","","",0,"");
	        	
	        	JOptionPane.showMessageDialog(null, "Eliminado");
			}
		});	
	}
	
	public void  registraredit_event()
    {
		btn_edit.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
				int id = Integer.parseInt(txt_index.getText());

				
				System.out.println("Editar: "+ personas.get(id).getNombre());
				
		          
				Persona p1 = new Persona();
				
				if(validacion_noempty())
				{
					p1.setNombre(input_nombre.getText());
					p1.setApellido(input_apellido.getText());
					p1.setGenero(input_genero.getText());
					p1.setDocumento(Integer.parseInt(input_documento.getText()));
					p1.setFecha(input_fechanacimiento.getText());
				}
				
				// Poner los nuevos datos
				personas.get(id).setNombre(p1.getNombre());
				personas.get(id).setApellido(p1.getApellido());
				personas.get(id).setDocumento(p1.getDocumento());
				personas.get(id).setGenero(p1.getGenero());
				personas.get(id).setFecha(p1.getFecha());
				txt_index_name.setText(p1.getFullName());
				
				modelo.setElementAt( p1.getNombre(), id);
						
				UpdateDataLista(listaNombres);
				JOptionPane.showMessageDialog(null, "Editado");
				
			}
		});	
    }
	public void registraradd_event()
	{
		btn_registrar.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
				System.out.println("Sirve");
				if(validacion_noempty())
				{
					llenarlista();
					
					UpdateDataLista(listaNombres);
					PonerInformacionInputs("","","",0,"");
					JOptionPane.showMessageDialog(null, "Agregado");
				}
				
			}
		});	
	}
	
	public void llenarlista()
	{
		Persona p1 = new Persona();
		
		if(validacion_noempty())
		{
			p1.setNombre(input_nombre.getText());
			p1.setApellido(input_apellido.getText());
			p1.setGenero(input_genero.getText());
			p1.setDocumento(Integer.parseInt(input_documento.getText()));
			p1.setFecha(input_fechanacimiento.getText());
			personas.add(p1);
		
			this.modelo.addElement(p1.getNombre());
		}
	}
	public void PonerInformacionInputs(String n,String a,String g,Integer d,String f)
	{
		input_nombre.setText(n);
		input_apellido.setText(a);
		input_genero.setText(g);
		input_documento.setText(String.valueOf(d));
		input_fechanacimiento.setText(f);
	}

	public static void main (String[] args)
	{
		new Controller();
	}
}
