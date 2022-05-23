import java.util.Scanner;

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
		int data = scn.nextInt();
		return data;
	}
	public static boolean boolInput(String message) {
		Scanner scn = new Scanner(System.in);
		System.out.print(message + " ");
		boolean data = scn.nextBoolean();
		return data;
	}
	public static byte byteInput(String message) {
		Scanner scn = new Scanner(System.in);
		System.out.print(message + " ");
		byte data = scn.nextByte();
		return data;
	}
	public static double doubleInput(String message) {
		Scanner scn = new Scanner(System.in);
		System.out.print(message + " ");
		double data = scn.nextDouble();
		return data;
	}
	public static float floatInput(String message) {
		Scanner scn = new Scanner(System.in);
		System.out.print(message + " ");
		float data = scn.nextFloat();
		return data;
	}
	public static long longInput(String message) {
		Scanner scn = new Scanner(System.in);
		System.out.print(message + " ");
		long data = scn.nextLong();
		return data;
	}
	public static short shortInput(String message) {
		Scanner scn = new Scanner(System.in);
		System.out.print(message + " ");
		short data = scn.nextShort();
		return data;
	}
}
