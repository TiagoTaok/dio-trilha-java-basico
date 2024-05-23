import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário para digitar o número da agência
        System.out.print("Digite o número da Agência: ");
        String agencia = scanner.nextLine(); // A entrada de número de agência é melhor capturada como String

        // Pedir ao usuário para digitar o número da conta
        System.out.print("Digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        // Pedir ao usuário para digitar o nome do cliente
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        // Pedir ao usuário para digitar o saldo
        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Criar a mensagem de saída
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
                         + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        // Imprimir a mensagem
        System.out.println(mensagem);
        
        // Fechar o scanner
        scanner.close();
    }
}
