package co.papo.domain;

public class Cliente {
	private double id;
	private String nombre;
	private String tipo;
	
	
	public Cliente(double id, String nombre, String tipo) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
	}


	public double getId() {
		return id;
	}


	public String getNombre() {
		return nombre;
	}


	public String getTipo() {
		return tipo;
	}
	
	
	
}
