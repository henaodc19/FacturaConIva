package co.papo.domain;

import java.util.ArrayList;
import java.util.List;

public class Facturacion {
	private List<Factura> facturas;
	private Cliente tipo;
	
	public Facturacion() {
		this.facturas = new ArrayList<>();
	}
	
	public void generarFactura(long valor, Cliente cliente) {
		int numeroFactura = facturas.size() + 1;
		Factura factura = null;
		
		if (valor >= 2000000 && cliente.getTipo().equals("J")) {
			factura = new FacturaIva19(numeroFactura, valor);
		} 
		else if(valor >= 2000000 && cliente.getTipo().equals("N")){
			factura = new FacturaIva16(numeroFactura, valor);
			
		}else{
			factura = new FacturaSinIva(numeroFactura, valor);
		}
		
		this.facturas.add(factura);
	}
	
	public void mostrarFacturas() {
		for (Factura factura : facturas) {
			System.out.println("Factura " + factura.getNumero() + 
					" - " + factura.calcularTotal());
		}
	}
}
