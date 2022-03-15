package br.com.jabcneto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import br.com.jabcneto.model.Garage;
import br.com.jabcneto.model.Vehicle;

public class Main {

	public static void main(String[] args) {
		List<Vehicle> vehicles = Arrays.asList(new Vehicle("Ford", "Fiesta", BigDecimal.valueOf(1000)),
				new Vehicle("Ford", "Fiesta", BigDecimal.valueOf(1200)),
				new Vehicle("Ford", "Explorer", BigDecimal.valueOf(2500)),
				new Vehicle("Fiat", "Uno", BigDecimal.valueOf(500)),
				new Vehicle("Fiat", "Cronos", BigDecimal.valueOf(1000)),
				new Vehicle("Fiat", "Torino", BigDecimal.valueOf(1250)),
				new Vehicle("Chevrolet", "Aveo", BigDecimal.valueOf(1250)),
				new Vehicle("Chevrolet", "Spin", BigDecimal.valueOf(2500)),
				new Vehicle("Toyota", "Corola", BigDecimal.valueOf(1200)),
				new Vehicle("Toyota", "Fortuner", BigDecimal.valueOf(3000)),
				new Vehicle("Renault", "Logan", BigDecimal.valueOf(950)));

		Garage garage = new Garage(vehicles);

		List<Vehicle> copyOf = List.copyOf(vehicles);

		List<Vehicle> sortedByPrice = copyOf.stream().sorted((v1, v2) -> v1.getPrice().compareTo(v2.getPrice()))
				.collect(Collectors.toList());

		List<Vehicle> sortedByModel = copyOf.stream().sorted((v1, v2) -> v1.getModel().compareTo(v2.getModel()))
				.collect(Collectors.toList());

		List<Vehicle> priceLessThan1000 = copyOf.stream().filter(v1 -> v1.getPrice().doubleValue() < 1000)
				.collect(Collectors.toList());

		List<Vehicle> priceGreaterThan1000 = copyOf.stream().filter(v1 -> v1.getPrice().doubleValue() >= 1000)
				.collect(Collectors.toList());

		BigDecimal priceSum = copyOf.stream().reduce(BigDecimal.ZERO, (sub, elem) -> sub.add(elem.getPrice()),
				BigDecimal::add);

		BigDecimal avgPrice = priceSum.divide(BigDecimal.valueOf(garage.getVehicles().size()), 2, RoundingMode.HALF_UP);

		System.out.println("Organizado pelo preco: " + sortedByPrice);
		System.out.println("Organizado pela marca: " + sortedByModel);
		System.out.println("Preco menor que 1000: " + priceLessThan1000);
		System.out.println("Preco maior ou igual a 1000: " + priceGreaterThan1000);
		System.out.println("Preco medio: " + avgPrice);

	}
}
