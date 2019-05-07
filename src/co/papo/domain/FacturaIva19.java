package co.papo.domain;

public class FacturaIva19 extends FacturaConIva {
	private double valorIva;

	public FacturaIva19(int numero, long valor) {
		super(numero, valor);
	}

	@Override
	public long calcularTotal() {
		this.valorIva = this.getValor() * 0.19;

		return (long) (this.getValor() + this.valorIva);
	}
}
