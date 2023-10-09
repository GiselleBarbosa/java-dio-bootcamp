package bootcamp.giselle.variaveis;

public class AnatomiaClasses2 {

    public static void main(String[] args) {
        String primeiroNome = "Giselle";
        String sobreNome = "Barbosa";

        String nomeCompleto = nomeCompleto(primeiroNome, sobreNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String sobreNome) {
        return "Nome completo é: " + primeiroNome.concat(" ").concat(sobreNome);
    }


}
