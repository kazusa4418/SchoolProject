package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MyReceiver_multi {
    public static void main(String[] args) {
        MyReceiverDatagram_multi msd = new MyReceiverDatagram_multi();
    }
}

class MyReceiverDatagram_multi {
    private DatagramPacket packet;
    private MulticastSocket socket;

    MyReceiverDatagram_multi() {
        try {
            byte[] buffer = new byte[65535];

            packet = new DatagramPacket(buffer, buffer.length);
            socket = new MulticastSocket(10037);

            socket.joinGroup(InetAddress.getByName("224.1.1.37"));

            while (true) {
                socket.receive(packet);
                System.out.println((new String(buffer)).trim());
            }
        }
        catch (IOException e) {
            System.err.println(e.toString());
        }
    }
}
