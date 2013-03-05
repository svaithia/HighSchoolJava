import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;

public class Wheel extends Applet implements ActionListener
{
    Panel p_card; //to hold all of the screens
    Panel card1, card2, HLRESULT, card4, card5, card6, card3, LASTEND1, credits, instru1, instru2, instru3, intro, HighLow, RockP, RockP2;
    JTextField entername, yurnumber;
    String yurnumbers;
    CardLayout cdLayout = new CardLayout ();
    String urname;
    JLabel continu, spinner, gamebeforestatus;
    ///
    JRadioButton chara1, chara2, chara3;
    JTextField mins;
    JLabel avatarerror, roundnumber, roundscore, gamescore, possibilityscorelbl, roundnumber1, roundscore1, gamescore1;
    int spinnernum;
    int roundint = 1;
    int roundscoreint;
    int gamescoreint;
    int possibilityscore = 0;
    JButton roll, cont, confirmcont;
    JLabel confirm, gamestatus;
    String wheelvalue = "";
    String currentgame = "";
    JLabel rockyou, rockcomp;
    JLabel rockpaperscissorswinner, lblyou, lblcomp;
    String rockstring;
    JLabel confirmhighlow;
    int highlowyur;
    int highlowcomp = 0;
    int INTcompnumber = 0;
    JTextField HLuguesscompnumber;
    JLabel hlcomputerguess, hlyourguess, hlyourresult, hlcomputerresult, hlyournumber, highlowerrormsg;
    String hlstringcompresult, hlstringurresult;
    int hlcomputersrealnumber, computersguessnumber;
    JButton backtowheel, backtowheel2;
    JLabel winorlose, finalscore;

    ///




    JLabel blah = new JLabel ("BBBBBBBBBBBB");



    public void init ()
    {

	p_card = new Panel ();
	p_card.setLayout (cdLayout);
	screen1 ();
	screen2 ();
	wheel ();
	screen4 ();
	screen5 ();
	screen6 ();
	HLRESULT ();
	LASTEND ();
	instru1 ();
	instru2 ();
	instru3 ();
	intro ();
	credits ();
	RockP ();
	RockP2 ();
	HighLow ();
	resize (676, 475);
	setLayout (new BorderLayout ());
	add ("Center", p_card);

    }


    public void screen1 ()
    { //screen 1 is set up.
	card1 = new Panel ();
	card1.setBackground (Color.BLACK);
	JLabel panel = new JLabel (createImageIcon ("images/title.jpg"));
	card1.add (panel);
	p_card.add ("1", card1);
	JButton play = new JButton ("Play");
	play.addActionListener (this);
	play.setActionCommand ("Play");
	play.setFont (new Font ("Arial", Font.PLAIN, 40));
	play.setBackground (new Color (252, 246, 106));

	JButton instru = new JButton ("Instructions");
	instru.addActionListener (this);
	instru.setActionCommand ("instru1");
	instru.setFont (new Font ("Arial", Font.PLAIN, 40));
	instru.setBackground (new Color (252, 246, 106));

	JButton credits = new JButton ("Credits");
	credits.addActionListener (this);
	credits.setActionCommand ("credits");
	credits.setFont (new Font ("Arial", Font.PLAIN, 40));
	credits.setBackground (new Color (252, 246, 106));



	Panel bottom = new Panel ();
	bottom.setBackground (Color.BLACK);
	bottom.setSize (676, 106);

	bottom.add (play);
	bottom.add (instru);
	bottom.add (credits);
	card1.add (bottom);
    }


    public void intro ()
    { //screen 2 is set up.
	intro = new Panel ();
	intro.setBackground (Color.white);
	JLabel title = new JLabel ("Wheel of Fortune");
	title.setFont (new Font ("Arial", Font.BOLD, 50));
	title.setForeground (Color.BLUE);

	intro.add (title);


	JLabel name = new JLabel ("Please enter your name: ");
	name.setFont (new Font ("Arial", Font.BOLD, 30));
	name.setForeground (Color.BLACK);


	entername = new JTextField (10);
	entername.setFont (new Font ("Arial", Font.BOLD, 20));

	Panel p = new Panel ();
	p.add (name);
	p.add (entername);



	JButton next = new JButton ("Continue");
	next.addActionListener (this);
	next.setActionCommand ("2");


	chara1 = new JRadioButton ("ONE");
	chara1.addActionListener (this);
	chara1.setActionCommand ("CHARAONE");

	JLabel firstchar = new JLabel (createImageIcon ("images/char1.gif"));



	chara2 = new JRadioButton ("TWO");
	chara2.addActionListener (this);
	chara2.setActionCommand ("CHARATWO");
	JLabel secchar = new JLabel (createImageIcon ("images/char2.gif"));

	chara3 = new JRadioButton ("THREE");
	chara3.addActionListener (this);
	chara3.setActionCommand ("CHARATHREE");
	JLabel thirdchar = new JLabel (createImageIcon ("images/char3.gif"));

	ButtonGroup group = new ButtonGroup ();
	group.add (chara1);
	group.add (chara2);
	group.add (chara3);

	Panel p2 = new Panel (new GridLayout (1, 3));
	p2.add (chara1);
	p2.add (chara2);
	p2.add (chara3);

	Panel p3 = new Panel (new GridLayout (1, 3));
	p3.add (firstchar);
	p3.add (secchar);
	p3.add (thirdchar);



	avatarerror = new JLabel ("Enter a name and choose an avatar");
	avatarerror.setPreferredSize (new Dimension (250, 20));
	intro.add (p);

	intro.add (p3);
	intro.add (blah);
	intro.add (p2);

	intro.add (avatarerror);





	intro.add (next);
	p_card.add ("intro", intro);
    }


