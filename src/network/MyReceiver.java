package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MyReceiver {
    public static void main(String[] args) {
        MyReceiverDatagram msd = new MyReceiverDatagram();
    }
}

class MyReceiverDatagram {
    private DatagramPacket packet;
    private DatagramSocket socket;

    MyReceiverDatagram() {
        try {
            byte[] buffer = new byte[65535];

            packet = new DatagramPacket(buffer, buffer.length);
            socket = new DatagramSocket(55555);

            int i = 1;
            while (true) {
                socket.receive(packet);
                System.out.print((new String(buffer)).trim() + ": ");
                System.out.println(i); i++;
            }
        }
        catch (IOException e) {
            System.err.println(e.toString());
        }
    }
}
