public class ServerDemo {
	public static void main (String[] args) {
		Command abcCom = new Command();
		DoOne onecom = new DoOne(abcCom);
		DoTwo twocom = new DoTwo(abcCom);

		Server server = new Server();
		server.fillRequest(onecom);
		server.fillRequest(twocom);

		server.serveRequest();
	}
}
