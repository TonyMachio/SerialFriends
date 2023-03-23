package tony.ruiz.serialFriends.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import tony.ruiz.serialFriends.dto.SerieDTO;
import tony.ruiz.serialFriends.services.SerieService;

@RestController
@RequestMapping("/api/series")
public class SerieAPIController{

	private final SerieService serieService;

	public SerieAPIController(SerieService serieService) {
		this.serieService = serieService;
	}
	
	@GetMapping
	public List<SerieDTO> obtenerSeries() {
		return serieService.obtenerSeriesPorTitulo();
	}
	
	@GetMapping("/ranking")
	public List<SerieDTO> obtenerRanking() {
		return serieService.obtenerSeriesPorNotaMedia();
	}
	
	@PostMapping("/nueva")
	public SerieDTO agregarSerie(@RequestBody SerieDTO serieDTO) {
		return serieService.guardarSerie(serieDTO);
	}
}
