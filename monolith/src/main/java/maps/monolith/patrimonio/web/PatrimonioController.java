package maps.monolith.patrimonio.web;

import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import maps.monolith.patrimonio.domain.DadosPatrimonio;

@RestController
@RequestMapping("/fundos/{cnpj}/patrimonio")
public class PatrimonioController {

	@RequestMapping(method = RequestMethod.GET)
	public DadosPatrimonio posicao(@PathVariable String cnpj, @RequestParam Date data) {
		DadosPatrimonio dados = new DadosPatrimonio();
		
		dados.setData(data);
		dados.setPatrimonioLiquido(Math.random());
		dados.setValorCota(Math.random());
		dados.setQtdCotas(Math.random());
		dados.setNumeroCotistas((int) (100 / Math.random()));

		dados.setAtivos(Math.random());
		dados.setCaixa(Math.random());
		dados.setValoresAPagar(Math.random());
		dados.setValoresAReceber(Math.random());

		dados.setTaxaAdministracao(Math.random());
		dados.setTaxaPerformance(Math.random());

		return dados;
	} 
}

