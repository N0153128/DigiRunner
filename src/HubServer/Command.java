package HubServer;

import java.net.*;

public class Command {
	private DatagramSocket sock;
	private DatagramPacket pack;
	
	public void Ping (DatagramSocket sock, DatagramPacket pack) {
		byte[] payload = new byte[256];
		payload = "State: Active".getBytes();
		try {
			DatagramPacket packet = new DatagramPacket(payload, payload.length, pack.getSocketAddress());
			sock.send(pack);
		} catch (Exception e) {
			System.out.println("Package not sent: " + e);
		}
		System.out.println("package sent");

	}

	public void Share(String some) {
		System.out.println(some);
	}
}
