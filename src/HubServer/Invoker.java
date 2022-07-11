import java.util.*;

public class Invoker {
	private Share share;
	
	public void requestResolver(String wish) {
		Map<String, Command> menu = new HashMap<>();
		menu.put("/share", this.share);
		
		
	}

	public void serveRequest(Request req) {
		req.execute();
	}
}
