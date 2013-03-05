import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import java.io.*;

//Requires a hall.gif and billard.gif in folder "pics"

public class FindMe extends Applet implements ActionListener
{

    Panel p_card; //to hold all of the cards
    Panel card1, card2, card3, card4, card5, card6, card7, card8; //the two screens
    CardLayout cdLayout = new CardLayout ();

    public void init ()
    {
	p_card = new Panel ();
	p_card.setLayout (cdLayout);
	//make the 2 screens
	hall (); //1
	sunroom (); //2
	conservatory (); //3
	parlor (); //4
	washroom (); //5
	office (); //6
	sitting (); //7
	ballroom (); //8
	resize (300, 300);
	setLayout (new BorderLayout ());
	add ("Center", p_card);

    }


    public void hall ()
    { //Pre: p_card is a cdLayout, card1 is declared
	//Post: initializes opening screen's widgets.
	card1 = new Panel ();
	card1.setBackground (Color.white);
	JLabel hall = new JLabel (createImageIcon ("hall.gif"));

	JLabel title = new JLabel (" Find Me! ");
	title.setFont (new Font ("Arial", Font.BOLD, 30));
	title.setForeground (Color.red);
	JLabel title2 = new JLabel ("You are in the main hall.");
	title2.setFont (new Font ("Arial", Font.BOLD, 18));
	title2.setForeground (Color.blue);
	JLabel title3 = new JLabel ("Look throughout my house to find me.");


	JButton sunroom = new JButton ("Sunroom");
	sunroom.setActionCommand ("2");
	sunroom.addActionListener (this);

	JButton conservatory = new JButton ("Conservatory");
	conservatory.setActionCommand ("3");
	conservatory.addActionListener (this);

	JButton parlor = new JButton ("Parlor");
	parlor.setActionCommand ("4");
	parlor.addActionListener (this);

	JButton washroom = new JButton ("Washroom");
	washroom.setActionCommand ("5");
	washroom.addActionListener (this);

	Panel p = new Panel (new GridLayout (4, 1));
	p.add (sunroom);
	p.add (conservatory);
	p.add (parlor);
	p.add (washroom);

	card1.add (title);
	card1.add (hall);
	card1.add (title2);
	card1.add (title3);
	card1.add (p);
	p_card.add ("1", card1);
    }


    public void sunroom ()
    { //Pre: p_card is a cdLayout, card2 is declared
	//Post: initializes rules screen's widgets.
	card2 = new Panel ();
	card2.setBackground (Color.white);
	JLabel title = new JLabel ("Sunroom Room");
	title.setFont (new Font ("Arial", Font.BOLD, 18));
	title.setForeground (Color.red);

	JLabel words = new JLabel ("I'm not here! Keep Looking.");
	JLabel pic = new JLabel (createImageIcon ("billard.gif"));

	//to move to the next screen
	JButton next2 = new JButton ("Back to Hall", createImageIcon ("hall.gif"));
	next2.setActionCommand ("1");
	next2.addActionListener (this);

	next2 = new JButton ("Office", createImageIcon ("hall.gif"));
	next2.setActionCommand ("6");
	next2.addActionListener (this);

	card2.add (pic);
	card2.add (title);
	card2.add (words);
	card2.add (next2);

	p_card.add ("2", card2);
    }


    public void conservatory ()
    { //Pre: p_card is a cdLayout, card2 is declared
	//Post: initializes rules screen's widgets.
	card3 = new Panel ();
	card3.setBackground (Color.white);
	JLabel title = new JLabel ("Conservatory Room");
	title.setFont (new Font ("Arial", Font.BOLD, 18));
	title.setForeground (Color.red);

	JLabel words = new JLabel ("I'm not here! Keep Looking.");
	JLabel pic = new JLabel (createImageIcon ("billard.gif"));

	//to move to the next screen
	JButton next3 = new JButton ("Back to Hall", createImageIcon ("hall.gif"));
	next3.setActionCommand ("1");
	next3.addActionListener (this);

	next3 = new JButton ("Sitting Room", createImageIcon ("hall.gif"));
	next3.setActionCommand ("7");
	next3.addActionListener (this);

	card3.add (pic);
	card3.add (title);
	card3.add (words);
	card3.add (next3);

	p_card.add ("3", card3);
    }


