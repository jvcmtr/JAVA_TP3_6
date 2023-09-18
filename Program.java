import java.math.BigDecimal;

public class Program {
    public static void main(String[] args) {
        Cliente c = new Cliente("joao", "", "", null);

        c.deposito(new BigDecimal(500));

        System.out.println(c.saque(new BigDecimal(97)));
        System.out.println(c.saque(new BigDecimal(970)));
        System.out.println(c.saque(new BigDecimal(400)));

        System.out.println(c.saque(new BigDecimal(4)));
        System.out.println(c.saque(new BigDecimal(3)));
    }
}