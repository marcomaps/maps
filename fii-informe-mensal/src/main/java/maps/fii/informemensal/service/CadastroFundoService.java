package maps.fii.informemensal.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class CadastroFundoService {

	public CadastroFundo cadastro(String cnpj) {
		RestTemplate restTemplate = new RestTemplate();
		String url = BaseURL.url + cnpj;
		try {
			return restTemplate.getForObject(url, CadastroFundo.class);
		} catch (RestClientException e) {
			throw new ChamadaServicoException("cadastro", url, e);
		}
	}
}
