import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu numero da conta");
        int numero = scanner.nextInt();

        System.out.println("Digite a sua agencia");
        String agencia = scanner.next();

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite o saldo da conta");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá," + nome + " obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está dispovinel para saque ");

    }
}
