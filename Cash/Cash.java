/*
Author: Saravanan
Date: March 18, 2010
Purpose: Cash Register
Sources: None
*/
public class Cash
{
    public static void main (String args[])
    {
	new Cash ();
    }
    public Cash ()
    {
	System.out.println ("***************************\n*       CASH REGISTER     *\n***************************");
	double cost = IBIO.inputDouble ("Please enter the total cost: $");
	double paid = IBIO.inputDouble ("Please enter the amount paid: $");
	double change = paid - cost; //change
	double change2 = Math.round (change * 100.0) / 100.0; //Remove Floating Decimal
	double ch100 = 100 * change;
	int changei = (int) ch100; //convert from Double to Int

	int toonie = changei / 200;
	int toonier = changei % 200;

	int loonie = toonier / 100;
	int loonier = toonier % 100;

	int quarters = loonier / 25;
	int quartersr = loonier % 25;

	int dimes = quartersr / 10;
	int dimesr = quartersr % 10;

	int nickel = dimesr / 5;
	int nickelr = dimesr % 5;

	int penny = nickelr / 1;

	System.out.println ("\n\nTotal change: $" + change2 + "\n\nYou will need: ");
	System.out.println (toonie + " toonie(s)");
	System.out.println (loonie + " loonie(s)");
	System.out.println (quarters + " quarter(s)");
	System.out.println (dimes + " dime(s)");
	System.out.println (nickel + " nickel(s)");
	System.out.println (penny + " penny(ies)");
    }
}
