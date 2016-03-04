package maps.fii.informemensal.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PatrimonioFundoService {
	public DadosPatrimonio patrimonio(String cnpj) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(BaseURL.url + cnpj + "/patrimonio?data=01/01/2016", DadosPatrimonio.class);
	}
}
