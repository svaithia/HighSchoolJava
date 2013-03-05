import java.util.Calendar;

public class four
{
    public static void main (String args[])
    {
	new four ();


    }


    public four ()
    {

	Calendar now = Calendar.getInstance ();
	Calendar after = Calendar.getInstance ();
	System.out.println ("If it is: " + now.get (Calendar.HOUR_OF_DAY) + ":" + now.get (Calendar.MINUTE) + ":" + ", right now.\nWhat time is it in California?\n");
	//substract hours from current date using Calendar.add method
	after.add (Calendar.HOUR, -3);
	String three = after.get (Calendar.HOUR_OF_DAY) + ":" + after.get (Calendar.MINUTE);

	String time = IBIO.inputString ("Please enter the time in the following 24-hour format (HH:MM):\t");
	int score4 = 0;

	if (three.equals (time))
	{
	    System.out.println ("Well done! Right now, the time in California is: " + now.get (Calendar.HOUR_OF_DAY) + ":" + now.get (Calendar.MINUTE) + ":" + now.get (Calendar.SECOND));
	    score4 = 10;
	    System.out.println ("You got the points for it!");
	}
	else
	{
	    while (true)
	    {
		{
		    System.out.println ("Sorry that is not right. TRY AGAIN.\n"
			    + "\n-------------------------------------\n"
			    + "\nIf it is: " + now.get (Calendar.HOUR_OF_DAY) + ":" + now.get (Calendar.MINUTE) + ", right now.\nWhat time is it in California?");
		    String timea = IBIO.inputString ("Please enter the time in the following 24-hour format (HH:MM):\t");
		    if (three.equals (timea))
		    {
			System.out.println ("\nAlthough that is correct, you don't get the point for it because it took you more than one try to get the correct answer.");
			System.out.println (" ");
			break;
		    }
		    else
		    {
			System.out.println (" ");
		    }
		}
	    }
	}
    }
}















