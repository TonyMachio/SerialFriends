package tony.ruiz.serialFriends.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import tony.ruiz.serialFriends.domain.Serie;
import tony.ruiz.serialFriends.domain.Valoracion;
import tony.ruiz.serialFriends.dto.SerieDTO;

@Component
public class SerieMapper {

    private final ModelMapper modelMapper;

    
    public SerieMapper() {
		this.modelMapper = new ModelMapper();
	}

	public SerieDTO toDTO(Serie serie) {
        SerieDTO serieDto = modelMapper.map(serie, SerieDTO.class);
        if(serie.getValoraciones()!= null)
        	serieDto.setNotaMedia((float)(serie.getValoraciones().stream().mapToDouble(Valoracion::getNota).average().orElse(0.0)));
        return serieDto;
    }

    public List<SerieDTO> toDTOList(List<Serie> series) {
        return series.stream()
                     .map(this::toDTO)
                     .collect(Collectors.toList());
    }
    
    public ModelMapper getModelMapper() {
		return modelMapper;
	}
    
    
}

