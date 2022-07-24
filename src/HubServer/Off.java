package HubServer;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Off implements Request {
    private final Command command;
    private final DatagramPacket packet;
    private final DatagramSocket sock0;

    public Off(Command command, DatagramSocket sock, DatagramPacket pack) {
        this.command = command;
        this.packet = pack;
        this.sock0 = sock;
    }

    public void execute() {
        command.off(sock0, packet);
    }

}
