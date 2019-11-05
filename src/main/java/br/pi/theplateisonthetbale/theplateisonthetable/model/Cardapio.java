package br.pi.theplateisonthetbale.theplateisonthetable.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_cardapio")
public class Cardapio {

	@Id
	// @Column(name="fk_cardapio")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long idCardapio;
	@NotNull
	public String nomeCardapio;
	@NotNull
	public String categCardapio;
	@NotNull
	public String VegetCardapio;
	
	public Long getIdCardapio() {
		return idCardapio;
	}

	public void setIdCardapio(Long idCardapio) {
		this.idCardapio = idCardapio;
	}

	public String getNomeCardapio() {
		return nomeCardapio;
	}

	public void setNomeCardapio(String nomeCardapio) {
		this.nomeCardapio = nomeCardapio;
	}

	public String getCategCardapio() {
		return categCardapio;
	}

	public void setCategCardapio(String categCardapio) {
		this.categCardapio = categCardapio;
	}

	public String getVegetCardapio() {
		return VegetCardapio;
	}

	public void setVegetCardapio(String vegetCardapio) {
		VegetCardapio = vegetCardapio;
	}

}
