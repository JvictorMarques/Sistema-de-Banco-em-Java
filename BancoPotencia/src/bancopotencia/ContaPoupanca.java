package bancopotencia;
import connection.Conection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.Date;

public class ContaPoupanca extends Conta {
    private int idContaPoupanca;

    Conection con1=new Conection(); 
    Connection connected;
    Statement st;
    ResultSet rs;

    public int getIdContaPoupanca() {
        return idContaPoupanca;
    }

    public void setIdContaPoupanca(int idContaPoupanca) {
        this.idContaPoupanca = idContaPoupanca;
    }
    private double rendimentos;


    public ContaPoupanca(int idContaPoupanca, double rendimentos) {
      this.idContaPoupanca = idContaPoupanca;
      this.rendimentos = rendimentos;
    }

    public double getRendimentos() {
        return rendimentos;
    }

    public void setRendimentos(double rendimentos) throws SQLException {

        this.rendimentos = rendimentos;
    }

    public double atualizarRendimentos(double saldo) {
        return saldo = saldo *0.05;
    }
}