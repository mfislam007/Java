package project3;

public class Circle implements Measurable {

	private double cx; // centre x
    private double cy; // centre y
    private double r; // radius

    //----------------------------------------------------
    //Constructors
    public Circle() {
        this.cx = 0;
        this.cy = 0;
        this.r = 1;
    }

    public Circle(double r){
        this.cx = 0;
        this.cy = 0;
        this.r = Math.abs(r);
    }

    public Circle(double cx, double cy, double r) {
        this.cx = cx;
        this.cy = cy;
        this.r = Math.abs(r);
    }

    //------------------------------------------------
    // Setters and getters
    public double getCx() {
        return cx;
    }

    public void setCx(double cx){
        this.cx = cx;
    }

    public double getCy() {
        return cy;
    }

    public void setCy(double cy){
        this.cy = cy;
    }

    public double getR() {
        return r;
    }

    public void setR(double r){
        this.r = Math.abs(r);
    }

    //-------------------------------------------
    //Other methods

    // Area of circle
    public double area() {
        return Math.PI * r * r;
    }

	@Override
	public double perimeter() {
		return 2*Math.PI*r;
	}

	@Override
	public void scale(double scaleValue) {
		r*= scaleValue;
		
	}
	
}
