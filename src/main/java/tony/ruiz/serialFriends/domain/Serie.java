package tony.ruiz.serialFriends.domain;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
public class Serie {

	
	private Integer id;
	private String titulo;
	private String sinopsis;
	private Plataforma plataforma;
	private String caratula;
	private Set<Valoracion> valoraciones;
	
	public Serie() {
	}

	public Serie(String titulo, String sinopsis, Plataforma plataforma, String caratula) {
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.plataforma = plataforma;
		this.caratula = caratula;
	}

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
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

	@ManyToOne
	@JoinColumn(name = "plataforma_id")
	public Plataforma getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}

	public String getCaratula() {
		return caratula;
	}

	public void setCaratula(String caratula) {
		this.caratula = caratula;
	}

	@JsonIgnore
	@OneToMany(mappedBy = "serie")
	public Set<Valoracion> getValoraciones() {
		return valoraciones;
	}

	public void setValoraciones(Set<Valoracion> valoraciones) {
		this.valoraciones = valoraciones;
	}
	
}
