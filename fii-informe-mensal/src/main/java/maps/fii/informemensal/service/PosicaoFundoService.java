package maps.fii.informemensal.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PosicaoFundoService {
	public PosicoesFundo posicao(String cnpj) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(BaseURL.url + cnpj + "/posicao?data=01/01/2016", PosicoesFundo.class);
	}
}
