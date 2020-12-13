/**
 * Write a program with one thread (the producer) that produces items (in
 * this case simple int's).  another thread (the consumer) consumes items.
 * For communication purposes both threads have access to bounded
 * buffer which is basically an array.
 * 
 * see Introduction Par4 slide 10  Producer/Consumer Problem
 * 
 * Classes used:
 * 	Class ProductOnHand:  to provide global variables to use for this example producer/consumer problem
 * 		In Class ProducOnHand have the following variables that can be changed for testing
 * 		static Integer onHand = 5;  // Amount on hand queue
 *	
 *		// To regulate the loop
 *		final static int consumerCount = 1000;  // Sleep time 
 *		final static int consumerMax = 30;		// maximum for loop counter 
 *		final static int producerCount = 100;   // Sleep time
 *		final static int producerMax = 20;		// maximum loop max
 * 	Class Production
 * 	Class Consumer
 */
package com.ss.basics.four;


/**
 * @author ronh ron henson
 *
 */

public class ProducerConsumer {
	
	public static void main (String[] args)  {
		
		System.out.println("Initial loop parameters");
		System.out.println("    On Hand:                " + ProductOnHand.onHand);
		System.out.println("    Queue Size:             " + ProductOnHand.queueSize);
		System.out.println("    Consumer Sleep time :   " + ProductOnHand.consumerCount);
		System.out.println("    Consumer maximum loop : " + ProductOnHand.consumerMax);
		System.out.println("    Producer Sleep time :   " + ProductOnHand.producerCount);
		System.out.println("    Producer maximum loop : " + ProductOnHand.producerMax + "\n");
				
		Thread producerThread = new Thread(new Producer());	
		Thread consumerThread = new Thread(new Consumer());
						
		producerThread.start();
		consumerThread.start();
		
		try {
				producerThread.join();
				consumerThread.join();
			
		} catch (InterruptedException e) {
			System.out.println("Interupted " + e);
		}
	}
}

