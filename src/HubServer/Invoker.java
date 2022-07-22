package HubServer;

import java.io.IOException;
import java.net.BindException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import Support.Shortcuts;

import javax.xml.crypto.Data;

class Invoker implements Runnable{
	private final DatagramSocket child_sock;
	private final String threadName;
	private final Command command;
	private DatagramPacket packet;

	Invoker (String name, Command command1, DatagramSocket sock) {
		threadName = name;
		command = command1;
		child_sock = sock;
	}

	public void run() {
		byte[] buffer = new byte[8192];
		while (true) {
			DatagramPacket request = new DatagramPacket(buffer, buffer.length);
			try {
				child_sock.receive(request);
				packet = request;
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			String msg = new String(request.getData(), 0, request.getLength());
			requestResolver(msg);
		}
	}

	public void start() {
		Thread thread = new Thread(this, threadName);
		thread.start();
	}

	public void requestResolver(String wish) {
		if (wish.equals("/share")) {
			Share share = new Share(command, child_sock, packet);
			serveRequest(share);
		} else if (wish.equals("/ping")) {
			Ping ping = new Ping(command, child_sock, packet);
			serveRequest(ping);
		}
	}

	public void serveRequest(Request req) {
		req.execute();
	}
}


