package es.uma.informatica.sii.ejb.demo.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import es.uma.informatica.sii.ejb.demo.entidades.Contacto;

/**
 * Session Bean implementation class BaseDeDatos
 */
@Stateless
public class BaseDeDatos implements BaseDeDatosLocal {

	@PersistenceContext(unitName = "ejb-demo")
	private EntityManager em;
	
	@Override
	public List<Contacto> todoContactos() {
		return em.createNamedQuery("Contacto.todos", Contacto.class).getResultList();
	}

	@Override
	public void aniadirContacto(Contacto c) {
		em.persist(c);
	}

	@Override
	public void eliminarContacto(Contacto c) {
		em.remove(em.merge(c));
	}

}
