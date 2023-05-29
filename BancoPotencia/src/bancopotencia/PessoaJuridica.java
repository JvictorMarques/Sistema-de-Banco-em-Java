package bancopotencia;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private String atividadeEconomica;
    private String grupoEconomico;
    private String controleAcionario;

    public PessoaJuridica(String cnpj, String razaoSocial, String nomeFantasia, String atividadeEconomica, String grupoEconomico, String controleAcionario, String dataNascimento, double renda, Endereco endereco, Contato contato) {
        super(renda, dataNascimento, endereco, contato);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.atividadeEconomica = atividadeEconomica;
        this.grupoEconomico = grupoEconomico;
        this.controleAcionario = controleAcionario;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    public String getAtividadeEconomica() {
        return atividadeEconomica;
    }
    public void setAtividadeEconomica(String atividadeEconomica) {
        this.atividadeEconomica = atividadeEconomica;
    }
    public String getGrupoEconomico() {
        return grupoEconomico;
    }
    public void setGrupoEconomico(String grupoEconomico) {
        this.grupoEconomico = grupoEconomico;
    }
    public String getControleAcionario() {
        return controleAcionario;
    }
    public void setControleAcionario(String controleAcionario) {
        this.controleAcionario = controleAcionario;
    }
    
}