    public void screen2 ()
    { //screen 2 is set up.
	card2 = new Panel ();
	card2.setBackground (Color.white);


	continu = new JLabel ("Hi                                    !");
	continu.setForeground (Color.black);
	continu.setFont (new Font ("Arial", Font.PLAIN, 40));

	JLabel play = new JLabel ("You are about to play Wheel of Fortune!");
	play.setForeground (Color.black);
	play.setFont (new Font ("Arial", Font.PLAIN, 30));


	JLabel choose = new JLabel ("Choose a character");
	choose.setForeground (Color.blue);
	choose.setFont (new Font ("Arial", Font.PLAIN, 60));

	blah.setForeground (Color.WHITE);
	blah.setFont (new Font ("Arial", Font.PLAIN, 20));




	card2.add (choose);
	card2.add (blah);
	card2.add (continu);

	card2.add (play);



	JButton next = new JButton ("Continue");
	next.addActionListener (this);
	next.setActionCommand ("3");

	card2.add (next);


	p_card.add ("2", card2);
    }


    public void wheel ()
    { //wheel is set up.
	card3 = new Panel ();
	card3.setBackground (Color.white);

	JLabel main = new JLabel ("Spin the Wheel");
	main.setFont (new Font ("Arial", Font.BOLD, 50));

	JLabel arrow = new JLabel (createImageIcon ("wheel/arrow.gif")); //IMAGE
	spinner = new JLabel (createImageIcon ("wheel/1.gif")); //IMAGE
	roll = new JButton ("Roll!");
	roll.setBackground (Color.white);
	roll.addActionListener (this);
	roll.setActionCommand ("roll");
	roll.setFont (new Font ("Arial", Font.BOLD, 25));


	cont = new JButton ("Continue");
	cont.addActionListener (this);
	cont.setActionCommand ("4");
	cont.setEnabled (false);



	Panel p1 = new Panel ();
	p1.add (arrow);
	p1.add (spinner);
	card3.add (main);
	card3.add (roll);
	card3.add (cont);
	card3.add (p1);


	roundnumber1 = new JLabel ("Current Round: " + roundint);
	roundscore1 = new JLabel ("Round Score: " + roundscoreint);
	gamescore1 = new JLabel ("Game Score: " + gamescoreint);


	Panel stats = new Panel (new GridLayout (3, 1));
	stats.add (roundnumber1);
	stats.add (roundscore1);
	stats.add (gamescore1);



	card3.add (stats);
	p_card.add ("3", card3);
    }


    public void screen4 ()

    { //screen 4 is set up.
	card4 = new Panel ();
	card4.setBackground (Color.white);

	JLabel title = new JLabel ("Wheel of Fortune");
	title.setFont (new Font ("Arial", Font.BOLD, 50));
	title.setForeground (Color.BLUE);
	card4.add (title);

	confirm = new JLabel ("                     You landed on XXXXXXXXXXXXX");
	confirm.setFont (new Font ("Arial", Font.PLAIN, 30));
	confirm.setForeground (Color.BLUE);

	card4.add (confirm);
	card4.add (blah);
	//////////////
	/*      roundnumber = new JLabel ("Current Round: " + roundint);
	      roundscore = new JLabel ("Round Score: " + roundscoreint);
	      gamescore = new JLabel ("Current Round Score: " + gamescoreint);
	      possibilityscorelbl = new JLabel ("Possibility Score: " + possibilityscore);
	*/
	gamebeforestatus = new JLabel ("Click continue to play: ");
	gamebeforestatus.setFont (new Font ("Arial", Font.PLAIN, 20));

	gamestatus = new JLabel ("     Rock Paper Scissors     ");
	gamestatus.setFont (new Font ("Arial", Font.PLAIN, 30));
	gamestatus.setForeground (Color.GREEN);


	confirmcont = new JButton ("Continue");
	confirmcont.addActionListener (this);



	/*
		Panel stats = new Panel (new GridLayout (3, 1));
		stats.add (roundnumber);
		stats.add (roundscore);
		stats.add (gamescore);
		stats.add (possibilityscorelbl);
		card4.add (stats);
	*/


	///


	card4.add (gamebeforestatus);
	card4.add (gamestatus);
	card4.add (confirmcont);
	p_card.add ("4", card4);
    }





