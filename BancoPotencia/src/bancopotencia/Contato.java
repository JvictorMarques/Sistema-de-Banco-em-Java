package bancopotencia;

public class Contato {
    private String email;
    private int contato1;
    private int contato2;

    public Contato(String email, int contato1, int contato2) {
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

    public int getContato1() {
        return contato1;
    }

    public void setContato1(int contato1) {
        this.contato1 = contato1;
    }

    public int getContato2() {
        return contato2;
    }

    public void setContato2(int contato2) {
        this.contato2 = contato2;
    }
}
