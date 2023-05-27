package hotel.alura.api.models;

import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;



@Entity(name= "reservas")
public class Reservas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter @Setter @Column(name= "id")	
	private Long id;
	
	@Column(name= "fechaEntrada")
	private LocalDate fechaEntrada;
	
	@Column(name= "fechaSalida")
	private LocalDate fSalida;
	
	@Column(name= "valor")
	private double valor;
	
	@Column(name= "formaPago")
	private String fPago;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCiente")
	private Cliente cliente;
		

	public Reservas() {
		super();
	}

	public Reservas(Long id, LocalDate fechaEntrada, LocalDate fSalida, double valor, String fPago, Cliente cliente) {
		super();
		this.id = id;
		this.fechaEntrada = fechaEntrada;
		this.fSalida = fSalida;
		this.valor = valor;
		this.fPago = fPago;
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public LocalDate getfSalida() {
		return fSalida;
	}

	public void setfSalida(LocalDate fSalida) {
		this.fSalida = fSalida;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getfPago() {
		return fPago;
	}

	public void setfPago(String fPago) {
		this.fPago = fPago;
	}


}
