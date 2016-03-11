package maps.monolith.api.carteira.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CARTEIRA", schema = "P9")
public class Carteira {
	@Id
	@Column(name = "COD_CART")
	private long id;

	@ManyToOne
	@JoinColumn(name = "COD_AGEN")
	private Agente agente;

	private double vlCotaIni;

	public long getId() {
		return id;
	}

	public Agente getAgente() {
		return agente;
	}

	public double getVlCotaIni() {
		return vlCotaIni;
	}

	@Override
	public String toString() {
		return "Carteira [id=" + id + ", agente=" + agente + ", vlCotaIni=" + vlCotaIni + "]";
	}
}
