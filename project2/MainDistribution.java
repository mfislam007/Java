package project2;

import java.util.Scanner;

public class MainDistribution {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String answer;
		 Distribution value = new Distribution(0,5);
		 PrintDistribution display = new PrintDistribution(value);
		 
		 do {
			 display.DisplayDistribution();
			 System.out.print("Give some values");
			 int a = input.nextInt();
			 value.insertValue(a);
			 System.out.print("Show the frequency data (y/n)? ");
			 answer = input.next();
		 }
		 while(answer.equals("y"));
		 input.close();

	}

}
