package bootcamp.giselle.tipagem;

public class TiposVariaveis2 {
    public static void main(String[] args) {
        double salarioMinimo = 1400;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // cast = converteu para um tipo mais específico
    }
}
