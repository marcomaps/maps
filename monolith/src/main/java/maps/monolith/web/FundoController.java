package maps.monolith.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FundoController {

	private FundoRepository fundoRepository;

	@Autowired
	public FundoController(FundoRepository fundoRepository) {
		this.fundoRepository = fundoRepository;
	}

	@RequestMapping("/fundo/cadastro")
	public CadastroFundo find(@RequestParam String cnpj) {
		return fundoRepository.find(cnpj);
	}

	@RequestMapping("/fundo/cadastro/todos")
	public Collection<CadastroFundo> findAll() {
		return fundoRepository.findAll();
	}

	// curl --data '{"cnpj" : "6", "nome" : "FUNDO 6", "valorCota" : "6.66"}'
	// -X POST -H 'Content-Type:application/json'
	// http://localhost:8080/fundo/cadastro/novo
	@RequestMapping(method = RequestMethod.POST, path = "/fundo/cadastro/novo")
	public CadastroFundo create(@RequestBody CadastroFundo cad) {
		System.out.println("criando " + cad);
		fundoRepository.add(cad);
		return cad;
	}
}