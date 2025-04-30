package br.dev.nunes.conversor.model;

public class Temperatura {
	
	private double celsius;

		
	
	public double getCelsius() {
		return celsius;
		
	}
	
	public void setCelsius(double celsius) {
		this.celsius = celsius;
		
	}
	
	public double  converterParaFahrenheit() {
		return (celsius * 9/5) + 32;
		
	}
		
	public double  converterParaKelvin() {
		return celsius + 273.15;
		
	}
	
	
}
