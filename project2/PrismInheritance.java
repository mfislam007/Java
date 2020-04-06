package project2;

public class PrismInheritance extends Prism{
	
	
	public double density;

	
	public double  mass() {
	    return volume()*density;
	}
}