    public void RockP ()
    { //screen 2 is set up.
	RockP = new Panel ();
	RockP.setBackground (Color.WHITE);


	JLabel title = new JLabel ("Wheel of Fortune");
	title.setFont (new Font ("Arial", Font.BOLD, 50));
	title.setForeground (Color.BLUE);

	JLabel RockPT = new JLabel ("Rock Paper Scissors");
	RockPT.setFont (new Font ("Arial", Font.BOLD, 50));
	RockPT.setForeground (Color.GREEN);

	RockP.add (title);
	RockP.add (RockPT);

	JLabel choose = new JLabel ("Click to choose");

	RockP.add (choose);

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	JButton rock = new JButton (createImageIcon ("Rock/1.gif"));
	rock.addActionListener (this);
	rock.setActionCommand ("rock");

	JButton paper = new JButton (createImageIcon ("Rock/2.gif"));
	paper.addActionListener (this);
	paper.setActionCommand ("paper");

	JButton scissors = new JButton (createImageIcon ("Rock/3.gif"));
	scissors.addActionListener (this);
	scissors.setActionCommand ("scissors");

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	Panel rps = new Panel ();
	rps.add (rock);
	rps.add (paper);
	rps.add (scissors);

	RockP.add (rps);

	p_card.add ("RockP", RockP);
    }


    public void RockP2 ()
    { //screen 2 is set up.
	RockP2 = new Panel ();
	RockP2.setBackground (Color.WHITE);

	JLabel RockPT = new JLabel ("Rock Paper Scissors");
	RockPT.setFont (new Font ("Arial", Font.BOLD, 50));
	RockPT.setForeground (Color.GREEN);

	RockP2.add (RockPT);


	lblyou = new JLabel ("You Chose: ");
	lblyou.setFont (new Font ("Arial", Font.PLAIN, 20));

	rockyou = new JLabel (createImageIcon ("Rock/1.gif"));

	lblcomp = new JLabel ("Computer Chose: ");
	lblcomp.setFont (new Font ("Arial", Font.PLAIN, 20));

	rockcomp = new JLabel (createImageIcon ("Rock/2.gif"));

	Panel you = new Panel ();
	you.add (lblyou);
	you.add (rockyou);
	you.add (lblcomp);
	you.add (rockcomp);

	RockP2.add (you);

	rockpaperscissorswinner = new JLabel ("                                                            WON!");
	rockpaperscissorswinner.setFont (new Font ("Arial", Font.BOLD, 20));
	RockP2.add (rockpaperscissorswinner);


	/// START WORKIN ON BUTTON
	backtowheel = new JButton ("Back to the Wheel");
	backtowheel.addActionListener (this);
	backtowheel.setActionCommand ("3");

	RockP2.add (backtowheel);

	p_card.add ("RockP2", RockP2);
    }










    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void HighLow ()
    { //screen 2 is set up.
	HighLow = new Panel ();
	HighLow.setBackground (Color.WHITE);


	JLabel title = new JLabel ("Wheel of Fortune");
	title.setFont (new Font ("Arial", Font.BOLD, 50));
	title.setForeground (Color.BLUE);

	JLabel HighLowT = new JLabel ("High - Low");
	HighLowT.setFont (new Font ("Arial", Font.BOLD, 50));
	HighLowT.setForeground (Color.GREEN);


	String lbl = "<html>First, you select a number from 0 to a 20 and <br>the computer selects a number from zero to a hundred. <br>If you guess the computer's number before, then you get the \"Round Score\" added to your \"Game Score\"<br>.The computer will guide you by saying Higher or Lower.";


	JLabel instructhighlow = new JLabel ("" + lbl);
	instructhighlow.setFont (new Font ("Arial", Font.PLAIN, 20));

	JLabel instructionhighlow = new JLabel ("Please choose a number from 0 to 20");
	yurnumber = new JTextField (3);

	highlowerrormsg = new JLabel ("");
	highlowerrormsg.setFont (new Font ("Arial", Font.PLAIN, 30));
	highlowerrormsg.setForeground (Color.RED);

	JButton Select = new JButton ("Select");
	Select.addActionListener (this);
	Select.setActionCommand ("highlowselect");

	HighLow.add (title);
	HighLow.add (blah);
	HighLow.add (HighLowT);
	HighLow.add (instructhighlow);
	HighLow.add (instructionhighlow);

	HighLow.add (yurnumber);
	HighLow.add (Select);
	p_card.add ("HighLow", HighLow);
    }




