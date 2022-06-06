import java.util.ArrayList;
import java.util.List;

public class Server {
	private List<Request> reqList = new ArrayList<Request>();

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
