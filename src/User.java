import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.Inet4Address;
import java.net.BindException;

class Fetcher implements Runnable {
	private Thread thread;
	private String threadName;
	private DatagramSocket child_sock;

	Fetcher(String name, DatagramSocket sock) {
		threadName = name;
		child_sock = sock;
		System.out.println("Fetching requests...");
	}

	public void run() {
		try {
			InetAddress addr = InetAddress.getByName("localhost");
			//DatagramSocket sock0 = new DatagramSocket(fetch_port);
			byte[] buffer = new byte[256];
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
public class User {

	public static int portRange() {
		for (int i = 4440; i <= 5550; i++) {
			try {
				DatagramSocket sock = new DatagramSocket(i);
				sock.close();
				return i;
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		return 0;
	}


	public static void main (String[] args) {

		int client_port = portRange();
		try {
			DatagramSocket sock0 = new DatagramSocket(client_port);
			Fetcher fetch = new Fetcher("Fetched", sock0);
			fetch.start();
			while (true) {
				InetAddress addr = InetAddress.getByName("localhost");
		//		DatagramSocket sock0 = new DatagramSocket(alternate_port);
				byte[] buffer = new byte[256];
				int port = 4445;
				buffer = Shortcuts.strInput("> ").getBytes();
				DatagramPacket pack = new DatagramPacket(buffer, buffer.length, addr, port);
				sock0.send(pack);
			}
		}
		catch (BindException e) {
			client_port++;
			System.out.println("bind shit");
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
