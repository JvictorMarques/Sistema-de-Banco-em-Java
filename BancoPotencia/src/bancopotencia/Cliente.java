package bancopotencia;

public class Cliente {
	
	private String dataNascimento;
	private double renda;
	Endereco endereco;
	Contato contato;
	Conta conta;
	 
	public Cliente(double renda, String dataNascimento, Endereco endereco, Contato contato, Conta conta){
		this.renda = renda;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.contato = contato;
		this.conta = conta;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}
	 
}
