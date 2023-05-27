package hotel.alura.api.dao;

import hotel.alura.api.models.Cliente;
import hotel.alura.api.models.Reservas;

public interface ReservaDao {

	void registrarReserva(Reservas reservas);
}
