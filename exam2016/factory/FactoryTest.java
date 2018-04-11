package factory;

import java.util.Scanner;

public class FactoryTest{
	public static void main(String[] args) {
		// This plays the part of the drawing program
		// Prompt the user to enter a type of shape
		System.out.println("Enter type of shape:");
		//String shape = System.console().readLine();
//		Scanner sc = new Scanner(System.in);
//		String shape = sc.nextLine();
//		// Create a new Shape
//		Shape newShape = ShapeFactory.makeShape(shape);
//		newShape.draw();
//
//		Shape newShape2 = ShapeFactory.makeShape("RECTANGLE");
//		newShape.draw();
		
		Rectangle rec = new Rectangle();
		rec.draw();
		
		ShapeFactory fac = new ShapeFactory();
		
		fac.makeShape("CIRCLE").draw();
		
		Shape shape = ShapeFactory.makeShape("CIRCLE");
		
		shape.draw();
		
		Shape shape2 = ShapeFactory.makeShape("CIRCLE");
		shape2.draw();
		
	}
}