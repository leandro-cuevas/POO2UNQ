package ar.edu.unq.po2.recuperatorio;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Supermercado implements MailSender {
	
	Set<Cliente> clientes;
	
	Criterio criterio;
	
	public Supermercado() {
		clientes = new HashSet<Cliente>();
		criterio = new CriterioMasMontoConsumido();
	}

	public void vender(Cliente cliente, int monto) {
		cliente.hacerCompra(monto);
		verificarSiCorrespondeMail(cliente);
		
	}
	
	private void verificarSiCorrespondeMail(Cliente cliente) {
		Compra ultima = cliente.getCompras().get(cliente.getCompras().size()-1);
		
		int duracionEntre = (int) Duration.between(ultima.getFecha(), LocalDateTime.now()).toDays();
		
		if (duracionEntre <= 1) {
			enviarMail(cliente);
		}
	}

	private void enviarMail(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

}
