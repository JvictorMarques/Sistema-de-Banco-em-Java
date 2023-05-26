public class Agencia {
    private int idAgencia;
    private String localidade;
    private Contato contato;
    private Endereco endereco;
    
    public Agencia(int idAgencia, String localidade, Contato contato, Endereco endereco) {
        this.idAgencia = idAgencia;
        this.localidade = localidade;
        this.contato = contato;
        this.endereco = endereco;
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
   
    public void mostrarInformacoes() {
        System.out.println("ID da agência: " + idAgencia);
        System.out.println("Localidade: " + localidade);
        System.out.println("Informações de contato:");
        System.out.printf("Email: %s\nContato 1: %s\nContato 2: %s\n", contato.getEmail(), contato.getContato1(), contato.getContato2());
        System.out.println("Informações de endereço:");
        System.out.printf("ID do endereço: %d\nRua: %s\nCEP: %s\nCidade: %s\nEstado: %s\nNúmero: %d\n",
                endereco.getIdEndereco(), endereco.getRua(), endereco.getCep(), endereco.getCidade(), endereco.getEstado(), endereco.getNumero());
    }
}
