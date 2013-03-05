public class TimeT
{
    public static void main (String args[])
    {
	new TimeT ();
    }


    public TimeT ()
    {
	//Intro
	String name = IBIO.inputString ("Please enter your name: ");
	String friend = IBIO.inputString ("Please enter a friend's name: ");

	System.out.println (name + ", imagine living as an Irish immigrant, who works for at a small factory in New York.");
	System.out.println ("You get $2.25 a day, which is barely enough for you to survive with your wife and your three children. ");
	System.out.println ("One Saturday morning, your best friend (your neighbor), ");
	System.out.println ("who knows how to read and write tells you that a man named " + friend + " has found gold!");
	System.out.println ("Yes, that is right valuable, yellow, shiny GOLD! Your neighbor, ");
	System.out.println ("who earns a quarter more than you a day but has 5 children, tells you that he is going to go diggin' fo' some gold. \n\n" + friend + " asks you, " + name + ", do you want to come with me?\"");
	while (true)
	{
	    char again = IBIO.inputChar ("You say, Y/N: ");
	    System.out.println ("");
	    if (again == 'Y' || again == 'y')
	    {
		System.out.println ("You decide to go with " + friend + ". But before continuing your path, there is one small test that you have to pass. Let's see if you are ready... \n");
		break;
	    }

	    else if (again == 'N' || again == 'n')
	    {
		System.out.println ("You said No, did you change your mind? (Y/N)");
	    }


	    else
	    {

		System.out.println ("Error, please Enter 'Y' for Yes and 'N' for No");
	    }

	}

	System.out.println ("Where did the Gold Rush happen?\na. Boston\nb. Washington D.C\nc. California\nd. Florida");
	










	//TASK



    }
}


