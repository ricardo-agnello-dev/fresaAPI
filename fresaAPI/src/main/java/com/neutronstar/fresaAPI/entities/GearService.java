package com.neutronstar.fresaAPI.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Entity
@Table(name = "tb_gear_service")
public class GearService {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date data;
	private Integer quantity;
	private String type;
	private String material;
	private Double module;
	private Integer numberOfTeeth;
	private Double price;
	
	public Double getTotalPrice() {
		return quantity * price;
	}

}
