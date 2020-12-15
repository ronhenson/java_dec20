/*
 * 12/13/20
 * Day 5 assignment for Monday 12/14/20
 * See Day5_assignment
 * Assignment 2b:  Functional
 * 		Given a list of non-negative integers, return an integer list
 * 		of the rightmost digits.  (Note: use %)
 * 		rightDigit({1, 22, 93}) -> [1, 2, 3]
 */

package com.ss.dec11;


import java.util.Arrays;
import java.util.List;

public class FuncitonNonNegativeIntegers {
	
	public static void main (String[] args) { 
				
		List<Integer> rightDigit = Arrays.asList(22, 1, 46);
	
		printRightDigit(rightDigit);
	}
	
	static void printRightDigit(List<Integer> rightDigit) {
		rightDigit.forEach(i -> System.out.println(i % 10));
	
	}

}
