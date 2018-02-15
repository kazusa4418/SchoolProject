package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MySender {
    public static void main(String[] args) {
        MySenderDatagram msd = new MySenderDatagram();
    }
}

class MySenderDatagram {
    private DatagramPacket packet;
    private DatagramSocket socket;

    MySenderDatagram() {
        try {
            byte[] buffer = "Hello!!".getBytes();
            packet = new DatagramPacket(buffer, buffer.length, InetAddress.getByName("224.1.1.37"), 10037);
            socket = new DatagramSocket();

            while (true) {
                try {
                    Thread.sleep(1000);
                    socket.send(packet);
                }
                catch (InterruptedException e) {
                    System.err.println(e.toString());
                }
            }
        }
        catch (IOException e) {
            System.err.println(e.toString());
        }
    }
}
