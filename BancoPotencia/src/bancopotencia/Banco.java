package bancopotencia;

import java.util.ArrayList;

public class Banco {
	private String codigoBanco;
	private int idAgencia;
	private String localidade = "Digital";
	Contato contato;
	private ArrayList<Cliente> clientes = new ArrayList();
	    
	    
    public Banco(String codigoBanco, int idAgencia, String localidade, Contato contato) {
    	this.codigoBanco = codigoBanco;
        this.idAgencia = idAgencia;
        this.localidade = localidade;
        this.contato = contato;
    }
    
    public int getIdAgencia() {
        return idAgencia;
    }
    
    public void setIdAgencia(int idAgencia) {
        this.idAgencia = idAgencia;
    }
    
    public String getLocalidade() {
        return localidade;
    }
    
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void addCliente(Cliente cliente) {
    this.clientes.add(cliente);

    }

     public ArrayList<Cliente> getClientes(){
		return clientes;
	}
    public void mostrarInformacoes() {
        System.out.println("ID da agência: " + idAgencia);
        System.out.println("Localidade: " + localidade);
        System.out.println("Informações de contato:");
        System.out.printf("Email: %s\nContato 1: %s\nContato 2: %s\n", contato.getEmail(), contato.getContato1(), contato.getContato2());
        System.out.println("Informações de endereço:");
    }

   public void listarClientes() {
		System.out.printf("-Clientes-\n");
	    int tamanho = cliente.size();
	    for (int i=0; i<tamanho; i++) {
	    	System.out.println("\n Cliente: "+ i +
	    		  "\nID: "+ cliente.get(i).getIdCliente()+
	    		  "\nData de Nascimento: "+ cliente.get(i).getDataNascimento()+
	    		  "\nRenda: "+ cleinte.get(i).getRenda());
	    }
	}
     public void removerConta(String numeroClientes) {
		int tamanho = clientes.size();
	    for (int i=0; i<tamanho; i++) {
	    	String id = clientes.get(i).getIdCliente();
	    	if(id.equals(numeroClientes)){
	            clientes.remove(clientes.get(i));
	            System.out.println("\nCliente removida com sucesso!\n");
	            break;
	        }
	    }
    }
}
