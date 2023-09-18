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
        this.saldo = new BigDecimal(0);
    }

    public boolean deposito(BigDecimal bits) {
        if (bits.compareTo(BigDecimal.ZERO) > 0) {
            saldo = saldo.add(bits);
            return true;
        }
        return false;
    }

    public String saque(BigDecimal bits) {
        if (saldo.subtract(bits).compareTo(BigDecimal.ZERO) >= 0
                && bits.compareTo(BigDecimal.ZERO) > 0) {
            saldo.subtract(bits);
            return SacarMinimoDeNotas(bits);
        }
        return "incapaz de sacar este valor.";
    }

    private String SacarMinimoDeNotas(BigDecimal valor) {
        int[] notas = { 0, 0, 0, 0 };

        BigDecimal CINQUENTA = new BigDecimal(50);
        BigDecimal DEZ = BigDecimal.TEN;
        BigDecimal CINCO = new BigDecimal(5);
        BigDecimal UM = BigDecimal.ONE;
        BigDecimal ZERO = BigDecimal.ZERO;

        while (valor.compareTo(ZERO) != 0) {

            if (valor.compareTo(CINQUENTA) >= 0) {
                notas[0] = (notas[0] + 1);
                valor.subtract(CINQUENTA);

            } else if (valor.compareTo(DEZ) >= 0) {
                notas[0] = (notas[1] + 1);
                valor.subtract(DEZ);
            } else if (valor.compareTo(CINCO) >= 0) {
                notas[0] = (notas[2] + 1);
                valor.subtract(CINCO);
            } else {
                notas[0] = (notas[3] + 1);
                valor.subtract(UM);
            }
            ;
        }

        return (notas[0] + " de B$50, " + notas[1] + " de B$10, " + notas[2] + " de B$5 e " + notas[3] + " de B$1");
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
}
