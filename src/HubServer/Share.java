package HubServer;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Share implements Request {
	private final Command command;
	private final DatagramPacket packet;
	private final DatagramSocket sock0;

	public Share(Command command, DatagramSocket sock, DatagramPacket pack) {
		this.command = command;
		this.packet = pack;
		this.sock0 = sock;
	}
	
	public void execute() {
		command.Share(sock0, packet);
	}

}
