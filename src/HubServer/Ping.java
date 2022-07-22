package HubServer;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Ping implements Request {
    private final Command command;
    private final DatagramPacket packet;
    private final DatagramSocket sock0;

    public Ping(Command command, DatagramSocket sock, DatagramPacket pack) {
        this.command = command;
        this.packet = pack;
        this.sock0 = sock;
    }

    public void execute() {
        command.Ping(sock0, packet);
    }

}
