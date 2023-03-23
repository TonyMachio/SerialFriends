package tony.ruiz.serialFriends.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UsuarioDTO {
	
	private Integer id;
	private String nombre;

	
	public UsuarioDTO() {
	}

	public UsuarioDTO(Integer id) {
		this.id = id;
	}

	public UsuarioDTO(Integer id, String nombre) {
		this.nombre = nombre;
	}

	@JsonIgnore
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