    public void screen5 ()

    { //screen 5 is set up.
	card5 = new Panel ();
	card5.setBackground (Color.white);

	JLabel title = new JLabel ("Wheel of Fortune");
	title.setFont (new Font ("Arial", Font.BOLD, 50));
	title.setForeground (Color.BLUE);

	JLabel HighLowT = new JLabel ("High - Low");
	HighLowT.setFont (new Font ("Arial", Font.BOLD, 50));
	HighLowT.setForeground (Color.GREEN);




	JLabel guesshighlow = new JLabel ("Guess the computer's number: ");
	HLuguesscompnumber = new JTextField (3);

	JButton Select = new JButton ("Guess");
	Select.addActionListener (this);
	Select.setActionCommand ("highlowguess");

	//////////////////////////////////////////

	card5.add (title);
	card5.add (blah);
	card5.add (HighLowT);
	card5.add (guesshighlow);
	card5.add (HLuguesscompnumber);

	card5.add (Select);
	p_card.add ("5", card5);
    }


    public void screen6 ()
    { //screen 6 is set up.
	card6 = new Panel ();
	card6.setBackground (Color.white);
	JLabel title = new JLabel ("Wheel of Fortune");
	title.setFont (new Font ("Arial", Font.BOLD, 50));
	title.setForeground (Color.BLUE);

	JLabel HighLowT = new JLabel ("High - Low");
	HighLowT.setFont (new Font ("Arial", Font.BOLD, 50));
	HighLowT.setForeground (Color.GREEN);

	confirmhighlow = new JLabel ("You selected ___________________.");

	JButton iconfirmhighlow = new JButton ("Yes");
	iconfirmhighlow.addActionListener (this);
	iconfirmhighlow.setActionCommand ("iconfirmhighlow");

	JButton noconfirmhighlow = new JButton ("No");
	noconfirmhighlow.addActionListener (this);
	noconfirmhighlow.setActionCommand ("noconfirmhighlow");






	card6.add (title);
	card6.add (blah);
	card6.add (HighLowT);
	card6.add (confirmhighlow);
	card6.add (iconfirmhighlow);
	card6.add (noconfirmhighlow);

	p_card.add ("6", card6);
    }


    public void HLRESULT ()
    { //screen 7 is set up.
	HLRESULT = new Panel ();
	HLRESULT.setBackground (Color.white);
	JLabel title = new JLabel ("Wheel of Fortune");
	title.setFont (new Font ("Arial", Font.BOLD, 50));
	title.setForeground (Color.BLUE);

	JLabel HighLowT = new JLabel ("High - Low");
	HighLowT.setFont (new Font ("Arial", Font.BOLD, 50));
	HighLowT.setForeground (Color.GREEN);



	hlyournumber = new JLabel ("Your Number :       ");
	hlyournumber.setFont (new Font ("Arial", Font.PLAIN, 20));

	hlcomputerguess = new JLabel ("Computer's Guess :       ");
	hlyourguess = new JLabel ("Your Guess:        ");
	hlyourresult = new JLabel ("NOT THE SAME. HIGHER OR LOWER");
	hlcomputerresult = new JLabel ("NOT THE SAME. HIGHER OR LOWER");

	Panel HIGHLOWPANEL = new Panel (new GridLayout (2, 2));
	HIGHLOWPANEL.add (hlyourguess);
	HIGHLOWPANEL.add (hlcomputerguess);
	HIGHLOWPANEL.add (hlyourresult);
	HIGHLOWPANEL.add (hlcomputerresult);

	backtowheel2 = new JButton ("Back to the Wheel");
	backtowheel2.addActionListener (this);
	backtowheel2.setActionCommand ("3");



	HLRESULT.add (title);
	HLRESULT.add (blah);
	HLRESULT.add (HighLowT);
	HLRESULT.add (hlyournumber);
	HLRESULT.add (HIGHLOWPANEL);
	HLRESULT.add (backtowheel2);

	p_card.add ("HLRESULT", HLRESULT);
    }


