/**
 * Write a program to create a deadlock between two threads.
 */
package com.ss.basics.four;


/**
 * @author ronh - ron henson
 *
 */
public class CreateDeadlock {
	
	public static void main(String[] args) {
		Person one = new Person("John", "Doe", 30, true );
		Person two = new Person("Tom", "Jones", 40, false );
		
		System.out.println("Begin");
		
		// Run two threads
		
		Runnable test1 = new Runnable() {

			@Override
			public void run() {
				try {
					synchronized (one) {
						System.out.println("Thread 1 After one");
						Thread.sleep (100);
						synchronized (two) {
							System.out.println("Thread 1 After two");
						}
					}
				} catch (InterruptedException e) {
					// Do nothing
				}
			}
		};
			
		Runnable test2 = new Runnable() {
			
			@Override
			public void run() {
				try {
					synchronized (two) {
						System.out.println("Thread 2 After two");
						Thread.sleep (100);
						synchronized (one) {
							System.out.println("Thread 2 after one");
						}
					}
				} catch (InterruptedException e) {
					// Do nothing
				}
			}
		};
				
			new Thread(test1).start();
			new Thread(test2).start();
			
			System.out.println("End");
			
	}
}