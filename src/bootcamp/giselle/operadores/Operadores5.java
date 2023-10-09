package bootcamp.giselle.operadores;

public class Operadores5 {
    // Operador ternario ( IF / ELSE )
    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        String resultado = "";

        if (a == b) {
            resultado = "VERDADEIRO";
        } else {
            resultado = "FALSO";
        }

        System.out.println("Usando if/else " + resultado);

        resultado = a == b ? "verdadeiro" : "falso";

        System.out.println("Usando ternario " + resultado);
    }
}
