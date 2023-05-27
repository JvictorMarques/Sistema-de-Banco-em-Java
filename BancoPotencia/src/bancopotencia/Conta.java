/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancopotencia;

import java.util.Date;

/**
 *
 * @author Elder
 */
public class Conta {
    private String idConta;

    private String tipoPessoa;

    private double saldo;

    private int operacao;

    private Date dataMovimentacao;

    private double valorMovimentacao;

    private String tipoMovimentacao;

    private String historico; //historico: arrayList(object)

    private String senha;

    Cliente cliente;

    Agencia agencia;

    public Conta(String idConta, double saldo, String tipoPessoa, int operacao, Date dataMovimentacao, String senha, Cliente cliente, Agencia agencia){

        this.idConta = idConta ;
        this.saldo = saldo;
        this.tipoPessoa = tipoPessoa;
        this.operacao = operacao;
        this.senha = senha;
        this.cliente = cliente;
        this.agencia = agencia;
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

    public String getIdConta() {
        return idConta;
    }

    public void setIdConta(String idConta) {
        this.idConta = idConta;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
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

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

    public Date getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(Date dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public double getValorMovimentacao() {
        return valorMovimentacao;
    }

    public void setValorMovimentacao(double valorMovimentacao) {
        this.valorMovimentacao = valorMovimentacao;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
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

}
