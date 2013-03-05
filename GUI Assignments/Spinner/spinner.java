import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;


public class spinner extends Applet implements ActionListener
{
    JLabel spinner;

    public void init ()
    {
	resize (300, 300);

	JLabel main = new JLabel ("Spin the Spinner");
	main.setFont (new Font ("Arial", Font.BOLD, 30));

	spinner = new JLabel (createImageIcon ("blank.gif")); //IMAGE
	JButton roll = new JButton ("Roll!");
	roll.setBackground (Color.white);
	roll.addActionListener (this);
	roll.setActionCommand ("roll");
	roll.setFont (new Font ("Arial", Font.BOLD, 25));

	add (main);
	add (roll);
	add (spinner);

    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("roll"))
	{
	    int spinnernum = (int) (Math.random () * 4) + 1;
	    spinner.setIcon (createImageIcon (spinnernum + ".gif"));
	}
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = spinner.class.getResource (path);
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


