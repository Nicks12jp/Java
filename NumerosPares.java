import java.util.Scanner;
public class NumerosPares {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite um numero limite positivo: ");
            int limite = sc.nextInt();
            
             while (limite < 0) {
                System.out.println("Por favor, digite um numero positivo.");
                limite = sc.nextInt();
            }
                System.out.println("Numeros pares de 0 ate " + limite + ":");
                for (int i = 0; i <= limite; i += 2) {
                    System.out.println(i);
                }
            }
        }
    }