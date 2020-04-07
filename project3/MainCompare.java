package project3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import exercise2.Date;

public class MainCompare {

	public static void main(String[] args) {
		 ArrayList<Date> date = new ArrayList<>();
		 date.add(new Date("02/03/2019"));
		 date.add(new Date("03/12/2019"));
		 date.add(new Date("05/05/2019"));
		 date.add(new Date("01/07/2018"));
		 date.add(new Date("02/08/2019"));
	        
	        Collections.sort(date);
	        
	        for(Date s: date){
	            System.out.println(s);
	        }
	    }

	}


