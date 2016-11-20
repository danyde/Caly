package be.caly.model;

import java.util.List;


public interface ClientDAO {
	
	public List<Client> getClientInEtalon();
	
	public Client getClientById(Long id);
	
	public Long updateClient (Client client); 
}
