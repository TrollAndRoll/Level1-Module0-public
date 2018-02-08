import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener 
{
	
	
	
	public static void main(String[] args) 
	{
		
		
		new FortuneCookie().showButtons();
		
		
	}
	JButton button = new JButton();
	void showButtons()
	{
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		button.setSize(200, 200);
		button.setText("Press me for fortune");
		frame.add(button);
		button.addActionListener(this);
		
		System.out.println("Button");
		frame.pack();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JOptionPane.showMessageDialog(null, "Woohoo!!!");
		int rand = new Random().nextInt(5);
		String yes = "hi";
		
		if (rand == 0)
		{
			yes = "Khoalas whill sniff your kitten.";
		}
		if (rand == 1)
		{
			yes = "A horse will trample on your seeds";
		}
		if (rand == 2)
		{
			yes = "A panda will lick your palm";
		}
		if (rand == 3)
		{
			yes = "A strawberry will fall on your head";
		}
		if (rand == 4)
		{
			yes  ="An alligator will bark";
		}
		
		JOptionPane.showMessageDialog(null, yes);
	}
}
