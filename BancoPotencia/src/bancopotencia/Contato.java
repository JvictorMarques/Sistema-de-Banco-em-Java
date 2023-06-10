package bancopotencia;

public class Contato {
    private String email;
    private String contato1;
    private String contato2;

    public Contato(String email, String contato1, String contato2) {
        this.email = email;
        this.contato1 = contato1;
        this.contato2 = contato2;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContato1() {
        return contato1;
    }

    public void setContato1(String contato1) {
        this.contato1 = contato1;

    }

    public String getContato2() {
        return contato2;
    }

    public void setContato2(String contato2) {
        this.contato2 = contato2;
    }
}
