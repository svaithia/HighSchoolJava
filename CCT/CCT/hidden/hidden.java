import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;


public class hidden extends Applet implements ActionListener
{
    JTextField first;
    JTextField second;
    JTextField third;
    JLabel level;
    JLabel hidden;
    JLabel First;
    JLabel Second;
    JLabel Third;
    JButton enter;

    public void init ()
    {
	resize (525, 700);
	JLabel title = new JLabel ("Hidden Image"); //
	title.setFont (new Font ("Arial", Font.BOLD, 50)); //
	title.setForeground (Color.RED); //

	level = new JLabel ("LVL 1"); //2

	hidden = new JLabel (createImageIcon ("1/1.jpg"));

	First = new JLabel (createImageIcon ("1/one.gif"));
	first = new JTextField (2);

	Second = new JLabel (createImageIcon ("1/two.gif"));
	second = new JTextField (2);


	Third = new JLabel (createImageIcon ("1/three.gif"));
	third = new JTextField (2);


	enter = new JButton ("Enter");
	enter.addActionListener (this);
	enter.setActionCommand ("enter");

	JPanel numbers = new JPanel ();
	numbers.add (First);
	numbers.add (first);
	numbers.add (Second);
	numbers.add (second);
	numbers.add (Third);
	numbers.add (third);
	numbers.add (enter);

	add (title);
	add (level);
	add (hidden);
	add (numbers);
    }


    public void actionPerformed (ActionEvent e)
    {
	String firstt = first.getText ();
	String secondd = second.getText ();
	String thirdd = third.getText ();
	if (e.getActionCommand ().equals ("enter"))
	{

	    //B1 | B1 | A1
	    if (firstt.equals ("B1") && secondd.equals ("B1") && thirdd.equals ("A1"))
	    {
		resize (525, 700);
		JOptionPane.showMessageDialog (null, "You got them all! Well Done. Move to Level 2", "You got it!", JOptionPane.INFORMATION_MESSAGE);
		level.setText ("LVL 2");
		First.setIcon (createImageIcon ("2/one.JPG"));
		Second.setIcon (createImageIcon ("2/two.JPG"));
		Third.setIcon (createImageIcon ("2/three.JPG"));
		hidden.setIcon (createImageIcon ("2/2.jpg"));
		first.setText ("");
		second.setText ("");
		third.setText ("");
		enter.setActionCommand ("enter2");
	    }
	    else
	    {
	    JOptionPane.showMessageDialog (null, "Some of the Positions were incorrect. Try again.", "You didn't get them all!", JOptionPane.ERROR_MESSAGE);
	    }
	}
	if (e.getActionCommand ().equals ("enter2"))
	{
	    //E1 || A1 || E4
	    if (firstt.equals ("E1") && secondd.equals ("A1") && thirdd.equals ("E4"))
	    {

		JOptionPane.showMessageDialog (null, "You got them all! Well Done. Move to Level 3", "You got it!", JOptionPane.INFORMATION_MESSAGE);
		level.setText ("LVL 3");
		First.setIcon (createImageIcon ("3/one.GIF"));
		Second.setIcon (createImageIcon ("3/two.GIF"));
		Third.setIcon (createImageIcon ("3/three.GIF"));
		hidden.setIcon (createImageIcon ("3/3.jpg"));
		first.setText ("");
		second.setText ("");
		third.setText ("");
		enter.setActionCommand ("enter3");
	    }
	    else
	    {
		JOptionPane.showMessageDialog (null, "Some of the Positions were incorrect. Try again.", "You didn't get them all!", JOptionPane.ERROR_MESSAGE);
	    }
	}
	if (e.getActionCommand ().equals ("enter3"))
	{
	    //E1 || A1 || E4
	    if (firstt.equals ("E4") && secondd.equals ("") && thirdd.equals (""))
	    {

		JOptionPane.showMessageDialog (null, "Some of the Positions were incorrect. Try again.", "You didn't get them all!", JOptionPane.ERROR_MESSAGE);
		

	    }
	    else
	    {
		JOptionPane.showMessageDialog (null, "Some of the Positions were incorrect. Try again.", "You didn't get them all!", JOptionPane.ERROR_MESSAGE);
	    }
	}
	


    }




    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = hidden.class.getResource (path);
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


