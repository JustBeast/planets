package aditya;

public class Vector {
	double x; 
	double y; 
	
	public Vector() {
		x = 0; 
		y = 0;
		
	}
	public Vector(Vector other) {
		x = other.x;
		y = other.y;
	}
	
	//copy constructor
	public Vector(double xx, double yy) {
		x = xx;
		y = yy;
	}
	public void add(Vector other) { 
		x = x + other.x;
		y = y + other.y;
		
	}
	public void invert() {
		x = -x; 
		y = -y;
		
	}
	public double magnitude() {
		return Math.sqrt(x*x + y * y);
	}
	public void scaleBy(double factor) {
		x = x / factor; 
		y = y/ factor;
		
	}
	public void ScaleUp(double factor) {
		x = x* factor;
		y = y * factor;
		
	}
}
