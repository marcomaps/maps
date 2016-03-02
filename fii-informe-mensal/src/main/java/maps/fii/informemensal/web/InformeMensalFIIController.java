package maps.fii.informemensal.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import maps.fii.informemensal.domain.InformacoesAtivo;
import maps.fii.informemensal.domain.InformacoesAtivoBuilder;
import maps.fii.informemensal.domain.InformeMensalFII;
import maps.fii.informemensal.service.CadastroFundo;
import maps.fii.informemensal.service.CadastroFundoService;
import maps.fii.informemensal.service.DadosPatrimonio;
import maps.fii.informemensal.service.PatrimonioFundoService;
import maps.fii.informemensal.service.PosicaoFundoService;
import maps.fii.informemensal.service.PosicoesFundo;

@RestController
@RequestMapping("/fii/informes/mensal/{cnpj}")
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

	@RequestMapping(method = RequestMethod.GET)
	public InformeMensalFII gerar(@PathVariable String cnpj, @RequestParam String competencia) {
		CadastroFundo cadastro = this.cadFundoService.cadastro(cnpj);
		DadosPatrimonio patrimonio = this.patrimonioFundoService.patrimonio(cnpj);

		PosicoesFundo posicoes = this.posicaoFundoService.posicao(cnpj);
		InformacoesAtivo ativo = new InformacoesAtivoBuilder(posicoes).build();

		InformeMensalFII informeMensalFII = new InformeMensalFII(cadastro.getNome(), cnpj,
				cadastro.getAdministrador().getNome(), cadastro.getAdministrador().getCnpj(), competencia,
				patrimonio.getNumeroCotistas());
		informeMensalFII.setValorCota(patrimonio.getValorCota());
		informeMensalFII.setInformacoesAtivo(ativo);
		return informeMensalFII;
	}
}
