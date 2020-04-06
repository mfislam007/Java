package project2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class DateArray {
	public static void main(String[] args) {
		
		ArrayList<Date> Dates = new ArrayList<>();
		Dates.add(new Date (2,5,2018));
		Dates.add(new Date(5,8,2018));
		Dates.add(new Date (2,2,2018));
		Dates.add(new Date(5,3,2018));
		
		System.out.println("Enter your Date: ");
		Scanner scanner = new Scanner(System.in);
		String date = scanner.nextLine();
		while(!date.isEmpty()){
		System.out.println("Your Date is " + date);
		Dates.add(new Date(date));
		System.out.println("Enter your Date: ");
		date = scanner.nextLine();
		}
		 System.out.println("list of date");
	        for(Date s: Dates){
	            System.out.println(s);
	        }
	   int found= 0;
	    System.out.println("Enter your search date");
	    String Search_date = scanner.nextLine();
	    Date Saerch_Date= new Date(Search_date);
	    for (int i=0; i<Dates.size(); i++){
	    	if(Dates.get(i).equals(Saerch_Date)){
	    		
	    	found= 1;
	    System.out.println("Date found imdex " + i);
	    	}
	    }
	    	if (found==0) 
	    System.out.println("Date not found");	
	   
}
}