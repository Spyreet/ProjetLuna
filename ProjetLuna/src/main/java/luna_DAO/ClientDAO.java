package luna_DAO;

import java.util.List;

import luna_Class.Client;

public interface ClientDAO {
	public void insertClient(Client client);
	public void updateClient(Client client);
	public void removeClient(int clientID);
	public Client getClient(int clientID);
	public List<Client> getAllClient();
}
