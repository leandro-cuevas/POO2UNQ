package ar.edu.unq.po2;

import java.awt.Rectangle;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class PalabrasOrdenadasAdapter extends DefaultListModel<String>{
	
	private DefaultListModel listM;

	private ListaDePalabrasOrdenadas listaOrdenada;

    public PalabrasOrdenadasAdapter(DefaultListModel listM) {
    	this.listM = listM;
    	listaOrdenada = new ListaDePalabrasOrdenadas();
    }
    
    public void addElement(String s) {
    	listaOrdenada.agregarPalabra(s);
    	listM.clear();
    	actualizar();
    }

	private void actualizar() {
		for (int i = 0; i < listaOrdenada.cantidadDePalabras(); i++) {
			listM.addElement(listaOrdenada.getPalabraDePosicion(i));
		}
	}
}