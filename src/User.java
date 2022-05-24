import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.Inet4Address;

class Fetcher implements Runnable {
	private Thread thread;
	private String threadName;

	Fetcher(String name) {
		threadName = name;
		System.out.println("Fetching requests...");
	}

	public void run() {
		try {
			InetAddress addr = InetAddress.getByName("localhost");
			DatagramSocket sock0 = new DatagramSocket(4446);
			byte[] buffer = new byte[256];
			while (true) {
				DatagramPacket request = new DatagramPacket(buffer, buffer.length);
				sock0.receive(request);
				String msg = new String(request.getData(), 0, request.getLength());
				System.out.println(msg);
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public void start() {
		thread = new Thread(this, threadName);
		thread.start();
	}

}

public class User {

	public static void main (String[] args) {
		Fetcher fetch = new Fetcher("Fetched");
		fetch.start();
		try {
			while (true) {
				InetAddress addr = InetAddress.getByName("localhost");
				DatagramSocket sock0 = new DatagramSocket();
				byte[] buffer = new byte[256];
				int port = 4445;
				buffer = Shortcuts.strInput("> ").getBytes();
				DatagramPacket pack = new DatagramPacket(buffer, buffer.length, addr, port);
				sock0.send(pack);
			}
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
