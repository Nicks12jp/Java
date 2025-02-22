public class ExemploDoLoopFor {
    public static void main(String[] args) {
        int soma=0;
        for (int i = 1; i <= 100; i++) {
            soma+=i;
        }
        System.out.println("A soma dos 100 primeiros numeros inteiros: " + soma);
    }
}