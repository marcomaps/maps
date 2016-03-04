package maps.monolith.cadastro.domain;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class CadastroFundoRepository {

	private static Map<String, CadastroFundo> fundos = new HashMap<String, CadastroFundo>();

	public CadastroFundoRepository() {
		final DadosAdministrador adm1 = new DadosAdministrador("123", "ADM 1");
		final DadosAdministrador adm2 = new DadosAdministrador("456", "ADM 2");

		add(new CadastroFundo("1", "FUNDO 1", adm1));
		add(new CadastroFundo("2", "FUNDO 2", adm1));
		add(new CadastroFundo("3", "FUNDO 3", adm2));
		add(new CadastroFundo("4", "FUNDO 4", adm2));
		add(new CadastroFundo("5", "FUNDO 5", adm2));
	}

	public CadastroFundo add(CadastroFundo cad) {
		fundos.put(cad.getCnpj(), cad);
		return cad;
	}

	public Collection<CadastroFundo> findAll() {
		return fundos.values();
	}

	public CadastroFundo find(String cnpj) {
		return fundos.get(cnpj);
	}
}
