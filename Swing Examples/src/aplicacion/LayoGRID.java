package aplicacion;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LayoGRID {
	private static final int COLUMNAS = 10;
	private static final int FILAS = 5;
	public JFrame vb = new JFrame("GRID LAyout");
	public LayoGRID()
	{
		
      vb.getContentPane().setLayout(new GridLayout(FILAS,COLUMNAS));
		
      JTextField [][] textField = new JTextField [FILAS][COLUMNAS];
      for (int i=0;i<FILAS;i++)
         for (int j=0;j<COLUMNAS;j++)
         {
            textField[i][j] = new JTextField(1);
            vb.getContentPane().add(textField[i][j]);
         }
		
		
		vb.setBackground(Color.white);
		vb.setBounds(120, 30, 300, 300);
		vb.setVisible(false);
	}
	
}
