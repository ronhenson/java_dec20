/**
 * 
 */
package com.ss.dec07;

/**
 * @author ronh
 *
 */
public class Triangle implements Shape {

	double base;
	double height;
		
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
		
	public double calculateArea() {
		return base * height;
	}
}
