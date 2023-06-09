
package bancopotencia;

/**
 *
 * @author wgsor
 */
import java.util.ArrayList;

public class Cliente {
	
    private String idCliente;
    private String dataNascimento;
    private double renda;
    Endereco endereco;
    Contato contato;
    private ArrayList<Conta> contas = new ArrayList<>();

    public Cliente(double renda, String dataNascimento, Endereco endereco, Contato contato){
            this.renda = renda;
            this.dataNascimento = dataNascimento;
            this.endereco = endereco;
            this.contato = contato;
    }
    public Cliente(){

    }
     public String getIdCliente(){
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
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

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public ArrayList<Conta> getContas(){
        return contas;
    }

    public Conta getConta(String IdConta){
        int tam =IdConta.length();
        for(int i=0;i>tam;i++){
            if(IdConta.equals(contas.get(i).getIdConta())){
                return contas.get(i);
            }
        }
        System.out.println("Erro na existencia de conta");
        Conta c1 = new Conta();
        return c1;
    }

    public void listarContas() {
        System.out.printf("-Contas-\n");
        int tamanho = contas.size();
        for (int i=0; i<tamanho; i++) {
            System.out.println("\nConta: "+ i +
                      "\nNúmero: "+ contas.get(i).getIdConta()+
                      "\nOperação: "+ contas.get(i).getOperacao()+
                      "\nSaldo: "+ contas.get(i).getSaldo()+
                      "\nPessoa: "+ contas.get(i).getTipoPessoa());
        }
    }

    /*/public void removerConta(String numeroConta) {
        int tamanho = contas.size();
        for (int i=0; i<tamanho; i++) {
            String id = contas.get(i).getIdConta();
            if(id.equals(numeroConta)){
                contas.remove(contas.get(i));
                System.out.println("\nConta removida com sucesso!\n");
                break;
            }
        }
    }/*/
}
