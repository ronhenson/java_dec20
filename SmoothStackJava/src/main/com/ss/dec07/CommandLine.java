/**
 * 12/08/20
 * Week 1 Day 2 Assignment 1
 * Take multiple values from command line showing result
 * 	of adding all of them.
 */
package com.ss.dec07;

/**
 * @author ronh
 *
 */
public class CommandLine {
	
	public static void main(String[] args) {
		int sum = 0;
		for (int i=0;i<args.length; i++) {
			try {
				sum += Integer.parseInt(args[i]);
				System.out.print(args[i] + " + ");
			} catch (NumberFormatException e) {
				System.out.println("\n'" + args[i] + "' is an Invalid Number... aborting");
				System.exit(1);
			}
		}
		System.out.println(" = " + sum);
	}
}
