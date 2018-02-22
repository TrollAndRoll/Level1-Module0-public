import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener 
{
	public static void main(String[] args) 
	{
		new SoundEffects().CreateUI();
		
	}
	JButton B1 = new JButton("Drum Sound");
	JButton B2 = new JButton("Other Drum Sound");
	JButton B3 = new JButton("Third Drum Sound");
	JButton B4 = new JButton("You get the idea");
	
	public void CreateUI()
	{
		JFrame yes = new JFrame();
		yes.setTitle("Sound Effects");
		yes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel no = new JPanel();
		yes.setSize(500,500);
		no.setSize(500,500);
		yes.add(no);
		
		
		B1.setSize(100,100);
		B2.setSize(100,100);
		B3.setSize(100,100);
		B4.setSize(100,100);
		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		B4.addActionListener(this);
		
		no.add(B1);
		no.add(B2);
		no.add(B3);
		no.add(B4);
		
		yes.setVisible(true);
		yes.pack();
	}
	
	private void playSound(String fileName) 
	{
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		JButton buttonPressed = (JButton) arg0.getSource();
		
		if(buttonPressed == B1)
		{
			playSound("drumsound.wav");
		}
		if(buttonPressed == B2)
		{
			playSound("drumsound1.wav");
		}
		if(buttonPressed == B3)
		{
			playSound("drumsound2.wav");
		}
		if(buttonPressed == B4)
		{
			playSound("drumbsound3.wav");
		}
	}
}
