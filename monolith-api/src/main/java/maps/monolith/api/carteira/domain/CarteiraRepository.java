package maps.monolith.api.carteira.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarteiraRepository extends CrudRepository<Carteira, Long> {

	@Query("from Carteira c join c.agente a where a.mneAgen=?1")
	Carteira findByMnemonico(String mne);
}
