import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class tictac extends Applet implements ActionListener
{
    String turn = "X";
    JButton b11, b12, b13, b14, b15, b16, b17, b18, b19;
    int xWins = 0;
    int oWins = 0;
    JLabel label = new JLabel ("Let's Play!");
    public void init ()
    {
	JLabel title = new JLabel ("Tic-Tac-Toe");

	title.setFont (new Font ("Arial", Font.PLAIN, 40));
	title.setForeground (Color.RED);
	JLabel pic = new JLabel (createImageIcon ("tictactoe.gif"));
	add (title);
	add (pic);
	Panel p = new Panel (new GridLayout (3, 3));
	b11 = new JButton ("__");
	b11.setFont (new Font ("Arial", Font.PLAIN, 50));
	b11.setBackground (Color.WHITE);
	b11.setActionCommand ("11");
	b11.addActionListener (this);
	p.add (b11);
	b12 = new JButton ("__");
	b12.setActionCommand ("12");
	b12.setBackground (Color.WHITE);
	b12.addActionListener (this);
	b12.setFont (new Font ("Arial", Font.PLAIN, 50));
	p.add (b12);
	b13 = new JButton ("__");
	b13.setActionCommand ("13");
	b13.setBackground (Color.WHITE);
	b13.addActionListener (this);
	b13.setFont (new Font ("Arial", Font.PLAIN, 50));
	p.add (b13);
	b14 = new JButton ("__");
	b14.setActionCommand ("14");
	b14.addActionListener (this);
	b14.setBackground (Color.WHITE);
	b14.setFont (new Font ("Arial", Font.PLAIN, 50));
	p.add (b14);
	b15 = new JButton ("__");
	b15.setActionCommand ("15");
	b15.addActionListener (this);
	b15.setBackground (Color.WHITE);
	b15.setFont (new Font ("Arial", Font.PLAIN, 50));
	p.add (b15);
	b16 = new JButton ("__");
	b16.setActionCommand ("16");
	b16.addActionListener (this);
	b16.setBackground (Color.WHITE);
	b16.setFont (new Font ("Arial", Font.PLAIN, 50));
	p.add (b16);
	b17 = new JButton ("__");
	b17.setActionCommand ("17");
	b17.addActionListener (this);
	b17.setBackground (Color.WHITE);
	b17.setFont (new Font ("Arial", Font.PLAIN, 50));
	p.add (b17);
	b18 = new JButton ("__");
	b18.setActionCommand ("18");
	b18.addActionListener (this);
	b18.setBackground (Color.WHITE);
	b18.setFont (new Font ("Arial", Font.PLAIN, 50));
	p.add (b18);
	b19 = new JButton ("__");
	b19.setActionCommand ("19");
	b19.addActionListener (this);
	b19.setBackground (Color.WHITE);
	b19.setFont (new Font ("Arial", Font.PLAIN, 50));
	p.add (b19);
	add (p);
	add (label);
	resize (325, 500);

    }


    public void actionPerformed (ActionEvent e)
    { //Switch the button's label
	if (e.getActionCommand ().equals ("11") && b11.getText ().equals ("__"))
	{
	    b11.setText (turn);
	    b11.setEnabled (false);
	}

	else if (e.getActionCommand ().equals ("12"))
	{
	    b12.setText (turn);
	    b12.setEnabled (false);
	}
	else if (e.getActionCommand ().equals ("13"))
	{
	    b13.setText (turn);
	    b13.setEnabled (false);
	}
	else if (e.getActionCommand ().equals ("14"))
	{
	    b14.setText (turn);
	    b14.setEnabled (false);
	}
	else if (e.getActionCommand ().equals ("15"))
	{
	    b15.setText (turn);
	    b15.setEnabled (false);
	}
	else if (e.getActionCommand ().equals ("16"))
	{
	    b16.setText (turn);
	    b16.setEnabled (false);
	}
	else if (e.getActionCommand ().equals ("17"))
	{
	    b17.setText (turn);
	    b17.setEnabled (false);
	}
	else if (e.getActionCommand ().equals ("18"))
	{
	    b18.setText (turn);
	    b18.setEnabled (false);
	}
	else if (e.getActionCommand ().equals ("19"))
	{
	    b19.setText (turn);
	    b19.setEnabled (false);
	}



	//Calculate if someone won HORIZONTAL
	String winner = "__";
	if (b11.getText ().equals (b12.getText ()) && b11.getText ().equals (b13.getText ()) && !b11.getText ().equals ("__"))
	{
	    JOptionPane.showMessageDialog (null, b11.getText () + " won!", "We have a winner!", JOptionPane.ERROR_MESSAGE);
	    winner = b11.getText ();

	}
	if (b14.getText ().equals (b15.getText ()) && b15.getText ().equals (b16.getText ()) && !b15.getText ().equals ("__"))
	{
	    JOptionPane.showMessageDialog (null, b11.getText () + " won!", "We    have a winner!", JOptionPane.ERROR_MESSAGE);
	    winner = b14.getText ();

	}
	if (b17.getText ().equals (b18.getText ()) && b17.getText ().equals (b19.getText ()) && !b19.getText ().equals ("__"))
	{
	    JOptionPane.showMessageDialog (null, b11.getText () + " won!", "We    have a winner!", JOptionPane.ERROR_MESSAGE);
	    winner = b17.getText ();

	}
	///////////// VERTICAL
	if (b11.getText ().equals (b14.getText ()) && b14.getText ().equals (b17.getText ()) && !b17.getText ().equals ("__"))
	{
	    JOptionPane.showMessageDialog (null, b11.getText () + " won!", "We    have a winner!", JOptionPane.ERROR_MESSAGE);
	    winner = b14.getText ();

	}
	if (b12.getText ().equals (b15.getText ()) && b15.getText ().equals (b18.getText ()) && !b15.getText ().equals ("__"))
	{
	    JOptionPane.showMessageDialog (null, b11.getText () + " won!", "We    have a winner!", JOptionPane.ERROR_MESSAGE);
	    winner = b12.getText ();

	}
	if (b13.getText ().equals (b16.getText ()) && b13.getText ().equals (b19.getText ()) && !b19.getText ().equals ("__"))
	{
	    JOptionPane.showMessageDialog (null, b11.getText () + " won!", "We    have a winner!", JOptionPane.ERROR_MESSAGE);
	    winner = b13.getText ();

	}
	//////DIAGONAL
	if (b11.getText ().equals (b15.getText ()) && b15.getText ().equals (b19.getText ()) && !b19.getText ().equals ("__"))
	{
	    JOptionPane.showMessageDialog (null, b11.getText () + " won!", "We    have a winner!", JOptionPane.ERROR_MESSAGE);
	    winner = b11.getText ();

	}
	if (b13.getText ().equals (b15.getText ()) && b15.getText ().equals (b17.getText ()) && !b15.getText ().equals ("__"))
	{
	    JOptionPane.showMessageDialog (null, b11.getText () + " won!", "We    have a winner!", JOptionPane.ERROR_MESSAGE);
	    winner = b13.getText ();

	}


	//If someone won, reset and display new score
	if (!winner.equals ("__"))
	{
	    b11.setText ("__");
	    b12.setText ("__");
	    b13.setText ("__");
	    b14.setText ("__");
	    b15.setText ("__");
	    b16.setText ("__");
	    b17.setText ("__");
	    b18.setText ("__");
	    b19.setText ("__");
	    b11.setEnabled (true);
	    b12.setEnabled (true);
	    b13.setEnabled (true);
	    b14.setEnabled (true);
	    b15.setEnabled (true);
	    b16.setEnabled (true);
	    b17.setEnabled (true);
	    b18.setEnabled (true);
	    b19.setEnabled (true);
	    if (winner.equals ("X"))
		xWins++;
	    else
		oWins++;
	    showStatus ("X's points: " + xWins + " |  | O's points: " + oWins);
	    label.setText ("X's points: " + xWins + " |  | O's points: " + oWins);
	}
	//Switch whose turn it was
	if (turn.equals ("X"))
	    turn = "O";
	else
	    turn = "X";
    }
	protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = tictac.class.getResource (path);
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


