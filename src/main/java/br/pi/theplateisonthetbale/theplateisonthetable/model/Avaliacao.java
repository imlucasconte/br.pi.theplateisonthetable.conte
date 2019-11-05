package br.pi.theplateisonthetbale.theplateisonthetable.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_avaliacao")
public class Avaliacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long idAvalicao;
	@NotNull
	public String descriAvalicao;

	public Long getIdAvalicao() {
		return idAvalicao;
	}

	public void setIdAvalicao(Long idAvalicao) {
		this.idAvalicao = idAvalicao;
	}

	public String getDescriAvalicao() {
		return descriAvalicao;
	}

	public void setDescriAvalicao(String descriAvalicao) {
		this.descriAvalicao = descriAvalicao;
	}

}
