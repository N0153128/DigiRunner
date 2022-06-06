public class CommanderDemo {
	public static void main (String[] args) {
		Request abcReq = new Request();

		DoOne onereq = new DoOne(abcReq);
		DoTwo tworeq = new DoTwo(abcReq);

		Server server = new Server();
		for (int i = 0; i <= 10; i++) {
			//server.serveCommand(onereq);
		//	server.serveCommand(tworeq);
		
		
			int rnum = 1 + (int)(Math.random() * 10);
			server.collectCommand(onereq, rnum);
		}
	}
}
