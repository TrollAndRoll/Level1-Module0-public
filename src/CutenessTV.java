import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener 
{
	JButton B1 = new JButton();
	JButton B2 = new JButton();
	JButton B3 = new JButton();
	
	public static void main(String[] args) 
	{
		
		new CutenessTV().CreateRun();
		
	}
	
	void CreateRun()
	{
		JFrame hi = new JFrame();
		JPanel bye = new JPanel();
		
		hi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		hi.setVisible(true);
		
		hi.add(bye);
		bye.add(B1);
		bye.add(B2);
		bye.add(B3);
		
		B1.setText("Penguins");
		B2.setText("Kermit");
		B3.setText("Unicorns!!!!!");
		
		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		
		hi.pack();
	}
	
	void showDucks() 
	{
	     playVideo("Drirjl5K9Yk");
	}

	void showFrog() 
	{
	     playVideo("S2DTLbTQj0I");
	}

	void showFluffyUnicorns() 
	{
	     playVideo("PUCgC_TukKg");
	}
	
	public void actionPerformed(ActionEvent arg0) 
	{
		JButton buttonPressed = (JButton) arg0.getSource();
		
		if(buttonPressed == B1)
		{
			showDucks();
		}
		else if(buttonPressed == B2)
		{
			showFrog();
		}
		else if(buttonPressed == B3)
		{
			showFluffyUnicorns();
		}
	}

	void playVideo(String videoID) 
	{
	     try 
	     {
	          URI uri = new URI("https://youtu.be/" + videoID + "?autoplay=1");
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) 
	     {
	          e.printStackTrace();
	     }
	}
}


