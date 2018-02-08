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
	public void CreateUI()
	{
		JFrame yes = new JFrame();
		JPanel no = new JPanel();
		yes.add(no);
		
		JButton B1 = new JButton();
		JButton B2 = new JButton();
		JButton B3 = new JButton();
		JButton B4 = new JButton();
		B1.setSize(100,100);
		B2.setSize(100,100);
		B3.setSize(100,100);
		B4.setSize(100,100);
		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		B4.addActionListener(this);
	}
	
	private void playSound(String fileName) 
	{
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		
		
	}
}
