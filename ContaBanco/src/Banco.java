import java.util.Scanner;

public class Banco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero = 1021;
        double saldo = 250.75;

        System.out.println("digite o numero da agência");
        String agencia = scanner.nextLine();
        System.out.println("digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    
    }
}
