package com.neutronstar.fresaAPI.dto;

import java.util.Date;

import com.neutronstar.fresaAPI.entities.GearService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GearServiceDTO {

	private Long id;
	private Date data;
	private Integer quantity;
	private String type;
	private String material;
	private Double module;
	private Integer numberOfTeeth;
	private Double price;
	private Double totalItem;
	
	public GearServiceDTO (GearService entity) {
		id = entity.getId();
		data = entity.getData();
		quantity = entity.getQuantity();
		type = entity.getType();
		material = entity.getMaterial();
		module = entity.getModule();
		numberOfTeeth = entity.getNumberOfTeeth();
		price = entity.getPrice();
		totalItem = entity.getTotalItem();
	}
	


}
