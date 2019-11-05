package br.pi.theplateisonthetablet.Controller;

import java.net.URI;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.pi.theplateisonthetable.Repository.AvaliacaoRepository;
import br.pi.theplateisonthetbale.theplateisonthetable.model.Avaliacao;

public class AvalicaoController {
	
	@Autowired
	private AvaliacaoRepository avaliacaoRepo;
	
	@RestController
	@RequestMapping("avaliacao")
	public class MesaController{
		@GetMapping("/mostrar")
		public String avaliacao() {
			return "avaliacao";
		}
		
		@PostMapping ("/salvar")
		//@ResponseStatus (HttpStatus.CREATED)
		public ResponseEntity<Avaliacao> salvar (@RequestBody Avaliacao avaliacao, 
									HttpServletResponse response) {
			System.out.println("passou aqui...");
			Avaliacao l = avaliacaoRepo.save(avaliacao);
			URI uri = ServletUriComponentsBuilder.
					fromCurrentServletMapping().
					path("/{id}").
					buildAndExpand(l.getIdAvalicao()).toUri();
			//response.setHeader("Location", uri.toASCIIString());
			return ResponseEntity.created(uri).body(l);
		}
		
	}
}
