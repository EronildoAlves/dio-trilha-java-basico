
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeCliente = sc.next();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.next();

        System.out.println("Digite o número da sua conta: ");
        int numero = sc.nextInt();

        System.out.println("Qual valor deseja depositar? ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ","
                + " obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + "," + " conta " + numero + " e seu saldo R$"
                + saldo + " já está disponível para saque.");

        sc.close();
    }
}
