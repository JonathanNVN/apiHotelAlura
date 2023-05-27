package hotel.alura.api.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import de.mkammerer.argon2.Argon2Factory.Argon2Types;
import hotel.alura.api.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<Usuario> getUsuarios() {		
		String query = "FROM Usuario";		
		return entityManager.createQuery(query).getResultList();
	}

	@Override
	public void eliminar(Long id) {
		Usuario usuario = entityManager.find(Usuario.class, id);
		entityManager.remove(usuario);		
	}

	@Override
	public void registrar(Usuario usuario) {
		entityManager.merge(usuario);
	}

	@Override
	public Usuario obtenerUsuarioPorCredenciales(Usuario usuario) {
		String query = "FROM Usuario WHERE email= :email";
		List<Usuario> lista = entityManager.createQuery(query)
			   .setParameter("email", usuario.getEmail())
			   .getResultList();
		
		if(lista.isEmpty()) {
			return null;
		}
		
		String contrasenaHashed = lista.get(0).getContrasena();
		
		Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
		
		if (argon2.verify(contrasenaHashed, usuario.getContrasena())) {
			return lista.get(0);
		}
		
		return null;
		
	}


}
