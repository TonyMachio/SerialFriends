package tony.ruiz.serialFriends.services;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import tony.ruiz.serialFriends.domain.Valoracion;
import tony.ruiz.serialFriends.dto.ValoracionDTO;
import tony.ruiz.serialFriends.repositories.ValoracionRepository;

@Service
public class ValoracionServiceImpl implements ValoracionService{

	private final ValoracionRepository repository;
	private final ModelMapper mapper;
	
	public ValoracionServiceImpl(ValoracionRepository repository, ModelMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}

	@Override
	public ValoracionDTO agregarValoracion(ValoracionDTO valoracionDTO) {
		Valoracion valoracion = repository.save(mapper.map(valoracionDTO, Valoracion.class));
		return mapper.map(valoracion, ValoracionDTO.class);
	}

}
