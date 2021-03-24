package ventanas;

import javax.swing.JFrame;
import javax.swing.plaf.DimensionUIResource;
import java.awt.Color;

public class Venta extends JFrame{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Venta()
	{
		this.setSize(500, 500);

        // Cerrar proceso y ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Formulario Tarea");
        setLocationRelativeTo(null);
        setMinimumSize(new DimensionUIResource(500, 500));
        getContentPane().setBackground(Color.white);
        setVisible(true);

	}
	
	public static void main(String[] args)
	{
		
		new Venta();
	}
}
