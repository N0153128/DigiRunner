package HubServer;

import java.net.DatagramSocket;
import java.net.SocketException;
import Support.Shortcuts;

public class Master {
	public static void main (String[] args) throws SocketException {
		Command command = new Command();
		DatagramSocket sock0 = new DatagramSocket(4445);
		Invoker server = new Invoker("Server", command, sock0);
		server.start();
		//	Share share = new Share(command);
	//	share.text = "pizda rulyu...";
	//	Invoker invoker = new Invoker();
	//	invoker.serveRequest(share);

	}
}
