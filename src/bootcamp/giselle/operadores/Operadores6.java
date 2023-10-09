package bootcamp.giselle.operadores;

public class Operadores6 {
    public static void main(String[] args) {
        // OPERADORES RELACIONAIS - COMPARAÇÕES

        /*
        (==) igual a
        (!=) diferente de
        (>) maior que
        (<) menor que
        (>=) maior ou igual a
        (<=) menor ou igual a
        */

        int num1 = 1;
        int num2 = 2;

        // boolean respostaComparacao = num1 == num2;
        // System.out.println("num1 é igual a num2? (resposta = " + respostaComparacao + ")");

        boolean respostaComparacao = num1 < num2;

        System.out.println("num1 é menor que num2? (resposta = " + respostaComparacao + ")"); //  true

        String nome1 = "Giselle";
        String nome2 = "Giselle";

        boolean respostaComparacaoNomes = nome1 == nome2;
        System.out.println("Nome1 é igual nome2? (resposta = " + respostaComparacaoNomes + ")"); //  true


        String nome3 = "Selle";
        String nome4 = new String("Selle");

        boolean respostaComparacaoNomes2 = nome3 == nome4;
        System.out.println("Nome3 é igual nome4? (resposta = " + respostaComparacaoNomes2 + ")"); //  false

        // Utiliza-se o EQUALS para analisar o conteudo dos objetos se sao iguais
        System.out.println(nome3.equals(nome4)); // true

    }
}
