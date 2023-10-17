package bootcamp.giselle.estruturas_de_repeticao;

public class ExemploForArray {
  public static void main(String[] args) {
    String alunos[] = { "GISELLE", "YAGO", "TIAGO", "MARCOS" };

    for (int index = 0; index < alunos.length; index++) {
      System.out.println("O Aluno no indice index= " + index + " é " + alunos[index]);
    }
  }
}