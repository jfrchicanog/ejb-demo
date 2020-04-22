package es.uma.informatica.sii.ejb.demo.ejb;

import java.util.List;

import javax.ejb.Local;

import es.uma.informatica.sii.ejb.demo.entidades.Contacto;

@Local
public interface BaseDeDatosLocal {
	List<Contacto> todoContactos();
	void aniadirContacto(Contacto c);
	void eliminarContacto(Contacto c);
}
