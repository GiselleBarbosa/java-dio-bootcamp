package bootcamp.giselle.condicionais;

public class SwitchCase2 {
  public static void main(String[] args) {
    String plano = "F";

    switch (plano) {
      case "T":
        System.out.println("5GB YouTube");
        break;
        case "M":
        System.out.println("WhatsApp e Instagram gratis");
        break;
         case "B":
        System.out.println("100 minutos de ligacao");
        break;
        default :
        System.out.println("Sem plano ativo");
    }

  }
}