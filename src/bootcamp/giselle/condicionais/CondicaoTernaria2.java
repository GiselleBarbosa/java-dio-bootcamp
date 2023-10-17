package bootcamp.giselle.condicionais;

public class CondicaoTernaria2 {
  public static void main(String[] args) {
    int nota = 4;

    String resultado = nota >= 7 ? "Aluno APROVADO" : nota >= 5 && nota < 7 ? "Recuperacao" : "Reprovado";

    System.out.println(resultado);
  }
}