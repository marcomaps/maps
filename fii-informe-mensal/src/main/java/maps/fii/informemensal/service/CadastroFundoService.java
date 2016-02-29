package maps.fii.informemensal.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CadastroFundoService {

	public CadastroFundo cadastro(String cnpj) {
		RestTemplate restTemplate = new RestTemplate();
		// TODO ver como passar parâmetro de maneira mais elegante
		return restTemplate.getForObject("http://localhost:8080/fundo/cadastro?cnpj=" + cnpj, CadastroFundo.class);
	}

}
