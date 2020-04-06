package project2;
import java.util.HashMap;
import java.util.Scanner;

public class Stores_Main {

	public static void main(String[] args) {
		
HashMap<Integer, Double> p1 = new HashMap<>();
p1.put(10, 12.50);
p1.put(20, 25.25);
System.out.println("Program stores data in HashMap");
Scanner sc = new Scanner (System.in);
System.out.println("what is product numbers");
int a1 = sc.nextInt();
while(a1!=0) {
	p1.get(a1);
	System.out.println(p1.get(a1));
	System.out.println("what is product numbers");
	a1 = sc.nextInt();
}

//System.out.println("what is product prices");
//double a2 = sc.nextDouble();
//p1.put(a1, a2);

	}
 
}
