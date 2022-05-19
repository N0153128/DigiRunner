import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class Bot {
	public static void main (String[] args) {
		try {
			DatagramSocket sock0 = new DatagramSocket(4445);
			boolean run = true;
			byte[] buffer = new byte[256];
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
					System.out.println(request.getAddress());
				} else if (msg.equals("/echo")) {
					DatagramPacket = new DatagramPacket(msg.getBytes(), msg.getBytes.length, addr, port)
					sock0.send()
					System.out.println(msg);
				}
				//System.out.println(msg);
			}
		}
		catch (Exception ex) {
			System.out.println();
		}
	}
}
