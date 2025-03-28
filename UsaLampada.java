public class UsaLampada {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();

        lampada1.ligar(); 
        lampada2.desligar(); 

        lampada1.observar();
        lampada2.observar();
    }
}
