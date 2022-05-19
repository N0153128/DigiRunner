//import java.util.Arrays;
import java.lang.Thread;
import java.io.*;
import java.util.*;
import java.net.*;


public class pg {

	public static void func(Integer arg){
		if (arg != null){
		
			if (arg > 0){
				System.out.println(">0");
			} else if (arg < 0){
				System.out.println("<0");
			}
		} else if (arg == null) {
			System.out.println("arg is null");
		}
	}

	public static void me(int arg1) {
		System.out.println("method 1 triggered");
	}

	public static void me(int arg1, int arg2) {
		System.out.println("method 2 triggered");
	}

	public static int me(double arg1) {
		System.out.println("method 3 triggered");
		return 3;
	}

/*      public static int me(int arg1, int arg2) {
		System.out.println("method 4 triggered");
		return 3;
	}
*/
	public static String shortCut(String message) {
		Scanner inp = new Scanner(System.in);
		System.out.print(message + " ");
		String word = inp.nextLine();
		return word;

	}

 	public static void main (String[] args) {
		System.out.println(shortCut("who?"));

		int su = 1;
		int ka = 0;

		if (su == 1 && ka == 1) {
			System.out.println("yes");       
		}
		try{
			InetAddress ad = InetAddress.getLocalHost();
			System.out.println(ad);
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
		//int su = 0;
		//int su2 = su+10;
		//System.out.println(su2);
		
		//System.out.println(1+(int)(Math.random()*100*2.5));
		//System.out.println(1+(int)(1.5));
		//pg.me(1);
		//pg.me(1, 2);

		//System.out.println("-----------");
		//pg.func(null);
		
 	}
 
}

