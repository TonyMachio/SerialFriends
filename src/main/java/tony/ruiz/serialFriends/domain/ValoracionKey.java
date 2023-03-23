package tony.ruiz.serialFriends.domain;

import lombok.*;

@EqualsAndHashCode
public class ValoracionKey{
    
    Integer serie;
    Integer usuario;

	public Integer getSerie() {
		return serie;
	}

	public void setSerie(Integer serie) {
		this.serie = serie;
	}
	
	public Integer getUsuario() {
		return usuario;
	}

	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}
}
