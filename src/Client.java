import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class Client {
	private DatagramSocket socket;
  	private InetAddress address;

 	private byte[] buf;

  	public void Client() {
		try {
  		socket = new DatagramSocket();
  		address = InetAddress.getByName("localhost");
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
  	}

  	public String sendEcho(String msg) {
  		buf = msg.getBytes();
  		DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4445);
		try {    
			socket.send(packet);
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
  		packet = new DatagramPacket(buf, buf.length);
		try {
    			socket.receive(packet);
		}
		catch (Exception ex) {
			System.out.println(ex);
		} 
		String received = new String(packet.getData(), 0, packet.getLength());
    		return received;
  	}
 	 public void close() {
  		socket.close();
  	 }
}
