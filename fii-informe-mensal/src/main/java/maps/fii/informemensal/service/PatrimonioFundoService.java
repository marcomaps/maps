package maps.fii.informemensal.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class PatrimonioFundoService {
	public DadosPatrimonio patrimonio(String cnpj) {
		RestTemplate restTemplate = new RestTemplate();
		String url = BaseURL.url + cnpj + "/patrimonio?data=01/01/2016";
		try {
			return restTemplate.getForObject(url, DadosPatrimonio.class);
		} catch (RestClientException e) {
			throw new ChamadaServicoException("dados patrimônio", url, e);
		}
	}
}
