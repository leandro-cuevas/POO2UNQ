package ar.edu.unq.po2.bancosPrestamos;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<ClienteBancario> clientes = new ArrayList<ClienteBancario>();

	private List<SolicitudesCredito> solicitudes = new ArrayList<SolicitudesCredito>();

	public List<ClienteBancario> getClientes() {
		return clientes;
	}

	public List<SolicitudesCredito> getSolicitudes() {
		return solicitudes;
	}
	
	public void agregarCliente(ClienteBancario cliente) {
		clientes.add(cliente);
	}
	
	public void recepcionarSolicitudCredito(ClienteBancario clienteBancario, int montoCredito, int meses) {
		this.solicitudes.add(new CreditoPersonal(clienteBancario, montoCredito, meses));
	}

	public void recepcionarSolicitudCredito(ClienteBancario clienteBancario, int montoCredito, int meses, Propiedad propiedad) {
		this.solicitudes.add(new CreditoHipotecario(clienteBancario, montoCredito, meses, propiedad));
	}
	
	public int totalADesembolsar() {
		return this.solicitudes.stream().filter(e-> e.esAceptable()).mapToInt(e-> e.monto).sum();
	}

}
