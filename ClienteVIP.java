import java.math.BigDecimal;
import java.util.Scanner;

public class ClienteVIP extends Cliente {
    public ClienteVIP(String nome, String email, String segurosocial, Endereco endereco) {
        super(nome, email, segurosocial, endereco);
    }

    @Override
    public String saque(BigDecimal bits) {
        BigDecimal saldo = this.getSaldo();

        if (saldo.subtract(bits).compareTo(BigDecimal.ZERO) >= 0
                && bits.compareTo(BigDecimal.ZERO) > 0) {
            
            this.setSaldo(saldo.subtract(bits));

            if(bits.compareTo(new BigDecimal(50)) <=0){
                System.out.println("qual metodo de saque você deseja utilizar : ");
                System.out.println("\t[1] - Somente notas de B$1,00 e B$5,00");
                System.out.println("\t[2] - Menor numero de notas");
                
                Scanner in = new Scanner(System.in);
                String input = in.next(); 
                
                if(input.compareTo("1") == 0){        
                    return SacarTrocado(bits);
                }
            }
            return SacarMinimoDeNotas(bits);
        }
        return "incapaz de sacar este valor.";
    }


    private String SacarTrocado(BigDecimal valor){
        int[] notas = { 0, 0};

        BigDecimal CINCO = new BigDecimal(5);
        BigDecimal UM = BigDecimal.ONE;
        BigDecimal ZERO = BigDecimal.ZERO;

        while (valor.compareTo(ZERO) != 0) {
            if (valor.compareTo(CINCO) >= 0) {
                notas[0] = (notas[0] + 1);
                valor = valor.subtract(CINCO);

            } else {
                notas[1] = (notas[1] + 1);
                valor = valor.subtract(UM);

            };
        }

        return ( notas[0] + " notas de\tB$5 e " + notas[1] + " notas de\tB$1");
    }
}