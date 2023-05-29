package bancopotencia;

import java.util.Date;

public class ContaCorrente extends Conta{
    private double limite = 500;
    private double taxa = 0.10;
    private double SaldoLimite;
    Conta saldo;
    
    public ContaCorrente(double taxa, double SaldoLimite, String idConta, double saldo, String tipoPessoa, int operacao, Date dataMovimentacao, String senha, Cliente cliente, Agencia agencia){
        super(idConta, saldo, tipoPessoa, operacao, dataMovimentacao, senha, cliente, agencia);
        this.taxa = taxa;
        this.SaldoLimite = SaldoLimite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getSaldoLimite() {
        return SaldoLimite;
    }

    public void setSaldoLimite(double Saldo, double limite) {
        this.SaldoLimite = Saldo + limite;
    }
    @Override
    public double sacar(double valor){
        double saldo = super.getSaldo();
        if(valor <= saldo){
        }else{
            saldo -= valor + taxa;
            return saldo;

        }
        return 0;
    }
    @Override
    public double depositar(double valor){
        double saldo = super.getSaldo();
        if (valor>0){
        }else{
            saldo += (valor - taxa);
            return saldo;
        }
        return 0;
    }
}

