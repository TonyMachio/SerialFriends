package tony.ruiz.serialFriends.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import tony.ruiz.serialFriends.domain.Valoracion;
import tony.ruiz.serialFriends.dto.ValoracionDTO;
import tony.ruiz.serialFriends.services.ValoracionService;

@RestController
@RequestMapping("/api/valoraciones")
public class ValoracionAPIController{

	ValoracionService valoracionService;
	
	public ValoracionAPIController(ValoracionService valoracionService) {
		this.valoracionService = valoracionService;
	}
	
	@PostMapping("/agregar")
	public ValoracionDTO agregarValoracion (ValoracionDTO valoracionDTO){
		return valoracionService.agregarValoracion(valoracionDTO);
	}

}
