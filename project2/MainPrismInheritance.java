package project2;

public class MainPrismInheritance {

	public static void main(String[] args) {
		
		PrismInheritance SolidPrism = new PrismInheritance();
		SolidPrism.depth = 10;
		SolidPrism.height = 20;
		SolidPrism.weidth = 30;
		SolidPrism.volume();
		SolidPrism.density = 45.5;
		
		System.out.println(SolidPrism.volume());	
		System.out.println(SolidPrism.mass());

	}
}
