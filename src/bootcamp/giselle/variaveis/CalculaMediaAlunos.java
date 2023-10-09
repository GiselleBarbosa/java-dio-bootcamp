package bootcamp.giselle.variaveis;

public class CalculaMediaAlunos {
    public static void main(String[] args) {
        int mediaFinal = 3;

        if (mediaFinal < 6) {
            System.out.println("Aluno(a) reprovado(a)");
        } else if (mediaFinal == 6) {
            System.out.println("Aluno(a) irá para recuperação");

        } else {
            System.out.println("Aluno(a) Aprovado(a)");
        }
    }
}
