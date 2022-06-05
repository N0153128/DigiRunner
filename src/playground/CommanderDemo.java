public class CommanderDemo {
	public static void main (String[] args) {
		Request abcReq = new Request();

		DoOne onereq = new DoOne(abcReq);
		DoTwo tworeq = new DoTwo(abcReq);

		Server server = new Server();
		server.serveCommand(onereq);
		server.serveCommand(tworeq);

		server.collectCommand();
	}
}
