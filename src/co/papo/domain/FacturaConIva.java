package co.papo.domain;

public class FacturaConIva extends Factura {

	public FacturaConIva(int numero, long valor) {
		super(numero, valor);
	}

	@Override
	public long calcularTotal() {
		return 0;
	}
	
}
