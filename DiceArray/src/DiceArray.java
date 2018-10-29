/**
 * 
 * @author astagnaro20
 * Creates 2 die, rolls them 1000 times, counts # of times each number was rolled
 * Pd 6
 * 
 */
public class DiceArray 
{
	public static void main(String[] args)
	{
	Dice die1 = new Dice();
	Dice die2 = new Dice();
	
	int [] count = new int[13];
	for(int i = 0; i<1000; i++)
	{
		int sum = die1.roll() + die2.roll();
		count[sum]++;
		
	}
	for(int i = 2; i<13; i++)
	{
		System.out.println("You rolled " + count[i] + " " + i + "'s.");
	}
	
	}
	
}
