import java.util.Collection;

public class ClientCollection {

    private Collection<Client> clientCollection;

    public void addClient(Client client) {
        clientCollection.add(client);
    }

    public void removeClient(Client client) {
        clientCollection.remove(client);
    }

    public Collection<Client> getAllClients() {
        return clientCollection;
    }

    public Client getClientByIP(String ipAddress) {
        return null;

    }
}
