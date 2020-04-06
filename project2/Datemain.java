package project2;

import java.util.Scanner;

public class Datemain {
	public static void main(String[] args) {
		String s;
 Date calender1 = new Date();
 System.out.println ("day "+ calender1.getDay()+ "month"+ calender1.getMonth()+ "year" + calender1.getYear());
 System.out.println (calender1);
 
Date calender2 = new Date(21,11,2018);
System.out.println (calender2);


if (calender1.equals (calender2)){
	System.out.println ("The same date");
} else{
		System.out.println ("Not the same date");
}
Scanner in = new Scanner(System.in);
System.out.println("Enter a date");
s = in.nextLine();
Date calender3 = new Date(s);
System.out.println("You entered the date " + s);

if (calender1.equals (calender3)){
	System.out.println ("The same date");
} else{
		System.out.println ("Not the same date");
}

Date calender4 = new Date();
System.out.println (calender4.toLongString());

System.out.println("month name");
String name = in.nextLine();
System.out.println("monthNumber : " + Date.monthNumber(name));
}
	}
	
