package tony.ruiz.serialFriends.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GenericModelMapper {

	@Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
