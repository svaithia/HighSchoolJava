import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;


public class animal extends Applet implements ActionListener
{
JLabel one;
JLabel two;
JLabel three;

    public void init ()
    {
	JLabel title = new JLabel ("ANIMAL PICKER");
	title.setFont (new Font ("Arial", Font.BOLD, 30));
	title.setForeground (Color.ORANGE);


	JButton red1 = new JButton ("Feathers");
	red1.setBackground (Color.RED);
	red1.addActionListener (this);
	red1.setActionCommand ("1red");

	JButton green1 = new JButton ("Feathers");
	green1.setBackground (Color.GREEN);
	green1.addActionListener (this);
	green1.setActionCommand ("1green");

	JButton yellow1 = new JButton ("Feathers");
	yellow1.setBackground (Color.YELLOW);
	yellow1.addActionListener (this);
	yellow1.setActionCommand ("1yellow");

	///////////////////////

	JButton red2 = new JButton ("Eyes");
	red2.setBackground (Color.RED);
	red2.addActionListener (this);
	red2.setActionCommand ("2red");

	JButton green2 = new JButton ("Eyes");
	green2.setBackground (Color.GREEN);
	green2.addActionListener (this);
	green2.setActionCommand ("2green");

	JButton yellow2 = new JButton ("Eyes");
	yellow2.setBackground (Color.YELLOW);
	yellow2.addActionListener (this);
	yellow2.setActionCommand ("2yellow");

	////////////////////////

	JButton red3 = new JButton ("Beak");
	red3.setBackground (Color.RED);
	red3.addActionListener (this);
	red3.setActionCommand ("3red");

	JButton green3 = new JButton ("Beak");
	green3.setBackground (Color.GREEN);
	green3.addActionListener (this);
	green3.setActionCommand ("3green");

	JButton yellow3 = new JButton ("Beak");
	yellow3.setBackground (Color.YELLOW);
	yellow3.addActionListener (this);
	yellow3.setActionCommand ("3yellow");

	Panel p1 = new Panel ();
	p1.add (red1);
	p1.add (green1);
	p1.add (yellow1);


	Panel p2 = new Panel ();
	p2.add (red2);
	p2.add (green2);
	p2.add (yellow2);


	Panel p3 = new Panel ();
	p3.add (red3);
	p3.add (green3);
	p3.add (yellow3);

	Panel p4 = new Panel (new GridLayout (4, 1));
	p4.add (p1);
	p4.add (p2);
	p4.add (p3);


	add (title);
	add (p4);

	one = new JLabel (createImageIcon ("1red.gif"));
	two = new JLabel (createImageIcon ("2red.gif"));
	three = new JLabel (createImageIcon ("3red.gif"));

	Panel p5 = new Panel (new BorderLayout ());
	p5.add (one, "North");
	p5.add (two, "Center");
	p5.add (three, "South");

	add (p5);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("1red"))
	{
	    one.setIcon (createImageIcon ("1red.gif"));
	}
	if (e.getActionCommand ().equals ("2red"))
	{
	    two.setIcon (createImageIcon ("2red.gif"));
	}
	if (e.getActionCommand ().equals ("3red"))
	{
	    three.setIcon (createImageIcon ("3red.gif"));
	}

	if (e.getActionCommand ().equals ("1yellow"))
	{
	    one.setIcon (createImageIcon ("1yellow.gif"));
	}
	if (e.getActionCommand ().equals ("2yellow"))
	{
	    two.setIcon (createImageIcon ("2yellow.gif"));
	}
	if (e.getActionCommand ().equals ("3yellow"))
	{
	    three.setIcon (createImageIcon ("3yellow.gif"));
	}

	if (e.getActionCommand ().equals ("1green"))
	{
	    one.setIcon (createImageIcon ("1green.gif"));
	}
	if (e.getActionCommand ().equals ("2green"))
	{
	    two.setIcon (createImageIcon ("2green.gif"));
	}
	if (e.getActionCommand ().equals ("3green"))
	{
	    three.setIcon (createImageIcon ("3green.gif"));
	}
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = animal.class.getResource (path);
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


