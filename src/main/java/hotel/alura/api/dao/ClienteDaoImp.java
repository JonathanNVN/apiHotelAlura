package hotel.alura.api.dao;

import org.springframework.stereotype.Repository;

import hotel.alura.api.models.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ClienteDaoImp implements ClienteDao{
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void registrarCliente(Cliente clientes) {
		
		entityManager.merge(clientes);
		
	}
	



}
