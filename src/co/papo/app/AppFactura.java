package co.papo.app;

import co.papo.domain.Cliente;
import co.papo.domain.Facturacion;

public class AppFactura {

	public static void main(String[] args) {
		Facturacion facturacion = new Facturacion();
		Cliente cliente = new Cliente(1036950277, "papo", "N");
		Cliente cliente1 = new Cliente(1034580277, "alejo", "J");
		Cliente cliente2 = new Cliente(1036936278, "pepo", "J");
		
		facturacion.generarFactura(316000, cliente);
		facturacion.generarFactura(4500000, cliente1);
		facturacion.generarFactura(1900000, cliente2);
		
		
		facturacion.mostrarFacturas();

	}

}
