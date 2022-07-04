//import java.util.Arrays;
import java.lang.Thread;
import java.io.*;
import java.util.*;
import java.net.*;

public class pg {

	int initial;

	public int initial(int parm) {
		this.initial = parm;
		return initial;
	}

	public <T> void requester(T[] income) {
		for (T element : income) {
			System.out.printf("%s ", element);
		}
		System.out.println(initial(10));

	}
	
 	public static void main (String[] args) {
		pg playground = new pg();
		Integer[] ints = {1, 2, 3, 4, 5};
		Double[] doubs = {6.9, 4.7, 1.2};
		String[] strs = {"P", "I", "Z", "D", "A"};
		playground.requester(ints);
		playground.requester(doubs);
		playground.requester(strs);
		System.out.println(playground.initial);	
	}
 
}

