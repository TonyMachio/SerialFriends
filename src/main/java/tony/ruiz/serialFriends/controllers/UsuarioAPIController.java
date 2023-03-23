package tony.ruiz.serialFriends.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import tony.ruiz.serialFriends.dto.UsuarioDTO;
import tony.ruiz.serialFriends.services.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioAPIController {
	
	private final UsuarioService usuarioService;
	
	public UsuarioAPIController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@GetMapping()
	public List<UsuarioDTO> obtenerUsuarios(){
		return usuarioService.obtenerUsuarios();
	}
}
