import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Por favor, digite o Nome do Cliente!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo da Conta!");
        double saldoConta = scanner.nextDouble();
        scanner.nextLine();

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.");
    }
}
