package network;

import java.net.Socket;
import java.net.InetAddress;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class MyClient {
    public static void main(String[] args) {
        MyClientSocket mcs = new MyClientSocket();
    }
}

class MyClientSocket {
    private Socket socket;
    private BufferedWriter writer;
    private String buf;

    MyClientSocket() {
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 55555);

            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            writer.write("clinet");
            writer.newLine();
            writer.flush();
            writer.close();
            socket.close();

        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}