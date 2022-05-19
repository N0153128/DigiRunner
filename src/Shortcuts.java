import java.utils.Scanner;

// 19.05 - untested
public class Shortcuts {
	public static String strInput(String message) {
		Scanner scn = new Scanner(System.in);
		System.out.print(message + " ");
		String data = scn.nextLine();
		return data;
	}
	public static int intInput(String message) {
		Scanner scn = new Scanner(System.in);
		System.out.print(message + " ");
		int data = scn.nextINt();
		return data;
	}
	public static boolean boolInput(String message) {
		Scanner scn = new Scanner(System.in);
		System.out.print(message + " ");
		String data = scn.nextBoolean();
		return data;
	}
	public static byte byteInput(String message) {
		Scanner scn = new Scanner(System.in);
		System.out.print(message + " ");
		String data = scn.nextByte();
		return data;
	}
	public static double doubleInput(String message) {
		Scanner scn = new Scanner(System.in);
		System.out.print(message + " ");
		String data = scn.nextDouble();
		return data;
	}
	public static float floatInput(String message) {
		Scanner scn = new Scanner(System.in);
		System.out.print(message + " ");
		String data = scn.nextFloat();
		return data;
	}
	public static long longInput(String message) {
		Scanner scn = new Scanner(System.in);
		System.out.print(message + " ");
		String data = scn.nextLong();
		return data;
	}
	public static short shortInput(String message) {
		Scanner scn = new Scanner(System.in);
		System.out.print(message + " ");
		String data = scn.nextShort();
		return data;
	}
}
