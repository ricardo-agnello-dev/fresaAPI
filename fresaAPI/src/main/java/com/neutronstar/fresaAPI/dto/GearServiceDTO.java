package com.neutronstar.fresaAPI.dto;

import java.util.Date;

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
	
	public Double getTotalItem() {
		return quantity * price;
	}

}
