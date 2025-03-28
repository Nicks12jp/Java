import java.util.Scanner;
public class UsaLampada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lampada lampada = new Lampada();
        
        while (true) { // Loop para manter a interação
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Ligar lâmpada");
            System.out.println("2 - Desligar lâmpada");
            System.out.println("3 - Observar lâmpada");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    lampada.ligar();
                    System.out.println("Você ligou a lâmpada!");
                    break;
                case 2:
                    lampada.desligar();
                    System.out.println("Você desligou a lâmpada!");
                    break;
                case 3:
                    lampada.observar();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close(); // Fecha o scanner antes de sair
                    return; // Sai do método main
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}
