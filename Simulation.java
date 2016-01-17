package aditya;
import apcs.Window;

public class Simulation {

	public static void main(String[] args) {
		Window.size(1000, 600);
		
		Mass[] bodies = new Mass[2];
		bodies[0] = new Mass(250, 200, 950, "red");
		bodies[1] = new Mass(750, 450, 780, "blue");
		for (Mass body : bodies) {
			body.bodies = bodies;
		}
		while (true)  {
			Window.out.background("black"); 
			for(Mass body : bodies) {
				body.accelerate();
			}
			for (Mass body : bodies) {
				body.draw();
				body.move();
			}
			Window.frame();
		}
		

	}

}
