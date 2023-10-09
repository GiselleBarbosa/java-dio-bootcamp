package bootcamp.giselle.sistema_smart_tv;

public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv(); // criando um novo objeto Smart Tv

        System.out.println("tv esta ligada?: " + smartTv.ligada);
        System.out.println("canal ao ligar: " + smartTv.canal);
        System.out.println("volume ao ligar: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("apos metodo ligar() agora tv esta ligada?: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("apos metodo desligar() agora tv esta ligada?: " + smartTv.ligada);

        smartTv.aumentarVolume(); //33
        System.out.println("volume atual: " + smartTv.volume);

        smartTv.aumentarVolume(); // 34
        System.out.println("volume atual: " + smartTv.volume);

        smartTv.diminuirVolume(); // 33
        System.out.println("volume atual: " + smartTv.volume);

        smartTv.mudarDeCanalViaInput(5);
        System.out.println("digitou canal via teclado numerico");

        smartTv.aumentarCanal();
        System.out.println("canal atual apos apertar botao +");

        smartTv.diminuirCanal();
        System.out.println("canal atual apos apertar botao -");

    }
}
