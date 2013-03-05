import java.util.Calendar;

public class seven
{
    public static void main (String args[])
    {
	new seven ();
    }
    public seven ()
    {
	char SORNO = IBIO.inputChar ("Do you want to do another BONUS task? It is a WORDSEARCH (YOU GET BONUS MARKS!)");
	if (SORNO == 's' || SORNO == 'S')
	{
	    System.out.println (ascii7 + "\n");
	    System.out.println ("There are 18 words in this WORDSEARCH puzzle.\n\nFind at least FIVE (5) of them and enter them (ALL CAPS AND SEPERATE IF THERE ARE TWO WORDS):\n");
	    System.out.println (" N O N N A R B L G N I N N A P\n L O D E B T S U T T E R B Z V\n S Z A E L D A R C V K D R B W\n V M I S T N D N A M E D E F E\n M C O A F Z X Y J M J G P N N\n D B F R E I G H T E R N P Q T\n Q L S M M Q F I B O X I I R R\n P R L M K E F S T B M G L A E\n T L K A Q K U D Z O I G C D P\n Z O A I H M I J N O G I N N R\n V G O C H S V J J M R D N U E\n J V H T E H R B M T A O V G N\n O R S S N R Y A T O T O J G E\n E I C L A I M E M W E J Y E U\n C A U V A X O T F N Y V T T R\n");
	    int score7 = 0;

	    String ws1 = IBIO.inputString ("\nEnter the first word: ");
	    if (ws1.equals ("ENTREPRENEUR") || ws1.equals ("PANNING") || ws1.equals ("PLACER") || ws1.equals ("BOOMTOWN") || ws1.equals ("CRADLE") || ws1.equals ("SUTTER") || ws1.equals ("MARSHALL") || ws1.equals ("BRANNON") || ws1.equals ("LODE") || ws1.equals ("SUPPLY") || ws1.equals ("DEMAND") || ws1.equals ("CLAIM") || ws1.equals ("DIGGING") || ws1.equals ("NUGGET") || ws1.equals ("MIGRATE") || ws1.equals ("CLIPPER") || ws1.equals ("FREIGHTER") || ws1.equals ("ISTHMUS"))
	    {
		System.out.println ("Yes! That is right! Good JOB! You got points!");
		score7 = 10;
	    }
	    else
	    {
		System.out.println ("Sorry! That was not one of the 18 words.");
	    }

	    String ws2 = IBIO.inputString ("\nEnter the second word: ");
	    if (ws2.equals (ws1))
	    {
		System.out.println ("You already entered that word, you were trying to cheat, weren't you?\nYou lose your turn and NO POINTS FOR YOU!");
	    }
	    else if (ws2.equals ("ENTREPRENEUR") || ws2.equals ("PANNING") || ws2.equals ("PLACER") || ws2.equals ("BOOMTOWN") || ws2.equals ("CRADLE") || ws2.equals ("SUTTER") || ws2.equals ("MARSHALL") || ws2.equals ("BRANNON") || ws2.equals ("LODE") || ws2.equals ("SUPPLY") || ws2.equals ("DEMAND") || ws2.equals ("CLAIM") || ws2.equals ("DIGGING") || ws2.equals ("NUGGET") || ws2.equals ("MIGRATE") || ws2.equals ("CLIPPER") || ws2.equals ("FREIGHTER") || ws2.equals ("ISTHMUS"))
	    {
		System.out.println ("Yes! That is right! Good JOB! You got points!");
		score7 = score7 + 10;
	    }
	    else
	    {
		System.out.println ("Sorry! That was not one of the 18 words.");
	    }

	    String ws3 = IBIO.inputString ("\nEnter the second word: ");
	    if (ws3.equals (ws1) || ws3.equals (ws2) || ws3.equals (ws3))
	    {
		System.out.println ("You already entered that word, you were trying to cheat, weren't you?\nYou lose your turn and NO POINTS FOR YOU!");
	    }
	    else if (ws3.equals ("ENTREPRENEUR") || ws3.equals ("PANNING") || ws3.equals ("PLACER") || ws3.equals ("BOOMTOWN") || ws3.equals ("CRADLE") || ws3.equals ("SUTTER") || ws3.equals ("MARSHALL") || ws3.equals ("BRANNON") || ws3.equals ("LODE") || ws3.equals ("SUPPLY") || ws3.equals ("DEMAND") || ws3.equals ("CLAIM") || ws3.equals ("DIGGING") || ws3.equals ("NUGGET") || ws3.equals ("MIGRATE") || ws3.equals ("CLIPPER") || ws3.equals ("FREIGHTER") || ws3.equals ("ISTHMUS"))
	    {
		System.out.println ("Yes! That is right! Good JOB! You got points!");
		score7 = score7 + 10;
	    }
	    else
	    {
		System.out.println ("Sorry! That was not one of the 18 words.");
	    }

	    String ws4 = IBIO.inputString ("\nEnter the second word: ");
	    if (ws4.equals (ws1) || ws4.equals (ws2) || ws4.equals (ws3))
	    {
		System.out.println ("You already entered that word, you were trying to cheat, weren't you?\nYou lose your turn and NO POINTS FOR YOU!");
	    }
	    else if (ws4.equals ("ENTREPRENEUR") || ws4.equals ("PANNING") || ws4.equals ("PLACER") || ws4.equals ("BOOMTOWN") || ws4.equals ("CRADLE") || ws4.equals ("SUTTER") || ws4.equals ("MARSHALL") || ws4.equals ("BRANNON") || ws4.equals ("LODE") || ws4.equals ("SUPPLY") || ws4.equals ("DEMAND") || ws4.equals ("CLAIM") || ws4.equals ("DIGGING") || ws4.equals ("NUGGET") || ws4.equals ("MIGRATE") || ws4.equals ("CLIPPER") || ws4.equals ("FREIGHTER") || ws4.equals ("ISTHMUS"))
	    {
		System.out.println ("Yes! That is right! Good JOB! You got points!");
		score7 = score7 + 10;
	    }
	    else
	    {
		System.out.println ("Sorry! That was not one of the 18 words.");
	    }
	    String ws5 = IBIO.inputString ("\nEnter the second word: ");
	    if (ws5.equals (ws1) || ws5.equals (ws2) || ws5.equals (ws3) || ws5.equals (ws4))
	    {
		System.out.println ("You already entered that word, you were trying to cheat, weren't you?\nYou lose your turn and NO POINTS FOR YOU!");
	    }
	    else if (ws5.equals ("ENTREPRENEUR") || ws5.equals ("PANNING") || ws5.equals ("PLACER") || ws5.equals ("BOOMTOWN") || ws5.equals ("CRADLE") || ws5.equals ("SUTTER") || ws5.equals ("MARSHALL") || ws5.equals ("BRANNON") || ws5.equals ("LODE") || ws5.equals ("SUPPLY") || ws5.equals ("DEMAND") || ws5.equals ("CLAIM") || ws5.equals ("DIGGING") || ws5.equals ("NUGGET") || ws5.equals ("MIGRATE") || ws5.equals ("CLIPPER") || ws5.equals ("FREIGHTER") || ws5.equals ("ISTHMUS"))
	    {
		System.out.println ("Yes! That is right! Good JOB! You got points!");
		score7 = score7 + 10;
	    }
	    else
	    {
		System.out.println ("Sorry! That was not one of the 18 words.");
	    }
	}
    }















