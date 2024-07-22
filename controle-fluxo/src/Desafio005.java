import java.util.Scanner;

public class Desafio005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double valorSaque = 0;

        for (int i = 1; valorSaque <= limiteDiario; i++) {

            valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transações encerradas.");
                break;
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            } else {
                limiteDiario -= valorSaque;
                System.out.println("Saque realizado. limite restante: " + limiteDiario);
                System.out.println("Transacoes encerradas.");
                break;
            }
        }
        scanner.close();
    }
}
