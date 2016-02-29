package maps.fii.informemensal.web;

public class InformeMensalFII {
	private String competencia;

	public String getCompetencia() {
		return competencia;
	}

	private String cnpj;
	private String nome;
	private double valorCota;

	private InformacoesAtivo ativo;
	private InformacoesPassivo passivo;

	public InformeMensalFII(String competencia, String cnpj, String nome, double valorCota) {
		super();
		this.competencia = competencia;
		this.cnpj = cnpj;
		this.nome = nome;
		this.valorCota = valorCota;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getNome() {
		return nome;
	}

	public double getValorCota() {
		return valorCota;
	}

	public InformacoesAtivo getAtivo() {
		return ativo;
	}

	public InformacoesPassivo getPassivo() {
		return passivo;
	}

}
