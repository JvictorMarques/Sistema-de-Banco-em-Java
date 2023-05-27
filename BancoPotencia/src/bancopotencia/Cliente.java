/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancopotencia;

/**
 *
 * @author wgsor
 */
public class Cliente {
	
	private String dataNascimento;
	private double renda;
	Endereco endereco;
	Contato contato;
	Conta conta;
	 
	public Cliente(double renda, String dataNascimento){ //, Endereco endereco, Contato contado, Conta conta
		this.renda = renda;
		this.dataNascimento = dataNascimento;
		//Endereco endereco = new Endereco(endereco.getIdEndereco, endereco.getRua, endereco.getCep, endereco.getCidade, endereco.getEstado, endereco.getNumero);
		//Contato contato = new Contato(contato.getEmail, contato.getContato1, contato.getContato2, contato.getId);
		//Conta conta = new Conta(conta.getID. conta.getTipo. conta.getSaldo, conta.getOperacao, conta.getDataMovimentacao, conta.getTipoMovimentacao, conta.getHistorico, conta.getSenha);
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
