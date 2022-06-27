//import java.util.Arrays;
import java.lang.Thread;
import java.io.*;
import java.util.*;
import java.net.*;

public class pg {
	
	public static String requestResolver(String income) {
		Map<String, String> supermap = new HashMap<String, String>();
		supermap.put("one", "single");
		supermap.put("two", "double");
		supermap.put("three", "triple");
		supermap.put("four", "quad");
		return supermap.get(income);
	}
	
 	public static void main (String[] args) {
		String resolved = requestResolver(args[0]);
		Map<String,
		System.out.println(resolved);
		
	}
 
}

