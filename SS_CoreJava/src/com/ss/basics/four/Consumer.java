/**
 * 
 */
package com.ss.basics.four;

/**
 * @author ronh
 *
 */
public class Consumer implements Runnable {
	
	public void consume() {
		try {
			synchronized (ProductOnHand.onHand) {
				
				for (int i=0; i<ProductOnHand.consumerMax; i++ ) {

					if (ProductOnHand.onHand > 0) {
						ProductOnHand.onHand--;
						System.out.println(i + ". Consumed, Data on hand: " + ProductOnHand.onHand);
					}
					Thread.sleep(ProductOnHand.consumerCount);
				}
				System.out.println("==> End of consumer transactions ... total in queue: " + ProductOnHand.onHand);
			}

		} catch (InterruptedException e) { 
			System.out.println("Interrupted " + e);
		}
	}
	
	//Runnable subtractOne = new Runnable() {
	
	@Override
	public void run() {
		consume();
	}
		
}
