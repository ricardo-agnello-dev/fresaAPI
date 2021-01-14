package com.neutronstar.fresaAPI.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.neutronstar.fresaAPI.entities.GearService;

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
	
	@Getter
	private Set<GearService> gearServices = new HashSet<>();

}
