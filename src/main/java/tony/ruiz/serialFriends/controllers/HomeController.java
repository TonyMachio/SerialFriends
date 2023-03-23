package tony.ruiz.serialFriends.controllers;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import tony.ruiz.serialFriends.dto.PlataformaDTO;
import tony.ruiz.serialFriends.dto.SerieDTO;
import tony.ruiz.serialFriends.dto.UsuarioDTO;
import tony.ruiz.serialFriends.dto.ValoracionDTO;
import tony.ruiz.serialFriends.utils.FileUploadUtils;

@Controller
@RequestMapping("/series")
public class HomeController {

	UsuarioAPIController usuarioAPIController;
	SerieAPIController serieAPIController;
	PlataformaAPIController plataformaAPIController;
	ValoracionAPIController valoracionAPIController;

	public HomeController(UsuarioAPIController usuarioAPIController, SerieAPIController serieAPIController,
			PlataformaAPIController plataformaAPIController, ValoracionAPIController valoracionAPIController) {
		this.serieAPIController = serieAPIController;
		this.usuarioAPIController = usuarioAPIController;
		this.plataformaAPIController = plataformaAPIController;
		this.valoracionAPIController = valoracionAPIController;
	}

	@GetMapping()
	public String obtenerSeries(Model model) {
		model.addAttribute("series", serieAPIController.obtenerSeries());
		return "series";
	}

	@GetMapping("/ranking")
	public String obtenerRanking(Model model) {
		model.addAttribute("series", serieAPIController.obtenerRanking());
		return "ranking";
	}

	@GetMapping("/nuevaSerie")
	public String cargarFormularioNuevaSerie(Model model) {
		model.addAttribute("plataformas", plataformaAPIController.obtenerPlataformas());
		return "nuevaSerie";
	}

	@PostMapping("/nuevaSerie")
	public String agregarSerie(@RequestParam String titulo, @RequestParam String sinopsis,
			@RequestParam Integer plataforma, @RequestParam MultipartFile caratulaFile) throws IOException {

		String fileName = StringUtils.cleanPath(caratulaFile.getOriginalFilename());
		SerieDTO serieDTO = new SerieDTO(titulo, sinopsis, new PlataformaDTO(plataforma), fileName);

		FileUploadUtils.saveFile(FileUploadUtils.CARATULAS_PATH, fileName, caratulaFile);
		serieAPIController.agregarSerie(serieDTO);

		return "redirect:/series/ranking";
	}

	@GetMapping("/nuevaValoracion")
	public String cargarFormularioNuevaValoracion(Model model) {
		model.addAttribute("series", serieAPIController.obtenerSeries());
		model.addAttribute("usuarios", usuarioAPIController.obtenerUsuarios());
		return "nuevaValoracion";
	}

	@PostMapping("/nuevaValoracion")
	public String agregarValoracion(@RequestParam Integer usuario, @RequestParam Integer serie,
			@RequestParam Float nota, String comentario) {

		ValoracionDTO valoracionDTO = new ValoracionDTO.Builder()
											.setSerie(new SerieDTO(serie))
											.setUsuario(new UsuarioDTO(usuario))
											.setNota(nota)
											.setComentario(comentario)
											.build();
		valoracionAPIController.agregarValoracion(valoracionDTO);

		return "redirect:/series/ranking";
	}

}
