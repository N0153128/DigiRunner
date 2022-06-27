import java.net.DatagramSocket;
import java.net.DatagramPacket;

public class Ping implements Request {
	private Command command;

	public Ping(Command command) {
		this.command = command;
	}

	public void execute(DatagramSocket sock0, DatagramPacket pack) {
		command.Ping(sock0, pack);
	}
}
