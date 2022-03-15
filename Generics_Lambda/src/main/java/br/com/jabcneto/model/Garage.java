package br.com.jabcneto.model;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Garage {
	
	private String id;
	private List<Vehicle> vehicles;
	
	public Garage(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
}
