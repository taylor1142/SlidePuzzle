import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SlideWindow{



  public SlideWindow()
	{
	JFrame MainFrame = new JFrame();
	MainFrame.setTitle("Slide Puzzle");
	MainFrame.setSize(600,600);
	MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel panel1 = new JPanel();
	MainFrame.setContentPane(panel1);
	GridLayout l1 = new GridLayout(3,4);
	panel1.setLayout(l1);
	for(int x = 0; x < 12; x++)
		{
		ImageIcon i_b0 = new ImageIcon("images/bart" +x+".jpg");
		JButton b_b0 = new JButton(i_b0);
		panel1.add(b_b0);
		b_b0.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				System.out.println("asdjaosidjaoisjd");
			} 
		} );
		}
	MainFrame.setVisible(true);
	
	
	
	}


}