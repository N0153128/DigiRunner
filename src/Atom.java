import java.lang.Thread;
import java.io.*;
import java.util.*;

public class Atom {
 
 	public static int[] tunnelSearch(int original[]) {
		int flag = 0;
		while (flag == 0) {
				
			for (int i = 0; i < original.length; i++) {
				if (original[i] == 0) {
					int a = 1 + (int)(Math.random() * 10);
					int b = 1 + (int)(Math.random() * 100);
					if (a == b) {
						original[i] = a;
					}
				} else if (original[original.length-1] != 0) {
					flag = 1;
				  }
			}
		}

		return original;
	}
	//^^ this shit is done, do not touch
 	
	public static void mineProc() {
		int[] initiator = new int[1024];
		HashMap<Integer, Integer[]>json = new HashMap // <- Continue here
		int counter = 0;
		Date d1 = new Date();
		long start = d1.getTime();
		while (true) {
			if (Atom.tunnelSearch(initiator).getClass()) {
				counter++;
			}
			Date d2 = new Date();
			long now = d2.getTime();
			long diff = (now - start);
			if (diff == 5000) {
				System.out.println("total: " + counter + "P/M");
				break;
			}
		}

	}
 
 	public static void main (String[] args) {
 	 	int[] bak = new int[1024];
	//	System.out.println(Atom.tunnelSearch(bak));
		Atom.mineProc();
		System.out.println();
 	}
}
