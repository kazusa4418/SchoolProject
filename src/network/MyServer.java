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
<<<<<<< HEAD
            server = new ServerSocket(22567);

            while (true) {
                socket = server.accept();
                System.out.println("Accepted");
                socket.close();
            }
=======
            server = new ServerSocket(55555);
            socket = server.accept();
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("welcome MyServer");
            bw.newLine();
            bw.flush();

            bw.close();
            socket.close();
>>>>>>> 24746f8cc4da97e995b2356b7f883654a7b9c074
        }
        catch (IOException e) {
            e.printStackTrace();
            System.err.println(e.toString());
        }
    }
}
