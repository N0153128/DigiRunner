// Main server logic with an event loop

public class ServerDemo {
	public static void main (String[] args) {
		Command abcCom = new Command();
		Ping onecom = new Ping(abcCom);
		DoTwo twocom = new DoTwo(abcCom);

		Server server = new Server();
		server.fillRequest(onecom);
		server.fillRequest(twocom);

		server.serveRequest();
	}
}
