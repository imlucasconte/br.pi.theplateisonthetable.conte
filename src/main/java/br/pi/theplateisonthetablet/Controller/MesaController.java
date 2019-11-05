package br.pi.theplateisonthetablet.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mesa")
public class MesaController {

	@GetMapping("/mostrar")
		public String mesa() {
			return "mesa";
		}
	}

