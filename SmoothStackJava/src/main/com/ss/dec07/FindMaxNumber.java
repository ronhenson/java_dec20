/**
 * 12/08/20
 * Week 1 Day 2 Assignment 2
 * Construct a 2D array and find the max number
 * 	and show the it's postion in an array
 */
package com.ss.dec07;

/**
 * @author ronh
 *
 */
public class FindMaxNumber {
	
	public static void main(String[] args) {
		int[][] intArray = { 
			{10, 7, 40},
			{12, 22, 5},
			{80, 15, 6}
			};
	
	int maxNum = 0;
	int row = 0, column = 0;
	
	for (int i = 0; i<intArray.length; i++) {
		for (int j = 0; j<intArray[i].length; j++) {
			if (maxNum < intArray[i][j]) {
				maxNum = intArray[i][j];
				row = i;
				column = j;
			}
		}
	}
	System.out.println("Maximum number: " + maxNum + 
		" Position in Array: row " + row + " column " +
		+ column);
	}

}
