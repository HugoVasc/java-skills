public class SmartTvMetodos {
    private boolean ligada = false;
    private int volume = 10;
    private int canal = 1;

    public void ligar(){
        this.ligada = true;
    }
    public void desligar(){
        this.ligada = false;
    }
    public void aumentarVolume(){
        this.volume +=1;
    }
    public void diminuirVolume(){
        this.volume -=1;
    }
    public void aumentarCanal(){
        this.canal++;
    }
    public void diminuirCanal(){
        this.canal--;
    }
    public void mudarCanal(int canal){
        this.canal = canal;
    }
    public static void main(String[] args) throws Exception {
        SmartTvMetodos tv = new SmartTvMetodos();
        System.out.println("\nStatus Inicial:");
        System.out.println("TV ligada? " + tv.ligada);
        System.out.println("Canal atual: " + tv.canal);
        System.out.println("Volume atual: " + tv.volume);
        System.out.println("\nApós mudanças:");
        tv.ligar();
        System.out.println("TV ligada? " + tv.ligada);
        while(tv.volume < 15) tv.aumentarVolume();
        System.out.println("Volume atual: " + tv.volume);
        tv.mudarCanal(10);
        System.out.println("Canal atual: " + tv.canal);
    }
}
