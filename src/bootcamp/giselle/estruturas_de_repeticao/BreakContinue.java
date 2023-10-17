package bootcamp.giselle.estruturas_de_repeticao;

public class BreakContinue {
  public static void main(String[] args) {

    // break - interrompe o fluxo no 2 // print 1,2
    // continue - irá pular o numero condicionado, e continua apos ele: // print
    // 1,2,4,5

    for (int numero = 1; numero <= 5; numero++) {
      if (numero == 3) {
        break;
      }

      System.out.println(numero);
    }
  }
}