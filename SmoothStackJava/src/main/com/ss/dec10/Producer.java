/**
 * 
 */
package com.ss.dec10;

/**
 * @author ronh
 *
 */
public class Producer implements Runnable {
	
	public void produce() {
		try {
			synchronized (ProductOnHand.onHand) {
				for (int i=0; i<ProductOnHand.producerMax; i++ ) {
					if (ProductOnHand.onHand < ProductOnHand.queueSize) {
						ProductOnHand.onHand++;
						System.out.println(i + ". Produced Data on hand:  " + ProductOnHand.onHand);
					}
				Thread.sleep(ProductOnHand.producerCount);
				}
				System.out.println("==> End of producer  transactions ... total in queue: " + ProductOnHand.onHand);
			}

		} catch (InterruptedException e) { 
			System.out.println("Interrupted " + e);
		}
	}
	
	
	
	
	// Runnable addOne = new Runnable() {
	
	@Override
	public void run() {	
		produce();
	}


	


//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		
//	}

}
