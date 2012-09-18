
public class Client {

    private final String ipAddress;
    private final int port;

    public Client(String ipAddress, int port) {
        this.ipAddress = ipAddress;
        this.port = port;
    }

    public String getIPAddress() {
        return this.ipAddress;
    }

    public int getPort() {
        return this.port;
    }
}
