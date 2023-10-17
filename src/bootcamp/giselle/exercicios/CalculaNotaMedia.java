package bootcamp.giselle.exercicios;

import java.util.Scanner;

public class CalculaNotaMedia {

    public static void main(String[] args) {
        // Declaracoes
        Scanner teclado = new Scanner(System.in);
        float nota1, nota2, nota3, nota4, media;

        // Leitura das notas
        System.out.println("Informe as notas: ");

        // Nota 1:
        System.out.print("\n\tNota 1: ");
        nota1 = teclado.nextFloat();

        // Nota 2:
        System.out.print("\tNota 2: ");
        nota2 = teclado.nextFloat();

        // Nota 3
        System.out.print("\tNota 3: ");
        nota3 = teclado.nextFloat();

        // Nota 4
        System.out.print("\tNota 4: ");
        nota4 = teclado.nextFloat();

        // Calcula usando um método com retorno:
        media = calculaMedia(nota1, nota2, nota3, nota4);

        System.out.println("\n\tA média é " + media);
    }

    // O método estático (static) permite ser invocado sem a instância da classe:
    public static float calculaMedia(float n1, float n2, float n3, float n4) {

        float media = n1 + n2 + n3 + n4;

        return media / 4;

    }
}
