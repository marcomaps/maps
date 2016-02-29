package maps.fii.informemensal.domain;

public class InformeMensalFII {

	private String nome;
	private String cnpj;
	private String nomeAdm;
	private String cnpjAdm;
	private String competencia;
	private int numeroCotistas;

	private double valorCota;

	private InformacoesAtivo ativo;
	private InformacoesPassivo passivo;

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

	public InformacoesAtivo getAtivo() {
		return ativo;
	}

	public InformacoesPassivo getPassivo() {
		return passivo;
	}

	public void setInformacoesAtivo(InformacoesAtivo ativo) {
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "InformeMensalFII [nome=" + nome + ", cnpj=" + cnpj + ", nomeAdm=" + nomeAdm + ", cnpjAdm=" + cnpjAdm
				+ ", competencia=" + competencia + ", numeroCotistas=" + numeroCotistas + ", valorCota=" + valorCota
				+ ", ativo=" + ativo + ", passivo=" + passivo + "]";
	}

}
