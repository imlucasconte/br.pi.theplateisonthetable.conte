package br.pi.theplateisonthetable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pi.theplateisonthetbale.theplateisonthetable.model.Mesa;

public interface MesaRepository extends JpaRepository <Mesa, Long>{
	
	//findById
	public Mesa findByIdMesabyCadeirasMesa(Long idMesa, char cadeirasMesa);
}
