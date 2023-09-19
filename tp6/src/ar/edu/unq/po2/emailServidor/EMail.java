package ar.edu.unq.po2.emailServidor;

import java.util.ArrayList;
import java.util.List;

public class EMail {
	
	private List<Correo> inbox;
	private List<Correo> borrados;
	
	public EMail(ServidorPop servidor, String nombreUsuario, String pass) {
		
		ClienteEMail cliente = new ClienteEMail(servidor, nombreUsuario, pass);
		
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
		this.conectarCliente(cliente);
	}

	private void conectarCliente(ClienteEMail cliente) {
		cliente.setEmail(this);
	}

	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.remove(correo);
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
	
	public void agregarCorreos(List<Correo> correos) {
		inbox.addAll(correos);
	}
	
}
