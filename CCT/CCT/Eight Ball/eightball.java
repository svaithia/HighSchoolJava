import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class eightball extends Applet implements ActionListener

{

    JLabel image = new JLabel (createImageIcon ("blank.jpg"));

    public void init ()
    {
	resize (500, 550);
	JLabel title = new JLabel ("Magic 8 Ball");
	title.setFont (new Font ("Arial", Font.BOLD, 60));

	JLabel intro = new JLabel ("Ask a yes/no question and press enter");
	intro.setFont (new Font ("Arial", Font.PLAIN, 25));
	JTextField question = new JTextField (30);
	question.setText ("Will all of the students pass?");

	JButton enter = new JButton ("Enter");
	JLabel ball = new JLabel (createImageIcon ("ball.jpg"));
	enter.addActionListener (this);
	enter.setActionCommand ("enter");

	add (title);
	add (intro);
	add (question);
	add (enter);
	add (ball);
	add (image);

    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("enter"))
	{
	    int answer = (int) (Math.random () * 16) + 1;
	    image.setIcon (createImageIcon (answer + ".gif"));
	}
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = eightball.class.getResource (path);
	if (imgURL != null)
	{
	    return new ImageIcon (imgURL);
	}
	else
	{
	    System.err.println ("Couldn't find file: " + path);
	    return null;
	}
    }
}


