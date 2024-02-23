import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        int numero = entrada.nextInt();
        
        entrada.nextLine();
        System.out.println("Por favor, digite o nome da Agência !");
        String agencia = entrada.nextLine();
        
        System.out.println("Por favor, digite o seu nome !");
        String nomeCliente = entrada.nextLine();
        
        System.out.println("Por favor, digite o saldo da Conta !");
        float saldo = entrada.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
