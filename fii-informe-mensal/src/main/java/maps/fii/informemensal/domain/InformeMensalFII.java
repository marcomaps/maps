package maps.fii.informemensal.domain;

public class InformeMensalFII {

	private String nome;
	private String cnpj;
	private String nomeAdm;
	private String cnpjAdm;
	private String competencia;
	private int numeroCotistas;

	private double ativo;
	private double patrimonioLiquido;
	private double qtdCotas;
	private double rentabilidade;

	private double valorCota;

	private InformacoesAtivo infoAtivo;
	private InformacoesPassivo infoPassivo;

	public InformeMensalFII(String nome, String cnpj, String nomeAdm, String cnpjAdm, String competencia,
			int numeroCotistas) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.nomeAdm = nomeAdm;
		this.cnpjAdm = cnpjAdm;
		this.numeroCotistas = numeroCotistas;
		this.competencia = competencia;
	}

	public void setInformacoesGerais(double ativo, double pl, double qtdCotas, double valorCota, double rentabilidade) {
		this.ativo = ativo;
		this.patrimonioLiquido = pl;
		this.qtdCotas = qtdCotas;
		this.valorCota = valorCota;
		this.rentabilidade = rentabilidade;
	}

	public String getCompetencia() {
		return competencia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getNome() {
		return nome;
	}

	public String getNomeAdm() {
		return nomeAdm;
	}

	public int getNumeroCotistas() {
		return numeroCotistas;
	}

	public String getCnpjAdm() {
		return cnpjAdm;
	}

	public double getValorCota() {
		return valorCota;
	}

	public void setValorCota(double valorCota) {
		this.valorCota = valorCota;
	}

	public double getAtivo() {
		return ativo;
	}

	public InformacoesPassivo getPassivo() {
		return infoPassivo;
	}

	public void setInformacoesAtivo(InformacoesAtivo infoAtivo) {
		this.infoAtivo = infoAtivo;
	}

	public double getPatrimonioLiquido() {
		return patrimonioLiquido;
	}

	public double getQtdCotas() {
		return qtdCotas;
	}

	public double getRentabilidade() {
		return rentabilidade;
	}

	public InformacoesAtivo getInfoAtivo() {
		return infoAtivo;
	}

	public InformacoesPassivo getInfoPassivo() {
		return infoPassivo;
	}

	@Override
	public String toString() {
		return "InformeMensalFII [nome=" + nome + ", cnpj=" + cnpj + ", nomeAdm=" + nomeAdm + ", cnpjAdm=" + cnpjAdm
				+ ", competencia=" + competencia + ", numeroCotistas=" + numeroCotistas + ", ativo=" + ativo
				+ ", patrimonioLiquido=" + patrimonioLiquido + ", qtdCotas=" + qtdCotas + ", rentabilidade="
				+ rentabilidade + ", valorCota=" + valorCota + ", infoAtivo=" + infoAtivo + ", infoPassivo="
				+ infoPassivo + "]";
	}

}
