/**
 * 12/13/20
 * Introduction Part5
 * Assignment 3
 * Given a listof Strings, write a method that returns a list of all strings that
 * start with the letter 'a' (lower case) and have exactly 3 letters.
 * TIP: Use Java 8 Lambdas and Streams API
 */
package com.ss.dec11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author ronh
 *
 */
public class ListOfStringsUsingLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc", "bad", "abcd", "ABC", "bacabc", "adf", "");
		
		try {
			Stream<String> streamList = list.stream().filter( p -> p.charAt(0) == 'a' && p.length() == 3 );
			streamList.forEach(System.out::println);
		} catch (StringIndexOutOfBoundsException e) {
			// zero length string, ignore
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
