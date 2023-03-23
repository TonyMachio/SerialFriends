package tony.ruiz.serialFriends.services;

import java.util.List;

import org.springframework.stereotype.Service;
import tony.ruiz.serialFriends.domain.Serie;
import tony.ruiz.serialFriends.dto.SerieDTO;
import tony.ruiz.serialFriends.mappers.SerieMapper;
import tony.ruiz.serialFriends.repositories.SerieRepository;

@Service
public class SerieServiceImpl implements SerieService {

	private final SerieRepository repository;
	private final SerieMapper serieMapper;

	public SerieServiceImpl(SerieRepository repository, SerieMapper serieMapper) {
		this.repository = repository;
		this.serieMapper = serieMapper;
	}

	@Override
	public List<SerieDTO> obtenerSeriesPorTitulo() {
		List<Serie> series = repository.findAllByOrderByTitulo();
		return serieMapper.toDTOList(series);

	}

	@Override
	public List<SerieDTO> obtenerSeriesPorNotaMedia() {
		List<Serie> series = repository.findAllOrderByValoracionMediaDesc();
		return serieMapper.toDTOList(series);
	}

	@Override
	public SerieDTO guardarSerie(SerieDTO serieDTO) {
		Serie serie = repository.save(serieMapper.getModelMapper().map(serieDTO, Serie.class));
		return serieMapper.toDTO(serie);
	}

}
