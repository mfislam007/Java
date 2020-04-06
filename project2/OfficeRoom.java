package project2;

import java.util.Arrays;
import java.util.Scanner;

public class OfficeRoom extends Room{

	
private String staffnames;
	
public void staff(){
		roomnumber();
	    Scanner input = new Scanner(System.in);
		
		System.out.println("Enter all the names : ");
		staffnames = input.next();
}

public boolean staff_names(String name){
	if (staffnames.contains(name)){
		return true;
	} else
	return false;
}

@Override
public String toString() {
	return "OfficeRoom [number=" + getNumber() + ", description=" + getDescription() + "staffnames=" +(staffnames) + "]";
}

}