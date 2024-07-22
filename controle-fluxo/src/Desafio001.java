import java.util.Scanner;

public class Desafio001 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println(" ");
            System.out.println("+-------------------+");
            System.out.println("| Informe Opção     |");
            System.out.println("+-------------------+");
            System.out.println("| 1-Depositar       |");
            System.out.println("| 2-Sacar           |");
            System.out.println("| 3-Consultar Saldo |");
            System.out.println("| 0-Encerrar        |");
            System.out.println("+-------------------+");
            System.out.println(" ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o valor do depósito:");
                    float valorDeposito = scanner.nextFloat();
                    saldo += valorDeposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 2:
                    System.out.println("Informe o valor para Saque:");
                    float valorSaque = scanner.nextFloat();

                    if (saldo >= valorSaque) {
                        saldo -= valorSaque;
                        System.out.println("Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
