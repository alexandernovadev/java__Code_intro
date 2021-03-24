package aplicacion;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class LayoutSpring {
  	JFrame frame = new JFrame();
    Container contentPane = frame.getContentPane();
    SpringLayout layout = new SpringLayout();
    
    public LayoutSpring(){
    	   contentPane.setLayout(layout);
           contentPane.add(new JLabel("Label: "));
           contentPane.add(new JTextField("Text field", 15));
           
           frame.setBounds(110, 110, 260, 100);
           frame.setVisible(false);
    }
    public static void main(String[] args) {
        
  
     
    }
}