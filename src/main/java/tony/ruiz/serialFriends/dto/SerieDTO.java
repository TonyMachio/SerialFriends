package tony.ruiz.serialFriends.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class SerieDTO {

	private Integer id;
	private String titulo;
	private String sinopsis;
	private PlataformaDTO plataforma;
	private String caratula;
	private Set<ValoracionDTO> valoraciones;
	private Float notaMedia;

	public SerieDTO() {
	}

	public SerieDTO(Integer id) {
		this.id = id;
	}

	public SerieDTO(Integer id, String titulo, String sinopsis, PlataformaDTO plataforma, String caratula) {
		this.id = id;
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.plataforma = plataforma;
		this.caratula = caratula;
	}

	public SerieDTO(String titulo, String sinopsis, PlataformaDTO plataforma, String caratula) {
		this(null, titulo, sinopsis, plataforma, caratula);
	}
	
	@JsonIgnore
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public PlataformaDTO getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(PlataformaDTO plataforma) {
		this.plataforma = plataforma;
	}

	public String getCaratula() {
		return caratula;
	}

	public void setCaratula(String caratula) {
		this.caratula = caratula;
	}

	public Set<ValoracionDTO> getValoraciones() {
		return valoraciones;
	}

	public void setValoraciones(Set<ValoracionDTO> valoraciones) {
		this.valoraciones = valoraciones;
	}

	public Float getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(Float notaMedia) {
		this.notaMedia = notaMedia;
	}
}
