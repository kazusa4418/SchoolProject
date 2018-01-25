package network;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        MyServerSocket mss = new MyServerSocket();
    }
}

class MyServerSocket {
    private ServerSocket server;
    private Socket socket;
    private BufferedWriter bw;

    MyServerSocket() {
        try {
            server = new ServerSocket(55555);
            socket = server.accept();
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("welcome MyServer");
            bw.newLine();
            bw.flush();

            bw.close();
            socket.close();
        }
        catch (IOException e) {
            e.printStackTrace();
            System.err.println(e.toString());
        }
    }
}
