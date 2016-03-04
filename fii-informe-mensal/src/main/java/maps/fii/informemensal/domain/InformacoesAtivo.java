package maps.fii.informemensal.domain;

import maps.fii.informemensal.service.PosicaoFundo;

public class InformacoesAtivo {

	private double tituloPublico;
	private double tituloPrivado;
	private double fundoRF;
	private double fundoAcoes;
	private double fundoImobiliario;
	private double outros;

	private StringBuilder historico = new StringBuilder();

	public InformacoesAtivo() {
	}

	private void track(String categoria, PosicaoFundo pos) {
		// historico.append(categoria).append(": ").append(pos).append("; ");
	}

	public void tituloPublico(PosicaoFundo pos) {
		this.tituloPublico += pos.getValor();
		track("Título Público", pos);
	}

	public void tituloPrivado(PosicaoFundo pos) {
		this.tituloPrivado += pos.getValor();
		track("Título Privado", pos);
	}

	public void fundoRF(PosicaoFundo pos) {
		this.fundoRF += pos.getValor();
		track("fundoRF", pos);
	}

	public void fundoAcoes(PosicaoFundo pos) {
		this.fundoAcoes += pos.getValor();
		track("fundoAcoes", pos);
	}

	public void fundoImobiliario(PosicaoFundo pos) {
		this.fundoImobiliario += pos.getValor();
		track("fundoImobiliario", pos);
	}

	public double getTituloPublico() {
		return tituloPublico;
	}

	public double getTituloPrivado() {
		return tituloPrivado;
	}

	public double getFundoRF() {
		return fundoRF;
	}

	public double getFundoAcoes() {
		return fundoAcoes;
	}

	public double getFundoImobiliario() {
		return fundoImobiliario;
	}

	public double getOutros() {
		return outros;
	}

	public String getHistorico() {
		return historico.toString();
	}
}
