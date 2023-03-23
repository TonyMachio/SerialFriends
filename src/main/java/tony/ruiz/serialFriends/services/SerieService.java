package tony.ruiz.serialFriends.services;

import java.util.List;

import tony.ruiz.serialFriends.dto.SerieDTO;

public interface SerieService {

	public List<SerieDTO> obtenerSeriesPorTitulo();
	public List<SerieDTO> obtenerSeriesPorNotaMedia();
	public SerieDTO guardarSerie(SerieDTO serieDTO);
}
