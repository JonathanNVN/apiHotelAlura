package hotel.alura.api.dao;

import java.util.List;

import hotel.alura.api.models.Usuario;

public interface UsuarioDao {
	List<Usuario> getUsuarios();

	 void eliminar(Long id);

	 void registrar(Usuario usuario);

	 Usuario obtenerUsuarioPorCredenciales(Usuario usuario);

}
