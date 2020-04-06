package project2;

import exercise6.Rectangle;

public class MainExample1 {

	public static void main(String[] args) {
		 Rectangle ractangle1 = new Rectangle();
	        System.out.println("Ractangle1: Centre (" + ractangle1.getLx() + ", " + ractangle1.getLy() 
	            + "), Width " + ractangle1.width()
	            + ", Height" +ractangle1.height()
	            + ", Area " + ractangle1.area());
	        Rectangle ractangle2 = new Rectangle(5,7);
	        System.out.println("Ractangle2: Centre (" + ractangle2.getLx() + ", " + ractangle2.getLy() 
	            + "), Width " + ractangle2.width()
	            + ", Height " + ractangle2.height()		
	            + ", Area " + ractangle2.area());
	        Rectangle ractangle3 = new Rectangle(2, -3, 5, 4);
	        System.out.println("Ractangle3: Centre (" + ractangle3.getLx() + ", " + ractangle3.getLy() 
	            + "), Weight " + ractangle3.width()
	            + ", Height " + ractangle3.height()
	            + ", Area " + ractangle3.area());
	        
	    }
}
