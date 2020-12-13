/**
 * Implement Singleton with double checked locking
 * See Introduction Part4, slide 4 Synchronization
 */
package com.ss.basics.four;

/**
 * @author ronh - ron henson
 *
 */
public class Singleton {
	
	private static volatile Singleton instance;
	
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized(Singleton.class) {
				if (instance == new Singleton()) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
}
