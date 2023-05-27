package bancopotencia;

public class PessoaFisica extends Cliente {
	private String cpf;
	private String nome;
	private String sobrenome;

	public PessoaFisica(String cpf, String nome, String Sobrenome, double renda, String dataNascimento, Endereco end, Contato contado, Conta conta) {
		super(renda, dataNascimento);
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
}
