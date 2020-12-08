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
		int randomNumber, guessNumber;
		int maxNum = 100, minNum = 1;
		int lowerBound, upperBound;
		
		randomNumber = getRandomNumber(maxNum, minNum);
		lowerBound = Math.max(1, randomNumber - 10);
		upperBound = Math.min(100, randomNumber + 10);
				
		for (int i=1; i<6; i++) {
			guessNumber = getNumber();
			if (guessNumber >= lowerBound && guessNumber <= upperBound) {
				System.out.println("Good guess, the number is " + randomNumber );
				break;
			} else if (i < 5) {
				System.out.println("Wrong Number, Keep Trying");
			} else {
				System.out.println("Sorry " + randomNumber);
			}
	}
}
	
	private static int getRandomNumber(int max, int min) {
		Random number = new Random();
		return number.nextInt((max - min) + 1) + min;
	}
	
	private static int getNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Integer betweene 1-100 inclusive: ");
		while (!sc.hasNextInt()) {
			System.out.println("Enter Ineger between 1-100:");
			sc.next();
		}
		return sc.nextInt();
	}
}
