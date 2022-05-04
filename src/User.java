import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class User {

	public static void main (String[] args) {
		try {
			InetAddress addr = InetAddress.getByName("localhost");
			DatagramSocket sock0 = new DatagramSocket();
			byte[] buffer = new byte[256];
			int port = 4445;
			
			buffer = args[0].getBytes();
			DatagramPacket pack = new DatagramPacket(buffer, buffer.length, addr, port);
			sock0.send(pack);
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
