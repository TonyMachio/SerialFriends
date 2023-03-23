package tony.ruiz.serialFriends.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import tony.ruiz.serialFriends.domain.Plataforma;
import tony.ruiz.serialFriends.dto.PlataformaDTO;
import tony.ruiz.serialFriends.repositories.PlataformaRepository;

@Service
public class PlataformaServiceImpl extends BaseService implements PlataformaService{

	private final PlataformaRepository repository;
	
	public PlataformaServiceImpl(PlataformaRepository repository, ModelMapper mapper) {
		super(mapper);
		this.repository = repository;
	}

	public List<PlataformaDTO> obtenerPlataformas() {
		List<Plataforma> plataformas = repository.findAll();
		return plataformas.stream().map(plataforma -> getModelMapper().map(plataforma, PlataformaDTO.class)).toList();
	}

}
