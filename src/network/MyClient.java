package network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        MyClientSocket mcs = new MyClientSocket();
    }
}

class MyClientSocket {
    private Socket socket;

    MyClientSocket() {
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 22567);
            socket.close();
        }
        catch (IOException e) {
            System.err.println(e.toString());
        }
    }
}
