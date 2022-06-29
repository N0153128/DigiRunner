//import java.util.Arrays;
import java.lang.Thread;
import java.io.*;
import java.util.*;
import java.net.*;

public class pg {
	
	public static <E> requestResolver(E income) {
		Map<String, Object> supermap = new HashMap<String, Object>();
		supermap.put("one", 1);
		supermap.put("two", 0.2);
		return supermap.get(income);
	}
	
 	public static void main (String[] args) {
		int resolved = requestResolver(args[0]);
		System.out.println("" + resolved * 10);
		
	}
 
}

