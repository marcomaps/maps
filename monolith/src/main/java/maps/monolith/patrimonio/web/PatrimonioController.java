package maps.monolith.patrimonio.web;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import maps.monolith.patrimonio.domain.DadosPatrimonio;

@RestController
public class PatrimonioController {

	@RequestMapping("/fundo/patrimonio")
	public DadosPatrimonio posicao(@RequestParam String cnpj) {
		DadosPatrimonio dados = new DadosPatrimonio();
		
		
		dados.setData(new Date());
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

