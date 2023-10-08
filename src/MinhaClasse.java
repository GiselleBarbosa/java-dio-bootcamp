public class MinhaClasse {
    public static void main(String[] args) {

        // Final se assemelha a CONST - Constant em javascript
        final String BR = "Brasil";
        // BR = "Brazil";
        // Utilizando final a variavel BR não pode ser alterada
        // Declarar as variaveis FINAL utilizando letras MAIUSCULAS
        // Separar nomes por underline

        System.out.println(BR); // Brasil

        /*------------------------------------------------------ */

        /* Declarada variaval ano valendo 2000 */

        int ano = 2000;
        System.out.println(ano);// 2000

        /* Houve alteração do valor para 2023 */

        ano = 2023;
        System.out.println(ano); // 2023

        /*------------------------------------------------------ */

        /* Mais exemplos de declaração de variaveis */

        double PI = 3.14;
        int ESTADOS_BRASILEIROS = 27;
        int ANO_2000 = 2000;

        /*
         REGRAS para declaração de variaveis
        */

        // deve conter apenas letras, _ (UNDERLINE), $ (SIFRAO) , ou os numeros de 0 a 9
        // iniciar por letras(preferencialmente) ou _ (UNDERLINE)
        // primeira letra minuscula (Camel Case) e as demais maiusculas
        // não pode conter espaços
        // não usar palavras reservadas
        // deve ser unico dentro do scopo (Case Sensitive)

        /*------------------------------------------------------ */
        //  Exemplos INVALIDOS de nomes de variaveis

        // int numero&um = 1;   // usou simbolo nao permitido - unicos simbolos permitidos sao _ e $
        // int 1numero = 1;     // comeca com numero
        //  int numero um = 1;   // contêm espaço
        // int long = 1;        // usado uma palavra reservada

        /*------------------------------------------------------ */
        //  Exemplos VALIDOS de nomes de variaveis

        int numero$um = 1;
        int numero1 = 1;
        int numeroUm = 1;
        int longo = 1;
    }

}
