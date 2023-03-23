package tony.ruiz.serialFriends.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PlataformaDTO {
	
	private Integer id;
	private String nombre;

	
	public PlataformaDTO() {
	}

	public PlataformaDTO(Integer id) {
		this.id = id;
	}

	public PlataformaDTO(Integer id, String nombre) {
		this.id = id;
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
