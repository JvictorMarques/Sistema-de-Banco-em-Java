package bancopotencia;

import java.util.Date;

public class Transacao {
    private Date dataTransacao;
    private double valorTransacao;
    private String tipoTransacao; //Credito ou Debito
    private String transacao; // Deposito, Saque, trnasferir
    private String destino; //pessoa fisica ou juridica que vai receber a transação

    public Transacao(Date dataTransacao, double valorTransacao, String tipoTransacao, String transacao, String destino) {
    	this.dataTransacao = dataTransacao;
    	this.valorTransacao = valorTransacao;
    	this.tipoTransacao = tipoTransacao;
    	this.transacao = transacao;
        this.destino = destino;
    }

    public Date getDataTransacao() {
            return dataTransacao;
    }

    public double getValorTransacao() {
            return valorTransacao;
    }

    public String getTipoTransacao() {
            return tipoTransacao;
    }

    public String getTransacao() {
            return transacao;
    }

    public String getDestino() {
            return destino;
    }
    
}
