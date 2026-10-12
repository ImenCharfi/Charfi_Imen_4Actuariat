package tn.esprit.Charfi_Imen_4Actuariat.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Charfi_Imen_4Actuariat.entities.Client;
import tn.esprit.Charfi_Imen_4Actuariat.service.interfaces.IClientService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientRestController {

    IClientService clientService;

    // http://localhost:8081/client/retrieve-all-clients
    @GetMapping("/retrieve-all-clients")
    public Set<Client> getClients() {
        return clientService.retrieveAllClients();
    }

    // http://localhost:8081/client/retrieve-client/1
    @GetMapping("/retrieve-client/{client-id}")
    public Client retrieveClient(@PathVariable("client-id") Long clientId) {
        return clientService.retrieveClient(clientId);
    }

    // http://localhost:8081/client/add-client
    @PostMapping("/add-client")
    public Client addClient(@RequestBody Client c) {
        return clientService.addClient(c);
    }

    // http://localhost:8081/client/modify-client
    @PutMapping("/modify-client")
    public Client modifyClient(@RequestBody Client c) {
        return clientService.updateClient(c);
    }

    // http://localhost:8081/client/remove-client/1
    @DeleteMapping("/remove-client/{client-id}")
    public void removeClient(@PathVariable("client-id") Long clientId) {
        clientService.deleteClient(clientId);
    }
}