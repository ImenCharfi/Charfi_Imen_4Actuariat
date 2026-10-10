package tn.esprit.Charfi_Imen_4Actuariat.service.interfaces;

import tn.esprit.Charfi_Imen_4Actuariat.entities.Client;
import java.util.List;
import java.util.Set;

public interface IClientService {
    Client addClient(Client client);
    Client updateClient(Client client);
    void deleteClient(Long id);
    Client retrieveClient(Long id);
    Set<Client> retrieveAllClients();
}