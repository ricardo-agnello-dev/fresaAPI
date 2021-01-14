package com.neutronstar.fresaAPI.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neutronstar.fresaAPI.dto.ClientDTO;
import com.neutronstar.fresaAPI.dto.GearServiceDTO;
import com.neutronstar.fresaAPI.entities.Client;
import com.neutronstar.fresaAPI.entities.GearService;
import com.neutronstar.fresaAPI.repositories.ClientRepository;
import com.neutronstar.fresaAPI.repositories.GearServiceRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private GearServiceRepository gearServiceRepository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll(){
		List<Client> list = clientRepository.findAll();
		return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional
	public ClientDTO insert(ClientDTO dto) {
		Client client = new Client(null, dto.getName());
		for (GearServiceDTO g : dto.getGearServices()) {
			GearService gearService = gearServiceRepository.getOne(g.getId());
			client.getGearServices().add(gearService);
		}
		
		client = clientRepository.save(client);
		return new ClientDTO(client);
	}

}
