package maps.monolith.cadastro.domain;

public class DadosAdministrador {
	private String cnpj;
	private String nome;

	public DadosAdministrador(String cnpj, String nome) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "DadosAdministrador [cnpj=" + cnpj + ", nome=" + nome + "]";
	}
}