  public void parlor ()
    { //Pre: p_card is a cdLayout, card2 is declared
	//Post: initializes rules screen's widgets.
	card4 = new Panel ();
	card4.setBackground (Color.white);
	JLabel title = new JLabel ("Conservatory Room");
	title.setFont (new Font ("Arial", Font.BOLD, 18));
	title.setForeground (Color.red);

	JLabel words = new JLabel ("I'm not here! Keep Looking.");
	JLabel pic = new JLabel (createImageIcon ("billard.gif"));

	//to move to the next screen
	JButton next4 = new JButton ("Back to Hall", createImageIcon ("hall.gif"));
	next4.setActionCommand ("1");
	next4.addActionListener (this);


	card4.add (pic);
	card4.add (title);
	card4.add (words);
	card4.add (next4);

	p_card.add ("4", card4);
    }

  public void washroom ()
    { //Pre: p_card is a cdLayout, card2 is declared
	//Post: initializes rules screen's widgets.
	card5 = new Panel ();
	card5.setBackground (Color.white);
	JLabel title = new JLabel ("Washroom");
	title.setFont (new Font ("Arial", Font.BOLD, 18));
	title.setForeground (Color.red);

	JLabel words = new JLabel ("I'm not here! Keep Looking.");
	JLabel pic = new JLabel (createImageIcon ("billard.gif"));

	//to move to the next screen
	JButton next5 = new JButton ("Back to Hall", createImageIcon ("hall.gif"));
	next5.setActionCommand ("1");
	next5.addActionListener (this);
	//to move to the next screen
	next5 = new JButton ("Ballroom", createImageIcon ("hall.gif"));
	next5.setActionCommand ("8");
	next5.addActionListener (this);

	
	card5.add (pic);
	card5.add (title);
	card5.add (words);
	card5.add (next5);

	p_card.add ("5", card5);
    }


    
    ////////
    
     public void office ()
    { //Pre: p_card is a cdLayout, card2 is declared
	//Post: initializes rules screen's widgets.
	card6 = new Panel ();
	card6.setBackground (Color.white);
	JLabel title = new JLabel ("Washroom");
	title.setFont (new Font ("Arial", Font.BOLD, 18));
	title.setForeground (Color.red);

	JLabel words = new JLabel ("I'm not here! Keep Looking.");
	JLabel pic = new JLabel (createImageIcon ("billard.gif"));

	//to move to the next screen
	JButton next6 = new JButton ("Sunroom", createImageIcon ("hall.gif"));
	next6.setActionCommand ("2");
	next6.addActionListener (this);
	//to move to the next screen

	
	card6.add (pic);
	card6.add (title);
	card6.add (words);
	card6.add (next6);

	p_card.add ("6", card6);
    }





 public void sitting ()
    { //Pre: p_card is a cdLayout, card2 is declared
	//Post: initializes rules screen's widgets.
	card7 = new Panel ();
	card7.setBackground (Color.white);
	JLabel title = new JLabel ("Washroom");
	title.setFont (new Font ("Arial", Font.BOLD, 18));
	title.setForeground (Color.red);

	JLabel words = new JLabel ("I'm not here! Keep Looking.");
	JLabel pic = new JLabel (createImageIcon ("billard.gif"));

	//to move to the next screen
	JButton next7 = new JButton ("Sunroom", createImageIcon ("hall.gif"));
	next7.setActionCommand ("2");
	next7.addActionListener (this);
	//to move to the next screen

	
	card7.add (pic);
	card7.add (title);
	card7.add (words);
	card7.add (next7);

	p_card.add ("7", card7);
    }


public void ballroom ()
    { //Pre: p_card is a cdLayout, card2 is declared
	//Post: initializes rules screen's widgets.
	card7 = new Panel ();
	card7.setBackground (Color.white);
	JLabel title = new JLabel ("Washroom");
	title.setFont (new Font ("Arial", Font.BOLD, 18));
	title.setForeground (Color.red);

	JLabel words = new JLabel ("I'm not here! Keep Looking.");
	JLabel pic = new JLabel (createImageIcon ("billard.gif"));

	//to move to the next screen
	JButton next8 = new JButton ("Sunroom", createImageIcon ("hall.gif"));
	next8.setActionCommand ("2");
	next8.addActionListener (this);
	//to move to the next screen

	
	card8.add (pic);
	card8.add (title);
	card8.add (words);
	card8.add (next8);

	p_card.add ("8", card8);
    }





    /** Listens to the radio buttons and buttons.
    @param e.getActionCommand holds Again, Reset, rock, scissors, paper
    */
    public void actionPerformed (ActionEvent e)
    {
	//moves between the screens
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


    /**
    Makes an image icon to go on a button
    @param path is a valid path to a jpg or gif image
    @return an ImageIcon, or null if the path was invalid.
    Directly from: http://java.sun.com/docs/books/tutorial/uiswing/components/example-1dot4/index.html#RadioButtonDemo
    */
    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = FindMe.class.getResource (path);
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
