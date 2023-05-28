package bancopotencia;


public class PessoaFisica extends Cliente {
    private String cpf;
    private String nome;
    private String sobrenome;
    Endereco endereco;
    Contato contato;
    Conta conta;
    public PessoaFisica(String cpf, String nome, String sobrenome, double renda, String dataNascimento, Endereco endereco, Contato contato, Conta conta) {
        super(renda, dataNascimento, endereco, contato, conta);
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void cadastraPessoaFisica(String nome,String cpf,String datanascimento,String cep,String rua,int numero,String cidade,String estado,String email,int contato1,int contato2,String senha){
        setNome(nome);
        setCpf (cpf);
        super.setDataNascimento(datanascimento);
        endereco.setCep(cep);
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setCidade(cidade);
        contato.setEmail(email);
        contato.setContato1(contato1);
        contato.setContato2(contato2);
        conta.setSenha(senha);
    }
}