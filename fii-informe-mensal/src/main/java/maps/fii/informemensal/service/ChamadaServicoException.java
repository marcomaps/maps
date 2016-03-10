package maps.fii.informemensal.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.RestClientException;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ChamadaServicoException extends RuntimeException {
	public ChamadaServicoException(String servico, String url, RestClientException e) {
		super("Erro ao chamar serviço. Serviço: " + servico + ". URL: " + url, e);
	}
}