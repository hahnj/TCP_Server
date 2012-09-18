import java.io.*;
import java.net.*;

public class ClientTCP {

    public static void main(String args[]) throws Exception {
        Socket clientSocket = new Socket("127.0.0.1", 9560);
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());

        System.out.println("Enter a message:");
        String message = inputStream.readLine();
        outputStream.writeBytes(message + '\n');
        String reply = inputStream.readLine();
        System.out.println("Server sent: " + reply);
        clientSocket.close();
    }
}
