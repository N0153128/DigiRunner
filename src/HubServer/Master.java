package HubServer;

import java.net.DatagramSocket;
import java.net.SocketException;

public class Master {
	public static void main (String[] args) throws SocketException {
		Command command = new Command();
		DatagramSocket sock0 = new DatagramSocket(4440);
		Server server = new Server("Server", sock0);

		//	Share share = new Share(command);
	//	share.text = "pizda rulyu...";
	//	Invoker invoker = new Invoker();
	//	invoker.serveRequest(share);

	}
}
