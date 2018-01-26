package network;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        MyClientSocket mcs = new MyClientSocket();
    }
}

class MyClientSocket {
    private Socket socket;
    private BufferedReader reader;

    MyClientSocket() {
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 55555);
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String buf = reader.readLine();
            System.out.println(buf);

            reader.close();
            socket.close();
        }
        catch (IOException e) {
            System.err.println(e.toString());
        }
    }
}
