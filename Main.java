# FreeLuke
Free Luke after the security breach 
import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FreeLuke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -1;
		while (x < 0 ){
			JFrame frame = new JFrame();
			JButton button = new JButton("FreeLuke");
			Random rand = new Random();
			
			frame.pack();
			
			frame.setBackground(Color.BLUE);
			frame.setForeground(Color.red);
			button.setBackground(Color.YELLOW);
			frame.add(button);
			frame.setVisible(true);
			frame.setOpacity(1);
			frame.setSize(rand.nextInt(800), rand.nextInt(800));
			frame.setLocation(rand.nextInt(2000), rand.nextInt(1000));
			
		}
	}

}
