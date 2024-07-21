import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Informe seu nome:");
            String nome = scanner.next();

            System.out.println("Informe seu Sobrenome:");
            String sobrenome = scanner.next();

            System.out.println("Informe sua idade:");
            int idade = scanner.nextInt();

            System.out.println("Informe sua altura:");
            double altura = scanner.nextDouble();

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase() + ".");
            System.out.println("Tenho " + idade + " anos de idade.");
            System.out.println("Minha altura é " + altura + "cm");
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Campo idade/altura tem que ser numérico");
            System.out.println("Entre com os dados novamente!");
        } finally {
            System.out.println("Fim do Programa!!!");
        }
    }
}
