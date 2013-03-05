import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;
/*

1. HALL
2. Conservatory
3. Office
4. Billiards
5. Ballroom
6. Library
7. Kitchen
8. Dining Room

Hall : 2, 5, 6, 7, 8
Conservatory : 1
Office : 4
Sitting Room : 3, 5
Ballroom : 4, 1
Library : 1
Kitchen : 1, 8
Dining Room : 7,1


*/

public class FindMeSTART extends Applet implements ActionListener
{
    Panel p_card; //to hold all of the screens
    Panel card1, card2, card3, card4, card5, card6, card7, card8;
    Panel dir, dir2, dir3, dir4, dir5;
    CardLayout cdLayout = new CardLayout ();

    public void init ()
    {
	p_card = new Panel ();
	p_card.setLayout (cdLayout);
	screen1 ();
	screen2 ();
	screen3 ();
	screen4 ();
	screen5 ();
	screen6 ();
	screen7 ();
	screen8 ();
	resize (425, 500);
	setLayout (new BorderLayout ());
	add ("Center", p_card);
    }


    public void screen1 ()
    { //screen 1 is set up.
	card1 = new Panel ();
	dir = new Panel (new GridLayout (5, 1));
	card1.setBackground (Color.white);
	JLabel title = new JLabel ("Hall");
	title.setFont (new Font ("Arial", Font.PLAIN, 40));
	JLabel pic = new JLabel (createImageIcon ("hall.gif"));
	JButton next = new JButton ("Conservatory");
	next.setActionCommand ("2");
	next.addActionListener (this);

	JButton next2 = new JButton ("Ballroom");
	next2.setActionCommand ("5");
	next2.addActionListener (this);

	JButton next3 = new JButton ("Library");
	next3.setActionCommand ("6");
	next3.addActionListener (this);

	JButton next4 = new JButton ("Kitchen");
	next4.setActionCommand ("7");
	next4.addActionListener (this);

	JButton next5 = new JButton ("Dining Room");
	next5.setActionCommand ("8");
	next5.addActionListener (this);

	JLabel found = new JLabel ("No! You did not find me! TRY AGAIN");
	found.setFont (new Font ("Arial", Font.PLAIN, 20));
	found.setForeground (Color.RED);

	card1.add (title);
	card1.add (pic);
	card1.add (found);
	dir.add (next);
	dir.add (next2);
	dir.add (next3);
	dir.add (next4);
	dir.add (next5);
	card1.add (dir);
	p_card.add ("1", card1);
    }


    public void screen2 ()
    { //screen 2 is set up.
	card2 = new Panel ();
	card2.setBackground (Color.white);
	JLabel title = new JLabel ("Conservatory");
	title.setFont (new Font ("Arial", Font.PLAIN, 40));
	JLabel pic = new JLabel (createImageIcon ("cons.gif"));
	JButton next = new JButton ("Back to Hall");
	next.setActionCommand ("1");
	next.addActionListener (this);
	JLabel found = new JLabel ("No! You did not find me! TRY AGAIN");
	found.setFont (new Font ("Arial", Font.PLAIN, 20));
	found.setForeground (Color.RED);
	card2.add (title);
	card2.add (pic);
	card2.add (found);
	card2.add (next);
	p_card.add ("2", card2);
    }


    public void screen3 ()
    { //screen 3 is set up.
	card3 = new Panel ();
	card3.setBackground (Color.white);
	JLabel title = new JLabel ("Office");
	title.setFont (new Font ("Arial", Font.PLAIN, 40));
	JLabel found = new JLabel ("Yay! You found me! You WON!");
	found.setFont (new Font ("Arial", Font.PLAIN, 20));
	found.setForeground (Color.GREEN);
	JLabel pic = new JLabel (createImageIcon ("office.gif"));
	JButton next = new JButton ("Billiards");
	next.setActionCommand ("4");
	next.addActionListener (this);
	card3.add (title);
	card3.add (pic);
	card3.add (found);
	card3.add (next);
	p_card.add ("3", card3);
    }


    public void screen4 ()

    { //screen 4 is set up.
	card4 = new Panel ();
	dir2 = new Panel ();
	card4.setBackground (Color.white);
	JLabel title = new JLabel ("Billiards");
	title.setFont (new Font ("Arial", Font.PLAIN, 40));
	JLabel pic = new JLabel (createImageIcon ("billard.gif"));
	JButton next = new JButton ("Back to Office");
	next.setActionCommand ("3");
	next.addActionListener (this);
	JLabel found = new JLabel ("No! You did not find me! TRY AGAIN");
	found.setFont (new Font ("Arial", Font.PLAIN, 20));
	found.setForeground (Color.RED);
	JButton next2 = new JButton ("Ballroom");
	next2.setActionCommand ("5");
	next2.addActionListener (this);

	card4.add (title);
	card4.add (pic);
	card4.add (found);
	dir2.add (next);
	dir2.add (next2);
	card4.add (dir2);

	p_card.add ("4", card4);
    }


