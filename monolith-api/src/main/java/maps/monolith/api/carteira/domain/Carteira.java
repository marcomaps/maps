package maps.monolith.api.carteira.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CARTEIRA", schema = "P9")
public class Carteira {
	@Id
	@Column(name = "COD_CART")
	private long id;

	@ManyToOne
	private Agente agente;
}
