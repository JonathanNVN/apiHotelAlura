package hotel.alura.api.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name= "clientes")
@ToString @EqualsAndHashCode
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter @Setter @Column(name= "id")
	private Long id;
	
	@Getter @Setter @Column(name= "nombre")
	private String nombre;
	
	@Getter @Setter @Column(name= "apellido")
	private String apellido;
	
	@Getter @Setter @Column(name= "nacimiento")
	private LocalDate nacimiento;
	
	@Getter @Setter @Column(name= "nacionalidad")
	private String nacionalidad;	
	@Getter @Setter @Column(name= "telefono")
	private String telefono;	
	@Getter @Setter
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
    private List<Reservas> reservas = new ArrayList<>();


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Cliente() {
		super();
	}

	public Cliente(Long id, String nombre, String apellido, LocalDate nacimiento, String nacionalidad, String telefono,
			List<Reservas> reservas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacimiento = nacimiento;
		this.nacionalidad = nacionalidad;
		this.telefono = telefono;
		this.reservas = reservas;
	}

	public List<Reservas> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reservas> reservas) {
		this.reservas = reservas;
	}

	
}
