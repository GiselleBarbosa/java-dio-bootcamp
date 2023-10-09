package bootcamp.giselle.sistema_smart_tv;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public  void ligar (){
        ligada = true;
    }
    public void desligar (){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
         System.out.println("diminuindo o volume para: " + volume);
    }

    public void mudarDeCanalViaInput(int canalEscolhido){
        System.out.println("selecionou o canal numero " + canalEscolhido);
        canal = canalEscolhido;
    }
    public void aumentarCanal() {
        System.out.println("aumentando o volume para: " + canal);
        canal++;
    }

    public void diminuirCanal() {
        System.out.println("diminuindo o volume para: " + canal);
        canal--;
    }

}
