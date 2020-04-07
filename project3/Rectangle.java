package project3;

public class Rectangle implements Measurable {


    private double lx = 0; // centre x
    private double ly = 0; // centre y
    private double rx = 1; 
    private double ry = 1; 

    //Constructors
    public Rectangle() {
       
    }

    public Rectangle(double rx,double ry){
        this.lx = 0;
        this.ly = 0;
        this.rx = rx;
        this.ry = ry;
    }

    public Rectangle(double lx, double ly, double rx, double ry) {
        this.lx = lx;
        this.ly = ly;
        this.rx = rx;
        this.ry = ry;
    }

    // Setters and getters
    public double getLx() {
        return lx;
    }

    public void setLx(double lx){
        this.lx = lx;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly){
        this.ly = ly;
    }

    public double getRx() {
        return rx;
    }

    public void setRx(double rx){
        this.rx = rx;
    }

    public double getRy() {
        return ry;
    }

    public void setRy(double ry){
        this.ry = ry;
    }

  
    //Other methods

    // Area of circle
    public double width() {
        return (rx-lx);
    }
    public double height() {
        return (ry-ly);
    }
    public double area() {
        return width()*height();
    }

	@Override
	public double perimeter() {
		return 2*(width()+height());
	}

	@Override
	public void scale(double scaleValue) {
		rx=lx+scaleValue*width();
		ry=ly+scaleValue*width();
		
	}

} 
	
