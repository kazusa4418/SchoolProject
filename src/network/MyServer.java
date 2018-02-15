package network;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MyServer {
    public static void main(String[] args) {
        MyServerSocket mss = new MyServerSocket();
    }
}

class MyServerSocket {

    private ServerSocket server;
    private Socket socket;
    private BufferedReader bw;
    private String buf;

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

<<<<<<< HEAD
            while (true) {
                socket = server.accept();
                bw = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                buf = bw.readLine();
                System.out.println(buf);
            }
            //bw.close();
            //socket.close();

=======
            bw.close();
            socket.close();
>>>>>>> 24746f8cc4da97e995b2356b7f883654a7b9c074
>>>>>>> origin/master
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}