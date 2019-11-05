package br.pi.theplateisonthetbale.theplateisonthetable.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_reserva")
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long idReserva;
	@NotNull
	public Date dataRserva;
	@ManyToOne
	@JoinColumn(name = "fk_mesa")
	public Mesa mesa;
	@ManyToOne
	@JoinColumn(name = "fk_usuario")
	public Usuario usuario;
	@ManyToOne
	@JoinColumn(name = "fk_cardapio")
	public Cardapio cardapio;

	public Long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}

	public Date getDataRserva() {
		return dataRserva;
	}

	public void setDataRserva(Date dataRserva) {
		this.dataRserva = dataRserva;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Cardapio getCardapio() {
		return cardapio;
	}

	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}

}
