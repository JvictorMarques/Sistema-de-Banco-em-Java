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
    public void mostrarInformacoes() {
        System.out.println("ID da agência: " + idAgencia);
        System.out.println("Localidade: " + localidade);
        System.out.println("Informações de contato:");
        System.out.printf("Email: %s\nContato 1: %s\nContato 2: %s\n", contato.getEmail(), contato.getContato1(), contato.getContato2());
        System.out.println("Informações de endereço:");
    }

}