    public void screen5 ()

    { //screen 5 is set up.
	card5 = new Panel ();
	dir3 = new Panel ();
	card5.setBackground (Color.white);
	JLabel title = new JLabel ("Ballroom");
	title.setFont (new Font ("Arial", Font.PLAIN, 40));
	JLabel pic = new JLabel (createImageIcon ("ballroom.gif"));
	JButton next = new JButton ("Billiards");
	next.setActionCommand ("4");
	next.addActionListener (this);
	JButton next2 = new JButton ("Back to Hall");
	next2.setActionCommand ("1");
	next2.addActionListener (this);
	JLabel found = new JLabel ("No! You did not find me! TRY AGAIN");
	found.setFont (new Font ("Arial", Font.PLAIN, 20));
	found.setForeground (Color.RED);
	card5.add (title);
	card5.add (pic);
	card5.add (found);
	dir3.add (next);
	dir3.add (next2);
	card5.add (dir3);
	p_card.add ("5", card5);
    }


    public void screen6 ()
    { //screen 6 is set up.
	card6 = new Panel ();
	card6.setBackground (Color.white);
	JLabel title = new JLabel ("Library");
	title.setFont (new Font ("Arial", Font.PLAIN, 40));
	JLabel pic = new JLabel (createImageIcon ("library.gif"));
	JButton next = new JButton ("Back to Hall");
	next.setActionCommand ("1");
	next.addActionListener (this);
	JLabel found = new JLabel ("No! You did not find me! TRY AGAIN");
	found.setFont (new Font ("Arial", Font.PLAIN, 20));
	found.setForeground (Color.RED);
	card6.add (title);
	card6.add (pic);
	card6.add (found);
	card6.add (next);
	p_card.add ("6", card6);
    }


    public void screen7 ()
    { //screen 7 is set up.
	card7 = new Panel ();
	dir4 = new Panel ();
	card7.setBackground (Color.white);
	JLabel title = new JLabel ("Kitchen");
	title.setFont (new Font ("Arial", Font.PLAIN, 40));
	JLabel pic = new JLabel (createImageIcon ("kitchen.gif"));
	JButton next = new JButton ("Back to Hall");
	next.setActionCommand ("1");
	next.addActionListener (this);
	JLabel found = new JLabel ("No! You did not find me! TRY AGAIN");
	found.setFont (new Font ("Arial", Font.PLAIN, 20));
	found.setForeground (Color.RED);
	JButton next2 = new JButton ("Dining Room");
	next2.setActionCommand ("8");
	next2.addActionListener (this);

	card7.add (title);
	card7.add (pic);
	card7.add (found);
	dir4.add (next);
	dir4.add (next2);
	card7.add (dir4);
	p_card.add ("7", card7);
    }


    public void screen8 ()
    { //screen 8 is set up.
	card8 = new Panel ();
	dir5 = new Panel ();
	card8.setBackground (Color.white);
	JLabel title = new JLabel ("Dining Room");
	title.setFont (new Font ("Arial", Font.PLAIN, 40));
	JLabel pic = new JLabel (createImageIcon ("dining.gif"));
	JButton next = new JButton ("Kitchen");
	next.setActionCommand ("7");
	next.addActionListener (this);
	JLabel found = new JLabel ("No! You did not find me! TRY AGAIN");
	found.setFont (new Font ("Arial", Font.PLAIN, 20));
	found.setForeground (Color.RED);
	JButton next2 = new JButton ("Back to Hall");
	next2.setActionCommand ("1");
	next2.addActionListener (this);

	card8.add (title);
	card8.add (pic);
	card8.add (found);
	dir5.add (next);
	dir5.add (next2);
	card8.add (dir5);
	p_card.add ("8", card8);
    }


    public void actionPerformed (ActionEvent e)
    { //moves between the screens
	if (e.getActionCommand ().equals ("1"))
	    cdLayout.show (p_card, "1");
	else if (e.getActionCommand ().equals ("2"))
	    cdLayout.show (p_card, "2");
	else if (e.getActionCommand ().equals ("3"))
	    cdLayout.show (p_card, "3");
	else if (e.getActionCommand ().equals ("4"))
	    cdLayout.show (p_card, "4");
	else if (e.getActionCommand ().equals ("5"))
	    cdLayout.show (p_card, "5");
	else if (e.getActionCommand ().equals ("6"))
	    cdLayout.show (p_card, "6");
	else if (e.getActionCommand ().equals ("7"))
	    cdLayout.show (p_card, "7");
	else if (e.getActionCommand ().equals ("8"))
	    cdLayout.show (p_card, "8");

    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = FindMeSTART.class.getResource (path);
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
