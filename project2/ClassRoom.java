package project2;

import java.util.Scanner;

public class ClassRoom extends Room{

	private int seatnumbers;
	private int computernumbers;
	private int dataprojector;
	
public void data(){
		roomnumber();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter seatnumbers : " );
		seatnumbers = input.nextInt();
		System.out.println("Enter computernumbers : " );
		computernumbers = input.nextInt();
		System.out.println("Enter dataprojector: " );
		dataprojector = input.nextInt();
		 
	}

@Override
public String toString() {
	return "ClassRoom [number=" + getNumber() + ", description=" + getDescription()+ " seatnumbers=" + seatnumbers + ", computernumbers="
			+ computernumbers + ", dataprojector=" + dataprojector + "]";
}


}
