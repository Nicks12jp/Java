import java.util.Scanner;

public class MaiorEntreDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dois números
        System.out.print("Digite o primeiro número (a): ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número (b): ");
        int b = sc.nextInt();

        // Passo 1: soma
        int soma = a + b;
        System.out.println("Soma (a + b): " + soma);

        // Passo 2: diferença absoluta
        int dif = Math.abs(a - b);
        System.out.println("Diferença absoluta (|a - b|): " + dif);

        // Passo 3: aplicar fórmula
        int maior = (soma + dif) / 2;
        System.out.println("Maior número: " + maior);

        sc.close();
    }
}
