public class SmartTv {

    boolean ligada = false;
    int canal = 1, volume = 25;

    public void ligar () {
        ligada = true;
    }

    public void desligar () {
        ligada = false;
    }

    public void aumentarVolume () {
        volume++;
        System.out.println("Volume aumentado para " + volume);
    }

    public void diminuirVolume () {
        volume--;
        System.out.println("Volume diminuído para " + volume);
    }

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal () {
        canal++;
        System.out.println("Canal alterado para " + canal);
    }

    public void diminuirCanal () {
        canal--;
        System.out.println("Canal alterado para " + canal);
    }

}
