package bootcamp.giselle.tratamentos_de_excecoes;

public class FormatadorCepExemplo {

  public static void main(String[] args) {
    try {
      String cepFormatado = formatarCep("02810000");
      System.out.println(cepFormatado);
    } catch (CepInvalidoException error) {
      System.out.println("O cep informado esta invalido ou nao existe");

    }
  }

  static String formatarCep(String cep) throws CepInvalidoException {
    if (cep.length() != 8)
      throw new CepInvalidoException();

    // simulando um cep formatado
    return "02810-000";
  }

}