    public void LASTEND ()
    { //LASTEND 8 is set up.
	LASTEND1 = new Panel ();
	LASTEND1.setBackground (Color.white);
	JLabel title = new JLabel ("Wheel of Fortune");
	title.setFont (new Font ("Arial", Font.BOLD, 50));
	title.setForeground (Color.BLUE);

	winorlose = new JLabel ("                                      ");
	winorlose.setFont (new Font ("Arial", Font.PLAIN, 45));
	winorlose.setForeground (Color.GREEN);

	Panel panelforend = new Panel (new GridLayout ());

	finalscore = new JLabel ("                                      ");
	finalscore.setFont (new Font ("Arial", Font.PLAIN, 30));
	finalscore.setForeground (Color.GREEN);


	JButton back = new JButton ("Exit");
	back.addActionListener (this);
	back.setActionCommand ("EXIT");
	back.setFont (new Font ("Arial", Font.PLAIN, 40));
	back.setBackground (new Color (252, 246, 106));



	LASTEND1.add (title);
	LASTEND1.add (winorlose);
	LASTEND1.add (finalscore);
	LASTEND1.add (back);

	p_card.add ("LASTEND", LASTEND1);
    }


    public void credits ()
    { //screen 2 is set up.
	credits = new Panel ();
	credits.setBackground (Color.BLACK);
	JLabel panel2 = new JLabel (createImageIcon ("images/credits.gif"));



	JButton back = new JButton ("Back");
	back.addActionListener (this);
	back.setActionCommand ("1");
	back.setFont (new Font ("Arial", Font.PLAIN, 40));
	back.setBackground (new Color (252, 246, 106));

	Panel bottom = new Panel ();
	bottom.setBackground (Color.BLACK);
	bottom.setSize (676, 106);

	bottom.add (back);

	credits.add (bottom);
	credits.add (panel2);
	p_card.add ("credits", credits);
	p_card.add ("credits", credits);
    }


    public void instru1 ()
    { //screen 2 is set up.
	instru1 = new Panel ();
	instru1.setBackground (Color.BLACK);

	JLabel panel2 = new JLabel (createImageIcon ("images/instructions1.jpg"));
	instru1.add (panel2);


	JButton back = new JButton ("Back");
	back.addActionListener (this);
	back.setActionCommand ("1");
	back.setFont (new Font ("Arial", Font.PLAIN, 40));
	back.setBackground (new Color (252, 246, 106));

	JButton play = new JButton ("Play");
	play.addActionListener (this);
	play.setActionCommand ("Play");
	play.setFont (new Font ("Arial", Font.PLAIN, 40));
	play.setBackground (new Color (252, 246, 106));


	JButton nexxt = new JButton ("Next");
	nexxt.addActionListener (this);
	nexxt.setActionCommand ("instru2");
	nexxt.setFont (new Font ("Arial", Font.PLAIN, 40));
	nexxt.setBackground (new Color (252, 246, 106));



	Panel bottom = new Panel ();
	bottom.setBackground (Color.BLACK);
	bottom.setSize (676, 106);

	bottom.add (back);
	bottom.add (play);
	bottom.add (nexxt);
	instru1.add (bottom);
	p_card.add ("instru1", instru1);
    }


    public void instru2 ()
    { //screen 2 is set up.
	instru2 = new Panel ();
	instru2.setBackground (Color.BLACK);



	JLabel panel2 = new JLabel (createImageIcon ("images/instructions2.jpg"));
	instru2.add (panel2);


	JButton back = new JButton ("Back");
	back.addActionListener (this);
	back.setActionCommand ("instru1");
	back.setFont (new Font ("Arial", Font.PLAIN, 40));
	back.setBackground (new Color (252, 246, 106));

	JButton play = new JButton ("Play");
	play.addActionListener (this);
	play.setActionCommand ("Play");
	play.setFont (new Font ("Arial", Font.PLAIN, 40));
	play.setBackground (new Color (252, 246, 106));


	JButton nexxt = new JButton ("Next");
	nexxt.addActionListener (this);
	nexxt.setActionCommand ("instru3");
	nexxt.setFont (new Font ("Arial", Font.PLAIN, 40));
	nexxt.setBackground (new Color (252, 246, 106));



	Panel bottom = new Panel ();
	bottom.setBackground (Color.BLACK);
	bottom.setSize (676, 106);

	bottom.add (back);
	bottom.add (play);
	bottom.add (nexxt);
	instru2.add (bottom);








	p_card.add ("instru2", instru2);
    }


    public void instru3 ()
    { //screen 2 is set up.
	instru3 = new Panel ();
	instru3.setBackground (Color.black);

	JLabel panel2 = new JLabel (createImageIcon ("images/instructions3.jpg"));
	instru3.add (panel2);

	JButton back = new JButton ("Back");
	back.addActionListener (this);
	back.setActionCommand ("instru2");
	back.setFont (new Font ("Arial", Font.PLAIN, 40));
	back.setBackground (new Color (252, 246, 106));

	JButton play = new JButton ("Play");
	play.addActionListener (this);
	play.setActionCommand ("Play");
	play.setFont (new Font ("Arial", Font.PLAIN, 40));
	play.setBackground (new Color (252, 246, 106));

	JButton nexxt = new JButton ("Next");
	nexxt.addActionListener (this);
	nexxt.setActionCommand ("1");
	nexxt.setFont (new Font ("Arial", Font.PLAIN, 40));
	nexxt.setBackground (new Color (252, 246, 106));

	Panel bottom = new Panel ();
	bottom.setBackground (Color.BLACK);
	bottom.setSize (676, 106);

	bottom.add (back);
	bottom.add (play);
	bottom.add (nexxt);
	instru3.add (bottom);

	p_card.add ("instru3", instru3);
    }


