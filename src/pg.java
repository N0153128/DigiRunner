//import java.util.Arrays;
import java.lang.Thread;
import java.io.*;
import java.util.*;
import java.net.*;

class Demo implements Runnable {
	private Thread t;
	private String threadName;

	Demo( String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}
	public void run() {
		System.out.println("Running " + threadName + "'s shit");
		try {
			int rnd = 0;
			for (int i = 0; i<=10; i++) {
				rnd = 1 * (int)(Math.random()* 10);
				System.out.println("Thread: " + threadName + " says" + rnd);
				Thread.sleep(rnd*10);
			} 
		} catch (Exception ex) {
			System.out.println(ex);
		}
			System.out.println("Thread " + threadName + " closes");
	}
	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread (this, threadName);
			t.start();
		}
	}
}

public class pg {

 	public static void main (String[] args) {
		Demo t1 = new Demo( "One");
		t1.start();

		Demo t2 = new Demo( "Two");
		t2.start();
		int rand = 0;
		try {
			for (int i = 0; i<=10; i++) {
				rand = 1 * (int)(Math.random() * 10);
				System.out.println("Main says: " + rand);
				Thread.sleep(50);
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	
 	}
 
}

