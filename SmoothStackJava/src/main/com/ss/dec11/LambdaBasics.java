/** 12/13/20
 * Introduction Part5
 * Assignment 1
 * Basic lambdas
 * Array sorted by length (shortest to longest) exact solution was shown
 * 	in lecture
 * reverse length
 * alphabetically by the first character only (Hint charAt(0) returns 1st ch)
 * 		See the first two lambda examples of the notes
 * Redo the previous problem, but use a static helper
 * 		lambda should look like
 * 			Arrays.sort(words, (s1, s1)-> -> Utils.yourMethod(s1, s2));
 */

package com.ss.dec11;

import java.util.Arrays;

/**
 * @author ronh
 *
 */

public class LambdaBasics 
{
	

	public static void main(String[] args) 
	{
		String[] names = {"Bob Parks", "John Doe", "Dick Tracy", "Michael James", "Jill Thompson"};
		
		// sort by longest
		Arrays.sort(names, (name1, name2) -> (name1.length() - name2.length()));
		for (String name : names) System.out.println(name);
		
		// reverse sort by length
		System.out.println();
		Arrays.sort(names, (name1, name2) -> (name2.length() - name1.length()));
		for (String name : names) System.out.println(name);
		
		// sort by first character only
		System.out.println();
		Arrays.sort(names, (name1, name2) -> (name1.charAt(0) - name2.charAt(0)));
		for (String name : names) System.out.println(name);
		
		// sort by first charactter with helper
		System.out.println();
		Arrays.sort(names, (name1, name2) -> sortByFirstCharacter(name1, name2));
		for (String name : names) System.out.println(name);

	}
	
	private static  Integer sortByFirstCharacter(String name1, String name2) {
		return name1.charAt(0) - name2.charAt(0);
	}

}
