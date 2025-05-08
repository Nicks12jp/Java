import java.util.Scanner;

public class MaiorEntreTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de três números
        System.out.print("Digite o primeiro número (a): ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número (b): ");
        int b = sc.nextInt();

        System.out.print("Digite o terceiro número (c): ");
        int c = sc.nextInt();

        // Passo 1: encontrar o maior entre a e b
        int somaAB = a + b;
        int difAB = Math.abs(a - b);
        int maiorAB = (somaAB + difAB) / 2;

        System.out.println("\n--- Comparando a e b ---");
        System.out.println("Soma (a + b): " + somaAB);
        System.out.println("Diferença |a - b|: " + difAB);
        System.out.println("Maior entre a e b: " + maiorAB);

        // Passo 2: encontrar o maior entre maiorAB e c
        int somaABC = maiorAB + c;
        int difABC = Math.abs(maiorAB - c);
        int maiorABC = (somaABC + difABC) / 2;

        System.out.println("\n--- Comparando o maior de a/b com c ---");
        System.out.println("Soma (maiorAB + c): " + somaABC);
        System.out.println("Diferença |maiorAB - c|: " + difABC);
        System.out.println("Maior entre os três: " + maiorABC);

        sc.close();
    }
}
