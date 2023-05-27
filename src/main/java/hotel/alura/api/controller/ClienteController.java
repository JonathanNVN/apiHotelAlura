package hotel.alura.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hotel.alura.api.dao.ClienteDao;
import hotel.alura.api.models.Cliente;
import hotel.alura.api.utils.JWTUtil;

@RestController
public class ClienteController {

	@Autowired
	private ClienteDao clienteDao;
	
	@Autowired
	private JWTUtil jwtUtil;
	
	private boolean validarToken(String token) {
		String usuarioId= jwtUtil.getKey(token);
		return usuarioId != null;
	}
	
	@RequestMapping(value = "api/clientes", method = RequestMethod.POST)
	public void registrarNuevoCliente(@RequestHeader(value = "Authorization") String token, @RequestBody Cliente clientes) {
	
		String usuarioId = jwtUtil.getKey(token);
		
		if(!validarToken(token)) {
			return;
		}
		
		clienteDao.registrarCliente(clientes);
	}
}
