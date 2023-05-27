import java.util.Date;

public class ContaPoupança extends Conta {
    private double rendimentos;

    public ContaPoupança(String idConta, double saldo, String tipoPessoa, int operacao, Date dataMovimentacao, String senha,
                         Cliente cliente, Cliente nome, Cliente sobrenome, Cliente dataNascimento, Agencia idAgencia) {
        super(idConta, saldo, tipoPessoa, operacao, dataMovimentacao, senha, cliente, nome, sobrenome, dataNascimento, idAgencia);
    }

    public double getRendimentos() {
        return rendimentos;
    }

    public void setRendimentos(double rendimentos) {
        this.rendimentos = rendimentos;
    }

    public void atualizarRendimentos() {
        Date dataAtual = new Date();
        //Logica para implementar o rendimento, dataMovimentação e NovoSaldo
        if (dataAtual.getDate() == getDataMovimentacao().getDate()) {
            double saldoAtual = getSaldo();
            double taxaRendimento = 0.05; // TAXA DE RENDIMENTO FICTICIA 
            double rendimentosAtualizados = saldoAtual * taxaRendimento;

            double novoSaldo = saldoAtual + rendimentosAtualizados;
            setSaldo(novoSaldo);
            setRendimentos(rendimentosAtualizados);

            setDataMovimentacao(dataAtual);
           
        }
    }
}
