package project2;

import java.util.Scanner;

public class Room {

	private int number;
	private String description;
	
	public void roomnumber(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a room number : " );
		number = input.nextInt();
		System.out.println("Enter the description of that room : " );
		description = input.next();
		 
	}
	@Override
	public String toString() {
		return "Room [number=" + number + ", description=" + description + "]";
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
