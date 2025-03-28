import java.util.Scanner; // Importa a classe Scanner para ler entrada do usuário

public class Lampada {
    boolean status;

    public void ligar() {
        status = true;
    }

    public void desligar() {
        status = false;
    }

    public void observar() {
        if (status) {
            System.out.println("Lâmpada ligada");
        } else {
            System.out.println("Lâmpada desligada");
        }
    }
}
