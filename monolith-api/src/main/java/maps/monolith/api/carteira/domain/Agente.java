package maps.monolith.api.carteira.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AGENTE", schema = "P9")
public class Agente {
	@Id
	@Column(name = "COD_AGEN")
	private long id;
}
