// main server methods - request resolver, serve requests, possibly start an event loop?

import java.util.ArrayList;
import java.util.List;


public class Server {
	private Map<String, Request> request = new HashMap<String, Request>();
	p

	public static Request requestResolver(String encoded) {
		request.put("/ping", Ping)
	}

	public void fillRequest(Request request) {
		reqList.add(request);
	}

	public void serveRequest() {
		for (Request request : reqList) {
			request.execute();
		}
		reqList.clear();
	}
}
