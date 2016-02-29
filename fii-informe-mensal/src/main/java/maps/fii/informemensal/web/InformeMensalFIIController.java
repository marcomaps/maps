package maps.fii.informemensal.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import maps.fii.informemensal.service.CadastroFundoService;
import maps.fii.informemensal.service.PatrimonioFundoService;
import maps.fii.informemensal.service.PosicaoFundoService;

@RestController
public class InformeMensalFIIController {

	private CadastroFundoService cadFundoService;
	private PatrimonioFundoService patrimonioFundoService;
	private PosicaoFundoService posicaoFundoService;

	@Autowired
	public InformeMensalFIIController(CadastroFundoService cadFundoService,
			PatrimonioFundoService patrimonioFundoService, PosicaoFundoService posicaoFundoService) {
		this.cadFundoService = cadFundoService;
		this.patrimonioFundoService = patrimonioFundoService;
		this.posicaoFundoService = posicaoFundoService;
	}

	@RequestMapping("/fii/informes/mensal")
	public InformeMensalFII gerar(@RequestParam String cnpj, @RequestParam String competencia) {
		throw new UnsupportedOperationException();
//		CadastroFundo cadastroFundo = this.cadFundoService.cadastro(cnpj);
//		PosicoesFundo posicoes = this.posicaoFundoService.posicao(cnpj);
//		System.out.println(posicoes);
//		return new InformeMensalFII(competencia, cadastroFundo.getCnpj(), cadastroFundo.getNome(), cadastroFundo.getValorCota());
	}
}
