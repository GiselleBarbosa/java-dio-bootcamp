package bootcamp.giselle.operadores;

public class Operadores2 {
    public static void main(String[] args) {
        String nomeCompleto = "Giselle" + "Barbosa";
        System.out.println(nomeCompleto); // GiselleBarbosa // concatenou


        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";     // 31

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;     // 1111

        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;     // 1111

        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);   // 13

        System.out.println(concatenacao);
    }
}
