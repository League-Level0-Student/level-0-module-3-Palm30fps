//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
			
		Robot Color = new Robot();
		//3. Ask the user what color they would like the robot to draw
	String ask = JOptionPane.showInputDialog("What colour would you like to draw in? ");
		//5. Use an if/else statement to set the pen color that the user requested
if (ask.equals ("Blue")) {
	Color.setPenColor(0, 0, 255);
}	
else if(ask.equals("Red")) {
	Color.setPenColor(255, 0, 0);
}
else if(ask.equals("Green")) {
	Color.setPenColor(0, 255, 0);
}

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
Color.setPenWidth(10);
Color.setSpeed(100);		
Color.penDown();
Color.move(100);
Color.turn(90);	
Color.move(100);	
Color.turn(90);
Color.move(100);
Color.turn(90);	
Color.move(100);	
	
	
	}
}
