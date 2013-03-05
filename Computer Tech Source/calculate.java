public class calculate
{
    public static void main (String args[])
    {
	new calculate ();


    }


    public void printSlow (String s)
    {
	for (int i = 0 ; i < s.length () ; i++)
	{
	    System.out.print ("" + s.charAt (i));
	    //sleep for a bit after printing a letter try
	    try
	    {
		//number '100' here refers to how long the executing thread should sleep, in milliseconds
		Thread.sleep (1); //CHANGE to 75
		//change the speed
		//small # = fast
		//large # = slow

	    }
	    catch (InterruptedException m)
	    {
		;

	    }

	}
    }


    public calculate ()
    {

	System.out.println ("That is all! You have answered everything! Wait a few seconds while Mr. Adams calculates your score.");
	for (int x = 101 ; x > 0 ; x--)
	{
	    printSlow (x + "\t\t\t\tCALCULATING\n");
	}

	System.out.println ("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nDONE CALCULATING\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	int SCORE = score1 + score2 + score3 + score4 + score5 + score6;
	int SBONUS = SCORE + score7;
	int TOTAL = 500;
	

	//BARGRAPH
	int fill = SCORE;
	int empty = 100 - fill;

	System.out.println (" _________________");
	for (; fill < 100 ; fill += 10)

	    {

		System.out.println ("|                 | \n|_________________| \t ");
	    }
	for (; empty < 100 ; empty += 10)

	    {

		System.out.println ("|XXXXXXXXXXXXXXXXX| \n|_________________| ");
	    }
	System.out.println ("   Your Score:" + score + "%");
	/////////////

	System.out.println ("That is all! You have answered everything! Wait a few seconds while Mr. Adams calculates your score.");
	for (int x = 101 ; x > 0 ; x--)
	{
	    printSlow (x + "\t\t\t\tCALCULATING\n");
	}

	System.out.println ("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nDONE CALCULATING\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	int SCORE = score1 + score2 + score3 + score4 + score5 + score6;
	int SBONUS = SCORE + score7;
	int TOTAL = 500;
	

	//BARGRAPH
	int fill = SCORE;
	int empty = 100 - fill;

	System.out.println (" _________________");
	for (; fill < 100 ; fill += 10)

	    {

		System.out.println ("|                 | \n|_________________| \t ");
	    }
	for (; empty < 100 ; empty += 10)

	    {

		System.out.println ("|XXXXXXXXXXXXXXXXX| \n|_________________| ");
	    }
	System.out.println ("   Your Score:" + score + "%");
	////////////



System.out.println("\n\n\n\n");

	if ()
	{
	    System.out.println ("YOU HAVE PASSED! HURRAY! YOU HAVE GOTTEN YOUR PERMIT TO GO TO CALIFORNIA TO GET DIGGIN' TO SAVE YOUR FAMILY! GOOD LUCK @ CALI!");
	    System.out.println ("                                                     MM                                             \n                                                    M MMMMMM                                        \n                                                    M    MM                                         \n                                                 MM     M                                           \n                                                 MMM M   M                                          \n                                                   MM  MMMM                                         \n                      M                            M             MM MMM                             \n                     MMM  MM                MM                MMM        MM                         \n                     M MM M               M   M             MMM            MM                       \n                    M    M              M      M           MMM  MM           M                      \n                   M     M                     MM         MMM   M MMMMMM                            \n                 MMMM  M MM                     M        MMM    M    M        MM        M           \n                    M M          MMM            MM      MMM   MM     M         M       M MM MMMM    \n                    MM        MMMMMMMMM          M      MM  MM M  MMMMM                M   M  M     \n                          MM        MMMM         MM    MM      M M                     M     M      \n                        M              MMM    M   M    MM      MM    MMMMMMMM        MM      MM     \n                      MM                MMM    M  M    M       M  MMMMMMMMMMMMM    MM     MM  MM    \n                    MM                   MMM      MM  MM   M    MMMM         MMM       M  M  MMM    \n                   M                       MM   M  M  M       MMMM            MM       M M          \n                                      MM    MM  MM M  M  M  MMM                         MM          \n                                         M   MM  M M MM M  MM                           M           \n                          MMMMMMMMMMMM     M  MM MMM M M MMM  MM    MMMMMMMMMMMMMMM                 \n                                    MMMMM   MM M  M M M MM  M    MMMM            MMMMM              \n                     MM                 MMMM  M M M M   M MM  MMM              M    MMMM            \n                                            MM M MMMM   MM MMM                 MM     MMM           \n                  MM                          M  MMMMMM  MM MMMMMMMM           M       MMM          \n                                MMMMMMMMMMM    MMMMMMMMM MM                             MMM         \n                 M           MMMMMMM        M   M  MMMM MMMMMMMMMMMMMMMM       M         MMM        \n                M          MMMMM         MMMMM   M  M               MMMMMM     M          MM        \n                         MMMMM          MMM  MM MM   M  MM              MMMM               MM       \n                        MMMM          MMM   MM  MM    MM  MM             MMMM MM           MM       \n           M           MMMM          MM   MMM  MM     MM   MM              MMM              MM      \n           MM   MM     MM           M    MMM   MM      MM   MM              MMM             MM      \n          M MM  M     MM                 MM    MM       MM   M               MMM            MM      \n         M     M     MMM                MM     M        MMM                   MM             M      \n       MM     M      MM                MMM              MMM                    MM            MM     \n      MMMM     M    MM                 MM                MM       MM     M     MM            M      \n         M MMMMM    MM                MM     M  M        MMM      M MMMMM     M M            MM     \n          MM        MM                MM      M   M      MMM      M     M       MM                  \n         M          MM                MM    M  MM         MM     MM    M     MM MM            M     \n                    MM     M         MM       MMM MM      MM  MM        M        M           M M    \n                    MM    M MM MMM   MM     M   M         MM    MMM MMMMMM       MM           M     \n                          M   M M    M           M        MM        M             M                 \n                    MM  MM     M     M                     M       M                          MM    \n                    MM MMM     M     M                     M      MM             MMM         MM     \n                         M  MMM M    M                     MM                    MMM                \n                     M   M M   MM               M          MM                     MM          M     \n                     M   MM          MM            M       MM                      M          M     \n                                     M M         M MMM     MM                     MM                \n                     MM                          MMM       MM                                       \n                      M               MM        M MM  M    MM                      M                \n                                                    M      MM                      M                \n                                       M                   MM                      M                \n                                      M                     M                                       \n                                       M M  M               M                                       \n                                        MM M                M                                       \n                                       MMMMM                                                        \n                                       MM M                 M                                       \n                                     MM M  M                M                                       \n                                        M                                                           \n                                                            M                                       \n                                                                                                    \n                                                            M                                       \n                                                           MM                                       \n                                                           MM                                       \n                                                                                                    \n                                                           MM                                       \n");

	}
	else
	{
	    System.out.println ("YOU HAVE FAILED UNFORTUNATELY! YOU HAVE TO GO BACK TO YOUR HOME TO GET SLEEPIN' FOR TOMORROW'S WORK! YOUR CALIFORNIAN GOLD DIGGIN' DREAM HAS BURST!");

	}
    }
}
