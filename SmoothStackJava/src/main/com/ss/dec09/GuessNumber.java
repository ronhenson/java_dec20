package com.ss.dec09;
import java.util.Random;
import java.util.Scanner;

/**
 * java_dec20
 * 12/07/20
 * 
 * Day 1 Assignment 2
 * 	Random generate integer between 1-100 inclusive see: 19 JavaBasics_Wk1_Day1.pptx
 *  From console guess number, 5 attempts
 *  If number is within 10 numbers plus or minus, Give generated number and exit
 *  Example: Random # generated is 63
 *  User's guess must be between and include 53-73
 */

/**
 * @author ronh
 *
 */
public class GuessNumber {
	
	public static void main(String[] args) {

		int maxNum = 100;
		int minNum =1;

		int randomNumber = getRandomNumber(maxNum, minNum);
		
		int lowerBound = Math.max(1, randomNumber - 10);
		int upperBound = Math.min(100, randomNumber + 10);


		getNumber(randomNumber, lowerBound, upperBound);
	}

	private static int getRandomNumber(int max, int min) {
		
		Random number = new Random();
		return number.nextInt((max - min) + 1) + min;
	}
	
	private static void getNumber(int randomNumber, int lowerBound, int upperBound) {
		int guessNumber;
		try { 
			Scanner sc = new Scanner(System.in);
			for (int i=1; i<6; i++) {
				System.out.print("Enter Integer betweene 1-100 inclusive: ");
				guessNumber = sc.nextInt();
				
				if (checkNumber(guessNumber, randomNumber, lowerBound, upperBound)) {
					break;
				}
			}
			System.out.println("Sorry " + randomNumber);
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static boolean checkNumber(int guessNumber, int randomNumber, int lowerBound, int upperBound) {
		if (guessNumber >= lowerBound && guessNumber <= upperBound) {
			System.out.println("Good guess, the number is " + randomNumber );
			return true;
		}
		return false;
	}
}


