package bootcamp.giselle.java_documentation;

public class Comentarios2 {
    public static void main(String[] args) {
        int resultado1 = somaMultiplica(2, 3, "M");
        int resultado2 = somaMultiplica(2, 3, "A");

        System.out.println("Resultado da multiplicação: " + resultado1);
        System.out.println("Resultado da adição: " + resultado2);
    }

    public static int somaMultiplica(int numero1, int numero2, String multiplicar) {
        int resultado = 0;

        if (multiplicar.equals("M")) {
            resultado = numero1 * numero2;
        } else if (multiplicar.equals("A")) {
            resultado = numero1 + numero2;
        }
        return resultado;
    }
}
