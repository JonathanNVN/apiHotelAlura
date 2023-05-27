package hotel.alura.api.models;

//proceso de autenticación stateless y no stateful.

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name= "usuarios")
@ToString @EqualsAndHashCode
public class Usuario {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Getter @Setter @Column(name= "id")
private Long id;

@Getter @Setter @Column(name= "nombre")
private String nombre;

@Getter @Setter @Column(name= "apellido")
private String apellido;

@Getter @Setter @Column(name= "email")
private String email;

@Getter @Setter @Column(name= "telefono")
private String telefono;

@Getter @Setter @Column(name= "contrasena")
private String contrasena;

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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getContrasena() {
	return contrasena;
}

public void setContrasena(String contrasena) {
	this.contrasena = contrasena;
}


}
