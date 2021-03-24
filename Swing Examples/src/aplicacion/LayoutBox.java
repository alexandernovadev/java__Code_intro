package aplicacion;


import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LayoutBox {
	public JFrame vb = new JFrame("Box LAYOUT");
	public JPanel boxl = new JPanel();
	public JLabel etiqueta = new JLabel("Box Layout");
	public JLabel etiquetaflow = new JLabel("Mira el CODE en LayoutBocx.java");

	public LayoutBox()
	{
		vb.getContentPane().setLayout(new BoxLayout(vb.getContentPane(),BoxLayout.Y_AXIS));
		etiqueta.setVisible(true);
		boxl.add(etiqueta);
		vb.setBackground(Color.white);
		vb.setBounds(110, 110, 260, 100);
		vb.setVisible(false);
	}
	
}
