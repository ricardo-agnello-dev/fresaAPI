package com.neutronstar.fresaAPI.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "tb_client")
public class Client implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@ManyToMany
	@JoinTable(name = "tb_client_gear_service",
	joinColumns = @JoinColumn(name = "client_id"),
	inverseJoinColumns = @JoinColumn(name = "gear_service_id"))
	private Set<GearService> gearServices = new HashSet<>();
	
	public Double getTotalPrice() {
		double sum = 0.0;
		for (GearService g : gearServices) {
			sum += g.getTotalItem();
		}
		return sum;
	}

}
