package co.papo.domain;

import java.util.Date;

public abstract class Factura {
	private int numero;
	private long valor;
	private Date fecha;
	
	
	public Factura(int numero, long valor) {
		this.numero = numero;
		this.valor = valor;
		this.fecha = new Date();
	}
	

	public abstract long calcularTotal();
	
	public int getNumero() {
		return numero;
	}
	
	public long getValor() {
		return valor;
	}
	
	public Date getFecha() {
		return fecha;
	}
}
