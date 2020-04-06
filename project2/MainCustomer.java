package project2;

import java.util.ArrayList;

public class MainCustomer {

	public static void main(String[] args) {
		ArrayList <Customer> customers = new ArrayList<>();
		customers.add(new Customer(0123654,"anni linna","24 yliopistukatu"));
		customers.add(new PreferredCustomer(0165454,"minna linna","1 yliopistukatu",10000.0));
		
		// all the customers
       for(int i=0;i< customers.size(); i++){
    	   System.out.println(customers.get(i));
       }
       // preferred Customers
       for(int i=0;i< customers.size(); i++){
    	   if (customers.get(i) instanceof PreferredCustomer){
    	   System.out.println(customers.get(i)); 
    	   ((PreferredCustomer)customers.get(i)).CalculateBonus();
    	   }
	}
	
	
	}
}
