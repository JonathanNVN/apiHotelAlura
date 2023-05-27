package hotel.alura.api.dao;

import org.springframework.stereotype.Repository;

import hotel.alura.api.models.Reservas;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ReservaDaoImp implements ReservaDao {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public void registrarReserva(Reservas reservas) {		
		entityManager.merge(reservas);
	}

}
