public class ExemploDebbuging {

    public static void main(String[] args) {

        System.out.println("Iniciou Programa do Método MAIN.");
        a();
        System.out.println("Finalizou método MAIN.");
        System.out.println("Fim do Programa!!!");
    }

    public static void a() {
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou método a.");
    }

    public static void b() {
        System.out.println("Entrou no método b.");
        for (int i = 0; i <= 4; i++)
            System.out.println(i);
        c();
        System.out.println("Finalizou método b.");
    }

    public static void c() {
        System.out.println("Entrou no método c.");
        // Thread.dumpStack();
        System.out.println("Finalizou método c.");
    }
}
