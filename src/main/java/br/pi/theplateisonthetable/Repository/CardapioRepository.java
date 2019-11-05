package br.pi.theplateisonthetable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pi.theplateisonthetbale.theplateisonthetable.model.Cardapio;

public interface CardapioRepository extends JpaRepository <Cardapio, Long>{
	
	//findById
	public Cardapio FindByIdCardapio(Long idCardapio);
	
}
