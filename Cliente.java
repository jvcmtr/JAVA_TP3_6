import java.math.BigDecimal;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<String> email;
    private String segurosocial;
    private Endereco endereco;
    private BigDecimal saldo;

    public Cliente(String nome, String email, String segurosocial, Endereco endereco) {
        this.nome = nome;
        this.email = new ArrayList<String>();
        this.email.add(email);
        this.segurosocial = segurosocial;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getEmail() {
        return email;
    }

    public void setEmail(ArrayList<String> email) {
        this.email = email;
    }

    public String getSegurosocial() {
        return segurosocial;
    }

    public void setSegurosocial(String segurosocial) {
        this.segurosocial = segurosocial;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

}
