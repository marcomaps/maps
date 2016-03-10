package maps.fii.informemensal.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class PosicaoFundoService {
	public PosicoesFundo posicao(String cnpj) {
		RestTemplate restTemplate = new RestTemplate();
		String url = BaseURL.url + cnpj + "/posicao?data=01/01/2016";
		try {
			return restTemplate.getForObject(url, PosicoesFundo.class);
		} catch (RestClientException e) {
			throw new ChamadaServicoException("posição", url, e);
		}
	}
}
