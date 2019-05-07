package co.papo.domain;

public class FacturaIva16 extends FacturaConIva {

	private double valorIva;

	public FacturaIva16(int numero, long valor) {
		super(numero, valor);
	}

	@Override
	public long calcularTotal() {
		this.valorIva = this.getValor() * 0.16;

		return (long) (this.getValor() + this.valorIva);
	}
	
}
