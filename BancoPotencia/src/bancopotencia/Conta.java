
package bancopotencia;

import connection.Conection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conta {
    private int idConta;
    private String tipoPessoa;
    private double saldo;
    private int operacao;
    private String senha;
    private ArrayList<Transacao> transacoes = new ArrayList();
    Conection con1=new Conection(); 
    Connection connected;
    Statement st;
    ResultSet rs;

    public Conta(int idConta, double saldo){

        this.idConta = idConta ;    
        this.saldo = saldo;
        
        
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
    
    public void adicionarTransacoes(int id_conta_destinario, int id_conta_emissor,int id_conta_poupanca, String tipo_transacao, String credito_debito, double valor_transacao) {
        try {
            String sql = "INSERT INTO transacoes(id_conta_destinario, id_conta_emissor, id_conta_poupanca, tipo_transacao, credito_debito, valor_transacao) VALUES('"+id_conta_destinario+"','"+id_conta_emissor+"','"+id_conta_poupanca+"','"+tipo_transacao+"','"+credito_debito+"','"+valor_transacao+"')";
            connected = con1.getConnection();
            st = connected.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conta.class.getName()).log(Level.SEVERE, null, ex);
        }
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
