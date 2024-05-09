import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
               
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da conta !");
        Integer numeroConta = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da agência !");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o nome cliente !");
        String nomeCliente = scanner.next();
        String sobrenomeCliente = scanner.next(); 

        scanner.nextLine();//Use for next line of input
        
        System.out.println("Por favor, digite o saldo da conta !");
        double saldo = scanner.nextDouble();
  
        //imprimindo os dados obtidos pelo usuario
        System.out.println("\n");
        System.out.println("Olá "+ nomeCliente +" "+ sobrenomeCliente + ", obrigado por criar uma conta em nosso banco," +
        " sua agência é "+ numeroAgencia +", conta "+ numeroConta +" e seu saldo "+ saldo +" já está disponível para saque");
    }
}
