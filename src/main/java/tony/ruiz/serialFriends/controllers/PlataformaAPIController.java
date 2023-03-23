package tony.ruiz.serialFriends.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tony.ruiz.serialFriends.dto.PlataformaDTO;
import tony.ruiz.serialFriends.services.PlataformaService;

@RestController
@RequestMapping("/api/plataformas")
public class PlataformaAPIController {
	
	private final PlataformaService plataformaService;

	public PlataformaAPIController(PlataformaService plataformaService) {
		this.plataformaService = plataformaService;
	}
	
	public List<PlataformaDTO> obtenerPlataformas(){
		return plataformaService.obtenerPlataformas();
	}

}
