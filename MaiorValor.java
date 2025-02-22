import java.util.Scanner;
public class MaiorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2, valor3, maior;
        System.out.println("Digite o primeiro numero: ");
        valor1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        valor2 = sc.nextInt();

        System.out.println("Digite o terceiro numero: ");
        valor3 = sc.nextInt();
        if (valor1 > valor2 && valor1 > valor3) {
            maior = valor1;
        } else if (valor2 > valor3) {
            maior = valor2;
        } else {
            maior = valor3;
        }
        System.out.println("Maior numero: " + maior);
    }
}