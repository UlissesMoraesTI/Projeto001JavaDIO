public class ExemploForArray {

    public static void main(String[] args) {

        String alunos[] = { "Felipe", "Jonas", "Julia", "Marcos" };

        for (int i = 0; i < alunos.length; i++)

            System.out.println("Aluno nº " + (i + 1) + " " + alunos[i]);

        for (

        String aluno : alunos) {
            System.out.println(aluno);

        }

    }

}
