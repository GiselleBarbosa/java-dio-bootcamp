package bootcamp.giselle.operadores;

public class Operadores7 {
    /*OPERADORES LOGICOS
    * CONDICIONAIS - TABELA VERDADE

    && OPERADOR LOGICO "E"
    || OPERADOR LOGICO "OU"

     */

    public static void main(String[] args) {
        boolean condicao1 = false;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas são true");
        } else if (condicao1 || condicao2) {
            System.out.println("Uma das duas é true");
        } else {
            System.out.println("nenhuma é true");
        }
    }
}
