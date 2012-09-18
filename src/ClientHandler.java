import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;

public class ClientHandler implements Runnable {
    Socket connectionSocket;

    public ClientHandler(Socket connection) {
        connectionSocket = connection;
    }

    @Override
    public void run() {
        try {
            System.out.println("Started a new thread");

            BufferedReader inputStream = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outputStream = new DataOutputStream(connectionSocket.getOutputStream());

            while(true) {
                String clientMessage = inputStream.readLine();
                System.out.println("The client sent: " + clientMessage);
                outputStream.writeBytes("SENDING BACK, YO!" + clientMessage + "\n");
            }
        } catch (IOException e) {
            System.out.println("Received IO Exception " + e.getMessage());
        }

    }
}