    public void actionPerformed (ActionEvent e)
    { //moves between the screens
	if (e.getActionCommand ().equals ("1"))
	    cdLayout.show (p_card, "1");

	else if (e.getActionCommand ().equals ("Play"))
	{
	    cdLayout.show (p_card, "intro");
	    hlcomputersrealnumber = (int) (Math.random () * 20); //computer choosing a number FOR HIGHLOW - ENTER THE END
	}
	else if (e.getActionCommand ().equals ("2"))
	{
	    cdLayout.show (p_card, "2");
	    urname = entername.getText ();

	    continu.setText ("Hi " + urname + "!");
	}
	else if (e.getActionCommand ().equals ("3"))
	{
	    roll.setEnabled (true);
	    cont.setEnabled (false);
	    roundnumber1.setText ("Round: " + roundint);
	    roundscore1.setText ("Round Score: " + roundscoreint);
	    gamescore1.setText ("Game Score: " + gamescoreint);
	    cdLayout.show (p_card, "3");
	}

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
	else if (e.getActionCommand ().equals ("credits"))
	    cdLayout.show (p_card, "credits");
	else if (e.getActionCommand ().equals ("instru1"))
	    cdLayout.show (p_card, "instru1");
	else if (e.getActionCommand ().equals ("instru2"))
	    cdLayout.show (p_card, "instru2");
	else if (e.getActionCommand ().equals ("instru3"))
	    cdLayout.show (p_card, "instru3");
	else if (e.getActionCommand ().equals ("intro"))
	    cdLayout.show (p_card, "intro");
	else if (e.getActionCommand ().equals ("RockP"))
	    cdLayout.show (p_card, "RockP");
	else if (e.getActionCommand ().equals ("HighLow"))
	    cdLayout.show (p_card, "HighLow");
	if (e.getActionCommand ().equals ("LASTEND"))
	{
	    winorlose.setText ("GameOver!");
	    finalscore.setText ("" + urname + ", your final score is: " + gamescoreint);
	    cdLayout.show (p_card, "LASTEND");


	}
	try
	{
	    if (e.getActionCommand ().equals ("CHARAONE"))
	    {
		avatarerror.setText ("is your avatar.");
		avatarerror.setIcon (createImageIcon ("images/charathumb1.gif"));


	    }
	    else if (e.getActionCommand ().equals ("CHARATWO"))
	    {
		avatarerror.setText ("is your avatar.");
		avatarerror.setIcon (createImageIcon ("images/charathumb2.gif"));

	    }
	    else if (e.getActionCommand ().equals ("CHARATHREE"))
	    {
		avatarerror.setText ("is your avatar.");
		avatarerror.setIcon (createImageIcon ("images/charathumb3.gif"));

	    }
	}
	catch (Exception ee)
	{
	    avatarerror.setText ("Please enter your name first.");

	}
	if (e.getActionCommand ().equals ("roll"))
	{
	    HLuguesscompnumber.setText ("");
	    cont.setEnabled (true);
	    roll.setEnabled (false);
	    spinnernum = (int) (Math.random () * 8) + 1;

	    if ((spinnernum == 2 || spinnernum == 3 || spinnernum == 7))
	    {
		if (roundint > 12 && roundint < 19 || roundint == 2) // DONT SHOW BANKRUPT ON ROUND 12 TO 19 BECAUSE OF ROUND CHANGE
		{
		    spinnernum = 6;
		}
		spinnernum = spinnernum;

	    }

	    spinner.setIcon (createImageIcon ("wheel/" + spinnernum + ".gif"));

	    if (spinnernum == 1) // 500
	    {
		possibilityscore = 500;
		roundint = roundint + 1;
		wheelvalue = "$500";
	    }
	    else if (spinnernum == 2) //lose a turn
	    {
		possibilityscore = 0;
		roundint = roundint + 2;
		wheelvalue = "Lose A Turn";
		confirm.setForeground (Color.RED);
	    }
	    else if (spinnernum == 3) //bankrupt
	    {
		possibilityscore = 0;
		roundscoreint = 0;
		roundint = roundint + 2;
		wheelvalue = "Bankrupt";
		confirm.setForeground (Color.RED);
	    }
	    else if (spinnernum == 4) //250
	    {
		possibilityscore = 250;
		roundint = roundint + 1;
		wheelvalue = "$250";
	    }
	    else if (spinnernum == 5) //1000
	    {
		possibilityscore = 1000;
		roundint = roundint + 1;
		wheelvalue = "$1000";
	    }
	    else if (spinnernum == 6) //50
	    {
		possibilityscore = 50;
		roundint = roundint + 1;
		wheelvalue = "$50";
	    }
	    else if (spinnernum == 7) //lose a turn
	    {
		possibilityscore = 0;
		roundint = roundint + 2;
		wheelvalue = "Lose A Turn";
		confirm.setForeground (Color.RED);
	    }
	    else if (spinnernum == 8) //750
	    {
		possibilityscore = 750;
		roundint = roundint + 1;
		wheelvalue = "$750";
	    }
	}

	if (spinnernum == 7 || spinnernum == 3 || spinnernum == 2)
	{


	    confirm.setText ("You landed on a " + wheelvalue);
	    confirmcont.setActionCommand ("3");
	    gamebeforestatus.setText ("Click continue to go back to the Wheel");

	}

	else
	{
	    confirm.setText ("You landed on " + wheelvalue);
	    /*    roundnumber.setText ("Current Round: " + roundint);
		roundscore1.setText ("Round Score: " + roundscoreint);
		gamescore1.setText ("Game Score: " + gamescoreint);
		possibilityscorelbl.setText ("Possibility Score: " + possibilityscore);*/

	    if (roundint <= 14) //15)//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    {
		currentgame = "Rock Paper Scissors";
		gamestatus.setText ("" + currentgame);
		confirmcont.setActionCommand ("RockP");
		if (roundint == 14 || roundint == 13)
		{
		    gamescoreint = gamescoreint + (roundscoreint * 1);
		    roundint = 14;
		    roundscoreint = 0;
		}
	    }
	    else if (roundint == 15)
	    {
		gamescoreint = gamescoreint + (roundscoreint * 1);
		currentgame = "High-Low";
		gamestatus.setText ("" + currentgame);
		confirmcont.setActionCommand ("HighLow");
	    }
	    else if (roundint < 30)
	    {
		currentgame = "High-Low";
		gamestatus.setText ("" + currentgame);
		confirmcont.setActionCommand ("iconfirmhighlow");
	    }
	    else if (roundint > 30)
	    {
		confirmcont.setActionCommand ("LASTEND");

	    }

	}

