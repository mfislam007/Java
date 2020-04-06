package project2;

public class MainPrism {

	public static void main(String[] args) {
		Prism p1, p2;
		p1 = new Prism();
		p2 = new Prism();
		
		p1.weidth = 5;
		p1.height = 6;
		p1.depth = 3;
		
		p2.weidth = 6;
		p2.height = 7;
		p2.depth = 2;
		
		System.out.println(p1.volume());	
		System.out.println(p2.volume());
	}

	}

