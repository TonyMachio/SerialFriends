package tony.ruiz.serialFriends.services;

import org.modelmapper.ModelMapper;

public class BaseService {
	
	private final ModelMapper modelMapper;

	public BaseService(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	public ModelMapper getModelMapper() {
		return modelMapper;
	}
	
}
