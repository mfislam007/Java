package project3;

import java.util.ArrayList;


public class MainAngle {

	public static void main(String[] args) {
		
	
		ArrayList <Measurable> list = new ArrayList<>();
		
		Rectangle rectangle1 = new Rectangle(20,20);
		list.add(new Rectangle(2.0,4,10,20));
		Circle circle1 = new Circle();
		list.add(new Circle(10));
		
		System.out.println("Circle Area" + circle1.area());
		System.out.println("Circle Perimeter" + circle1.perimeter());
		circle1.scale(2);
		
		System.out.println("Rectangle Area" + rectangle1.area());
		System.out.println("Rectangle Perimeter" + rectangle1.perimeter());
		rectangle1.scale(2);

	
	}
}
