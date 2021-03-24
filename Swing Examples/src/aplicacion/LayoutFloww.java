package aplicacion;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class LayoutFloww {
	public JFrame v = new JFrame("Flow Layout");
	public JPanel flowl = new JPanel();
	public JLabel etiquetaflow = new JLabel("Mira el CODE en LayoutFloww.java");
	
	public LayoutFloww()
	{
		this.flowl.setLayout(new FlowLayout());
		flowl.add(etiquetaflow);
		flowl.setBackground(Color.white);
		
		v.setContentPane(flowl);
		v.setBounds(110, 110, 260, 100);
		v.setVisible(false);
	}
	
}