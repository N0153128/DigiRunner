import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class Command {
	private DatagramSocket sock0;

	public void Ping(DatagramSocket sock, DatagramPacket packet) {
		byte[] payload = new byte[256];
		payload = "Hi".getBytes();
		try {
			DatagramPacket pack = new DatagramPacket(payload, payload.length, packet.getSocketAddress());
			sock.send(pack);
		} catch (Exception e) {
			System.out.println("package not sent: " + e);
		}
		System.out.println("package sent");
	}

	public void Share(DatagramSocket sock) {
		System.out.println("Two");
	}

}
