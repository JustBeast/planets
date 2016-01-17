package aditya;

import apcs.Window;

public class Mass {
	public static final double G = 1.0;
	double  mass;
	String color;
	Vector position; 
	Vector velocity;
	Mass[] bodies;
	public Mass(double x, double y, double mass, String color) {
		position = new Vector(x,y);
		velocity = new Vector();
		this.mass = mass;
		this.color = color;
	}
	 public void draw() { 
		 Window.out.color(color);
		 Window.out.circle((int) position.x, (int) position.y, Math.log(mass));
	 }
	 public void move() {
		 position.add(velocity);
		 
	 }
	 public void accelerate() {
		 Vector netForce = new Vector(); 
		 for (Mass body : bodies) {
			 if (body != this) {
				 Vector r = new Vector(body.position.x - position.x, body.position.y - position.y);
				 double r2 = Math.pow(body.position.x - position.x, 2) +
				  Math.pow(body.position.y - position.y, 2);
				 double gforce = G * mass * body.mass / (r2) ; 
				r.scaleBy(r.magnitude());
				r.ScaleUp(gforce);
				
				netForce.add(r);
			 }
		 }
		 netForce.scaleBy(mass);
		 velocity.add(netForce);
		 
		 
	 }
}
