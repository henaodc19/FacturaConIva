package co.papo.domain;

public class FacturaSinIva extends Factura {

	public FacturaSinIva(int numero, long valor) {
		super(numero, valor);
	}

	@Override
	public long calcularTotal() {
		return this.getValor();
	}

}
