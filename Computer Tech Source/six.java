import java.util.Calendar;

public class six
{
    public static void main (String args[])
    {
	new six ();

    }


    public six ()
    {
	System.out.println ("This task will be a multiple choice:");
	System.out.println ("The average price per ounce of Gold in San Francisco during the Gold Rush was: ");
	System.out.println ("A. $1,000\nB. $500\nC. $16\nD. $4");
	int score6 = 0;
	char BONuS = ' ';
	char BONuS2 = ' ';
	char tsix = IBIO.inputChar ("\nYour answer is: ");
	if (tsix == 'c' || tsix == 'C')
	{
	    score6 = 10;
	    BONuS = 'Y';
	}
	else
	{
	    BONuS = 'N';
	}

	System.out.println ("\nHere is your second question:");
	System.out.println ("What is the largest city in California?");
	System.out.println ("A. Los Angeles\nB. San Francisco\nC. Sacramento\nD. San Diego");
	char tsix2 = IBIO.inputChar ("\nYour answer is: ");
	if (tsix2 == 'b' || tsix2 == 'B')
	{
	    score6 = score6 + 10;
	    BONuS2 = 'Y';
	}
	else
	{
	    BONuS2 = 'N';
	}


	if (BONuS == 'Y' && BONuS2 == 'Y')
	{
	    System.out.println ("WOW! Nice, you answered both questions right! Here is your BONUS TASK SIX question! (This one is worth more points!)");

	    System.out.println ("\nThe longest route to the gold fields, taking about 6 months is: ");
	    System.out.println ("A. The overland route\nB. The Panama route\nC. Around Cape Horn\nD. Take the train ");
	    char tsix3 = IBIO.inputChar ("\nYour answer is: ");
	    if (tsix3 == 'A' || tsix3 == 'a')
	    {
		score6 = score6 + 20;
	    }
	    System.out.println (score6);
	}
    }
}











