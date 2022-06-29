// main server methods - request resolver, serve requests, possibly start an event loop?

import java.util.ArrayList;
import java.util.List;


public class Server {
	private Map<String, Request> request = new HashMap<String, Request>();
	p

	public static Request requestResolver(Map<String, Object> parameters) {
		request.put("/ping", Ping(parameters.get("socket"), parameters.get("packet")));
		request.put("/share", Share(parameters.get("socket")));
		return request.get(parameters.get("command"));
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
