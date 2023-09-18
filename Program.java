import java.math.BigDecimal;
import java.util.Scanner; 

public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = "";

        Cliente vip = new ClienteStandart("Cliente Normal", null, null, null);
        Cliente normal = new ClienteVIP("Cliente Vip", "", "", null);
        Cliente atual = normal;

        while (input.compareTo("0") != 0){

            System.out.println("\n________________________________________");
            System.out.println("Usuario: " + atual.getNome());
            System.out.println("Saldo: B$ " + atual.getSaldo());
            System.out.println("\t[1] - Deposito");
            System.out.println("\t[2] - Saque");
            System.out.println("\t[3] - Trocar usuàrio");
            System.out.println("\t[0] - Sair");

            input = in.next();

            switch (input) {
                case "1":
                    int i = getInt("\nQuanto deseja depositar : ", in);
                    atual.deposito(new BigDecimal(i));
                    System.out.println("\n\tDEPOSITO EXECUTADO COM SUCESSO !");
                    break;
                
                case "2":
                    int ii = getInt("Quanto deseja sacar : ", in);
                    String s = atual.saque(new BigDecimal(ii));
                    System.out.println("\nsacando ...");
                    s = s.replaceAll(", ", "\n\t").replace(" e ", "\n\t");
                    System.out.println("\t" +s);
                    break;
                case "3":
                    if(atual == vip){
                        atual = normal;
                    }else{
                        atual = vip;
                    }
                    break;
                default:
                    break;
            }
        }

        System.out.println("\n\n________________________________________\n\tencerrando programa...");
        in.close();
    }

    static int getInt(String prompt, Scanner in){
        String s = "";
        int i = -1;
        boolean valid = false;

        while(!valid){    
            try{
                System.out.print(prompt);
                s = in.next();
                i = Integer.parseInt(s);
                valid = true;

            } catch (Exception e) {
                System.out.println("O valor digitado é invalido");
            }
        }
        return i;
    }
}