//import java.util.Arrays;
import java.lang.Thread;
import java.io.*;
import java.util.*;

public class sb {

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
 	public static void main (String[] args) {
		int su = 0;
		int su2 = su+10;
		System.out.println(su2);
		
		System.out.println(1+(int)(Math.random()*100*2.5));
		System.out.println(1+(int)(1.5));
		sb.me(1);
		sb.me(1, 2);
		//sb.me(2.3);
//		System.out.println(sb.me(1));
//		System.out.println(sb.me(1, 2));
	//	JSONObject obj = new JSONObject();
	//	obj.put("name", "suka");
	//	System.out.println("object: "+obj);
		
		//	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	//	hm.put(1, 1);
	//	System.out.println(hm);
		
		//int[] suka = new int[32];
		//System.out.println(suka.getClass());
	
		//Date d1 = new Date();
		//long start = d1.getTime();
		//System.out.println("Current time: " + start);
		//try {
		//	for (int i = 0; i < 10; i++) {
		//		if (i == 9) {
		//			Thread.sleep(5000);
		//			Date d2 = new Date();
		//			long now = d2.getTime();	
		//			System.out.println("Now: " + now);
		//			System.out.println("Difference: " + (long)(now - start));
		//		}
		//	}
		//}
	//	catch (Exception e) {
	//		System.out.println(e);
	//	}

 	 	//int[] arr1 = new int[] {
 	 	//  0, 1, 2, 3, 4
 	 	//};

		//System.out.println(indexOf(arr1, 4));
 	 //	int[] arr2 = new int[arr1.length * 2];
 	 //	System.arraycopy(arr1, 0, arr2, 0, arr1.length);
 	 //	for (int i = 0; i < arr2.length; i++) {
 	 //	 	System.out.println("Arr2, value: " + arr2[i]);
 	 //	}
	//	System.out.println(arr2[arr2.length-6]);
	//	System.out.println(arr2.length-1);
	//	int fig = arr2.length-8;
	//	System.out.println(--fig);
	//	System.out.println(arr2.length/2);
// 	 	System.out.println("Sukaaaa");
// 	 	int[] ept = new int[]{
// 	 	  5, 3, 1, 0, 2, 4
// 	 	};
// 	 	System.out.println("Initial array condition: ");
// 	 	for (int i = 0; i < ept.length; i++) {
// 	 	 	System.out.print(ept[i]+" ");
// 	 	}
// 	 	System.out.println("\nSorted array condition: ");
// 	 	Arrays.sort(ept);
// 	 	for (int i = 0; i < ept.length; i++) {
// 	 	 	System.out.print(ept[i]+ " ");
// 	 	}
 	}
 
}

