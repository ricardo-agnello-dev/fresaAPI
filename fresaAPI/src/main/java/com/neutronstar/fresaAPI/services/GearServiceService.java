package com.neutronstar.fresaAPI.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neutronstar.fresaAPI.dto.GearServiceDTO;
import com.neutronstar.fresaAPI.entities.GearService;
import com.neutronstar.fresaAPI.repositories.GearServiceRepository;

@Service
public class GearServiceService {
	
	@Autowired
	private GearServiceRepository gearServiceRepository;
	
	@Transactional(readOnly = true)
	public List<GearServiceDTO> findAll(){
		List<GearService> list = gearServiceRepository.findAll();
		return list.stream().map(x -> new GearServiceDTO(x)).collect(Collectors.toList());
	}

}
