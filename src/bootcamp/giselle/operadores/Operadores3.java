package bootcamp.giselle.operadores;

public class Operadores3 {
    // Operadores Unarios
    /*  (+) numeros positivos sao positivos por padrao sem este operador explicitamente
        (-) nega um número ou expressao aritmetica
        (++) incremento
        (--) decremento
        (!) negacao logica
      */

    public static void main(String[] args) {
        int numero = 5;

        System.out.println(numero);     // 5
        System.out.println(- numero);   // -5
        System.out.println(numero);     // 5

        // para alterar o valor da variavel para torna-lo NEGATIVO segue exemplo
        numero = - numero;
        System.out.println(numero);     // - 5

        // para alterar o valor da variavel para torna-lo POSITIVO segue exemplo
        numero = numero * -1;
        System.out.println(numero);     // 5
    }

}