	///////////////////////////////////// BEGIN ROCK PAPER SCISSORS /////////////////////////////////

	int compnumber = (int) (Math.random () * 3) + 1;
	rockcomp.setIcon (createImageIcon ("Rock/" + compnumber + ".gif"));

	if (e.getActionCommand ().equals ("rock"))
	{
	    lblyou.setText ("You Chose: Rock");

	    rockyou.setIcon (createImageIcon ("Rock/1.gif"));
	    if (compnumber == 1) //TIE
	    {
		lblcomp.setText ("Computer Chose: Rock");
		rockstring = "It was a Tie! No Points were added to your Round Score.";
		rockpaperscissorswinner.setForeground (Color.blue);

	    }
	    else if (compnumber == 2) //LOSE
	    {
		lblcomp.setText ("Computer Chose: Paper");
		rockstring = "You Lost! No Points were added to your Round Score.";
		rockpaperscissorswinner.setForeground (Color.red);
	    }

	    else //WIN
	    {
		lblcomp.setText ("Computer Chose: Scissors");
		rockstring = "You Won! " + wheelvalue + " will be added to your Round Score.";
		rockpaperscissorswinner.setForeground (Color.green);
		roundscoreint = roundscoreint + possibilityscore;
	    }
	    rockpaperscissorswinner.setText ("Result: " + rockstring);
	    cdLayout.show (p_card, "RockP2");
	}


	else if (e.getActionCommand ().equals ("paper"))
	{
	    lblyou.setText ("You Chose: Paper");
	    rockyou.setIcon (createImageIcon ("Rock/2.gif"));

	    if (compnumber == 1) //WIN
	    {
		lblcomp.setText ("Computer Chose: Rock");
		rockstring = "You Won! " + wheelvalue + " will be added to your Round Score.";
		rockpaperscissorswinner.setForeground (Color.green);
		roundscoreint = roundscoreint + possibilityscore;

	    }
	    else if (compnumber == 2) // TIE
	    {
		lblcomp.setText ("Computer Chose: Paper");
		rockstring = "It was a Tie! No Points were added to your Round Score.";
		rockpaperscissorswinner.setForeground (Color.blue);
	    }

	    else // LOSE
	    {
		lblcomp.setText ("Computer Chose: Scissors");
		rockstring = "You Lost! No Points were added to your Round Score.";
		rockpaperscissorswinner.setForeground (Color.red);
	    }

	    rockpaperscissorswinner.setText ("Result: " + rockstring);
	    cdLayout.show (p_card, "RockP2");

	}


