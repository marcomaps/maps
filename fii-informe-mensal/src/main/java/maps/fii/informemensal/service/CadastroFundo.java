package maps.fii.informemensal.service;

public class CadastroFundo {

	private String cnpj;
	private String nome;
	private DadosAdministrador administrador;

	public CadastroFundo() {
	}

	public CadastroFundo(String cnpj, String nome, DadosAdministrador adm) {
		this.cnpj = cnpj;
		this.nome = nome;
		this.administrador = adm;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getNome() {
		return nome;
	}

	public DadosAdministrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(DadosAdministrador administrador) {
		this.administrador = administrador;
	}

	@Override
	public String toString() {
		return "CadastroFundo [cnpj=" + cnpj + ", nome=" + nome + ", administrador=" + administrador + "]";
	}
}
