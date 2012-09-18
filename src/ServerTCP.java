import java.io.*;
import java.net.*;
public class ServerTCP {

    public static void main(String args[]) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9560);
        while(true) {
            Socket s = serverSocket.accept();
            Runnable clientHandler = new ClientHandler(s);
            Thread thread = new Thread(clientHandler);
            thread.start();
        }
    }
}
