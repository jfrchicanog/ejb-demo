package es.uma.informatica.sii.ejb.demo.web;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import es.uma.informatica.sii.ejb.demo.ejb.BaseDeDatosLocal;
import es.uma.informatica.sii.ejb.demo.entidades.Contacto;

@Named
@RequestScoped
public class Agenda{

	@Inject
	private BaseDeDatosLocal bbdd;
	
	private Contacto contacto;
	private String contactoElegido;
	
	public Agenda() {
		contacto = new Contacto();
	}

	public Contacto getContacto() {
		return contacto;
	}
	
	public void aniadirContacto() {
		bbdd.aniadirContacto(contacto);
		contacto = new Contacto(); 
	}
	
	public List<Contacto> getTodosContactos() {
		return bbdd.todoContactos();
	}
	
	public void eliminar(Contacto c) {
		bbdd.eliminarContacto(c);
	}

	public String getContactoElegido() {
		return contactoElegido;
	}

	public void setContactoElegido(String contactoElegido) {
		this.contactoElegido = contactoElegido;
	}
	

}
