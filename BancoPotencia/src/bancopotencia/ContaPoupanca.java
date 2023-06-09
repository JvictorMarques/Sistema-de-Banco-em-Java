package bancopotencia;

import java.util.Date;

public class ContaPoupanca extends Conta {
    private double rendimentos;
    

    public ContaPoupanca(String idConta, double saldo, String tipoPessoa, int operacao, Date dataMovimentacao, String senha, Cliente cliente) {
       /*/ super(idConta, saldo, tipoPessoa, operacao, dataMovimentacao, senha, cliente);/*/
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
