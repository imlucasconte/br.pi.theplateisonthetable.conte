package br.pi.theplateisonthetbale.theplateisonthetable.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_mesa")
public class Mesa {

	@Id
	// @Column(name="fk_mesa")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long idMesa;
	@NotNull
	public char cadeirasMesa;
	@NotNull
	public char externaMesa;

	public Long getIdMesa() {
		return idMesa;
	}

	public void setIdMesa(Long idMesa) {
		this.idMesa = idMesa;
	}

	public char getCadeirasMesa() {
		return cadeirasMesa;
	}

	public void setCadeirasMesa(char cadeirasMesa) {
		this.cadeirasMesa = cadeirasMesa;
	}

	public char getExternaMesa() {
		return externaMesa;
	}

	public void setExternaMesa(char externaMesa) {
		this.externaMesa = externaMesa;
	}
}
