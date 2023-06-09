/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancopotencia;

import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author Elder
 */
public class Conta {
    private int idConta;
    private String tipoPessoa;
    private double saldo;
    private int operacao;
    private String senha;
    private ArrayList<Transacao> transacoes = new ArrayList();

    public Conta(int idConta, double saldo){

        this.idConta = idConta ;
        this.saldo = saldo;
        
        
   }
   public Conta(){

   }

    public double sacar(double valor){
       double saldoDisponivel = this.saldo;
       if(saldoDisponivel > valor){
           setSaldo(saldoDisponivel-valor);
           //INSERTS NO BANCO

           return this.saldo;
       }else{
           //RETORNA NA TELA QUE O CLIENTE N TEM SALDO PARA ESTA OPERACAO
           return 0;
       }
    }
    
    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getOperacao() {
        return operacao;
    }

    public void extrato (){//no lugar de historico
        //consultas no banco sobre todas as transacoes do cliente
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void transferir(double valor, int idContaRecebedor){
        //SERIA INTERESSANTE QUE TODAS AS TRANSAÇÕES TIVESSEM UM ID ESTE ID QUANDO TUDO DER CERTO.
        //PRIMEIRO PROCURA NO BANCO SE EXISTE A CONTA QUE VAI RECEBER

        double saldoDisponivel = this.saldo;
        if(saldoDisponivel > valor){
            setSaldo(saldoDisponivel-valor);
            //INSERTS NO BANCO
            //return true;
        }else{
            //RETORNA NA TELA QUE O CLIENTE N TEM SALDO PARA ESTA OPERAÇÃO
            //return false;
        }
    }

    public double depositar(double valor){
       if (valor>0){
           double novoSaldo = this.saldo + valor;
           setSaldo(novoSaldo);
           return novoSaldo;
       }else {
           return 0;
       }
    }

    public void mostrarExtrato(){
        //PRINTAR HISTORICO RELADIONADO A CONTA
    }
     public void adicionarTransacao(Transacao transacao) {
		this.transacoes.add(transacao);
	}
    public ArrayList<Transacao> getTransacoes(){
		return transacoes;
	}
        public void listarTransacao() {
                    System.out.printf("-Transacao-\n");
                    int tamanho = transacoes.size();
                        for (int i=0; i<tamanho; i++) {
                            System.out.println("\nTrasacão: "+ i +
                                  "\nData de transacão: "+ transacoes.get(i).getDataTransacao()+
                                  "\nValor da Transacão: "+ transacoes.get(i).getValorTransacao()+
                                  "\nTipo de Cartão(Credito ou Debito): "+ transacoes.get(i).getTipoTransacao()+
                                  "\nDestino da Tranferencia(Fisica ou Juridica): "+ transacoes.get(i).getDestino()+
                                  "\nTipo de Transacão(Deposito, Saque, transferir): "+ transacoes.get(i).getTransacao());
                        }
        }
}
