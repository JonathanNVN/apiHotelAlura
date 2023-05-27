package hotel.alura.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import hotel.alura.api.dao.ReservaDao;
import hotel.alura.api.models.Reservas;


@RestController
public class ReservaController {
	
	@Autowired
	private ReservaDao reservaDao;
	

	@RequestMapping(value = "api/reservas", method = RequestMethod.POST)
	public void registrarNuevaReserva(@RequestBody Reservas reservas) {		
		reservaDao.registrarReserva(reservas);
	}

}
