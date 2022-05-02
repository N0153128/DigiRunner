import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class Net {
		private DatagramSocket socket;
		private boolean running;
		private byte[] buf = new byte[256];

		public Net() {
			try {
				socket = new DatagramSocket(4445);
			}
			catch (Exception ex) {
				System.out.println(ex);
			}
		}

		public void run() {
			running = true;
			while (running) {
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				try {
					socket.receive(packet);
				}
				catch (Exception ex) {
					System.out.println(ex);
				}
				InetAddress address = packet.getAddress();
				int port = packet.getPort();
				packet = new DatagramPacket(buf, buf.length, address, port);
				String received = new String(packet.getData(), 0, packet.getLength());

				if (received.equals("end")) {
					running = false;
					continue;
				}
				try {
					socket.send(packet);
				}
				catch (Exception ex) {
					System.out.println(ex);
				}
			}
			socket.close();
		}
	
}
	
	
//	public static void main (String[] args) {
//		System.out.println("Me alive");
//	}
