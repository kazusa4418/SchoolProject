package network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        MyServerSocket mss = new MyServerSocket();
    }
}

class MyServerSocket {
    ServerSocket server;
    Socket socket;

    MyServerSocket() {
        try {
            server = new ServerSocket(22567);
            socket = server.accept();
            socket.close();
        }
        catch (IOException e) {
            e.printStackTrace();
            System.err.println(e.toString());
        }
    }
}
