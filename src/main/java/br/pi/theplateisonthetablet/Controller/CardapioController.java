package br.pi.theplateisonthetablet.Controller;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.pi.theplateisonthetable.Repository.CardapioRepository;
import br.pi.theplateisonthetbale.theplateisonthetable.model.Cardapio;

@RestController
@RequestMapping("cardapio")
public class CardapioController{
	@RestController
	@RequestMapping ("/cardapio")
	public class CardapioResource {
		
		@Autowired
		private CardapioRepository cardapioRepo;
		
		@GetMapping ("/lista")
		public List <Cardapio> obterCardapios (){
			return cardapioRepo.findAll();
		}
		
		@PostMapping ("/salvar")
		//@ResponseStatus (HttpStatus.CREATED)
		public ResponseEntity<Cardapio> salvar (@RequestBody Cardapio cardapio, 
									HttpServletResponse response) {
			System.out.println("passou aqui...");
			Cardapio l = cardapioRepo.save(cardapio);
			URI uri = ServletUriComponentsBuilder.
					fromCurrentServletMapping().
					path("/{id}").
					buildAndExpand(l.getIdCardapio()).toUri();
			//response.setHeader("Location", uri.toASCIIString());
			return ResponseEntity.created(uri).body(l);
		}
		
		@GetMapping ("/{id}")
		public Cardapio obterCardapio (@PathVariable Long id) {
			return cardapioRepo.findById(id).get();
		}

	}
}
