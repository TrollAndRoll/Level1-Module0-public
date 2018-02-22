/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {

    JLabel drumLabelWithImage;
    JLabel drumLabel1;
    JLabel drumLabel2;

    public static void main(String[] args) throws Exception {
   	 new DrumKit().getGoing();
    }

    private void getGoing() throws MalformedURLException {
   	 // 1. Make a JFrame variable and initialize it using "new JFrame()"
   	 JFrame hi = new JFrame();
   	 // 2. Make the frame visible
   	 hi.setVisible(true);
   	 // 3. Set the size of the frame
   	 hi.setSize(50,50);
   	 // 4. Set the title of the frame
   	 hi.setTitle("Drum Kit");
   	 // 5. Make a JPanel and initialize it.
   	 JPanel hello = new JPanel();
   	 // 6. Add the panel to the frame. (The panel is invisible.)
   	 hi.add(hello);
   	 // 7. Download an image of a drum from the Internet. Drop it into your Eclipse project under "default package".
   	 // 8. Put the name of your image in a String variable.
   	 String drum = "drum.jpg";
   	 String drum2 = "drum2.jpg";
   	 String drum3 = "drum3.png";
   	 // 9. Edit the next line to use your String variable
   	 drumLabelWithImage = createLabelImage(drum);
   	 drumLabel1 = createLabelImage(drum2);
   	 drumLabel2 = createLabelImage(drum3);
   	 
   	 // 10. Add the image to the panel
     hello.add(drumLabelWithImage);
     hello.add(drumLabel1);
     hello.add(drumLabel2);
   	 // 11. Set the layout of the panel to "new GridLayout()"
     hello.setLayout(new GridLayout());
   	 // 12. call the pack() method on the frame
   	 hi.pack();
   	 // 13. add a mouse listener to drumLabelWithImage.
   	 drumLabelWithImage.addMouseListener(this);
   	 drumLabel1.addMouseListener(this);
   	 drumLabel2.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
   	 // 14. When the mouse is clicked, print "mouse clicked"
     System.out.println("mouse clicked");
   	 JLabel drumClicked = (JLabel) e.getSource();
   	 // 15. Download a drum sound and drop it into your "default package". You can find it on freesound.org. To download it, log in as leagueofamazing/code4life.
   	 // 16. If they clicked on the drumImage...
   	 //String sound = "drumsound.wav";
   	 	if(drumClicked == drumLabelWithImage)
   	 	{
   		 // 17. ...use the playSound method to play a drum sound.
   	 		playSound("drumsound.wav");
   	 	}
   	 	if(drumClicked == drumLabel1)
   	 	{
   	 		playSound("drumsound1.wav");
   	 	}
   	 	if(drumClicked == drumLabel2)
   	 	{
   	 		playSound("drumsound2.wav");
   	 	}
   	 // 18. Add more images to make a drumkit. Remember to add a mouse listener to each one.
    }

    private JLabel createLabelImage(String fileName)
			throws MalformedURLException
	{
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null)
		{
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}


    private void playSound(String fileName) {
   	 AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
   	 sound.play();
    }

}



