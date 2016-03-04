package maps.fii.informemensal.domain;

import maps.fii.informemensal.service.PosicaoFundo;
import maps.fii.informemensal.service.PosicoesFundo;

public class InformacoesAtivoBuilder {

	private PosicoesFundo posicoes;
	private InformacoesAtivo informacoesAtivo;

	public InformacoesAtivoBuilder(PosicoesFundo posicoes) {
		this.posicoes = posicoes;
		this.informacoesAtivo = new InformacoesAtivo();
	}

	public InformacoesAtivo build() {
		for (PosicaoFundo pos : this.posicoes) {
			switch (pos.getSegmento()) {
			case "Renda Fixa":
				rendaFixa(pos);
				break;
			case "Cota":
				cota(pos);
				break;
				
			default:
				outros(pos);
				break;
			}
		}
		
		return informacoesAtivo;
	}

	private void outros(PosicaoFundo pos) {
		
	}

	private void cota(PosicaoFundo pos) {
		switch (pos.getClassificacao()) {
		case "RF" :
			this.informacoesAtivo.fundoRF(pos);
			break;
		case "Ações" :
			this.informacoesAtivo.fundoAcoes(pos);
			break;
		case "Imobiliário" :
			this.informacoesAtivo.fundoImobiliario(pos);
			break;
		}
	}

	private void rendaFixa(PosicaoFundo pos) {
		switch (pos.getClassificacao()) {
		case "Título Público" :
			this.informacoesAtivo.tituloPublico(pos);
			break;
		case "Título Privado" :
			this.informacoesAtivo.tituloPrivado(pos);
			break;
		}
	}
}
