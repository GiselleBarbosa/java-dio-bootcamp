package bootcamp.giselle.tipagem;

public class TiposVariaveis {
    public static void main(String[] args) {
        // Atencao na hora de declarar numeros fracionarios

        double salarioMinimo = 1400.00;             // print => 1400.0
        System.out.println(salarioMinimo);

        double descontoSalario = 1.400;             // print => 1.4
        System.out.println(descontoSalario);

        // JAVA É FORTEMENTE TIPADA
        // ATENÇAO A NUMEROS QUE COMECEM COM (ZERO) 0

        // OUTROS EXEMPLOS
        int cep = 2810000; // 02810000 por começar com zero é interessante usar outro tipo
        float PI = 3.14F;           // float precisa ser encerrado com F
        long cpf = 11022033444L;    // long precisar ser encerrado com L
    }
}
