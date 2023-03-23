package tony.ruiz.serialFriends.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class ValoracionDTO {

	private SerieDTO serie;
	private UsuarioDTO usuario;
	private Float nota;
	private String comentario;
	
	public ValoracionDTO() {
	}

	public ValoracionDTO(SerieDTO serie, UsuarioDTO usuario, Float nota, String comentario) {
		this.setSerie(serie);
		this.usuario = usuario;
		this.nota = nota;
		this.comentario = comentario;
	}
	
	@JsonIgnore
	public SerieDTO getSerie() {
		return serie;
	}

	public void setSerie(SerieDTO serie) {
		this.serie = serie;
	}
	public UsuarioDTO getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioDTO usuario) {
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
	
	
	public static class Builder{
		private SerieDTO serie;
		private UsuarioDTO usuario;
		private Float nota;
		private String comentario;
		
		public Builder setSerie(SerieDTO serie) {
			this.serie = serie;
			return this;
		}
		public Builder setUsuario(UsuarioDTO usuario) {
			this.usuario = usuario;
			return this;
		}
		public Builder setNota(Float nota) {
			this.nota = nota;
			return this;
		}
		public Builder setComentario(String comentario) {
			this.comentario = comentario;
			return this;
		}
		public ValoracionDTO build() {
			return new ValoracionDTO(serie, usuario, nota, comentario);
		}
	}
	
}
