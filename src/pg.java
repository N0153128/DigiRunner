//import java.util.Arrays;
import java.lang.Thread;
import java.io.*;
import java.util.*;
import java.net.*;

public class pg {
	public static int getPort(int min, int max) {
		
		for (int i = min; i <= max; i++) {
			try {
				DatagramSocket sock0 = new DatagramSocket(i);
				return i;
		} catch (Exception bind) {
			System.out.println(bind);

			}
		}
		return 0;
	}
	
 	public static void main (String[] args) {
	System.out.println(getPort(4444, 5555));		
	
	}
 
}

