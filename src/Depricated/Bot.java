package Depricated;

import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class Bot {
	public static void main (String[] args) {
		try {
			DatagramSocket sock0 = new DatagramSocket(4445);
			boolean run = true;
			byte[] buffer = new byte[8192];
			while (run) {
				DatagramPacket request = new DatagramPacket(buffer, buffer.length);
				sock0.receive(request);
				InetAddress addr = request.getAddress();
				int port = request.getPort();
				String msg = new String(request.getData(), 0, request.getLength());
				if (msg.equals("/ping")) {
					System.out.println("hi");
				} else if (msg.equals("/off")) {
					System.out.println("Shutting down...");
					System.exit(0);
				} else if (msg.equals("/share")) {
					System.out.println(request.getAddress() + ":" + request.getPort() + " remote:  " + request.getSocketAddress());
				} else {
					byte[] pl = new byte[8192];
					String reply = "\nUnknown command: " + msg + "\n";
					pl = reply.getBytes();
					DatagramPacket pack = new DatagramPacket(pl, pl.length, request.getSocketAddress());
					sock0.send(pack);
					System.out.println("payload: " + pl + " length: " + pl.length + " address: " + request.getAddress() + " port: " + request.getPort());
					System.out.println("\nUnknown command: " + msg + "\n");
				}
			}
		}
		catch (Exception ex) {
			System.out.println();
		}
	}
}
