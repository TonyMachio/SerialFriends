package tony.ruiz.serialFriends.domain;

import jakarta.persistence.*;

@Entity
@IdClass(ValoracionKey.class)
public class Valoracion {

	private Serie serie;
	private Usuario usuario;
	private Float nota;
	private String comentario;
	
	public Valoracion() {
	}

	public Valoracion(Float nota, String comentario) {
		this.nota = nota;
		this.comentario = comentario;
	}

	@Id
	@ManyToOne
	@JoinColumn(name ="serie_id", referencedColumnName = "id")
	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	
	@Id
	@ManyToOne
	@JoinColumn(name ="usuario_id", referencedColumnName = "id")
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Float getNota() {
		return nota;
	}

	public void setNota(Float nota) {
		this.nota = nota;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
}
