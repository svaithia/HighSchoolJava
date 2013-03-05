import javax.swing.*;


public class three
{
    public static void main (String args[])
    {
	new three ();


    }


    public three ()
    {



	System.out.println ("Your task is to unscramble the following word: AAOGNRU. Enter all characters uppercase.");

	char first = IBIO.inputChar ("Enter the first letter: ");
	int point = 0;

	//FIRST CHAR IF
	if (first == 'A')
	{
	    System.out.println ("Correct.");
	    point = 10;
	}
	else
	    while (true)
	    {
		{
		    first = IBIO.inputChar ("Sorry, that is not right. Please enter the first letter again: ");
		    if (first == 'A')
		    {
			System.out.println ("Correct.");
			break;
		    }
		    else
		    {
			System.out.println ("TRY AGAIN!");
			point = 0;
		    }
		}
	    }

	//SECOND CHAR
	char second = IBIO.inputChar ("Enter the second letter: A");
	if (second == 'R')
	{
	    System.out.println ("Correct.");
	    point = point + 10;
	}
	else
	    while (true)
	    {
		{
		    second = IBIO.inputChar ("Sorry, that is not right. Please enter the second letter again: A");
		    if (second == 'R')
		    {
			System.out.println ("Correct.");
			break;
		    }
		    else
		    {
			System.out.println ("TRY AGAIN!");
		    }
		}
	    }
	//THIRD CHAR
	char third = IBIO.inputChar ("Enter the third letter: AR");
	if (third == 'G')
	{
	    System.out.println ("Correct.");
	    point = point + 10;
	}
	else
	    while (true)
	    {
		{
		    third = IBIO.inputChar ("Sorry, that is not right. Please enter the third letter again: AR");
		    if (third == 'G')
		    {
			System.out.println ("Correct.");
			break;
		    }
		    else
		    {
			System.out.println ("TRY AGAIN!");
		    }
		}
	    }
	//FOURTH CHAR
	char fourth = IBIO.inputChar ("Enter the fourth letter: ARG");
	if (fourth == 'O')
	{
	    System.out.println ("Correct.");
	   point = point + 10;
	}
	else
	    while (true)
	    {
		{
		    fourth = IBIO.inputChar ("Sorry, that is not right. Please enter the fourth letter again: ARG");
		    if (fourth == 'O')
		    {
			System.out.println ("Correct.");
			break;
		    }
		    else
		    {
			System.out.println ("TRY AGAIN!");
		    }
		}
	    }
	//FIFTH CHAR
	char fifth = IBIO.inputChar ("Enter the fifth letter: ARGO");
	if (fifth == 'N')
	{
	    System.out.println ("Correct.");
	    point = point + 10;
	}
	else
	    while (true)
	    {
		{
		    fifth = IBIO.inputChar ("Sorry, that is not right. Please enter the fifth letter again: ARGO");
		    if (fifth == 'N')
		    {
			System.out.println ("Correct.");
			break;
		    }
		    else
		    {
			System.out.println ("TRY AGAIN!");
		    }
		}
	    }
	//SIXTH CHAR
	char sixth = IBIO.inputChar ("Enter the sixth letter: ARGON");
	if (sixth == 'A')
	{
	    System.out.println ("Correct.");
	    point = point + 10;
	}
	else
	    while (true)
	    {
		{
		    sixth = IBIO.inputChar ("Sorry, that is not right. Please enter the sixth letter again: ARGON");
		    if (sixth == 'A')
		    {
			System.out.println ("Correct.");
			break;
		    }
		    else
		    {
			System.out.println ("TRY AGAIN!");
		    }
		}
	    }
	//SEVENTH CHAR
	char seventh = IBIO.inputChar ("Enter the seventh letter: ARGONA");
	if (seventh == 'U')
	{
	    System.out.println ("Correct.");
	    point = point + 10;
	}
	else
	    while (true)
	    {
		{
		    seventh = IBIO.inputChar ("Sorry, that is not right. Please enter the seventh letter again: ARGONA");
		    if (seventh == 'U')
		    {
			System.out.println ("Correct.");
			break;
		    }
		    else
		    {
			System.out.println ("TRY AGAIN!");
		    }
		}
	    }
	//EIGHTH CHAR
	char eighth = IBIO.inputChar ("Enter the eighth letter: ARGONAU");
	if (eighth == 'T')
	{
	    System.out.println ("Correct.");
	    point = point + 10;
	}
	else
	    while (true)
	    {
		{
		    eighth = IBIO.inputChar ("Sorry, that is not right. Please enter the eighth letter again: ARGONAU");
		    if (eighth == 'T')
		    {
			System.out.println ("Correct.");
			break;
		    }
		    else
		    {
			System.out.println ("TRY AGAIN!");
		    }
		}                
	    }
    }
}













