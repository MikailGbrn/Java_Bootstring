package com.learning.thread;

import java.beans.Transient;
import org.junit.Test;

public class ThreadHelloTest extends Thread{
	public void ThreadHelloTest() {

	}

	@Test
	public void testRun() {
		for (int i = 0; i < 5; i++) {
			ThreadHello instance = new ThreadHello(String.valueOf(i));
			Thread t = new Thread(instance);
			t.start();
		}
	}

	// @Test
	// public void testRun() {
	// 	for (int i = 0; i < 5; i++) {
	// 		ThreadWorld instance = new ThreadWorld();
	// 		instance.setName("" + i);
	// 		instance.start();
	// 	}
	// }

}