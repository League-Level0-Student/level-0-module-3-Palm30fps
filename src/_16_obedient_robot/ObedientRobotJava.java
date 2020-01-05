package _16_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobotJava {

	public static void main(String[] args) {

		Robot Color = new Robot();
		
		String ask = JOptionPane.showInputDialog("What colour would you like to draw in? ");
			
		if (ask.equals ("blue")) {
		Color.setPenColor(0, 0, 255);
		}	
		else if(ask.equals("red")) {
		Color.setPenColor(255, 0, 0);
		}
		else if(ask.equals("green")) {
		Color.setPenColor(0, 255, 0);
		}
		
		
		
		
		
		String shape = JOptionPane.showInputDialog("What shape would you like me to draw?");
	
	if (shape.equals ("circle")){drawCiricle(Color);}
	
	if (shape.equals ("square")){drawSquare(Color);}
	
	if (shape.equals ("triangle")){drawTriangle(Color);}
	
	
	
	
	
	
	
	}

	
	
	
	
	
	
	public static void drawSquare(Robot square) {

	
		square.setSpeed(100);

		square.penDown();

		for (int i = 0; i < 4; i++) {

			square.move(200);

			square.turn(90);
		}

	}

	public static void drawTriangle(Robot tri) {
		
		
		tri.setSpeed(100);

		tri.penDown();
for (int i = 0; i <3; i++) {
			
		
	

	tri.turn(60);
	
	tri.move(200);
	
}
	
	
	
	
	
	
	
}

public static void drawCiricle(Robot cir) {
		
				cir.setSpeed(100);

		cir.penDown();

			
		
	
for (int j = 0; j <360; j++) {
	
}
	cir.turn(1);
	
	cir.move(1);











}
}
