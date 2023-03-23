package tony.ruiz.serialFriends.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import tony.ruiz.serialFriends.dto.UsuarioDTO;
import tony.ruiz.serialFriends.repositories.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private final UsuarioRepository repository;
	private final ModelMapper mapper;

	public UsuarioServiceImpl(UsuarioRepository repository, ModelMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}

	@Override
	public List<UsuarioDTO> obtenerUsuarios() {
		return repository.findAll().stream()
									.map(usuario -> mapper.map(usuario, UsuarioDTO.class))
									.collect(Collectors.toList());
	}

}
