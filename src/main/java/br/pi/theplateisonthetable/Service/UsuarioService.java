package br.pi.theplateisonthetable.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import br.pi.theplateisonthetable.Repository.UsuarioRepository;
import br.pi.theplateisonthetbale.theplateisonthetable.model.Usuario;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repositorio;
	@GetMapping("/mostrar")
	public List<Usuario> findAll(){
		return repositorio.findAll();
	} 
}
