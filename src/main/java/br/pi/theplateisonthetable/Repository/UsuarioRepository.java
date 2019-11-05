package br.pi.theplateisonthetable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pi.theplateisonthetbale.theplateisonthetable.model.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario,Long>{
	
	// findByID
	public Usuario findByUserandfindByPassword(Long id, Long User, Long Password);
	
}
