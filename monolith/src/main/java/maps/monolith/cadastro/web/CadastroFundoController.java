package maps.monolith.cadastro.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import maps.monolith.cadastro.domain.CadastroFundo;
import maps.monolith.cadastro.domain.CadastroFundoRepository;

@RestController
@RequestMapping(value = "/fundos")
public class CadastroFundoController {

	private CadastroFundoRepository fundoRepository;

	@Autowired
	public CadastroFundoController(CadastroFundoRepository fundoRepository) {
		this.fundoRepository = fundoRepository;
	}

	@RequestMapping(value = "/{cnpj}", method = RequestMethod.GET)
	public CadastroFundo find(@PathVariable String cnpj) {
		CadastroFundo cadFundo = fundoRepository.find(cnpj);
		if (cadFundo == null) {
			throw new FundoNaoEncontradoException(cnpj);
		}
		return cadFundo;
	}

	@RequestMapping(method = RequestMethod.GET)
	public Collection<CadastroFundo> findAll() {
		return fundoRepository.findAll();
	}

	// curl --data '{"cnpj":"8","nome":"FUNDO
	// 8","administrador":{"cnpj":"456","nome":"ADM 2"}}' -X POST -H
	// 'Content-Type:application/json' http://localhost:8080/fundos/
	@RequestMapping(method = RequestMethod.POST)
	public CadastroFundo create(@RequestBody CadastroFundo cad) {
		fundoRepository.add(cad);
		return cad;
	}

	@SuppressWarnings("serial")
	@ResponseStatus(HttpStatus.NOT_FOUND)
	class FundoNaoEncontradoException extends RuntimeException {

		public FundoNaoEncontradoException(String cnpj) {
			super("Fundo n�o encontrado. CNPJ: " + cnpj);
		}
	}
}