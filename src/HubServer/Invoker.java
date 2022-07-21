package HubServer;

import java.net.BindException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.*;

public class Invoker {
	private Share share;
	
	public void requestResolver(String wish) {
		if (wish.equals("/ping")) {
			System.out.println("The user pings the server");
		} else if (wish.equals("/share")) {
			System.out.println("The user is trying to share their data");
		}
	}

	public void serveRequest(Request req) {
		req.execute();
	}
}

class Server implements Runnable {
	private Thread thread;
	private String threadName;
	private DatagramSocket child_sock;

	Server(String name, DatagramSocket sock) {
		threadName = name;
		child_sock = sock;
		System.out.println("Fetching requests...");
	}

	public void run() {
		try {
			InetAddress addr = InetAddress.getByName("localhost");
			byte[] buffer = new byte[8192];
			while (true) {
				DatagramPacket request = new DatagramPacket(buffer, buffer.length);
				child_sock.receive(request);
				String msg = new String(request.getData(), 0, request.getLength());
				System.out.println(msg);
			}
		} catch (BindException e) {
			System.out.println("bind fucked... rebinding");
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public void start() {
		thread = new Thread(this, threadName);
		thread.start();
	}

}
