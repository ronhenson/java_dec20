/**
 * 12/13/20
 * Assignment 2
 * Introduction Part5
 * Write a method that returns a comma separated string based
 * on a given list of integers.
 * Each letter should be preceded by the letter 'o' for odd and 'e' for even
 * Example
 * input : (3,44)
 * output: o3,e44
 */
package com.ss.dec11;

import java.util.Arrays;
import java.util.List;

/**
 * @author ronh
 *
 */
public class StringOfIntegers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(3, 44, 12, 0, 100);
		
		listOfIntegers.forEach( i -> {
			if (i % 2 == 0) {
				System.out.print("e" + i + ",");
			}else {
				System.out.print("o" + i +";");
			}
		});
	}

}
