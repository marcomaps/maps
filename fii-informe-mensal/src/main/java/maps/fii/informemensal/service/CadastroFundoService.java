package maps.fii.informemensal.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CadastroFundoService {

	public CadastroFundo cadastro(String cnpj) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(BaseURL.url + cnpj, CadastroFundo.class);
	}
}
