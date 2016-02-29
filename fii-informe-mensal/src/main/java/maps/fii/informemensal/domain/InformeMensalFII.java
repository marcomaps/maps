package maps.fii.informemensal.domain;

public class InformeMensalFII {

	private String nome;
	private String cnpj;
	private String competencia;
	private double valorCota;

	private InformacoesAtivo ativo;
	private InformacoesPassivo passivo;

	public InformeMensalFII(String nome, String cnpj, String competencia) {
		super();
		this.competencia = competencia;
		this.cnpj = cnpj;
		this.nome = nome;
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

	public double getValorCota() {
		return valorCota;
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
}
