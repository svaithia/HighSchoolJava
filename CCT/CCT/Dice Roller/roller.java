import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;


public class roller extends Applet implements ActionListener
{
    JLabel ydice;
    JLabel cdice;
    JButton yroll;
    JButton croll;
    JLabel update;
    JLabel score;
    int yous = 0;
    int comps = 0;
    int dicenum;
    int dicenum2;

    public void init ()
    {
	resize (200, 350);

	JLabel main = new JLabel ("High Roller");
	main.setForeground (Color.red);
	main.setFont (new Font ("Arial", Font.BOLD, 35));
	//YOU
	ydice = new JLabel (createImageIcon ("blank.gif")); //IMAGE
	yroll = new JButton ("Roll!");
	yroll.addActionListener (this);
	yroll.setActionCommand ("yroll");
	yroll.setFont (new Font ("Arial", Font.BOLD, 25));
	//COMP
	cdice = new JLabel (createImageIcon ("blank.gif")); //IMAGE
	croll = new JButton ("Roll!");
	croll.addActionListener (this);
	croll.setActionCommand ("croll");
	croll.setEnabled (false);
	croll.setFont (new Font ("Arial", Font.BOLD, 25));

	JButton again = new JButton ("Play Again!");
	again.addActionListener (this);
	again.setActionCommand ("again");
	///
	update = new JLabel ("Click Roll!\n\n");
	update.setFont(new Font("Arial", Font.ITALIC, 18));
	score = new JLabel ("You: " + yous + " Computer: " + comps);
	score.setFont(new Font("Arial", Font.BOLD, 20));
	score.setBounds(20,20,100,30);
	////
	add (main);
	add (ydice);
	add (yroll);
	//
	add (cdice);
	add (croll);
	//
	add (update);
	add (score);
	 
	add (again);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("yroll"))
	{
	    dicenum = (int) (Math.random () * 6) + 1;
	    ydice.setIcon (createImageIcon ("d" + dicenum + ".gif"));
	    yroll.setEnabled (false);
	    croll.setEnabled (true);

	}
	else if (e.getActionCommand ().equals ("croll"))
	{
	    dicenum2 = (int) (Math.random () * 6) + 1;
	    cdice.setIcon (createImageIcon ("d" + dicenum2 + ".gif"));
	    yroll.setEnabled (true);
	    croll.setEnabled (false);

	    if (dicenum < dicenum2)
	    {
		update.setText ("Computer won!");
		comps++;
	    }


	    else if (dicenum2 < dicenum)
	    {
		update.setText ("You won!");
		yous++;
	    }


	    else
	    {
		update.setText ("Tie - No points!");
	    }


	    score.setText ("You: " + yous + " Computer: " + comps);
	}

	if (e.getActionCommand ().equals ("again"))
	{
	    yous = 0;
	    comps = 0;
	    score.setText ("You: " + yous + " Computer: " + comps);
	    yroll.setEnabled (true);
	    croll.setEnabled (false);
	}
    }
    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = roller.class.getResource (path);
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
