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
				System.out.println(msg);
			}
		}
		catch (Exception ex) {
			System.out.println();
		}
	}
}
