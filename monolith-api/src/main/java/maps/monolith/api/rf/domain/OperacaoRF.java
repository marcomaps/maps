package maps.monolith.api.rf.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import maps.monolith.api.carteira.domain.Carteira;

@Entity
@Table(name = "TRANSACAO", schema = "P9")
public class OperacaoRF {
	@Id
	@Column(name = "COD_TRANS")
	private long id;

	private long numTrans;
	private long qtdeMov;
	private double puNegociacao;

	@ManyToOne
	private Carteira carteira;

	@Override
	public String toString() {
		return "OperacaoRF [id=" + id + ", numTrans=" + numTrans + ", qtdeMov=" + qtdeMov + ", puNegociacao="
				+ puNegociacao + ", carteira=" + carteira + "]";
	}
}
