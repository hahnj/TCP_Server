import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    final int SERVER_SOCKET = 9696;
    ClientCollection clientList;

    public TCPServer() {
        clientList = new ClientCollection();
    }

    public ServerSocket openSocket(int port) {
        try {
            ServerSocket socket = new ServerSocket(port);
            return socket;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void run() throws IOException {
        ServerSocket serverSocket = openSocket(SERVER_SOCKET);

        while(true) {
            Socket s = serverSocket.accept();
            Client client = new Client(s.getInetAddress().toString(), s.getPort());
            clientList.addClient(client);
        }


    }
}
