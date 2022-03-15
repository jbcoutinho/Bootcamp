package br.com.jbcoutinho;

public class Pratica1 {
	public static void main(String[] args) {
		
		String[] cidades = {
			"Londres",
			"Madrid",
			"Nueva York",
			"Buenos Aires",
			"Asuncion",
			"Sao Paulo",
			"Lima",
			"Santiago de Chile",
			"Lisboa",
			"Tokio"
		};
		
		int[][] temperaturas = {
				{-2,33},
				{-3,22},
				{-8,27},
				{4,37},
				{6,42},
				{5,43},
				{0,39},
				{-7,26},
				{-1,31},
				{-10,35}
		};
		
		int temperaturaMaxima = Integer.MIN_VALUE;
		int linhaTemperaturaMaxima = 0;
		int temperaturaMinima = Integer.MAX_VALUE;
		int linhaTemperaturaMinima = 0;
		
		for (int i = 0; i < temperaturas.length; i++) {
			if(temperaturas[i][1] > temperaturaMaxima) {
				temperaturaMaxima = temperaturas[i][1];
				linhaTemperaturaMaxima = i;				
			}
			if(temperaturas[i][0] < temperaturaMinima) {
				temperaturaMinima = temperaturas[i][0];
				linhaTemperaturaMinima = i;				
			}
			
		}	
		System.out.println("A temperatura minima foi encontrada na cidade " + cidades[linhaTemperaturaMinima] + " temperatura: " + temperaturaMinima);
		System.out.println("A temperatura maxima foi encontrada na cidade " + cidades[linhaTemperaturaMaxima] + " temperatura: " + temperaturaMaxima);
	}
}
