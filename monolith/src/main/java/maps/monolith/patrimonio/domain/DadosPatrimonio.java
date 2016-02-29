package maps.monolith.patrimonio.domain;

import java.util.Date;

public class DadosPatrimonio {

	private Date data;
	private double patrimonioLiquido;
	private double valorCota;
	private double qtdCotas;
	private int numeroCotistas;

	private double ativos;
	private double caixa;
	private double valoresAPagar;
	private double valoresAReceber;

	private double taxaAdministracao;
	private double taxaPerformance;

	public Date getData() {
		return data;
	}

	public double getPatrimonioLiquido() {
		return patrimonioLiquido;
	}

	public double getValorCota() {
		return valorCota;
	}

	public double getQtdCotas() {
		return qtdCotas;
	}

	public int getNumeroCotistas() {
		return numeroCotistas;
	}

	public double getAtivos() {
		return ativos;
	}

	public double getCaixa() {
		return caixa;
	}

	public double getValoresAPagar() {
		return valoresAPagar;
	}

	public double getValoresAReceber() {
		return valoresAReceber;
	}

	public double getTaxaAdministracao() {
		return taxaAdministracao;
	}

	public double getTaxaPerformance() {
		return taxaPerformance;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setPatrimonioLiquido(double patrimonioLiquido) {
		this.patrimonioLiquido = patrimonioLiquido;
	}

	public void setValorCota(double valorCota) {
		this.valorCota = valorCota;
	}

	public void setQtdCotas(double qtdCotas) {
		this.qtdCotas = qtdCotas;
	}

	public void setNumeroCotistas(int numeroCotistas) {
		this.numeroCotistas = numeroCotistas;
	}

	public void setAtivos(double ativos) {
		this.ativos = ativos;
	}

	public void setCaixa(double caixa) {
		this.caixa = caixa;
	}

	public void setValoresAPagar(double valoresAPagar) {
		this.valoresAPagar = valoresAPagar;
	}

	public void setValoresAReceber(double valoresAReceber) {
		this.valoresAReceber = valoresAReceber;
	}

	public void setTaxaAdministracao(double taxaAdministracao) {
		this.taxaAdministracao = taxaAdministracao;
	}

	public void setTaxaPerformance(double taxaPerformance) {
		this.taxaPerformance = taxaPerformance;
	}

	
}
