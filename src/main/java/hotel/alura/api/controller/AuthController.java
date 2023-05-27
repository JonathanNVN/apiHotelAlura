package hotel.alura.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hotel.alura.api.dao.UsuarioDao;
import hotel.alura.api.models.Usuario;
import hotel.alura.api.utils.JWTUtil;

@RestController
public class AuthController {

	@Autowired
	private UsuarioDao usuarioDao;
	
	@Autowired
	private JWTUtil jwtUtil;
	
	@RequestMapping(value = "api/login", method = RequestMethod.POST)
	public String login(@RequestBody Usuario usuario) {
		
		Usuario usuarioLogueadoUsuario = usuarioDao.obtenerUsuarioPorCredenciales(usuario);
		
		if (usuarioLogueadoUsuario != null) {
			
			String tokenJwt = jwtUtil.create(String.valueOf(usuarioLogueadoUsuario.getId()) , usuarioLogueadoUsuario.getEmail());			
			return tokenJwt;
		}
		return "FAIL";
	}
}
