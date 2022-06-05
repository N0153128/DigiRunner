import java.lang.Thread;
import java.io.*;
import java.util.*;

public class Atom {
 
	// Base mining method.
 	public static HashMap hexer(int original) {
		HashMap<Integer, Integer> json = new HashMap<Integer, Integer>();
		int flag = 0;
		for (int i = 0; i < original; i++) {
			int flag1 = 0;
			while(flag1 == 0) {
				int a = 1 + (int)(Math.random() * 10);
				int b = 1 + (int)(Math.random() * 100);
				if (a == b) {
					json.put(i, a);
					flag1 = 1;
				}
			}
		}
		return json;
	}
 
	// Mod: divide & multiply
 	public static HashMap hexer(int original, double nmod, int empty) {
		HashMap<Integer, Integer> json = new HashMap<Integer, Integer>();
		int flag = 0;
		for (int i = 0; i < original; i++) {
			int flag1 = 0;
			while(flag1 == 0) {
				int a = 1 + (int)(Math.random() * 10);
				int b = 0;
				if (nmod < 0.0) {
					b = 1 + (int)(Math.random() * 100 * nmod);
				} else if (nmod > 0.0) {
					b = 1 + (int)(Math.random() * 100 / nmod);
				}
				if (a == b) {
					json.put(i, a);
					flag1 = 1;
				}
			}
		}
		return json;
	}

	// Mod: delay & accelerate
 	public static HashMap hexer(int original, int blockmod) {
		HashMap<Integer, Integer> json = new HashMap<Integer, Integer>();
		int flag = 0;
		if (blockmod < 0) {
			original = original * blockmod;
		} else if (blockmod > 0) {
			original = original / blockmod;
		}
		for (int i = 0; i < original; i++) {
			int flag1 = 0;
			while(flag1 == 0) {
				int a = 1 + (int)(Math.random() * 10);
				int b = 1 + (int)(Math.random() * 100);
				if (a == b) {
					json.put(i, a);
					flag1 = 1;
				}
			}
		}
		return json;
	}

	// Mod: custom.
 	
/*	public static HashMap hexer(int original, int custom) {
		HashMap<Integer, Integer> json = new HashMap<Integer, Integer>();
		int flag = 0;
		for (int i = 0; i < original; i++) {
			int flag1 = 0;
			while(flag1 == 0) {
				int a = 1 + (int)(Math.random() * 10);
				int b = 1 + (int)(Math.random() * custom);
				if (a == b) {
					json.put(i, a);
					flag1 = 1;
				}
			}
		}
		return json;
	}
*/
	// Mining benchmark that demonstrates the user approximate amount of minable units per minute.
	public static void benchMine() {
		int init = 64;
		int counter = 0;
		Date d1 = new Date();
		long start = d1.getTime();
		while (true) {
			Atom.hexer(init, 1);
			counter++;

			Date d2 = new Date();
			long now = d2.getTime();
			long diff = (now - start);
			if (diff == 60000) {
				System.out.println("total: " + counter + " P/M with init " + init);	
				break;
			}
		}
	}
 
 	public static void main (String[] args) {
 	 	//int bak = 8;
		//System.out.println(Atom.tunnelSearch(bak));
		//System.out.println("Max mem: " + Runtime.getRuntime().maxMemory());
		Atom.benchMine();
		System.out.println();
 	}
}
