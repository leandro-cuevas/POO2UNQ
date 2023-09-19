package ar.edu.unq.po2.emailServidor;

import java.util.ArrayList;
import java.util.List;

public class ClienteEMail {
	
	 private ServidorPop servidor;
	 private String nombreUsuario;
	 private String passusuario;
	 private EMail email;

	
	public ClienteEMail(ServidorPop servidor, String nombreUsuario, String pass){
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.conectar();
	}
	
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	}
	
	public void recibirNuevos(){
		List<Correo> recibidos = this.servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
		email.agregarCorreos(recibidos);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}

	public void setEmail(EMail email) {
		this.email = email;
	}

}