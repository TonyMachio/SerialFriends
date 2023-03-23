package tony.ruiz.serialFriends.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
public class Plataforma {
	
	private Integer id;
	private String nombre;
	
	public Plataforma() {
	}

	public Plataforma(String nombre) {
		this.nombre = nombre;
	}

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
