public class ExemploWhile {

    public static void main(String[] args) {

        double mesada = 50.0;

        while (mesada > 0) {

            Double valorDoce = 8.0;

            if (valorDoce <= mesada) {

                System.out.println("Valor Doce r$ " + valorDoce + " Saldo Mesada r$ " + (mesada = mesada - valorDoce));
            } else {
                break;
            }
        }

        System.out.println("Fim do Programa!");
        System.out.println("Meu saldo é de r$" + mesada);
    }

}
