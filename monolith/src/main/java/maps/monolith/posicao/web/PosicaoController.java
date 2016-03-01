package maps.monolith.posicao.web;

import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import maps.monolith.posicao.domain.PosicaoFundo;
import maps.monolith.posicao.domain.PosicoesFundo;

@RestController
@RequestMapping("/fundos/{cnpj}/posicao")
public class PosicaoController {

	@RequestMapping(method = RequestMethod.GET)
	public PosicoesFundo posicao(@PathVariable String cnpj, @RequestParam Date data) {
		PosicoesFundo posicoes = new PosicoesFundo();
		posicoes.add(new PosicaoFundo("Renda Fixa", "Título Público", "LFT-2020", 2));
		posicoes.add(new PosicaoFundo("Renda Fixa", "Título Público", "LTN-2020", 3));
		posicoes.add(new PosicaoFundo("Cota", "RF", "FUNDO SOBERANO", 4));
		posicoes.add(new PosicaoFundo("Cota", "Ações", "FUNDO IBOVESPA ATIVO", 5));
		posicoes.add(new PosicaoFundo("Cota", "Imobiliário", "FUNDO SHOPPING MORUMBI", 6));
		return posicoes;
	}
}
