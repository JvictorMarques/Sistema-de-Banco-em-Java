/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancopotencia;

import java.util.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Elder
 */
public class Conta {
    private String idConta;
    private String tipoPessoa;
    private double saldo;
    private int operacao;
    private String senha;
    private ArrayList<Transacao> transacoes = new ArrayList();

    public Conta(String idConta, double saldo, String tipoPessoa, int operacao, Date dataMovimentacao, String senha, Cliente cliente){

        this.idConta = idConta ;    
        this.saldo = saldo;
        this.tipoPessoa = tipoPessoa;
        this.operacao = operacao;
        this.senha = senha;
   }
   public Conta(){

   }

    public void sacar(double valor){
       JOptionPane.showMessageDialog(null, "Saque realizado com sucesso.");
        try {       
            if (valor > 0) {
                double novoSaldo = valor - getSaldo();
                setSaldo(novoSaldo);
                JOptionPane.showMessageDialog(null, "saque realizado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Nao tem saldo para sacar");
            }
        }catch (NumberFormatException ex){
         System.err.println("Erro ao estabelecer a conexao com o banco de dados. Erro");     
        }
    }
    
    public String getIdConta() {
        return idConta;
    }

    public void setIdConta(String idConta) {
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

    public void depositar(double valor){
       try {       
            // Verifica se o valor do depósito é válido (maior que zero)
            if (valor > 0) {
                // Realiza o depósito na conta
                double novoSaldo = valor + getSaldo();
                setSaldo(novoSaldo);

                JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso");
            } else {
                // O valor do depósito é inválido
                JOptionPane.showMessageDialog(null, "Valor de depósito inválido");
            }
        } catch (NumberFormatException ex) {
             System.err.println("Erro ao estabelecer a conexao com o banco de dados. Erro");
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
