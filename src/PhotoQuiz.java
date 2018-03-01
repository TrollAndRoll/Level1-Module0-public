/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
//import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
//import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {
	static Component yes;
	static JFrame quizWindow = new JFrame();
	static JLabel scorer = new JLabel();
	static MouseListener l = new MouseListener() {
		
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
		try {
			replaceImage(quizWindow, scorer, "https://imageserve.babycenter.com/25/000/210/sZps4be03jlKOI3GSDqqm34pjna3fGkf_lg.jpg");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	};
	
	public static void main(String[] args) throws Exception {
		
		quizWindow.setLayout(new FlowLayout());
		
		quizWindow.setVisible(true);
		int score = 0;
		
		
		//quizWindow.setComponentOrientation(ComponentOrientation.);
		scorer.setText("Score:"+score);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		String panda = "https://c402277.ssl.cf1.rackcdn.com/photos/13100/images/featured_story/BIC_128.png?1485963152";
		// 2. create a variable of type "Component" that will hold your image
		
		// 3. use the "createImage()" method below to initialize your Component
		yes = createImage(panda);
		
		// 4. add the image to the quiz window
		yes.addMouseListener(l );
		quizWindow.add(yes);
		quizWindow.add(scorer);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog(null, "Is this panda chuby?\n(yes or no)");
		// 7. print "CORRECT" if the user gave the right answer
		if (answer.equalsIgnoreCase("yes"))
		{
			JOptionPane.showMessageDialog(null, "Correct!!!");
			score = score + 1;
		}
		// 8. print "INCORRECT" if the answer is wrong
		if (answer.equalsIgnoreCase("no"))
		{
			JOptionPane.showMessageDialog(null, "What???????\nHow is he not chubby!!!\nINCRORRECT!!!");
		}
		//JOptionPane.showMessageDialog(null, "Score:"+score);
		scorer.setText("Score:"+score);
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		replaceImage(quizWindow, scorer, "http://dogsaholic.com/wp-content/uploads/2015/07/Pug-810x539.jpg");
		// 12. pack the quiz window
		quizWindow.pack();
		//quizWindow.setSize(500,500);
		// 13. ask another question
		answer = JOptionPane.showInputDialog(null, "Is this pug cute?\n(yes or no)");
		// 14+ check answer, say if correct or incorrect, etc.
		if (answer.equalsIgnoreCase("yes"))
		{
			JOptionPane.showMessageDialog(null, "Correct!!!");
			score = score + 1;
		}
		// 8. print "INCORRECT" if the answer is wrong
		if (answer.equalsIgnoreCase("no"))
		{
			JOptionPane.showMessageDialog(null, "What???????\nHow is he not CUtE, he's adarouble!!!\nINCRORRECT!!!");
		}
		scorer.setText("You got"+score+"/2 correct!");
		quizWindow.remove(yes);
		quizWindow.add(scorer);
		quizWindow.pack();
	}

	private static void replaceImage(JFrame quizWindow, JLabel scorer, String imageurl) throws MalformedURLException {
		quizWindow.remove(yes);
		quizWindow.remove(scorer);
		// 10. find another image and create it (might take more than one line of code)
		String pug = imageurl;
		yes = createImage(pug);
		// 11. add the second image to the quiz window
		quizWindow.add(yes);
		quizWindow.add(scorer);
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





