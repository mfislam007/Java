package project2;
import java.util.Scanner;

public class MainDistribution2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String answer;
		 Distribution value = new Distribution(1,6);
		 PrintDistribution display = new PrintDistribution(value);
		 Dice dice = new Dice ();
		 dice.roll();
		 
		 do {
			 display.DisplayDistribution();
			 //System.out.print("Give some values");
			 dice.roll();
			 value.insertValue(dice.getScore());
			 System.out.print("Show the frequency data (y/n)? ");
			 answer = input.next();
		 }
		 while(answer.equals("y"));
		 input.close();

	}

}