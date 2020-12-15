/*
 * 12/13/20
 * Day5_assignments
 * Assignment 1: Lambdas
 * Write the following method that return a 
 * 		lambda expression performing a specified action.
 * 		PerformOperationIsOdd()  // if a number is odd or if it is even
 * 		PerformOperationIsPrime() // if a number is prime or if it is composite
 * 		PerformOperationIsPalindrome // if a number is a palindrome or if it is not
 * 	
 * INPUT is handle by the locked stub code in your editor
 * 
 * 	The first line contains integer, nubmer of test cases
 * 	Subsequent lines Input space separate integers
 * 		first integer specifies the condition to check for
 * 			1 for Odd/Even
 * 			2 for Prime
 * 			3 for Palindrome
 * 		Second integer denotes the number to check
 * 	SAMPLE
 * 	5
 * 	1 4
 * 	2 5
 * 	3 898
 * 	1 3
 * 	2 12
 * SAMPLE OUTPUT
 * 	EVEN
 * 	PRIME
 * 	PALINDROME
 * 	ODD
 * 	COKPOSiTE
 */
package com.ss.dec11;

import java.math.BigInteger;



interface PerformOperation
{
    public String operation(int num);	
    	
}

public class LambdaOperation 
{

	public static void main(String[] args) 
	{
		int numArgs = 0;
		
		if (args.length > 0) 
		{
			numArgs = Integer.parseInt(args[0]);
		}
		
		PerformOperation  odd = isOdd();
		PerformOperation prime = isPrime();
		PerformOperation pal = isPalindrome();
		
				
		if (numArgs > 0) 
		{
			for (int i = 1; i < numArgs*2 - 1; i+=2) 
			{
				int oper = Integer.parseInt(args[i]);
				int num = Integer.parseInt(args[i+1]);
				
				switch (oper) 
				{
				case 1: System.out.println(odd.operation(num));
						break;
				case 2: System.out.println(prime.operation(num));
						break;
				case 3: System.out.println(pal.operation(num));
						break;
				default:System.out.println("Invalid number" + num);
						break;
				}
					
			}
		}
	}
	
	public static  PerformOperation isOdd() 
	{
		
		return (i) -> (i % 2 == 0) ? "EVEN":"ODD";
		
	}
	
	public static  PerformOperation isPrime() 
	{
			
		return (i) -> (BigInteger.valueOf(i).isProbablePrime(10000)) ? "PRIME":"COMPOSITE";
	}
	
	public static  PerformOperation isPalindrome() 
	{
		
		
		return (i) -> 
		{
			char[] ch = String.valueOf(i).toCharArray();
			int end = ch.length -1;
			int start = 0;
			if (ch.length == 1) return "PALIiNROME";
			
			while (start < end) 
			{
				
				if (ch[start] != ch[end]) 
				{
					return "NOt PALINDROME";
				}
				start++;
				end--;
			}
			return "PALIDROME";
							
		};
	}
}