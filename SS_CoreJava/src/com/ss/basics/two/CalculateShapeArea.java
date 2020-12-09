/**
 * 12/09/20
 * Week 1 Day 2 Assignment 3
 * Create the following hierarchy
 * 		Shape is an interface
 * 		Rectangle, Circle and Traingel are classes
 */

package com.ss.basics.two;

/**
 * @author ronh
 *
 */


public class CalculateShapeArea {
	
	public static void main(String[] args) {
		
		Shape rectangle = new Rectangle(10, 5);
		System.out.println("Area of Rectangle is " +
				rectangle.calculateArea()
		);
		
		Shape triangle = new Triangle(10, 5);
		System.out.println("Area of Triangle is " + 
				triangle.calculateArea()
		);
		
		Shape circle = new Circle(2);
		System.out.println("Area of Circle is " + 
				circle.calculateArea()
		);
		
		
		
	
		
	}

}
