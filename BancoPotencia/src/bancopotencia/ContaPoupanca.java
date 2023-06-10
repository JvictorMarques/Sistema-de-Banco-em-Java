package bancopotencia;

import java.util.Date;

public class ContaPoupanca extends Conta {
    private int idContaPoupanca;
    private double rendimentos;


    public ContaPoupanca(int idContaPoupanca, double rendimentos) {
      this.idContaPoupanca = idContaPoupanca;
      this.rendimentos = rendimentos;
    }

    public double getRendimentos() {
        return rendimentos;
    }

    public void setRendimentos(double rendimentos) {
        this.rendimentos = rendimentos;
    }

    public double atualizarRendimentos(double saldo) {
        return saldo = saldo *0.05;
    }
}