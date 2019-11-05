package br.pi.theplateisonthetablet.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
	
@GetMapping("/mostrar")	
	public String usuario(){
		return "usuario";
		
	}
	
	
	
	
}
