package br.pi.theplateisonthetable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pi.theplateisonthetbale.theplateisonthetable.model.Avaliacao;

public interface AvaliacaoRepository extends JpaRepository <Avaliacao, Long>{
	
	// findById
	public Avaliacao findByIdAvaliacaobyDescripiAvaliacao(Long idAvaliacao, String descripiAvaliacao);
	
	
}
