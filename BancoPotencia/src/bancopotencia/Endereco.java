public class Endereco {
    private String rua;
    private String cep;
    private String cidade;
    private String estado;
    private int numero;

    public Endereco(String rua,String cep,String cidade,int numero) {
        this.rua = cnpj;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getRua() {
        return rua;
    }
    public String getCep() {
        return cep;
    }
    public String getCidade() {
        return cidade;
    }
    public String getEstado() {
        return estado;
    }
    public int getNumero() {
        return numero;
    }
}