	else if (e.getActionCommand ().equals ("scissors"))
	{
	    lblyou.setText ("You Chose: Scissors");
	    rockyou.setIcon (createImageIcon ("Rock/3.gif"));

	    if (compnumber == 1) //LOSE
	    {
		rockstring = "You Lost! No Points were added to your Round Score.";
		lblcomp.setText ("Computer Chose: Rock");
		rockpaperscissorswinner.setForeground (Color.red);
	    }
	    else if (compnumber == 2) //WIN
	    {
		lblcomp.setText ("Computer Chose: Paper");
		rockstring = "You Won! " + wheelvalue + " will be added to your Round Score.";
		rockpaperscissorswinner.setForeground (Color.green);
		roundscoreint = roundscoreint + possibilityscore;
	    }

	    else //TIE
	    {
		lblcomp.setText ("Computer Chose: Scissors");
		rockstring = "It was a Tie! No Points were added to your Round Score.";
		rockpaperscissorswinner.setForeground (Color.blue);
	    }
	    rockpaperscissorswinner.setText ("Result: " + rockstring);
	    cdLayout.show (p_card, "RockP2");

	}


	////////////////////////////////////// END ROCK PAPER SCISSORS //////////////////////////////////////
	////////////////////////////////////// BEGIN HIGH LOW //////////////////////////////////////////////
	if (e.getActionCommand ().equals ("highlowselect"))
	{
	    highlowyur = Integer.parseInt (yurnumber.getText ());
	    if (highlowyur >= 20 || highlowyur <= 0)
	    {
		confirmhighlow.setText ("You have selected, " + highlowyur + ".");
		cdLayout.show (p_card, "6");
	    }
	    else
	    {
		highlowerrormsg.setText ("Please enter a number that is between 0 AND 20");
		cdLayout.show (p_card, "5");
	    }



	}


	else if (e.getActionCommand ().equals ("noconfirmhighlow"))
	{
	    cdLayout.show (p_card, "HighLow");
	    yurnumber.setText ("");
	}


	if (e.getActionCommand ().equals ("iconfirmhighlow")) //YOU ACCEPT
	{
	    hlyournumber.setText ("Your Number: " + highlowyur);
	    cdLayout.show (p_card, "5");

	}


	if (e.getActionCommand ().equals ("highlowguess"))
	{
	    INTcompnumber = Integer.parseInt (HLuguesscompnumber.getText ());
	    //COMPUTER IS GUESSING
	    computersguessnumber = (int) (Math.random () * 20); //computer guessing your number

	    if (computersguessnumber == highlowyur) //COMPUTER GUESSED NUMBER RIGHT
	    {
		hlstringcompresult = "      Computer Won!";
		roundint = 30;
		backtowheel2.setText ("Computer Won!");
		backtowheel2.setActionCommand ("LASTEND");
	    } // COMPUTER WON

	    else if (computersguessnumber <= highlowyur) //COMPUTER HIGH
	    {
		hlstringcompresult = "      HIGHER!";
		roundint++;
	    }

	    else if (computersguessnumber >= highlowyur) //COMPUTER HIGH
	    {
		hlstringcompresult = "      LOWER!";
		roundint++;
	    }


	    if (INTcompnumber == hlcomputersrealnumber) //YOU GUESSED NUMBER RIGHT
	    {
		hlstringurresult = "You Won! The Computer's number was " + hlcomputersrealnumber;
		roundscoreint = roundscoreint + possibilityscore;
		roundscoreint = 0;
		backtowheel2.setText ("You Won!");
		backtowheel2.setActionCommand ("LASTEND");

	    } // YOU WON

	    else if (INTcompnumber <= hlcomputersrealnumber) //YOU HIGH
	    {
		hlstringurresult = "That is a little too low, GUESS HIGHER!";
		roundscoreint = roundscoreint + possibilityscore;
	    }

	    else if (INTcompnumber >= hlcomputersrealnumber) //YOU HIGH
	    {
		hlstringurresult = "That is a little too high, GUESS LOWER!";
		roundscoreint = roundscoreint + possibilityscore;
	    }




	    hlcomputerguess.setText ("Computer's Guess : " + computersguessnumber);
	    hlyourguess.setText ("Your Guess: " + INTcompnumber);
	    hlyourresult.setText ("" + hlstringurresult);
	    hlcomputerresult.setText ("" + hlstringcompresult);

	    cdLayout.show (p_card, "HLRESULT");

	}

	else if (e.getActionCommand().equals ("EXIT"))  //YOU HIGH
	{
	    System.exit (0);
	}

    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = Wheel.class.getResource (path);
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


