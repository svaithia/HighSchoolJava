import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;


public class rolldice extends Applet implements ActionListener
{
    JLabel dice;

    public void init ()
    {
	resize (625, 612);

	JLabel main = new JLabel ("Click to Roll the Dice");
	main.setForeground (Color.red);
	main.setFont (new Font ("Arial", Font.BOLD, 40));

	dice = new JLabel (createImageIcon ("blank.gif")); //IMAGE
	JButton roll = new JButton ("Roll!");
	roll.addActionListener (this);
	roll.setActionCommand ("roll");
	roll.setFont (new Font ("Arial", Font.BOLD, 25));

	add (main);
	add (roll);
	add (dice);

    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("roll"))
	{
	    int dicenum = (int) (Math.random () * 6) + 1;
	    dice.setIcon (createImageIcon ("d" + dicenum + ".gif"));
	}
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = rolldice.class.getResource (path);
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


