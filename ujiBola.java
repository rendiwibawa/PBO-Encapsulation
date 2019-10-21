 
package bola;

public class ujiBola {
    public static void main(String[] args) {
        double jarijari=14;
        Bola Objekbola=new Bola(7);
        Objekbola.showDiameter();
        Objekbola.showLuasPermukaanbola();
        Objekbola.showVolume();
        System.out.println("\n");
        Objekbola.setjarijari(jarijari);//ini memanipulasi dari dengan variable jari-jari yang di buat
        Objekbola.showDiameter();
        Objekbola.showLuasPermukaanbola();
        Objekbola.showVolume();
    }
}
