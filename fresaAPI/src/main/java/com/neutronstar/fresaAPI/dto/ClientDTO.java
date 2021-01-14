package com.neutronstar.fresaAPI.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.neutronstar.fresaAPI.entities.Client;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class ClientDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Double totalPrice;
	
	@Getter
	private List<GearServiceDTO> gearServices = new ArrayList<>();
	
	public ClientDTO (Client entity) {
		id = entity.getId();
		name = entity.getName();
		totalPrice = entity.getTotalPrice();
		gearServices = entity.getGearServices().stream().map(x -> new GearServiceDTO(x)).collect(Collectors.toList());
		
	}

}
